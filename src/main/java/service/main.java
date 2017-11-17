package service;

import Connection.Connection;
import Locations.Locations;
import Merge_model.JsonMerge;
import Merge_model.MPosition;
import Merge_model.MProperties;
import ProcessGroupUrl.ProcessGroupUrl;
import Put_hdfs_hour.HConfig;
import Put_hdfs_hour.HPosition;
import Put_hdfs_hour.HProperties;
import Put_hdfs_hour.PutHdfsHour;
import ReaderGroup.RDProcessor;
import ReaderGroup.ReadProcessGroup;
import Update.Update;
import com.google.gson.Gson;
import getHdfsDay.GDPosition;
import getHdfsDay.GDProperties;
import getHdfsDay.GetHdfsDay;
import nifi_objects.Consumer_model.Consumer;
import nifi_objects.Consumer_model.Position;
import nifi_objects.Consumer_model.Properties;
import processGroup.PPosition;
import processGroup.ProcessGroup;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class main {
    static ReadProcessGroup rpg = null;
    static List<String> process_group_url = new ArrayList<String>();
    static List<String> process_group_url_con = new ArrayList<String>();
    static List<String> locations= new ArrayList<String>();


    public static void createConnection() throws Exception {
        int anz = 0;
        ProcessGroupUrl processGroupUrl= new ProcessGroupUrl();

        List<String> process_group_url = processGroupUrl.getProcess_group_url();
        List<String> process_group_url_con = processGroupUrl.getProcess_group_url_con();


        while (anz < process_group_url.size()) {
            URL oracle = new URL(process_group_url.get(anz));
            BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
            String json = "";
            String inputLine = "";
            while ((inputLine = in.readLine()) != null) {
                json += inputLine;
            }
            in.close();
            Gson gson = new Gson();
            rpg = gson.fromJson(json, ReadProcessGroup.class);
            for (int z = 0; z < rpg.getProcessors().size(); z++) {
                String schema_name = "";
                if (rpg.getProcessors().get(z).getComponent().getName().contains("Consumer_")) {
                    schema_name = rpg.getProcessors().get(z).getComponent().getName().substring(9);
                    List<RDProcessor> familie = getFamilie(schema_name);
                    String consumer_name = "";
                    String consumer_id = "";
                    String consumer_groupId = "";
                    String merge_hour_name = "";
                    String merge_hour_id = "";
                    String merge_hour_groupId = "";
                    String put_hour_name = "";
                    String put_hour_id = "";
                    String put_hour_groupId = "";
                    String put_fail = "";
                    String put_error = "";
                    String put_error_name = "";
                    String put_error_id = "";
                    String put_error_groupId = "";
                    String put_failure_name = "";
                    String put_failure_id = "";
                    String put_failure_groupId = "";
                    String get_name = "";
                    String get_id = "";
                    String get_groupId = "";
                    String merge_day_name = "";
                    String merge_day_id = "";
                    String merge_day_groupId = "";
                    String put_day_name = "";
                    String put_day_id = "";
                    String put_day_groupId = "";

                    String put_base_name = "";
                    String put_base_id = "";
                    String put_base_groupId = "";

                    String merge_base_name = "";
                    String merge_base_id = "";
                    String merge_base_groupId = "";

                    String get_base_name = "";
                    String get_base_id = "";
                    String get_base_groupId = "";



                    for (int j = 0; j < familie.size(); j++) {

                        if (familie.get(j).getComponent().getName().equals("Consumer_" + schema_name)) {
                            consumer_name = familie.get(j).getComponent().getName();
                            consumer_id = familie.get(j).getComponent().getId();
                        }
                        if (familie.get(j).getComponent().getName().equals("MergeContent_" + schema_name + "_hour")) {
                            merge_hour_name = familie.get(j).getComponent().getName();
                            merge_hour_id = familie.get(j).getComponent().getId();
                            merge_hour_groupId = familie.get(j).getComponent().getParentGroupId();
                        }
                        if (familie.get(j).getComponent().getName().equals("PutHdfs_" + schema_name + "_error")) {
                            put_error_name = familie.get(j).getComponent().getName();
                            put_error_id = familie.get(j).getComponent().getId();
                            put_error_groupId = familie.get(j).getComponent().getParentGroupId();

                        }
                        if (familie.get(j).getComponent().getName().equals("PutHdfs_" + schema_name + "_hour")) {
                            put_hour_name = familie.get(j).getComponent().getName();
                            put_hour_id = familie.get(j).getComponent().getId();
                            put_hour_groupId = familie.get(j).getComponent().getParentGroupId();

                        }
                        if (familie.get(j).getComponent().getName().equals("PutHdfs_" + schema_name + "_failure")) {
                            put_failure_name = familie.get(j).getComponent().getName();
                            put_failure_id = familie.get(j).getComponent().getId();
                            put_failure_groupId = familie.get(j).getComponent().getParentGroupId();

                        }
                        if (familie.get(j).getComponent().getName().equals("GetHdfs_" + schema_name + "_day")) {
                            get_name = familie.get(j).getComponent().getName();
                            get_id = familie.get(j).getComponent().getId();
                            get_groupId = familie.get(j).getComponent().getParentGroupId();

                        }
                        if (familie.get(j).getComponent().getName().equals("MergeContent_" + schema_name + "_day")) {
                            merge_day_name = familie.get(j).getComponent().getName();
                            merge_day_id = familie.get(j).getComponent().getId();
                            merge_day_groupId = familie.get(j).getComponent().getParentGroupId();
                            System.out.println("merge_day_name: "+merge_day_name+" "+merge_day_id+" "+merge_day_groupId);

                        }
                        if (familie.get(j).getComponent().getName().equals("PutHdfs_" + schema_name + "_day")) {
                            put_day_name = familie.get(j).getComponent().getName();
                            put_day_id = familie.get(j).getComponent().getId();
                            put_day_groupId = familie.get(j).getComponent().getParentGroupId();

                        }
                        if (familie.get(j).getComponent().getName().equals("PutHdfs_" + schema_name + "_base")) {
                            put_base_name = familie.get(j).getComponent().getName();
                            put_base_id = familie.get(j).getComponent().getId();
                            put_base_groupId = familie.get(j).getComponent().getParentGroupId();

                        }
                        if (familie.get(j).getComponent().getName().equals("MergeContent_" + schema_name + "_base")) {
                            merge_base_name = familie.get(j).getComponent().getName();
                            merge_base_id = familie.get(j).getComponent().getId();
                            merge_base_groupId = familie.get(j).getComponent().getParentGroupId();

                        }
                        if (familie.get(j).getComponent().getName().equals("GetHdfs_" + schema_name + "_base")) {
                            get_base_name = familie.get(j).getComponent().getName();
                            get_base_id = familie.get(j).getComponent().getId();
                            get_base_groupId = familie.get(j).getComponent().getParentGroupId();

                        }

                    }
                    SendConnection(merge_hour_id, "PROCESSOR", merge_hour_groupId, merge_hour_name, consumer_id, "PROCESSOR", merge_hour_groupId, consumer_name, "success", process_group_url_con.get(anz));
                    SendConnection(put_error_id, "PROCESSOR", put_error_groupId, put_error_name, merge_hour_id, "PROCESSOR", merge_hour_groupId, merge_hour_name, "failure", process_group_url_con.get(anz));
                    SendConnection(put_hour_id, "PROCESSOR", put_hour_groupId, put_hour_name, merge_hour_id, "PROCESSOR", merge_hour_groupId, merge_hour_name, "merged", process_group_url_con.get(anz));
                    SendConnection(put_error_id, "PROCESSOR", put_error_groupId, put_error_name, put_hour_id, "PROCESSOR", put_hour_groupId, put_hour_name, "failure", process_group_url_con.get(anz));
                    SendConnection(merge_day_id, "PROCESSOR", merge_day_groupId, merge_day_name, get_id, "PROCESSOR", get_groupId, get_name, "success", process_group_url_con.get(anz));
                    SendConnection(put_error_id, "PROCESSOR", put_error_groupId, put_error_name, merge_day_id, "PROCESSOR", merge_day_groupId, merge_day_name, "failure", process_group_url_con.get(anz));
                    SendConnection(put_day_id, "PROCESSOR", put_day_groupId, put_day_name, merge_day_id, "PROCESSOR", merge_day_groupId, merge_day_name, "merged", process_group_url_con.get(anz));
                    SendConnection(put_error_id, "PROCESSOR", put_error_groupId, put_error_name, put_day_id, "PROCESSOR", put_day_groupId, put_day_name, "failure", process_group_url_con.get(anz));
                    SendConnection(put_failure_id, "PROCESSOR", put_failure_groupId, put_failure_name, put_error_id, "PROCESSOR", put_error_groupId, put_error_name, "failure", process_group_url_con.get(anz));
                    SendConnection(put_failure_id, "PROCESSOR", put_failure_groupId, put_failure_name, put_failure_id, "PROCESSOR", put_failure_groupId, put_failure_name, "failure", process_group_url_con.get(anz));

                    SendConnection(merge_base_id, "PROCESSOR", merge_base_groupId, merge_base_name,get_base_id, "PROCESSOR", get_base_groupId, get_base_name,"success",process_group_url_con.get(anz));
                    SendConnection(put_base_id, "PROCESSOR", put_base_groupId, put_base_name,merge_base_id, "PROCESSOR", merge_base_groupId, merge_base_name,"merged",process_group_url_con.get(anz));
                    SendConnection(put_error_id, "PROCESSOR",put_error_groupId, put_error_name,merge_base_id, "PROCESSOR", merge_base_groupId, merge_base_name,"failure",process_group_url_con.get(anz));
                    SendConnection(put_error_id, "PROCESSOR",put_error_groupId, put_error_name,put_base_id, "PROCESSOR", put_base_groupId, put_base_name,"failure",process_group_url_con.get(anz));
                }
            }
            anz = anz + 1;
        }


    }

    public static void main(String[] args) throws Exception {
        ReadDWH_usage();
        ReadDWH_user();
        ReadDWH_purchase();
        ReadDWH_mail();
        ReadDWH_subscription();
        ReadDWH_commission();
        createConnection();
        updateProcessors();
    }

    private static void ReadDWH_commission()throws Exception {
        List<String> l_url_com = new ArrayList<String>();
        l_url_com.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/357c3bee-f918-182c-8d3d-804e13018cac/processors");//Commission_tp
        l_url_com.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/c4633f4d-4d06-19b4-bf3b-26a3356c5b7c/processors");//Commission_ddach
        l_url_com.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/44103009-7328-1e97-a740-c300f52ca75f/processors");//Commission_dint
        l_url_com.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/cfca358a-a60c-1205-986a-ba4cfceed52b/processors");//Commission_ac
        l_url_com.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/41083564-225c-1c83-aac9-56e2589cb9bc/processors");//Commission_id
        l_url_com.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/b6ee31b0-86e2-1d08-b2e8-00e2c625005e/processors");//Commission_empty


        String inputLine;
        int i_x = 1000;
        int j_y = 1000;

        BufferedReader in = null;
        Locations loc= new Locations();
        List<String> l_loc = new ArrayList<String>();
        l_loc=loc.getLocations();
        for (int k = 0; k < l_url_com.size(); k++) {
            URL oracle = new URL("http://dwh-schemaservice-stage.cyberservices.local:2876/schema-repo");
            in = new BufferedReader(new InputStreamReader(oracle.openStream()));
            while ((inputLine = in.readLine()) != null) {
                if (inputLine.contains("commission_")) {
                    SendConsumer("Consumer_" + inputLine, "stg_" + inputLine+"_batch", 10, (10) + i_x, l_url_com.get(k), l_loc.get(k));
                    SendMerge("MergeContent_" + inputLine + "_hour", 600.0, (10) + i_x, "* 03 * * * ?", "CRON_DRIVEN", l_url_com.get(k));
                    SendMerge("MergeContent_" + inputLine + "_day", 600.0, 400 + i_x, "10 sec", "TIMER_DRIVEN", l_url_com.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_hour", 1200, (10) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", l_url_com.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_error", 600.0, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+""+l_loc.get(k), l_url_com.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_failure", 1200, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+""+l_loc.get(k), l_url_com.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_day", 1200, (400) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", l_url_com.get(k));
                    SendGetHdfsDay("GetHdfs_" + inputLine + "_day", 10, (400) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", "* 13 23 * * ?", "CRON_DRIVEN", l_url_com.get(k));

                    SendGetHdfsDay("GetHdfs_" + inputLine + "_base", -600, (10) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", "0 13 0 ? * MON *", "CRON_DRIVEN", l_url_com.get(k));
                    SendMerge("MergeContent_" + inputLine + "_base", -600.0, 200 + i_x, "10 sec", "TIMER_DRIVEN", l_url_com.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_base", -600, (400) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/base/"+"${now():format('yyyy-ww')}", l_url_com.get(k));
                    i_x = i_x + 1000;
                    j_y = j_y + 1000;
                }
            }
        }
        in.close();
    }

    private static void ReadDWH_subscription()throws Exception {
        List<String> l_url_subs = new ArrayList<String>();
        l_url_subs.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/9e0a344a-14b1-1836-91d7-ad743bbc732a/processors");//Subscription_tp
        l_url_subs.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/3da93842-cfa3-19e9-9535-bf6cbfe0888e/processors");//Subscription_ddach
        l_url_subs.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/5b5e3734-b77d-1a11-baad-cccdfb891b57/processors");//Subscription_dint
        l_url_subs.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/187e306d-465b-15a1-961d-ebd174345c4c/processors");//Subscription_ac
        l_url_subs.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/ee633ad9-dac0-1618-939d-007f9c014f1e/processors");//Subscription_id
        l_url_subs.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/2cf53460-f0a0-15b0-9c4e-13e77e944a6b/processors");//Subscription_empty

        String inputLine;
        int i_x = 1000;
        int j_y = 1000;

        BufferedReader in = null;
        Locations loc= new Locations();
        List<String> l_loc = new ArrayList<String>();
        l_loc=loc.getLocations();
        for (int k = 0; k < l_url_subs.size(); k++) {
            URL oracle = new URL("http://dwh-schemaservice-stage.cyberservices.local:2876/schema-repo");
            in = new BufferedReader(new InputStreamReader(oracle.openStream()));
            while ((inputLine = in.readLine()) != null) {
                if (inputLine.contains("subscription_")) {
                    SendConsumer("Consumer_" + inputLine, "stg_" + inputLine+"_batch", 10, (10) + i_x, l_url_subs.get(k), l_loc.get(k));
                    SendMerge("MergeContent_" + inputLine + "_hour", 600.0, (10) + i_x, "* 03 * * * ?", "CRON_DRIVEN", l_url_subs.get(k));
                    SendMerge("MergeContent_" + inputLine + "_day", 600.0, 400 + i_x, "10 sec", "TIMER_DRIVEN", l_url_subs.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_hour", 1200, (10) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", l_url_subs.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_error", 600.0, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+""+l_loc.get(k), l_url_subs.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_failure", 1200, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+""+l_loc.get(k), l_url_subs.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_day", 1200, (400) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", l_url_subs.get(k));
                    SendGetHdfsDay("GetHdfs_" + inputLine + "_day", 10, (400) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", "* 13 23 * * ?", "CRON_DRIVEN", l_url_subs.get(k));

                    SendGetHdfsDay("GetHdfs_" + inputLine + "_base", -600, (10) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", "0 13 0 ? * MON *", "CRON_DRIVEN", l_url_subs.get(k));
                    SendMerge("MergeContent_" + inputLine + "_base", -600.0, 200 + i_x, "10 sec", "TIMER_DRIVEN", l_url_subs.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_base", -600, (400) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/base/"+"${now():format('yyyy-ww')}", l_url_subs.get(k));
                    i_x = i_x + 1000;
                    j_y = j_y + 1000;
                }
            }
        }
        in.close();
    }


    private static void ReadDWH_mail()throws Exception {
        //URL oracle = new URL("http://dwh-schemaservice-stage.cyberservices.local:2876/schema-repo");
        //BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        List<String> l_url_mail = new ArrayList<String>();
        l_url_mail.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/ddd232cb-6a37-1a51-a0bb-58d6e84febf3/processors");//Mail_tp
        l_url_mail.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/73df3e44-eebb-1d97-aea7-8c8bd14b24f7/processors");//Mail_ddach
        l_url_mail.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/014634fa-c48e-1deb-8496-d4d12d94e147/processors");//Mail_dint
        l_url_mail.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/9e2834a0-b943-129d-9f7a-e61443681127/processors");//Mail_ac
        l_url_mail.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/4ef33d43-8d77-134b-90fc-78981a510f39/processors");//Mail_id
        l_url_mail.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/a2a43f6e-3f67-1116-8365-7b8cbb7a27e7/processors");//Mail_empty

        String inputLine;
        int i_x = 1000;
        int j_y = 1000;

        BufferedReader in = null;
        Locations loc= new Locations();
        List<String> l_loc = new ArrayList<String>();
        l_loc=loc.getLocations();
        for (int k = 0; k < l_url_mail.size(); k++) {
            URL oracle = new URL("http://dwh-schemaservice-stage.cyberservices.local:2876/schema-repo");
            in = new BufferedReader(new InputStreamReader(oracle.openStream()));
            while ((inputLine = in.readLine()) != null) {
                if (inputLine.contains("mail_")) {
                    SendConsumer("Consumer_" + inputLine, "stg_" + inputLine+"_batch", 10, (10) + i_x, l_url_mail.get(k), l_loc.get(k));
                    SendMerge("MergeContent_" + inputLine + "_hour", 600.0, (10) + i_x, "* 04 * * * ?", "CRON_DRIVEN", l_url_mail.get(k));
                    SendMerge("MergeContent_" + inputLine + "_day", 600.0, 400 + i_x, "10 sec", "TIMER_DRIVEN", l_url_mail.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_hour", 1200, (10) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", l_url_mail.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_error", 600.0, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+""+l_loc.get(k), l_url_mail.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_failure", 1200, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+""+l_loc.get(k), l_url_mail.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_day", 1200, (400) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", l_url_mail.get(k));
                    SendGetHdfsDay("GetHdfs_" + inputLine + "_day", 10, (400) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", "* 14 23 * * ?", "CRON_DRIVEN", l_url_mail.get(k));

                    SendGetHdfsDay("GetHdfs_" + inputLine + "_base", -600, (10) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", "0 14 0 ? * MON *", "CRON_DRIVEN", l_url_mail.get(k));
                    SendMerge("MergeContent_" + inputLine + "_base", -600.0, 200 + i_x, "10 sec", "TIMER_DRIVEN", l_url_mail.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_base", -600, (400) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/base/"+"${now():format('yyyy-ww')}", l_url_mail.get(k));
                    i_x = i_x + 1000;
                    j_y = j_y + 1000;
                }
            }
        }
        in.close();
    }

    public static void updateProcessors()throws Exception{
        int anz=0;
        ProcessGroupUrl processGroupUrl= new ProcessGroupUrl();
        List<String> process_group_list= processGroupUrl.getProcess_group_url();
        System.out.println(process_group_list);
        while (anz < process_group_list.size()) {
            //URL oracle = new URL("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d0518-015f-1000-0000-0000374b06f1/processors");
            URL oracle = new URL(process_group_list.get(anz));
            BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
            String json = "";
            String inputLine = "";
            String dummy = "";
            while ((inputLine = in.readLine()) != null) {
                json += inputLine;
            }
            in.close();

            Gson gson = new Gson();

            rpg = gson.fromJson(json, ReadProcessGroup.class);
            System.out.println("rpg: " + rpg.getProcessors().size());
            String id = "";
            String name = "";
            String state = "STOPPED";
            String clientID = "";
            long version = 0l;
            String data = "";
            String url = "";

            //rpg.getProcessors().size()
            for (int z = 0; z < rpg.getProcessors().size(); z++) {
                if (rpg.getProcessors().get(z).getComponent().getName().contains("MergeContent")) {
                    name = rpg.getProcessors().get(z).getComponent().getName();
                    id = rpg.getProcessors().get(z).getComponent().getId();
                    version = rpg.getProcessors().get(z).getRevision().getVersion().longValue();
                    url = rpg.getProcessors().get(z).getUri();
                    Update update = new Update(id, name, state, clientID, version, "original");
                    SendUpdate(update, url);

                }
                if (rpg.getProcessors().get(z).getComponent().getName().contains("PutHdfs")) {
                    name = rpg.getProcessors().get(z).getComponent().getName();
                    id = rpg.getProcessors().get(z).getComponent().getId();
                    version = rpg.getProcessors().get(z).getRevision().getVersion().longValue();
                    url = rpg.getProcessors().get(z).getUri();
                    Update update = new Update(id, name, state, clientID, version, "success");
                    SendUpdate(update, url);

                }
            }
            anz = anz + 1;
        }
    }

    private static List<RDProcessor> getConsumer(String schema_name) {
        List<RDProcessor> list_consumer = new ArrayList<RDProcessor>();
        for (int z = 0; z < rpg.getProcessors().size(); z++) {

        }

        return list_consumer;
    }

    public void SendConnection(String sourceId,String sourceGroupId,String destinationId,String destinationGroupId){

       System.out.println("SendConnection,SendConnection,SendConnection");
    }
    private static List<RDProcessor> getFamilie(String schema_name) {

        List<RDProcessor> list_familie = new ArrayList<RDProcessor>();

        for (int z = 0; z < rpg.getProcessors().size(); z++) {

            String name_komponent = rpg.getProcessors().get(z).getComponent().getName();
            if (name_komponent.equals("MergeContent_" + schema_name + "_hour")) {
                list_familie.add(rpg.getProcessors().get(z));
            }
            if (name_komponent.equals("PutHdfs_" + schema_name + "_hour")) {
                list_familie.add(rpg.getProcessors().get(z));
            }
            if (name_komponent.equals("Consumer_" + schema_name)) {
                list_familie.add(rpg.getProcessors().get(z));

            }
            if (name_komponent.equals("PutHdfs_" + schema_name + "_error")) {
                list_familie.add(rpg.getProcessors().get(z));

            }
            if (name_komponent.equals("PutHdfs_" + schema_name + "_failure")) {
                list_familie.add(rpg.getProcessors().get(z));

            }
            if (name_komponent.equals("GetHdfs_" + schema_name + "_day")) {
                list_familie.add(rpg.getProcessors().get(z));

            }
            if (name_komponent.equals("MergeContent_" + schema_name + "_day")) {
                list_familie.add(rpg.getProcessors().get(z));

            }
            if (name_komponent.equals("PutHdfs_" + schema_name + "_day")) {
                list_familie.add(rpg.getProcessors().get(z));

            }
            if (name_komponent.equals("PutHdfs_" + schema_name + "_base")) {
                list_familie.add(rpg.getProcessors().get(z));

            }
            if (name_komponent.equals("MergeContent_" + schema_name + "_base")) {
                list_familie.add(rpg.getProcessors().get(z));

            }
            if (name_komponent.equals("GetHdfs_" + schema_name + "_base")) {
                list_familie.add(rpg.getProcessors().get(z));

            }


        }

        return list_familie;
    }

    public static void ReadDWH_purchase() throws Exception {

        List<String> l_url_purchase = new ArrayList<String>();
        l_url_purchase.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/809330a5-7325-16fc-8ca9-32d8d0a6ab86/processors");//Purchase_tp
        l_url_purchase.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/77663861-dc5e-17f5-9448-d9879646a837/processors");//Purchase_ddach
        l_url_purchase.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/ec4232c9-8011-1ea7-a9b0-288259017712/processors");//Purchase_dint
        l_url_purchase.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/5ac032f2-f49b-19be-b8c0-3a6aa223ca81/processors");//Purchase_ac
        l_url_purchase.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/dd2b3a79-d33a-1b02-9e17-cfd0f8a39aa4/processors");//Purchase_id
        l_url_purchase.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/800933e8-2e8f-165d-ab0c-053fbb5f68a3/processors");//Purchase_empty

        String inputLine;
        int i_x = 1000;
        int j_y = 1000;

        BufferedReader in = null;
        Locations loc= new Locations();
        List<String> l_loc = new ArrayList<String>();
        l_loc=loc.getLocations();
        for (int k = 0; k < l_url_purchase.size(); k++) {
            URL oracle = new URL("http://dwh-schemaservice-stage.cyberservices.local:2876/schema-repo");
            in = new BufferedReader(new InputStreamReader(oracle.openStream()));
            while ((inputLine = in.readLine()) != null) {
                if (inputLine.contains("purchase_")) {
                    SendConsumer("Consumer_" + inputLine, "stg_" + inputLine+"_batch", 10, (10) + i_x, l_url_purchase.get(k), l_loc.get(k));
                    SendMerge("MergeContent_" + inputLine + "_hour", 600.0, (10) + i_x, "* 03 * * * ?", "CRON_DRIVEN", l_url_purchase.get(k));
                    SendMerge("MergeContent_" + inputLine + "_day", 600.0, 400 + i_x, "10 sec", "TIMER_DRIVEN", l_url_purchase.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_hour", 1200, (10) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", l_url_purchase.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_error", 600.0, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+""+l_loc.get(k), l_url_purchase.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_failure", 1200, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+""+l_loc.get(k), l_url_purchase.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_day", 1200, (400) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", l_url_purchase.get(k));
                    SendGetHdfsDay("GetHdfs_" + inputLine + "_day", 10, (400) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", "* 13 23 * * ?", "CRON_DRIVEN", l_url_purchase.get(k));

                    SendGetHdfsDay("GetHdfs_" + inputLine + "_base", -600, (10) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", "0 13 0 ? * MON *", "CRON_DRIVEN", l_url_purchase.get(k));
                    SendMerge("MergeContent_" + inputLine + "_base", -600.0, 200 + i_x, "10 sec", "TIMER_DRIVEN", l_url_purchase.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_base", -600, (400) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/base/"+"${now():format('yyyy-ww')}", l_url_purchase.get(k));
                    i_x = i_x + 1000;
                    j_y = j_y + 1000;
                }
            }
        }
        in.close();
    }

    public static void ReadDWH_usage() throws Exception {
        List<String> l_url_usage = new ArrayList<String>();
        //Backup
        l_url_usage.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/c95fdea7-015f-1000-ffff-ffffda3afe01/processors");//Usage_tp
        l_url_usage.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/533b3e7a-1f1d-1c27-99a7-6f37368c0f19/processors");//Usage_ddach
        l_url_usage.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/0cf635aa-47d7-16cc-be34-f4ea4fce828d/processors");//Usage_dint
        l_url_usage.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/9a683d4d-c6df-1d28-8df8-dd4355546246/processors");//Usage_ac
        l_url_usage.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/d3e23988-2b8e-1429-a45b-59275008dd46/processors");//Usage_id
        l_url_usage.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/926630f5-3ee2-1c4e-8b93-98d0cb7029f9/processors");//Usage_empty

        //l_url_usage.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/880f0c59-015f-1000-ffff-ffffae6607aa/processors");//id
        String inputLine;
        int i_x = 1000;
        int j_y = 1000;

        BufferedReader in = null;
        Locations loc= new Locations();
        List<String> l_loc = new ArrayList<String>();
        l_loc=loc.getLocations();
        for (int k = 0; k < l_url_usage.size(); k++) {
            URL oracle = new URL("http://dwh-schemaservice-stage.cyberservices.local:2876/schema-repo");
            in = new BufferedReader(new InputStreamReader(oracle.openStream()));
            while ((inputLine = in.readLine()) != null) {
                if (inputLine.contains("usage_")) {
                    SendConsumer("Consumer_" + inputLine, "stg_" + inputLine+"_batch", 10, (10) + i_x, l_url_usage.get(k), l_loc.get(k));
                    SendMerge("MergeContent_" + inputLine + "_hour", 600.0, (10) + i_x, "* 01 * * * ?", "CRON_DRIVEN", l_url_usage.get(k));
                    SendMerge("MergeContent_" + inputLine + "_day", 600.0, 400 + i_x, "10 sec", "TIMER_DRIVEN", l_url_usage.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_hour", 1200, (10) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", l_url_usage.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_error", 600.0, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+""+l_loc.get(k), l_url_usage.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_failure", 1200, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+""+l_loc.get(k), l_url_usage.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_day", 1200, (400) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", l_url_usage.get(k));
                    SendGetHdfsDay("GetHdfs_" + inputLine + "_day", 10, (400) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", "* 12 23 * * ?", "CRON_DRIVEN", l_url_usage.get(k));

                    SendGetHdfsDay("GetHdfs_" + inputLine + "_base", -600, (10) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", "0 12 0 ? * MON *", "CRON_DRIVEN", l_url_usage.get(k));
                    SendMerge("MergeContent_" + inputLine + "_base", -600.0, 200 + i_x, "10 sec", "TIMER_DRIVEN", l_url_usage.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_base", -600, (400) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/base/"+"${now():format('yyyy-ww')}", l_url_usage.get(k));
                    i_x = i_x + 1000;
                    j_y = j_y + 1000;
                }
            }
        }
        in.close();
    }

    public static void ReadDWH_user() throws Exception {
        //URL oracle = new URL("http://dwh-schemaservice-stage.cyberservices.local:2876/schema-repo");
        //BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        List<String> l_url_user = new ArrayList<String>();
        l_url_user.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/c079355e-4b66-16f1-9744-40b5fbf614d1/processors");//User_tp
        l_url_user.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/413a387f-e869-15ef-8ebe-641d1c4d677f/processors");//User_ddach
        l_url_user.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/3b8a3d68-b24f-1824-8f5c-af58040b4898/processors");//User_dint
        l_url_user.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/32d9353d-2294-1924-b503-1f6454e77676/processors");//User_ac
        l_url_user.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/331e3ce4-9100-120d-86c5-a2e03e2eed1c/processors");//User_id
        l_url_user.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/a94c32a1-6f7a-10d0-874e-98f28221f475/processors");//User_empty


        String inputLine;
        int i_x = 1000;
        int j_y = 1000;

        BufferedReader in = null;
        Locations loc= new Locations();
        List<String> l_loc = new ArrayList<String>();
        l_loc=loc.getLocations();

        for (int k = 0; k < l_url_user.size(); k++) {
            URL oracle = new URL("http://dwh-schemaservice-stage.cyberservices.local:2876/schema-repo");
            in = new BufferedReader(new InputStreamReader(oracle.openStream()));
            while ((inputLine = in.readLine()) != null) {
                if (inputLine.contains("user_")) {
                    SendConsumer("Consumer_" + inputLine, "stg_" + inputLine+"_batch", 10, (10) + i_x, l_url_user.get(k), l_loc.get(k));
                    SendMerge("MergeContent_" + inputLine + "_hour", 600.0, (10) + i_x, "* 02 * * * ?", "CRON_DRIVEN", l_url_user.get(k));
                    SendMerge("MergeContent_" + inputLine + "_day", 600.0, 400 + i_x, "10 sec", "TIMER_DRIVEN", l_url_user.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_hour", 1200, (10) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", l_url_user.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_error", 600.0, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+""+l_loc.get(k), l_url_user.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_failure", 1200, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+""+l_loc.get(k), l_url_user.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_day", 1200, (400) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", l_url_user.get(k));
                    SendGetHdfsDay("GetHdfs_" + inputLine + "_day", 10, (400) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", "* 10 23 * * ?", "CRON_DRIVEN", l_url_user.get(k));

                    SendGetHdfsDay("GetHdfs_" + inputLine + "_base", -600, (10) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/merge", "0 10 0 ? * MON *", "CRON_DRIVEN", l_url_user.get(k));
                    SendMerge("MergeContent_" + inputLine + "_base", -600.0, 200 + i_x, "10 sec", "TIMER_DRIVEN", l_url_user.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_base", -600, (400) + i_x, "/user/talend/staging/" + inputLine+""+l_loc.get(k)+"/base/"+"${now():format('yyyy-ww')}", l_url_user.get(k));
                    i_x = i_x + 1000;
                    j_y = j_y + 1000;
                }
            }
        }
        in.close();

    }

    public static void SendConsumer(String name, String queue_name, double pos_x, double pos_y, String url,String virtualHost) throws Exception {
        String data;
        Position p = new Position(pos_x, pos_y);
        Properties pr = new Properties(queue_name,virtualHost);
        Consumer c = new Consumer(p, pr, name);
        Gson gson = new Gson();
        data = gson.toJson(c);
        System.out.println("Consumer: " + data);
        SendHttp(gson, data, url);


    }
    public static void SendConnection(String d_id,String d_type,String d_groupId,String d_name,String s_id,String s_type,String s_groupId,String s_name,String Relations,String url)throws Exception{
        String url_n=url;
        String data;
        Connection connection= new Connection(d_id,d_type,d_groupId,d_name,s_id,s_type,s_groupId,s_name,Relations);
        Gson gson = new Gson();
        data= gson.toJson(connection);
        System.out.println(data);
        HttpURLConnectionNifi http = new HttpURLConnectionNifi();
        http.setUrl(url_n);
        http.setPostData(data);
        http.sendingPostRequest();

    }

    public static void SendHttp(Gson gson, String data, String url) throws Exception {
        String co = data;
        System.out.println("co: " + gson.toJson(co));
        HttpURLConnectionNifi http = new HttpURLConnectionNifi();
        // http.setUrl("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/53759954-015f-1000-ffff-ffff9474d593/processors");
        http.setUrl(url);
        http.setPostData(data);
        http.sendingPostRequest();

    }

    public static void SendPutHdfs(String name, double pos_x, double pos_y, String directory, String url) throws Exception {
        HPosition hp = new HPosition(pos_x, pos_y);
        HProperties ppr = new HProperties(directory);
        HConfig hcon = new HConfig(ppr);
        PutHdfsHour phdh = new PutHdfsHour(hp, hcon, name);
        Gson gson_h = new Gson();
        String data_h;
        data_h = gson_h.toJson(phdh);
        System.out.println("PutHDFS: " + data_h);
        SendHttp(gson_h, data_h, url);
    }

    public static void SendMerge(String name, double pos_x, double pos_y, String sPeriod, String sStrategy, String url) throws Exception {
        MPosition m_p = new MPosition(pos_x, pos_y);
        MProperties m_pr = new MProperties();
        JsonMerge jm = new JsonMerge(m_p, m_pr, name, sPeriod, sStrategy);
        Gson gson_m = new Gson();
        String data_m;
        data_m = gson_m.toJson(jm);
        System.out.println("Merge: " + data_m);
        SendHttp(gson_m, data_m, url);
    }

    public static void SendGetHdfsDay(String name, double pos_x, long pos_y, String directory, String sPeriod, String sStrategy, String url) throws Exception {
        GDPosition p = new GDPosition(pos_x, pos_y);
        GDProperties ppr = new GDProperties(directory);
        GetHdfsDay ghd = new GetHdfsDay(p, name, ppr, sPeriod, sStrategy);
        Gson gson = new Gson();
        String data;
        data = gson.toJson(ghd);
        SendHttp(gson, data, url);
    }

    public static void SendProcessGroup(String url_s, String name, double pos_x, double pos_y, String url) throws Exception {
        PPosition p = new PPosition(pos_x, pos_y);
        ProcessGroup pg = new ProcessGroup(p, name);
        Gson gson = new Gson();
        String data;
        data = gson.toJson(pg);
        System.out.println("ProcessGroup: " + data);
        //SendHttp(gson, data, url);
    }
    public static void SendUpdate(Update update,String url) throws Exception {
        Gson gson = new Gson();
        String data;
        data = gson.toJson(update);
        System.out.println(data);
        SendHttpPut(gson,data,url);
    }

    private static void SendHttpPut(Gson gson, String data, String url)throws Exception {
        String co = data;
        URL url_n = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) url_n.openConnection();
        connection.setRequestMethod("PUT");
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Accept", "application/json");
        OutputStreamWriter osw = new OutputStreamWriter(connection.getOutputStream());
        osw.write(data);
        osw.flush();
        osw.close();
        System.err.println(connection.getResponseCode());
    }


}















