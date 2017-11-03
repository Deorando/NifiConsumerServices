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
        List<String> process_group_url = new ArrayList<String>();
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d04a7-015f-1000-0000-00007587fed5/processors");//tp
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d0518-015f-1000-0000-0000374b06f1/processors");//ddach
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d0587-015f-1000-0000-0000718eef50/processors");//dint
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/045e3481-a47b-1778-8dcd-a66f603c162a/processors");//ac
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/8133b6d6-015f-1000-ffff-ffff9f94fd13/processors");//id
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/2a873c97-fc86-1739-981c-0bcd9e3498b5/processors");//tp
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/bb9338d3-3ebe-150f-beb3-bf693fa7678c/processors");//ddach
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/8d2030e0-fcb9-15f8-b6b1-53eb50346872/processors");//dint
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/a8b43aeb-5944-1d3d-8c1b-6cded7c6f05a/processors");//ac
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/8186e4f7-015f-1000-ffff-ffffa9458dbe/processors");//id
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/1c493853-2b23-122e-ba8c-c905608b0806/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/08113ca4-dd7c-135e-9b6c-2a20f51f8cd8/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/3c323317-fb46-173d-aeb1-b95188af5149/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/8d543e88-9b32-1944-aebc-b0d9f90a21c3/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/81895d30-015f-1000-ffff-ffffce2df0a9/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d50abf1-015f-1000-0000-0000777ee6c7/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d50c50d-015f-1000-0000-000009b10c20/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d50ec3d-015f-1000-0000-00004253cb3a/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d510cc8-015f-1000-0000-000027020cb9/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/819c915b-015f-1000-0000-00000503c2f7/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d64b727-015f-1000-ffff-ffff86968c13/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d64f03f-015f-1000-0000-000067f59e94/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d64cf03-015f-1000-0000-0000526b1b0a/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d650a53-015f-1000-0000-00007aa1797c/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/819b195c-015f-1000-ffff-ffff85c49f58/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d6eead9-015f-1000-ffff-ffff8b3e3e3b/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d6f00df-015f-1000-ffff-ffff89d4f62f/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d6f4046-015f-1000-0000-00001e6bac70/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d6f5a50-015f-1000-0000-000078e07790/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/819aa9bb-015f-1000-ffff-ffffd4630a4f/processors");




        List<String> process_group_url_con = new ArrayList<String>();
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d04a7-015f-1000-0000-00007587fed5/connections");//tp
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d0518-015f-1000-0000-0000374b06f1/connections");//ddach
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d0587-015f-1000-0000-0000718eef50/connections");//dint
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/045e3481-a47b-1778-8dcd-a66f603c162a/connections");//ac
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/8133b6d6-015f-1000-ffff-ffff9f94fd13/connections");//id
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/2a873c97-fc86-1739-981c-0bcd9e3498b5/connections");//tp
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/bb9338d3-3ebe-150f-beb3-bf693fa7678c/connections");//ddach
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/8d2030e0-fcb9-15f8-b6b1-53eb50346872/connections");//dint
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/a8b43aeb-5944-1d3d-8c1b-6cded7c6f05a/connections");//ac
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/8186e4f7-015f-1000-ffff-ffffa9458dbe/connections");//id
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/1c493853-2b23-122e-ba8c-c905608b0806/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/08113ca4-dd7c-135e-9b6c-2a20f51f8cd8/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/3c323317-fb46-173d-aeb1-b95188af5149/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/8d543e88-9b32-1944-aebc-b0d9f90a21c3/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/81895d30-015f-1000-ffff-ffffce2df0a9/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d50abf1-015f-1000-0000-0000777ee6c7/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d50c50d-015f-1000-0000-000009b10c20/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d50ec3d-015f-1000-0000-00004253cb3a/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d510cc8-015f-1000-0000-000027020cb9/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/819c915b-015f-1000-0000-00000503c2f7/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d64b727-015f-1000-ffff-ffff86968c13/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d64f03f-015f-1000-0000-000067f59e94/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d64cf03-015f-1000-0000-0000526b1b0a/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d650a53-015f-1000-0000-00007aa1797c/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/819b195c-015f-1000-ffff-ffff85c49f58/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d6eead9-015f-1000-ffff-ffff8b3e3e3b/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d6f00df-015f-1000-ffff-ffff89d4f62f/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d6f4046-015f-1000-0000-00001e6bac70/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d6f5a50-015f-1000-0000-000078e07790/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/819aa9bb-015f-1000-ffff-ffffd4630a4f/connections");

        while (anz < process_group_url.size()) {
            // URL oracle = new URL("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d0518-015f-1000-0000-0000374b06f1/processors");
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
                }
            }
            anz = anz + 1;
        }


    }

    public static void main(String[] args) throws Exception {
       // ReadDWH_usage();
       // ReadDWH_user();
       // ReadDWH_purchase();
       // ReadDWH_mail();
       // ReadDWH_subscription();
       // ReadDWH_commission();
       // createConnection();
        updateProcessors();


    }

    private static void ReadDWH_commission()throws Exception {
        //URL oracle = new URL("http://dwh-schemaservice-stage.cyberservices.local:2876/schema-repo");
        //BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        List<String> l_url_com = new ArrayList<String>();
        l_url_com.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d6eead9-015f-1000-ffff-ffff8b3e3e3b/processors");
        l_url_com.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d6f00df-015f-1000-ffff-ffff89d4f62f/processors");
        l_url_com.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d6f4046-015f-1000-0000-00001e6bac70/processors");
        l_url_com.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d6f5a50-015f-1000-0000-000078e07790/processors");
        l_url_com.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/819aa9bb-015f-1000-ffff-ffffd4630a4f/processors");


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
                    SendConsumer("Consumer_" + inputLine, "stg_" + inputLine, 10, (10) + i_x, l_url_com.get(k), l_loc.get(k));
                    SendMerge("MergeContent_" + inputLine + "_hour", 600.0, (10) + i_x, "* 03 * * * ?", "CRON_DRIVEN", l_url_com.get(k));
                    SendMerge("MergeContent_" + inputLine + "_day", 600.0, 400 + i_x, "10 sec", "TIMER_DRIVEN", l_url_com.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_hour", 1200, (10) + i_x, "/user/talend/staging/" + inputLine+"/"+l_loc.get(k)+"/merge", l_url_com.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_error", 600.0, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+"/"+l_loc.get(k), l_url_com.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_failure", 1200, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+"/"+l_loc.get(k), l_url_com.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_day", 1200, (400) + i_x, "/user/talend/staging/" + inputLine+"/"+l_loc.get(k)+"/merge", l_url_com.get(k));
                    SendGetHdfsDay("GetHdfs_" + inputLine + "_day", 10, (400) + i_x, "/user/talend/staging/" + inputLine+"/"+l_loc.get(k)+"/merge", "* 31 * * * ?", "CRON_DRIVEN", l_url_com.get(k));
                    i_x = i_x + 1000;
                    j_y = j_y + 1000;
                }

            }
        }
        in.close();
    }

    private static void ReadDWH_subscription()throws Exception {
        //URL oracle = new URL("http://dwh-schemaservice-stage.cyberservices.local:2876/schema-repo");
        //BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        List<String> l_url_subs = new ArrayList<String>();
        l_url_subs.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d64b727-015f-1000-ffff-ffff86968c13/processors");
        l_url_subs.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d64f03f-015f-1000-0000-000067f59e94/processors");
        l_url_subs.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d64cf03-015f-1000-0000-0000526b1b0a/processors");
        l_url_subs.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d650a53-015f-1000-0000-00007aa1797c/processors");
        l_url_subs.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/819b195c-015f-1000-ffff-ffff85c49f58/processors");

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
                    SendConsumer("Consumer_" + inputLine, "stg_" + inputLine, 10, (10) + i_x, l_url_subs.get(k), l_loc.get(k));
                    SendMerge("MergeContent_" + inputLine + "_hour", 600.0, (10) + i_x, "* 03 * * * ?", "CRON_DRIVEN", l_url_subs.get(k));
                    SendMerge("MergeContent_" + inputLine + "_day", 600.0, 400 + i_x, "10 sec", "TIMER_DRIVEN", l_url_subs.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_hour", 1200, (10) + i_x, "/user/talend/staging/" + inputLine+"/"+l_loc.get(k)+"/merge", l_url_subs.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_error", 600.0, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+"/"+l_loc.get(k), l_url_subs.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_failure", 1200, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+"/"+l_loc.get(k), l_url_subs.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_day", 1200, (400) + i_x, "/user/talend/staging/" + inputLine+"/"+l_loc.get(k)+"/merge", l_url_subs.get(k));
                    SendGetHdfsDay("GetHdfs_" + inputLine + "_day", 10, (400) + i_x, "/user/talend/staging/" + inputLine+"/"+l_loc.get(k)+"/merge", "* 31 * * * ?", "CRON_DRIVEN", l_url_subs.get(k));
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
        l_url_mail.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d50abf1-015f-1000-0000-0000777ee6c7/processors");
        l_url_mail.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d50c50d-015f-1000-0000-000009b10c20/processors");
        l_url_mail.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d50ec3d-015f-1000-0000-00004253cb3a/processors");
        l_url_mail.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d510cc8-015f-1000-0000-000027020cb9/processors");
        l_url_mail.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/819c915b-015f-1000-0000-00000503c2f7/processors");

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
                    SendConsumer("Consumer_" + inputLine, "stg_" + inputLine, 10, (10) + i_x, l_url_mail.get(k), l_loc.get(k));
                    SendMerge("MergeContent_" + inputLine + "_hour", 600.0, (10) + i_x, "* 04 * * * ?", "CRON_DRIVEN", l_url_mail.get(k));
                    SendMerge("MergeContent_" + inputLine + "_day", 600.0, 400 + i_x, "10 sec", "TIMER_DRIVEN", l_url_mail.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_hour", 1200, (10) + i_x, "/user/talend/staging/" + inputLine+"/"+l_loc.get(k)+"/merge", l_url_mail.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_error", 600.0, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+"/"+l_loc.get(k), l_url_mail.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_failure", 1200, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+"/"+l_loc.get(k), l_url_mail.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_day", 1200, (400) + i_x, "/user/talend/staging/" + inputLine+"/"+l_loc.get(k)+"/merge", l_url_mail.get(k));
                    SendGetHdfsDay("GetHdfs_" + inputLine + "_day", 10, (400) + i_x, "/user/talend/staging/" + inputLine+"/"+l_loc.get(k)+"/merge", "* 31 * * * ?", "CRON_DRIVEN", l_url_mail.get(k));
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
            /*
            if(rpg.getProcessors().get(z).getComponent().getName().contains("Consumer")) {
                name = rpg.getProcessors().get(z).getComponent().getName();
                id = rpg.getProcessors().get(z).getComponent().getId();
                version = rpg.getProcessors().get(z).getRevision().getVersion().longValue();
                url=rpg.getProcessors().get(z).getUri();
                Update update= new Update(id, name,state,clientID,version,"success");
                SendUpdate(update,url);

            }
           /* if(rpg.getProcessors().get(z).getComponent().getName().contains("Get")) {
                name = rpg.getProcessors().get(z).getComponent().getName();
                id = rpg.getProcessors().get(z).getComponent().getId();
                version = rpg.getProcessors().get(z).getRevision().getVersion().longValue();
                url=rpg.getProcessors().get(z).getUri();
                Update update= new Update(id, name,state,clientID,version,"success");
                SendUpdate(update,url);

            }
            */
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


        }

        return list_familie;
    }

    public static void ReadDWH_purchase() throws Exception {

        List<String> l_url_purchase = new ArrayList<String>();
        l_url_purchase.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/1c493853-2b23-122e-ba8c-c905608b0806/processors");
        l_url_purchase.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/08113ca4-dd7c-135e-9b6c-2a20f51f8cd8/processors");
        l_url_purchase.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/3c323317-fb46-173d-aeb1-b95188af5149/processors");
        l_url_purchase.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/8d543e88-9b32-1944-aebc-b0d9f90a21c3/processors");
        l_url_purchase.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/81895d30-015f-1000-ffff-ffffce2df0a9/processors");

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
                    SendConsumer("Consumer_" + inputLine, "stg_" + inputLine, 10, (10) + i_x, l_url_purchase.get(k), l_loc.get(k));
                    SendMerge("MergeContent_" + inputLine + "_hour", 600.0, (10) + i_x, "* 03 * * * ?", "CRON_DRIVEN", l_url_purchase.get(k));
                    SendMerge("MergeContent_" + inputLine + "_day", 600.0, 400 + i_x, "10 sec", "TIMER_DRIVEN", l_url_purchase.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_hour", 1200, (10) + i_x, "/user/talend/staging/" + inputLine+"/"+l_loc.get(k)+"/merge", l_url_purchase.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_error", 600.0, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+"/"+l_loc.get(k), l_url_purchase.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_failure", 1200, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+"/"+l_loc.get(k), l_url_purchase.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_day", 1200, (400) + i_x, "/user/talend/staging/" + inputLine+"/"+l_loc.get(k)+"/merge", l_url_purchase.get(k));
                    SendGetHdfsDay("GetHdfs_" + inputLine + "_day", 10, (400) + i_x, "/user/talend/staging/" + inputLine+"/"+l_loc.get(k)+"/merge", "* 31 * * * ?", "CRON_DRIVEN", l_url_purchase.get(k));
                    i_x = i_x + 1000;
                    j_y = j_y + 1000;
                }

            }
        }
        in.close();
    }

    public static void ReadDWH_usage() throws Exception {
        List<String> l_url_usage = new ArrayList<String>();
        l_url_usage.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d04a7-015f-1000-0000-00007587fed5/processors");//tp
        l_url_usage.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d0518-015f-1000-0000-0000374b06f1/processors");//ddach
        l_url_usage.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d0587-015f-1000-0000-0000718eef50/processors");//dint
        l_url_usage.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/045e3481-a47b-1778-8dcd-a66f603c162a/processors");//ac
        l_url_usage.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/8133b6d6-015f-1000-ffff-ffff9f94fd13/processors");//id

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
                    SendConsumer("Consumer_" + inputLine, "stg_" + inputLine, 10, (10) + i_x, l_url_usage.get(k), l_loc.get(k));
                    SendMerge("MergeContent_" + inputLine + "_hour", 600.0, (10) + i_x, "* 01 * * * ?", "CRON_DRIVEN", l_url_usage.get(k));
                    SendMerge("MergeContent_" + inputLine + "_day", 600.0, 400 + i_x, "10 sec", "TIMER_DRIVEN", l_url_usage.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_hour", 1200, (10) + i_x, "/user/talend/staging/" + inputLine+"/"+l_loc.get(k)+"/merge", l_url_usage.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_error", 600.0, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+"/"+l_loc.get(k), l_url_usage.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_failure", 1200, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+"/"+l_loc.get(k), l_url_usage.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_day", 1200, (400) + i_x, "/user/talend/staging/" + inputLine+"/"+l_loc.get(k)+"/merge", l_url_usage.get(k));
                    SendGetHdfsDay("GetHdfs_" + inputLine + "_day", 10, (400) + i_x, "/user/talend/staging/" + inputLine+"/"+l_loc.get(k)+"/merge", "* 30 * * * ?", "CRON_DRIVEN", l_url_usage.get(k));
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
        l_url_user.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/2a873c97-fc86-1739-981c-0bcd9e3498b5/processors");//tp
        l_url_user.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/bb9338d3-3ebe-150f-beb3-bf693fa7678c/processors");//ddach
        l_url_user.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/8d2030e0-fcb9-15f8-b6b1-53eb50346872/processors");//dint
        l_url_user.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/a8b43aeb-5944-1d3d-8c1b-6cded7c6f05a/processors");//ac
        l_url_user.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/8186e4f7-015f-1000-ffff-ffffa9458dbe/processors");//id


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
                    SendConsumer("Consumer_" + inputLine, "stg_" + inputLine, 10, (10) + i_x, l_url_user.get(k), l_loc.get(k));
                    SendMerge("MergeContent_" + inputLine + "_hour", 600.0, (10) + i_x, "* 02 * * * ?", "CRON_DRIVEN", l_url_user.get(k));
                    SendMerge("MergeContent_" + inputLine + "_day", 600.0, 400 + i_x, "10 sec", "TIMER_DRIVEN", l_url_user.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_hour", 1200, (10) + i_x, "/user/talend/staging/" + inputLine+"/"+l_loc.get(k)+"/merge", l_url_user.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_error", 600.0, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+"/"+l_loc.get(k), l_url_user.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_failure", 1200, (200) + i_x, "/user/talend/logging/nifi/" + inputLine + "_batch"+"/"+l_loc.get(k), l_url_user.get(k));
                    SendPutHdfs("PutHdfs_" + inputLine + "_day", 1200, (400) + i_x, "/user/talend/staging/" + inputLine+"/"+l_loc.get(k)+"/merge", l_url_user.get(k));
                    SendGetHdfsDay("GetHdfs_" + inputLine + "_day", 10, (400) + i_x, "/user/talend/staging/" + inputLine+"/"+l_loc.get(k)+"/merge", "* 31 * * * ?", "CRON_DRIVEN", l_url_user.get(k));
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
        //Component co = new Component(p, pr,name);
        SendHttp(gson, data, url);


    }
    public static void SendConnection(String d_id,String d_type,String d_groupId,String d_name,String s_id,String s_type,String s_groupId,String s_name,String Relations,String url)throws Exception{
        //String url="http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d0518-015f-1000-0000-0000374b06f1/connections";
        //http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/8d543e88-9b32-1944-aebc-b0d9f90a21c3/processors
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
        // String url = url_s;
        //String url="http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/root/process-groups";
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















