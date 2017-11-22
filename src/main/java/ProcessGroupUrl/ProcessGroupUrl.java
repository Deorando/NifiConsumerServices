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

        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e420e3e9-015f-1000-7ad1-a6c9ac996d0c/processors");//Usage_tp
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e4210101-015f-1000-5879-78aa7c648228/processors");//Usage_ddach
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e4212331-015f-1000-6280-ecb6fb2aee14/processors");//Usage_dint
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e421431b-015f-1000-4e06-45ff3c3ec5aa/processors");//Usage_ac
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e4216ec1-015f-1000-bff6-05a1f919b499/processors");//Usage_id
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e421922b-015f-1000-7efb-dd6862096ffa/processors");//Usage_empty
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e421d588-015f-1000-79ed-0517a44856e6/processors");//Mail_tp
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e421d589-015f-1000-8a42-23110738e44a/processors");//Mail_ddach
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e421d58a-015f-1000-513d-4108c2c17481/processors");//Mail_dint
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e421d58b-015f-1000-ea0f-8acfc1871757/processors");//Mail_ac
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e421d58c-015f-1000-9e2d-1a61a048b485/processors");//Mail_id
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e421d58d-015f-1000-b33a-4a80af41686c/processors");//Mail_empty
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e422f043-015f-1000-3c0f-e8e2c120e36f/processors");//User_tp
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e422f044-015f-1000-f7a6-6a9f88eb986e/processors");//User_ddach
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e422f045-015f-1000-b160-ccec7b851587/processors");//User_dint
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e422f046-015f-1000-f369-7750db77c8b6/processors");//User_ac
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e422f047-015f-1000-bdeb-a65477b764fc/processors");//User_id
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e422f048-015f-1000-b5e1-c9c9570d16f8/processors");//User_empty
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e4259f52-015f-1000-4a18-c71ee5c45d23/processors");//Commission_tp
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e4259f53-015f-1000-3852-b3e9373600e2/processors");//Commission_ddach
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e4259f54-015f-1000-b343-493287188902/processors");//Commission_dint
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e4259f55-015f-1000-b5d5-12a0cff68f57/processors");//Commission_ac
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e4259f56-015f-1000-2814-77f1632b12a3/processors");//Commission_id
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e4259f57-015f-1000-7dd7-6d829844c6a1/processors");//Commission_empty
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e423c602-015f-1000-30ea-9d5eb88b2394/processors");//Subscription_tp
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e423c603-015f-1000-c50a-2edb63df2c7e/processors");//Subscription_ddach
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e423c604-015f-1000-997b-e37fd945be53/processors");//Subscription_dint
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e423c605-015f-1000-ae90-75992994a9eb/processors");//Subscription_ac
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e423c606-015f-1000-8339-158c385dc669/processors");//Subscription_id
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e423c607-015f-1000-481a-1a2c82facba8/processors");//Subscription_empty
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e424c2c2-015f-1000-23c4-f99040e80ac3/processors");//Purchase_tp
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e424c2c3-015f-1000-cb8a-95e5af1c83a9/processors");//Purchase_ddach
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e424c2c4-015f-1000-dbaf-7aded8220522/processors");//Purchase_dint
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e424c2c5-015f-1000-812f-52e6168ff0bb/processors");//Purchase_ac
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e424c2c6-015f-1000-5bc0-767eb9495947/processors");//Purchase_id
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e424c2c7-015f-1000-9559-71238fd30298/processors");//Purchase_empty

        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e420e3e9-015f-1000-7ad1-a6c9ac996d0c/connections");//Usage_tp
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e4210101-015f-1000-5879-78aa7c648228/connections");//Usage_ddach
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e4212331-015f-1000-6280-ecb6fb2aee14/connections");//Usage_dint
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e421431b-015f-1000-4e06-45ff3c3ec5aa/connections");//Usage_ac
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e4216ec1-015f-1000-bff6-05a1f919b499/connections");//Usage_id
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e421922b-015f-1000-7efb-dd6862096ffa/connections");//Usage_empty
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e421d588-015f-1000-79ed-0517a44856e6/connections");//Mail_tp
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e421d589-015f-1000-8a42-23110738e44a/connections");//Mail_ddach
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e421d58a-015f-1000-513d-4108c2c17481/connections");//Mail_dint
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e421d58b-015f-1000-ea0f-8acfc1871757/connections");//Mail_ac
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e421d58c-015f-1000-9e2d-1a61a048b485/connections");//Mail_id
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e421d58d-015f-1000-b33a-4a80af41686c/connections");//Mail_empty
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e422f043-015f-1000-3c0f-e8e2c120e36f/connections");//User_tp
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e422f044-015f-1000-f7a6-6a9f88eb986e/connections");//User_ddach
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e422f045-015f-1000-b160-ccec7b851587/connections");//User_dint
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e422f046-015f-1000-f369-7750db77c8b6/connections");//User_ac
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e422f047-015f-1000-bdeb-a65477b764fc/connections");//User_id
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e422f048-015f-1000-b5e1-c9c9570d16f8/connections");//User_empty
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e4259f52-015f-1000-4a18-c71ee5c45d23/connections");//Commission_tp
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e4259f53-015f-1000-3852-b3e9373600e2/connections");//Commission_ddach
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e4259f54-015f-1000-b343-493287188902/connections");//Commission_dint
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e4259f55-015f-1000-b5d5-12a0cff68f57/connections");//Commission_ac
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e4259f56-015f-1000-2814-77f1632b12a3/connections");//Commission_id
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e4259f57-015f-1000-7dd7-6d829844c6a1/connections");//Commission_empty
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e423c602-015f-1000-30ea-9d5eb88b2394/connections");//Subscription_tp
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e423c603-015f-1000-c50a-2edb63df2c7e/connections");//Subscription_ddach
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e423c604-015f-1000-997b-e37fd945be53/connections");//Subscription_dint
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e423c605-015f-1000-ae90-75992994a9eb/connections");//Subscription_ac
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e423c606-015f-1000-8339-158c385dc669/connections");//Subscription_id
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e423c607-015f-1000-481a-1a2c82facba8/connections");//Subscription_empty
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e424c2c2-015f-1000-23c4-f99040e80ac3/connections");//Purchase_tp
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e424c2c3-015f-1000-cb8a-95e5af1c83a9/connections");//Purchase_ddach
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e424c2c4-015f-1000-dbaf-7aded8220522/connections");//Purchase_dint
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e424c2c5-015f-1000-812f-52e6168ff0bb/connections");//Purchase_ac
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e424c2c6-015f-1000-5bc0-767eb9495947/connections");//Purchase_id
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/e424c2c7-015f-1000-9559-71238fd30298/connections");//Purchase_empty








    }
}
