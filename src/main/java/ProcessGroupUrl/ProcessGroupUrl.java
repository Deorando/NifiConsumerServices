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

       this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d04a7-015f-1000-0000-00007587fed5/processors");
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d0518-015f-1000-0000-0000374b06f1/processors");
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d0587-015f-1000-0000-0000718eef50/processors");
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/045e3481-a47b-1778-8dcd-a66f603c162a/processors");
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/2a873c97-fc86-1739-981c-0bcd9e3498b5/processors");
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/bb9338d3-3ebe-150f-beb3-bf693fa7678c/processors");
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/8d2030e0-fcb9-15f8-b6b1-53eb50346872/processors");
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/a8b43aeb-5944-1d3d-8c1b-6cded7c6f05a/processors");
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/1c493853-2b23-122e-ba8c-c905608b0806/processors");
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/08113ca4-dd7c-135e-9b6c-2a20f51f8cd8/processors");
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/3c323317-fb46-173d-aeb1-b95188af5149/processors");
        this.process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/8d543e88-9b32-1944-aebc-b0d9f90a21c3/processors");

        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d04a7-015f-1000-0000-00007587fed5/connections");
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d0518-015f-1000-0000-0000374b06f1/connections");
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/595d0587-015f-1000-0000-0000718eef50/connections");
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/045e3481-a47b-1778-8dcd-a66f603c162a/connections");
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/2a873c97-fc86-1739-981c-0bcd9e3498b5/connections");
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/bb9338d3-3ebe-150f-beb3-bf693fa7678c/connections");
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/8d2030e0-fcb9-15f8-b6b1-53eb50346872/connections");
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/a8b43aeb-5944-1d3d-8c1b-6cded7c6f05a/connections");
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/1c493853-2b23-122e-ba8c-c905608b0806/connections");
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/08113ca4-dd7c-135e-9b6c-2a20f51f8cd8/connections");
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/3c323317-fb46-173d-aeb1-b95188af5149/connections");
        this.process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/8d543e88-9b32-1944-aebc-b0d9f90a21c3/connections");



       process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d50abf1-015f-1000-0000-0000777ee6c7/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d50c50d-015f-1000-0000-000009b10c20/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d50ec3d-015f-1000-0000-00004253cb3a/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d510cc8-015f-1000-0000-000027020cb9/processors");

        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d64b727-015f-1000-ffff-ffff86968c13/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d64f03f-015f-1000-0000-000067f59e94/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d64cf03-015f-1000-0000-0000526b1b0a/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d650a53-015f-1000-0000-00007aa1797c/processors");

        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d6eead9-015f-1000-ffff-ffff8b3e3e3b/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d6f00df-015f-1000-ffff-ffff89d4f62f/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d6f4046-015f-1000-0000-00001e6bac70/processors");
        process_group_url.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d6f5a50-015f-1000-0000-000078e07790/processors");

        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d50abf1-015f-1000-0000-0000777ee6c7/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d50c50d-015f-1000-0000-000009b10c20/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d50ec3d-015f-1000-0000-00004253cb3a/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d510cc8-015f-1000-0000-000027020cb9/connections");

       process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d64b727-015f-1000-ffff-ffff86968c13/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d64f03f-015f-1000-0000-000067f59e94/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d64cf03-015f-1000-0000-0000526b1b0a/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d650a53-015f-1000-0000-00007aa1797c/connections");

        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d6eead9-015f-1000-ffff-ffff8b3e3e3b/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d6f00df-015f-1000-ffff-ffff89d4f62f/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d6f4046-015f-1000-0000-00001e6bac70/connections");
        process_group_url_con.add("http://nifi01s.cyberservices.local:8080/nifi-api/process-groups/7d6f5a50-015f-1000-0000-000078e07790/connections");
    }
}
