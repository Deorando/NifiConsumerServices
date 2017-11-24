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
import XRead.XProcessor;
import XRead.XReadProcessGroup;
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
    static XReadProcessGroup xrpg=null;
    static List<String> process_group_url = new ArrayList<String>();
    static List<String> process_group_url_con = new ArrayList<String>();
    static List<String> locations= new ArrayList<String>();




    public static void main(String[] args) throws Exception {
        ReadDWH_usage();
        ReadDWH_user();
        ReadDWH_purchase();
        ReadDWH_mail();
        ReadDWH_subscription();
        ReadDWH_commission();
        //createConnection();
        createConnectionNew();
        updateProcessors();
    }


    public static void createConnectionNew() throws Exception {

        int anz = 0;
        ProcessGroupUrl processGroupUrl= new ProcessGroupUrl();

        List<String> process_group_url = processGroupUrl.getProcess_group_url();
        List<String> process_group_url_con = processGroupUrl.getProcess_group_url_con();


        while (anz < process_group_url.size()) {

            System.out.println("URL: "+process_group_url.get(anz));
            URL oracle = new URL(process_group_url.get(anz));

            BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
            String json = "";
            String inputLine = "";

            while ((inputLine = in.readLine()) != null) {
                json += inputLine;

            }
            in.close();
            // System.out.println("XXXXX: "+json);
            Gson gson = new Gson();
            xrpg = gson.fromJson(json, XReadProcessGroup.class);
            for (int z = 0; z <  xrpg.getProcessors().size(); z++) {
                String schema_name = "";
                if (xrpg.getProcessors().get(z).getComponent().getName().contains("Consumer_")) {
                    schema_name =  xrpg.getProcessors().get(z).getComponent().getName().substring(9);
                    List<XProcessor> familie = getFamilie(schema_name);
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
    private static void ReadDWH_commission()throws Exception {
        List<String> l_url_com = new ArrayList<String>();
        l_url_com.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/ef786c82-015f-1000-8e57-8dfed41663d8/processors");//Commission_dint


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
        l_url_subs.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/ef788922-015f-1000-9d93-7bb916a6f066/processors");//Subscription_dint

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
        l_url_mail.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/ef7825d2-015f-1000-51ab-1024c6250f6e/processors");//Mail_dint

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

            xrpg = gson.fromJson(json, XReadProcessGroup.class);
            System.out.println("rpg: " + xrpg.getProcessors().size());
            String id = "";
            String name = "";
            String state = "STOPPED";
            String clientID = "";
            long version = 0l;
            String data = "";
            String url = "";

            //rpg.getProcessors().size()
            for (int z = 0; z < xrpg.getProcessors().size(); z++) {
                if (xrpg.getProcessors().get(z).getComponent().getName().contains("MergeContent")) {
                    name = xrpg.getProcessors().get(z).getComponent().getName();
                    id = xrpg.getProcessors().get(z).getComponent().getId();
                    version = xrpg.getProcessors().get(z).getRevision().getVersion().longValue();
                    url = xrpg.getProcessors().get(z).getUri();
                    Update update = new Update(id, name, state, clientID, version, "original");
                    SendUpdate(update, url);

                }
                if (xrpg.getProcessors().get(z).getComponent().getName().contains("PutHdfs")) {
                    name = xrpg.getProcessors().get(z).getComponent().getName();
                    id = xrpg.getProcessors().get(z).getComponent().getId();
                    version = xrpg.getProcessors().get(z).getRevision().getVersion().longValue();
                    url = xrpg.getProcessors().get(z).getUri();
                    Update update = new Update(id, name, state, clientID, version, "success");
                    SendUpdate(update, url);

                }
            }
            anz = anz + 1;
        }
    }

    private static List<XProcessor> getConsumer(String schema_name) {
        List<XProcessor> list_consumer = new ArrayList<XProcessor>();
        for (int z = 0; z < xrpg.getProcessors().size(); z++) {

        }

        return list_consumer;
    }

    public void SendConnection(String sourceId,String sourceGroupId,String destinationId,String destinationGroupId){

       System.out.println("SendConnection,SendConnection,SendConnection");
    }
    private static List<XProcessor> getFamilie(String schema_name) {

        List<XProcessor> list_familie = new ArrayList<XProcessor>();

        for (int z = 0; z <  xrpg.getProcessors().size(); z++) {

            String name_komponent =  xrpg.getProcessors().get(z).getComponent().getName();
            if (name_komponent.equals("MergeContent_" + schema_name + "_hour")) {
                list_familie.add(xrpg.getProcessors().get(z));

            }
            if (name_komponent.equals("PutHdfs_" + schema_name + "_hour")) {
                list_familie.add(xrpg.getProcessors().get(z));
            }
            if (name_komponent.equals("Consumer_" + schema_name)) {
                list_familie.add(xrpg.getProcessors().get(z));

            }
            if (name_komponent.equals("PutHdfs_" + schema_name + "_error")) {
                list_familie.add(xrpg.getProcessors().get(z));

            }
            if (name_komponent.equals("PutHdfs_" + schema_name + "_failure")) {
                list_familie.add(xrpg.getProcessors().get(z));

            }
            if (name_komponent.equals("GetHdfs_" + schema_name + "_day")) {
                list_familie.add(xrpg.getProcessors().get(z));

            }
            if (name_komponent.equals("MergeContent_" + schema_name + "_day")) {
                list_familie.add(xrpg.getProcessors().get(z));

            }
            if (name_komponent.equals("PutHdfs_" + schema_name + "_day")) {
                list_familie.add(xrpg.getProcessors().get(z));

            }
            if (name_komponent.equals("PutHdfs_" + schema_name + "_base")) {
                list_familie.add(xrpg.getProcessors().get(z));

            }
            if (name_komponent.equals("MergeContent_" + schema_name + "_base")) {
                list_familie.add(xrpg.getProcessors().get(z));

            }
            if (name_komponent.equals("GetHdfs_" + schema_name + "_base")) {
                list_familie.add(xrpg.getProcessors().get(z));

            }


        }

        return list_familie;
    }

    public static void ReadDWH_purchase() throws Exception {

        List<String> l_url_purchase = new ArrayList<String>();
        l_url_purchase.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/ef78a64a-015f-1000-ca5e-e475b3de15c1/processors");//Purchase_dint

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
        l_url_usage.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/ef78355a-015f-1000-56d5-37f8af22664c/processors");//Usage_dint

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
        l_url_user.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/ef78487a-015f-1000-ee70-20fee4dd9b73/processors");//User_dint

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















