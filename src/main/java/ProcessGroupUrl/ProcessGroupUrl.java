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

        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/907c33c7-4960-125d-9426-db3fe7ac990b/processors");//Usage_tp
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/c7943b13-08f6-1956-88ae-1fa3e6d9c1bd/processors");//Usage_ddach
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/02f33e7b-1703-1181-9d4e-87ebec3cc4ad/processors");//Usage_dint
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/a24e3677-96a7-1c4e-9efb-d2b26bb471e3/processors");//Usage_ac
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/1b0b3f65-d075-1b7f-a014-b048a275576a/processors");//Usage_id
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/98ec3cb0-0cdf-1924-9fca-ded85b044065/processors");//Usage_empty
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/a24536dc-115f-1e15-a1af-598b0cb7d35e/processors");//Mail_tp
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/69f43673-08a5-17a7-a354-8fa0a44610a8/processors");//Mail_ddach
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/7fed3025-560e-1eb6-8c8b-67773d2b017f/processors");//Mail_dint
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/29a53ced-f687-181b-b3e9-7d9ff50e8ff1/processors");//Mail_ac
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/cfa337b9-74ea-12df-ae50-a3564419da4a/processors");//Mail_id
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/80a13781-b4dc-1e53-97ba-704b84b86e16/processors");//Mail_empty
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/716b3887-e163-1450-b0b5-cca4e6571ee3/processors");//User_tp
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/46ee3307-43db-10ed-baa4-b1584886bfe8/processors");//User_ddach
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/68793f1f-a8a9-154a-a398-dc09c8343b5a/processors");//User_dint
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/18523d02-ccd2-12a8-a97a-24c231f83863/processors");//User_ac
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/256f32d9-b7ac-1866-abb9-aac74c70ee1c/processors");//User_id
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/80863d91-8105-1869-bc82-ad705f92d888/processors");//User_empty
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/44f33729-10a5-1183-a880-d04aa7ae9fd9/processors");//Commission_tp
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/0f9534df-d2a6-1244-965d-5301e6b63f88/processors");//Commission_ddach
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/2c1b3c30-671d-1ddf-8881-5137ec91ebc1/processors");//Commission_dint
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/9234315a-8928-107a-b53b-5913d7df0f42/processors");//Commission_ac
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/c4173e95-719c-169a-a726-5361830f9c69/processors");//Commission_id
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/c2a1369c-9fc6-1eba-8c91-5fbafa9198dc/processors");//Commission_empty
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/972e3011-df99-16a1-9764-6647228cf291/processors");//Subscription_tp
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/f86d3856-fa7e-1972-a7a2-9fd2668a675b/processors");//Subscription_ddach
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/9c7c370b-20f2-1a4a-b651-62602f7f91fe/processors");//Subscription_dint
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/97ea3202-7d3a-1bf6-b248-100f676d6a78/processors");//Subscription_ac
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/7b3c3095-4e1d-1b49-a091-329a0e4b9cdf/processors");//Subscription_id
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/7b963937-4853-1ee1-b265-8f69cc0257c5/processors");//Subscription_empty
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/e5bea91c-015f-1000-ffff-ffffa83f1849/processors");//Purchase_tp
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/930b3376-c5e7-1ec0-806b-e18bc045c6a6/processors");//Purchase_ddach
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/88e836e4-7b87-177c-8a55-05e16bc8f770/processors");//Purchase_dint
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/b27233e9-46b9-19bb-8838-a742491a3312/processors");//Purchase_ac
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/2e333f5a-a55c-1507-8ef3-4388040e0bdd/processors");//Purchase_id
        this.process_group_url.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/14d03518-68f1-1207-9296-72760299db67/processors");//Purchase_empty


        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/907c33c7-4960-125d-9426-db3fe7ac990b/connections");//Usage_tp
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/c7943b13-08f6-1956-88ae-1fa3e6d9c1bd/connections");//Usage_ddach
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/02f33e7b-1703-1181-9d4e-87ebec3cc4ad/connections");//Usage_dint
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/a24e3677-96a7-1c4e-9efb-d2b26bb471e3/connections");//Usage_ac
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/1b0b3f65-d075-1b7f-a014-b048a275576a/connections");//Usage_id
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/98ec3cb0-0cdf-1924-9fca-ded85b044065/connections");//Usage_empty
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/a24536dc-115f-1e15-a1af-598b0cb7d35e/connections");//Mail_tp
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/69f43673-08a5-17a7-a354-8fa0a44610a8/connections");//Mail_ddach
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/7fed3025-560e-1eb6-8c8b-67773d2b017f/connections");//Mail_dint
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/29a53ced-f687-181b-b3e9-7d9ff50e8ff1/connections");//Mail_ac
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/cfa337b9-74ea-12df-ae50-a3564419da4a/connections");//Mail_id
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/80a13781-b4dc-1e53-97ba-704b84b86e16/connections");//Mail_empty
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/716b3887-e163-1450-b0b5-cca4e6571ee3/connections");//User_tp
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/46ee3307-43db-10ed-baa4-b1584886bfe8/connections");//User_ddach
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/68793f1f-a8a9-154a-a398-dc09c8343b5a/connections");//User_dint
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/18523d02-ccd2-12a8-a97a-24c231f83863/connections");//User_ac
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/256f32d9-b7ac-1866-abb9-aac74c70ee1c/connections");//User_id
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/80863d91-8105-1869-bc82-ad705f92d888/connections");//User_empty
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/44f33729-10a5-1183-a880-d04aa7ae9fd9/connections");//Commission_tp
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/0f9534df-d2a6-1244-965d-5301e6b63f88/connections");//Commission_ddach
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/2c1b3c30-671d-1ddf-8881-5137ec91ebc1/connections");//Commission_dint
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/9234315a-8928-107a-b53b-5913d7df0f42/connections");//Commission_ac
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/c4173e95-719c-169a-a726-5361830f9c69/connections");//Commission_id
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/c2a1369c-9fc6-1eba-8c91-5fbafa9198dc/connections");//Commission_empty
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/972e3011-df99-16a1-9764-6647228cf291/connections");//Subscription_tp
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/f86d3856-fa7e-1972-a7a2-9fd2668a675b/connections");//Subscription_ddach
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/9c7c370b-20f2-1a4a-b651-62602f7f91fe/connections");//Subscription_dint
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/97ea3202-7d3a-1bf6-b248-100f676d6a78/connections");//Subscription_ac
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/7b3c3095-4e1d-1b49-a091-329a0e4b9cdf/connections");//Subscription_id
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/7b963937-4853-1ee1-b265-8f69cc0257c5/connections");//Subscription_empty
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/e5bea91c-015f-1000-ffff-ffffa83f1849/connections");//Purchase_tp
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/930b3376-c5e7-1ec0-806b-e18bc045c6a6/connections");//Purchase_ddach
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/88e836e4-7b87-177c-8a55-05e16bc8f770/connections");//Purchase_dint
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/b27233e9-46b9-19bb-8838-a742491a3312/connections");//Purchase_ac
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/2e333f5a-a55c-1507-8ef3-4388040e0bdd/connections");//Purchase_id
        this.process_group_url_con.add("http://nifi01.cyberservices.local:8080/nifi-api/process-groups/14d03518-68f1-1207-9296-72760299db67/connections");//Purchase_empty








    }
}
