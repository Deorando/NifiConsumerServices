package ProcessGroupUrl;

import ReaderGroup.ReadProcessGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thomas.palyska on 02.11.2017.
 */
public class ProcessGroupUrl {
     ReadProcessGroup rpg = null;
     List<String> process_group_url = new ArrayList<String>();
     List<String> process_group_url_con = new ArrayList<String>();

    public ReadProcessGroup getRpg() {
        return rpg;
    }

    public void setRpg(ReadProcessGroup rpg) {
        this.rpg = rpg;
    }

    public List<String> getProcess_group_url() {
        return process_group_url;
    }

    public void setProcess_group_url(List<String> process_group_url) {
        this.process_group_url = process_group_url;
    }

    public List<String> getProcess_group_url_con() {
        return process_group_url_con;
    }

    public void setProcess_group_url_con(List<String> process_group_url_con) {
        this.process_group_url_con = process_group_url_con;
    }

    public ProcessGroupUrl() {

        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/c95fdea7-015f-1000-ffff-ffffda3afe01/processors");//Usage_tp
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/533b3e7a-1f1d-1c27-99a7-6f37368c0f19/processors");//Usage_ddach
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/0cf635aa-47d7-16cc-be34-f4ea4fce828d/processors");//Usage_dint
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/9a683d4d-c6df-1d28-8df8-dd4355546246/processors");//Usage_ac
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/d3e23988-2b8e-1429-a45b-59275008dd46/processors");//Usage_id
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/926630f5-3ee2-1c4e-8b93-98d0cb7029f9/processors");//Usage_empty
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/ddd232cb-6a37-1a51-a0bb-58d6e84febf3/processors");//Mail_tp
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/73df3e44-eebb-1d97-aea7-8c8bd14b24f7/processors");//Mail_ddach
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/014634fa-c48e-1deb-8496-d4d12d94e147/processors");//Mail_dint
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/9e2834a0-b943-129d-9f7a-e61443681127/processors");//Mail_ac
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/4ef33d43-8d77-134b-90fc-78981a510f39/processors");//Mail_id
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/a2a43f6e-3f67-1116-8365-7b8cbb7a27e7/processors");//Mail_empty
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/c079355e-4b66-16f1-9744-40b5fbf614d1/processors");//User_tp
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/413a387f-e869-15ef-8ebe-641d1c4d677f/processors");//User_ddach
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/3b8a3d68-b24f-1824-8f5c-af58040b4898/processors");//User_dint
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/32d9353d-2294-1924-b503-1f6454e77676/processors");//User_ac
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/331e3ce4-9100-120d-86c5-a2e03e2eed1c/processors");//User_id
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/a94c32a1-6f7a-10d0-874e-98f28221f475/processors");//User_empty
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/357c3bee-f918-182c-8d3d-804e13018cac/processors");//Commission_tp
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/c4633f4d-4d06-19b4-bf3b-26a3356c5b7c/processors");//Commission_ddach
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/44103009-7328-1e97-a740-c300f52ca75f/processors");//Commission_dint
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/cfca358a-a60c-1205-986a-ba4cfceed52b/processors");//Commission_ac
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/41083564-225c-1c83-aac9-56e2589cb9bc/processors");//Commission_id
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/b6ee31b0-86e2-1d08-b2e8-00e2c625005e/processors");//Commission_empty
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/9e0a344a-14b1-1836-91d7-ad743bbc732a/processors");//Subscription_tp
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/3da93842-cfa3-19e9-9535-bf6cbfe0888e/processors");//Subscription_ddach
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/5b5e3734-b77d-1a11-baad-cccdfb891b57/processors");//Subscription_dint
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/187e306d-465b-15a1-961d-ebd174345c4c/processors");//Subscription_ac
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/ee633ad9-dac0-1618-939d-007f9c014f1e/processors");//Subscription_id
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/2cf53460-f0a0-15b0-9c4e-13e77e944a6b/processors");//Subscription_empty
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/809330a5-7325-16fc-8ca9-32d8d0a6ab86/processors");//Purchase_tp
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/77663861-dc5e-17f5-9448-d9879646a837/processors");//Purchase_ddach
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/ec4232c9-8011-1ea7-a9b0-288259017712/processors");//Purchase_dint
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/5ac032f2-f49b-19be-b8c0-3a6aa223ca81/processors");//Purchase_ac
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/dd2b3a79-d33a-1b02-9e17-cfd0f8a39aa4/processors");//Purchase_id
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/800933e8-2e8f-165d-ab0c-053fbb5f68a3/processors");//Purchase_empty

        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/c95fdea7-015f-1000-ffff-ffffda3afe01/connections");//Usage_tp
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/533b3e7a-1f1d-1c27-99a7-6f37368c0f19/connections");//Usage_ddach
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/0cf635aa-47d7-16cc-be34-f4ea4fce828d/connections");//Usage_dint
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/9a683d4d-c6df-1d28-8df8-dd4355546246/connections");//Usage_ac
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/d3e23988-2b8e-1429-a45b-59275008dd46/connections");//Usage_id
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/926630f5-3ee2-1c4e-8b93-98d0cb7029f9/connections");//Usage_empty
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/ddd232cb-6a37-1a51-a0bb-58d6e84febf3/connections");//Mail_tp
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/73df3e44-eebb-1d97-aea7-8c8bd14b24f7/connections");//Mail_ddach
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/014634fa-c48e-1deb-8496-d4d12d94e147/connections");//Mail_dint
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/9e2834a0-b943-129d-9f7a-e61443681127/connections");//Mail_ac
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/4ef33d43-8d77-134b-90fc-78981a510f39/connections");//Mail_id
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/a2a43f6e-3f67-1116-8365-7b8cbb7a27e7/connections");//Mail_empty
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/c079355e-4b66-16f1-9744-40b5fbf614d1/connections");//User_tp
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/413a387f-e869-15ef-8ebe-641d1c4d677f/connections");//User_ddach
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/3b8a3d68-b24f-1824-8f5c-af58040b4898/connections");//User_dint
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/32d9353d-2294-1924-b503-1f6454e77676/connections");//User_ac
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/331e3ce4-9100-120d-86c5-a2e03e2eed1c/connections");//User_id
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/a94c32a1-6f7a-10d0-874e-98f28221f475/connections");//User_empty
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/357c3bee-f918-182c-8d3d-804e13018cac/connections");//Commission_tp
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/c4633f4d-4d06-19b4-bf3b-26a3356c5b7c/connections");//Commission_ddach
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/44103009-7328-1e97-a740-c300f52ca75f/connections");//Commission_dint
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/cfca358a-a60c-1205-986a-ba4cfceed52b/connections");//Commission_ac
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/41083564-225c-1c83-aac9-56e2589cb9bc/connections");//Commission_id
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/b6ee31b0-86e2-1d08-b2e8-00e2c625005e/connections");//Commission_empty
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/9e0a344a-14b1-1836-91d7-ad743bbc732a/connections");//Subscription_tp
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/3da93842-cfa3-19e9-9535-bf6cbfe0888e/connections");//Subscription_ddach
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/5b5e3734-b77d-1a11-baad-cccdfb891b57/connections");//Subscription_dint
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/187e306d-465b-15a1-961d-ebd174345c4c/connections");//Subscription_ac
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/ee633ad9-dac0-1618-939d-007f9c014f1e/connections");//Subscription_id
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/2cf53460-f0a0-15b0-9c4e-13e77e944a6b/connections");//Subscription_empty
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/809330a5-7325-16fc-8ca9-32d8d0a6ab86/connections");//Purchase_tp
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/77663861-dc5e-17f5-9448-d9879646a837/connections");//Purchase_ddach
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/ec4232c9-8011-1ea7-a9b0-288259017712/connections");//Purchase_dint
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/5ac032f2-f49b-19be-b8c0-3a6aa223ca81/connections");//Purchase_ac
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/dd2b3a79-d33a-1b02-9e17-cfd0f8a39aa4/connections");//Purchase_id
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/800933e8-2e8f-165d-ab0c-053fbb5f68a3/connections");//Purchase_empty








    }
}
