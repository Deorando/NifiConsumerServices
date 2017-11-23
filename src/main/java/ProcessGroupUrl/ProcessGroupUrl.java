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


        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/907c33c7-4960-125d-70ba-404f02c1fbdd/processors");//Usage_tp
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/c7943b13-08f6-1956-2a2f-c79ce03f5866/processors");//Usage_ddach
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/02f33e7b-1703-1181-02fb-fab9242f72d7/processors");//Usage_dint
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/a24e3677-96a7-1c4e-795b-6b55dfac38d7/processors");//Usage_ac
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/1b0b3f65-d075-1b7f-85c3-7c3103130a6c/processors");//Usage_id
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/98ec3cb0-0cdf-1924-eb73-653830f936dc/processors");//Usage_empty
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/a24536dc-115f-1e15-cc10-c24f16777443/processors");//Mail_tp
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/69f43673-08a5-17a7-f7b7-46752cda1ce5/processors");//Mail_ddach
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7fed3025-560e-1eb6-3100-be7917be85c6/processors");//Mail_dint
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/29a53ced-f687-181b-1664-c4ed948b61d2/processors");//Mail_ac
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/cfa337b9-74ea-12df-5b43-77d5266d3c2c/processors");//Mail_id
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/80a13781-b4dc-1e53-1af1-3085de552dba/processors");//Mail_empty
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/716b3887-e163-1450-7604-d7ef638d267a/processors");//User_tp
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/46ee3307-43db-10ed-3f35-b4085e6bd8d8/processors");//User_ddach
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/68793f1f-a8a9-154a-1cb1-f753caefaf6e/processors");//User_dint
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/18523d02-ccd2-12a8-0497-1310deac6991/processors");//User_ac
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/256f32d9-b7ac-1866-b7d0-0cdfa0fc6b8a/processors");//User_id
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/80863d91-8105-1869-b7fa-0e1352b74904/processors");//User_empty
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/44f33729-10a5-1183-e63c-11f2b3aa9097/processors");//Commission_tp
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/0f9534df-d2a6-1244-41c7-7dc037087043/processors");//Commission_ddach
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/2c1b3c30-671d-1ddf-760f-eda299abaf05/processors");//Commission_dint
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/9234315a-8928-107a-3c78-c2f2ae738352/processors");//Commission_ac
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/c4173e95-719c-169a-0043-97b71f2b95cf/processors");//Commission_id
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/c2a1369c-9fc6-1eba-91a9-43dd8399b9b2/processors");//Commission_empty
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/972e3011-df99-16a1-666b-8636ee6aea70/processors");//Subscription_tp
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/f86d3856-fa7e-1972-6f7e-63f4ab0f6ab2/processors");//Subscription_ddach
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/9c7c370b-20f2-1a4a-c861-2c34d87319bb/processors");//Subscription_dint
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/97ea3202-7d3a-1bf6-5da0-f6b86a02a470/processors");//Subscription_ac
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7b3c3095-4e1d-1b49-69f9-2c25da2729f7/processors");//Subscription_id
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7b963937-4853-1ee1-6754-345df58a345a/processors");//Subscription_empty
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e5bea91c-015f-1000-6690-085f17debb1a/processors");//Purchase_tp
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/930b3376-c5e7-1ec0-92d3-499826ae5db8/processors");//Purchase_ddach
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/88e836e4-7b87-177c-b709-008ff42310f7/processors");//Purchase_dint
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/b27233e9-46b9-19bb-1b54-3b79d94ae69b/processors");//Purchase_ac
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/2e333f5a-a55c-1507-79c2-1801df57f495/processors");//Purchase_id
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/14d03518-68f1-1207-14bf-c32afa28294b/processors");//Purchase_empty



        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/907c33c7-4960-125d-70ba-404f02c1fbdd/connections");//Usage_tp
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/c7943b13-08f6-1956-2a2f-c79ce03f5866/connections");//Usage_ddach
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/02f33e7b-1703-1181-02fb-fab9242f72d7/connections");//Usage_dint
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/a24e3677-96a7-1c4e-795b-6b55dfac38d7/connections");//Usage_ac
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/1b0b3f65-d075-1b7f-85c3-7c3103130a6c/connections");//Usage_id
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/98ec3cb0-0cdf-1924-eb73-653830f936dc/connections");//Usage_empty
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/a24536dc-115f-1e15-cc10-c24f16777443/connections");//Mail_tp
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/69f43673-08a5-17a7-f7b7-46752cda1ce5/connections");//Mail_ddach
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7fed3025-560e-1eb6-3100-be7917be85c6/connections");//Mail_dint
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/29a53ced-f687-181b-1664-c4ed948b61d2/connections");//Mail_ac
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/cfa337b9-74ea-12df-5b43-77d5266d3c2c/connections");//Mail_id
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/80a13781-b4dc-1e53-1af1-3085de552dba/connections");//Mail_empty
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/716b3887-e163-1450-7604-d7ef638d267a/connections");//User_tp
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/46ee3307-43db-10ed-3f35-b4085e6bd8d8/connections");//User_ddach
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/68793f1f-a8a9-154a-1cb1-f753caefaf6e/connections");//User_dint
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/18523d02-ccd2-12a8-0497-1310deac6991/connections");//User_ac
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/256f32d9-b7ac-1866-b7d0-0cdfa0fc6b8a/connections");//User_id
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/80863d91-8105-1869-b7fa-0e1352b74904/connections");//User_empty
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/44f33729-10a5-1183-e63c-11f2b3aa9097/connections");//Commission_tp
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/0f9534df-d2a6-1244-41c7-7dc037087043/connections");//Commission_ddach
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/2c1b3c30-671d-1ddf-760f-eda299abaf05/connections");//Commission_dint
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/9234315a-8928-107a-3c78-c2f2ae738352/connections");//Commission_ac
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/c4173e95-719c-169a-0043-97b71f2b95cf/connections");//Commission_id
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/c2a1369c-9fc6-1eba-91a9-43dd8399b9b2/connections");//Commission_empty
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/972e3011-df99-16a1-666b-8636ee6aea70/connections");//Subscription_tp
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/f86d3856-fa7e-1972-6f7e-63f4ab0f6ab2/connections");//Subscription_ddach
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/9c7c370b-20f2-1a4a-c861-2c34d87319bb/connections");//Subscription_dint
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/97ea3202-7d3a-1bf6-5da0-f6b86a02a470/connections");//Subscription_ac
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7b3c3095-4e1d-1b49-69f9-2c25da2729f7/connections");//Subscription_id
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7b963937-4853-1ee1-6754-345df58a345a/connections");//Subscription_empty
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e5bea91c-015f-1000-6690-085f17debb1a/connections");//Purchase_tp
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/930b3376-c5e7-1ec0-92d3-499826ae5db8/connections");//Purchase_ddach
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/88e836e4-7b87-177c-b709-008ff42310f7/connections");//Purchase_dint
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/b27233e9-46b9-19bb-1b54-3b79d94ae69b/connections");//Purchase_ac
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/2e333f5a-a55c-1507-79c2-1801df57f495/connections");//Purchase_id
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/14d03518-68f1-1207-14bf-c32afa28294b/connections");//Purchase_empty









    }
}
