
package ReaderGroup;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class RDAggregateSnapshot {

    @SerializedName("activeThreadCount")
    private Long mActiveThreadCount;
    @SerializedName("bytesIn")
    private Long mBytesIn;
    @SerializedName("bytesOut")
    private Long mBytesOut;
    @SerializedName("bytesRead")
    private Long mBytesRead;
    @SerializedName("bytesWritten")
    private Long mBytesWritten;
    @SerializedName("flowFilesIn")
    private Long mFlowFilesIn;
    @SerializedName("flowFilesOut")
    private Long mFlowFilesOut;
    @SerializedName("groupId")
    private String mGroupId;
    @SerializedName("id")
    private String mId;
    @SerializedName("input")
    private String mInput;
    @SerializedName("name")
    private String mName;
    @SerializedName("output")
    private String mOutput;
    @SerializedName("read")
    private String mRead;
    @SerializedName("runStatus")
    private String mRunStatus;
    @SerializedName("taskCount")
    private Long mTaskCount;
    @SerializedName("tasks")
    private String mTasks;
    @SerializedName("tasksDuration")
    private String mTasksDuration;
    @SerializedName("tasksDurationNanos")
    private Long mTasksDurationNanos;
    @SerializedName("type")
    private String mType;
    @SerializedName("written")
    private String mWritten;

    public Long getActiveThreadCount() {
        return mActiveThreadCount;
    }

    public void setActiveThreadCount(Long activeThreadCount) {
        mActiveThreadCount = activeThreadCount;
    }

    public Long getBytesIn() {
        return mBytesIn;
    }

    public void setBytesIn(Long bytesIn) {
        mBytesIn = bytesIn;
    }

    public Long getBytesOut() {
        return mBytesOut;
    }

    public void setBytesOut(Long bytesOut) {
        mBytesOut = bytesOut;
    }

    public Long getBytesRead() {
        return mBytesRead;
    }

    public void setBytesRead(Long bytesRead) {
        mBytesRead = bytesRead;
    }

    public Long getBytesWritten() {
        return mBytesWritten;
    }

    public void setBytesWritten(Long bytesWritten) {
        mBytesWritten = bytesWritten;
    }

    public Long getFlowFilesIn() {
        return mFlowFilesIn;
    }

    public void setFlowFilesIn(Long flowFilesIn) {
        mFlowFilesIn = flowFilesIn;
    }

    public Long getFlowFilesOut() {
        return mFlowFilesOut;
    }

    public void setFlowFilesOut(Long flowFilesOut) {
        mFlowFilesOut = flowFilesOut;
    }

    public String getGroupId() {
        return mGroupId;
    }

    public void setGroupId(String groupId) {
        mGroupId = groupId;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getInput() {
        return mInput;
    }

    public void setInput(String input) {
        mInput = input;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getOutput() {
        return mOutput;
    }

    public void setOutput(String output) {
        mOutput = output;
    }

    public String getRead() {
        return mRead;
    }

    public void setRead(String read) {
        mRead = read;
    }

    public String getRunStatus() {
        return mRunStatus;
    }

    public void setRunStatus(String runStatus) {
        mRunStatus = runStatus;
    }

    public Long getTaskCount() {
        return mTaskCount;
    }

    public void setTaskCount(Long taskCount) {
        mTaskCount = taskCount;
    }

    public String getTasks() {
        return mTasks;
    }

    public void setTasks(String tasks) {
        mTasks = tasks;
    }

    public String getTasksDuration() {
        return mTasksDuration;
    }

    public void setTasksDuration(String tasksDuration) {
        mTasksDuration = tasksDuration;
    }

    public Long getTasksDurationNanos() {
        return mTasksDurationNanos;
    }

    public void setTasksDurationNanos(Long tasksDurationNanos) {
        mTasksDurationNanos = tasksDurationNanos;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public String getWritten() {
        return mWritten;
    }

    public void setWritten(String written) {
        mWritten = written;
    }

}
