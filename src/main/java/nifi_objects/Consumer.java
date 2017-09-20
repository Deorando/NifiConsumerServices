package nifi_objects;


import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.List;
public class Consumer {
    /**
     * revision : {"version":2}
     * position : {"x":88.00000900219004,"y":288.00000158825503}
     * permissions : {"canRead":true,"canWrite":true}
     * component : {"position":{"x":88.00000900219004,"y":288.00000158825503},"name":"ConsumeAMQP","type":"org.apache.nifi.amqp.processors.ConsumeAMQP","state":"STOPPED","relationships":[{"name":"success","description":"All FlowFiles that are received from the AMQP queue are routed to this relationship","autoTerminate":false}],"supportsParallelProcessing":true,"supportsEventDriven":false,"supportsBatching":false,"persistsState":false,"restricted":false,"inputRequirement":"INPUT_FORBIDDEN","config":{"properties":{"Queue":null,"Host Name":"localhost","Port":"5672","Virtual Host":null,"User Name":"guest","Password":"guest","AMQP Version":"0.9.1","ssl-context-service":null,"ssl-client-auth":"REQUIRED"},"schedulingPeriod":"0 sec","schedulingStrategy":"TIMER_DRIVEN","executionNode":"ALL","penaltyDuration":"30 sec","yieldDuration":"1 sec","bulletinLevel":"WARN","runDurationMillis":0,"concurrentlySchedulableTaskCount":1,"comments":"","lossTolerant":false,"defaultConcurrentTasks":{"TIMER_DRIVEN":"1","EVENT_DRIVEN":"0","CRON_DRIVEN":"1"},"defaultSchedulingPeriod":{"TIMER_DRIVEN":"0 sec","CRON_DRIVEN":"* * * * * ?"}}}
     * inputRequirement : INPUT_FORBIDDEN
     */
    @SerializedName("revision")
    public RevisionBean revision;
    @SerializedName("position")
    public PositionBean position;
    @SerializedName("permissions")
    public PermissionsBean permissions;
    @SerializedName("component")
    public ComponentBean component;
    @SerializedName("inputRequirement")
    public String inputRequirement;
    public static Consumer objectFromData(String str) {
        return new Gson().fromJson(str, Consumer.class);
    }
    public static Consumer objectFromData(String str, String key) {
        try {
            JSONObject jsonObject = new JSONObject(str);
            return new Gson().fromJson(jsonObject.getString(str), Consumer.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static class RevisionBean {
        /**
         * version : 2
         */
        @SerializedName("version")
        public int version;
        public static RevisionBean objectFromData(String str) {
            return new Gson().fromJson(str, RevisionBean.class);
        }
        public static RevisionBean objectFromData(String str, String key) {
            try {
                JSONObject jsonObject = new JSONObject(str);
                return new Gson().fromJson(jsonObject.getString(str), RevisionBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public static class PositionBean {
        /**
         * x : 88.00000900219004
         * y : 288.00000158825503
         */
        @SerializedName("x")
        public double x;
        @SerializedName("y")
        public double y;
        public static PositionBean objectFromData(String str) {
            return new Gson().fromJson(str, PositionBean.class);
        }
        public static PositionBean objectFromData(String str, String key) {
            try {
                JSONObject jsonObject = new JSONObject(str);
                return new Gson().fromJson(jsonObject.getString(str), PositionBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public static class PermissionsBean {
        /**
         * canRead : true
         * canWrite : true
         */
        @SerializedName("canRead")
        public boolean canRead;
        @SerializedName("canWrite")
        public boolean canWrite;
        public static PermissionsBean objectFromData(String str) {
            return new Gson().fromJson(str, PermissionsBean.class);
        }
        public static PermissionsBean objectFromData(String str, String key) {
            try {
                JSONObject jsonObject = new JSONObject(str);
                return new Gson().fromJson(jsonObject.getString(str), PermissionsBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
    public static class ComponentBean {
        /**
         * position : {"x":88.00000900219004,"y":288.00000158825503}
         * name : ConsumeAMQP
         * type : org.apache.nifi.amqp.processors.ConsumeAMQP
         * state : STOPPED
         * relationships : [{"name":"success","description":"All FlowFiles that are received from the AMQP queue are routed to this relationship","autoTerminate":false}]
         * supportsParallelProcessing : true
         * supportsEventDriven : false
         * supportsBatching : false
         * persistsState : false
         * restricted : false
         * inputRequirement : INPUT_FORBIDDEN
         * config : {"properties":{"Queue":null,"Host Name":"localhost","Port":"5672","Virtual Host":null,"User Name":"guest","Password":"guest","AMQP Version":"0.9.1","ssl-context-service":null,"ssl-client-auth":"REQUIRED"},"schedulingPeriod":"0 sec","schedulingStrategy":"TIMER_DRIVEN","executionNode":"ALL","penaltyDuration":"30 sec","yieldDuration":"1 sec","bulletinLevel":"WARN","runDurationMillis":0,"concurrentlySchedulableTaskCount":1,"comments":"","lossTolerant":false,"defaultConcurrentTasks":{"TIMER_DRIVEN":"1","EVENT_DRIVEN":"0","CRON_DRIVEN":"1"},"defaultSchedulingPeriod":{"TIMER_DRIVEN":"0 sec","CRON_DRIVEN":"* * * * * ?"}}
         */
        @SerializedName("position")
        public PositionBeanX position;
        @SerializedName("name")
        public String name;
        @SerializedName("type")
        public String type;
        @SerializedName("state")
        public String state;
        @SerializedName("supportsParallelProcessing")
        public boolean supportsParallelProcessing;
        @SerializedName("supportsEventDriven")
        public boolean supportsEventDriven;
        @SerializedName("supportsBatching")
        public boolean supportsBatching;
        @SerializedName("persistsState")
        public boolean persistsState;
        @SerializedName("restricted")
        public boolean restricted;
        @SerializedName("inputRequirement")
        public String inputRequirement;
        @SerializedName("config")
        public ConfigBean config;
        @SerializedName("relationships")
        public List<RelationshipsBean> relationships;
        public static ComponentBean objectFromData(String str) {
            return new Gson().fromJson(str, ComponentBean.class);
        }
        public static ComponentBean objectFromData(String str, String key) {
            try {
                JSONObject jsonObject = new JSONObject(str);
                return new Gson().fromJson(jsonObject.getString(str), ComponentBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }
        public static class PositionBeanX {
            /**
             * x : 88.00000900219004
             * y : 288.00000158825503
             */
            @SerializedName("x")
            public double x;
            @SerializedName("y")
            public double y;
            public static PositionBeanX objectFromData(String str) {
                return new Gson().fromJson(str, PositionBeanX.class);
            }
            public static PositionBeanX objectFromData(String str, String key) {
                try {
                    JSONObject jsonObject = new JSONObject(str);
                    return new Gson().fromJson(jsonObject.getString(str), PositionBeanX.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return null;
            }
        }
        public static class ConfigBean {
            /**
             * properties : {"Queue":null,"Host Name":"localhost","Port":"5672","Virtual Host":null,"User Name":"guest","Password":"guest","AMQP Version":"0.9.1","ssl-context-service":null,"ssl-client-auth":"REQUIRED"}
             * schedulingPeriod : 0 sec
             * schedulingStrategy : TIMER_DRIVEN
             * executionNode : ALL
             * penaltyDuration : 30 sec
             * yieldDuration : 1 sec
             * bulletinLevel : WARN
             * runDurationMillis : 0
             * concurrentlySchedulableTaskCount : 1
             * comments :
             * lossTolerant : false
             * defaultConcurrentTasks : {"TIMER_DRIVEN":"1","EVENT_DRIVEN":"0","CRON_DRIVEN":"1"}
             * defaultSchedulingPeriod : {"TIMER_DRIVEN":"0 sec","CRON_DRIVEN":"* * * * * ?"}
             */
            @SerializedName("properties")
            public PropertiesBean properties;
            @SerializedName("schedulingPeriod")
            public String schedulingPeriod;
            @SerializedName("schedulingStrategy")
            public String schedulingStrategy;
            @SerializedName("executionNode")
            public String executionNode;
            @SerializedName("penaltyDuration")
            public String penaltyDuration;
            @SerializedName("yieldDuration")
            public String yieldDuration;
            @SerializedName("bulletinLevel")
            public String bulletinLevel;
            @SerializedName("runDurationMillis")
            public int runDurationMillis;
            @SerializedName("concurrentlySchedulableTaskCount")
            public int concurrentlySchedulableTaskCount;
            @SerializedName("comments")
            public String comments;
            @SerializedName("lossTolerant")
            public boolean lossTolerant;
            @SerializedName("defaultConcurrentTasks")
            public DefaultConcurrentTasksBean defaultConcurrentTasks;
            @SerializedName("defaultSchedulingPeriod")
            public DefaultConcurrentTasksBean defaultSchedulingPeriod;
            public static ConfigBean objectFromData(String str) {
                return new Gson().fromJson(str, ConfigBean.class);
            }
            public static ConfigBean objectFromData(String str, String key) {
                try {
                    JSONObject jsonObject = new JSONObject(str);
                    return new Gson().fromJson(jsonObject.getString(str), ConfigBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return null;
            }
            public static class PropertiesBean {
                /**
                 * Queue : null
                 * Host Name : localhost
                 * Port : 5672
                 * Virtual Host : null
                 * User Name : guest
                 * Password : guest
                 * AMQP Version : 0.9.1
                 * ssl-context-service : null
                 * ssl-client-auth : REQUIRED
                 */
                @SerializedName("Queue")
                public Object Queue;
                @SerializedName("Host Name")
                public String _$HostName207; // FIXME check this code
                @SerializedName("Port")
                public String Port;
                @SerializedName("Virtual Host")
                public Object _$VirtualHost14; // FIXME check this code
                @SerializedName("User Name")
                public String _$UserName121; // FIXME check this code
                @SerializedName("Password")
                public String Password;
                @SerializedName("AMQP Version")
                public String _$AMQPVersion45; // FIXME check this code
                @SerializedName("ssl-context-service")
                public Object sslcontextservice;
                @SerializedName("ssl-client-auth")
                public String sslclientauth;
                public static PropertiesBean objectFromData(String str) {
                    return new Gson().fromJson(str, PropertiesBean.class);
                }
                public static PropertiesBean objectFromData(String str, String key) {
                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        return new Gson().fromJson(jsonObject.getString(str), PropertiesBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    return null;
                }
            }
            public static class DefaultConcurrentTasksBean {
                /**
                 * TIMER_DRIVEN : 1
                 * EVENT_DRIVEN : 0
                 * CRON_DRIVEN : 1
                 */
                @SerializedName("TIMER_DRIVEN")
                public String TIMERDRIVEN;
                @SerializedName("EVENT_DRIVEN")
                public String EVENTDRIVEN;
                @SerializedName("CRON_DRIVEN")
                public String CRONDRIVEN;
                public static DefaultConcurrentTasksBean objectFromData(String str) {
                    return new Gson().fromJson(str, DefaultConcurrentTasksBean.class);
                }
                public static DefaultConcurrentTasksBean objectFromData(String str, String key) {
                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        return new Gson().fromJson(jsonObject.getString(str), DefaultConcurrentTasksBean.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    return null;
                }
            }
        }
        public static class RelationshipsBean {
            /**
             * name : success
             * description : All FlowFiles that are received from the AMQP queue are routed to this relationship
             * autoTerminate : false
             */
            @SerializedName("name")
            public String name;
            @SerializedName("description")
            public String description;
            @SerializedName("autoTerminate")
            public boolean autoTerminate;
            public static RelationshipsBean objectFromData(String str) {
                return new Gson().fromJson(str, RelationshipsBean.class);
            }
            public static RelationshipsBean objectFromData(String str, String key) {
                try {
                    JSONObject jsonObject = new JSONObject(str);
                    return new Gson().fromJson(jsonObject.getString(str), RelationshipsBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return null;
            }
        }
    }
}