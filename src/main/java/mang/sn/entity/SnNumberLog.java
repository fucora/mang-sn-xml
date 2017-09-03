package mang.sn.entity;

import java.io.Serializable;

import java.math.BigDecimal;

import java.sql.Timestamp;


public class SnNumberLog implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;

    /**
     * 单号
     */
    private String sn;

    /**
     * 单号生成时间
     */
    private Timestamp rundate;

    /**
     * 请求人id
     */
    private String ruid;

    /**
     * 请求人姓名
     */
    private String runame;

    /**
     * 前缀
     */
    private String prefix;

    /**
     * 编号业务类型
     */
    private String busType;

    /**
     * 单号计数类型0每天从1开始 1计数一直累加不清零 2计数每周从1开始 3计数每月从1开始 4计数每年从1开始
     */
    private Integer snType;

    /**
     * 备注（调用类）
     */
    private String invokeCode;

    /**
     * 备注如精度等
     */
    private String optionInfo;

    /**
     * 运行备注
     */
    private String runMemo;

    /**
     * 运行时长单位毫秒
     */
    private Long runtimeDuration;

    /**
     * 运行开始时间精确到毫秒
     */
    private Timestamp runtimeStart;

    /**
     * 运行结束时间精确到毫秒
     */
    private Timestamp runtimeEnd;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getSn() {
        return sn;
    }

    public void setRundate(Timestamp rundate) {
        this.rundate = rundate;
    }

    public Timestamp getRundate() {
        return rundate;
    }

    public void setRuid(String ruid) {
        this.ruid = ruid;
    }

    public String getRuid() {
        return ruid;
    }

    public void setRuname(String runame) {
        this.runame = runame;
    }

    public String getRuname() {
        return runame;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getBusType() {
        return busType;
    }

    public void setSnType(Integer snType) {
        this.snType = snType;
    }

    public Integer getSnType() {
        return snType;
    }

    public void setInvokeCode(String invokeCode) {
        this.invokeCode = invokeCode;
    }

    public String getInvokeCode() {
        return invokeCode;
    }

    public void setOptionInfo(String optionInfo) {
        this.optionInfo = optionInfo;
    }

    public String getOptionInfo() {
        return optionInfo;
    }

    public void setRunMemo(String runMemo) {
        this.runMemo = runMemo;
    }

    public String getRunMemo() {
        return runMemo;
    }

    public void setRuntimeDuration(Long runtimeDuration) {
        this.runtimeDuration = runtimeDuration;
    }

    public Long getRuntimeDuration() {
        return runtimeDuration;
    }

    public void setRuntimeStart(Timestamp runtimeStart) {
        this.runtimeStart = runtimeStart;
    }

    public Timestamp getRuntimeStart() {
        return runtimeStart;
    }

    public void setRuntimeEnd(Timestamp runtimeEnd) {
        this.runtimeEnd = runtimeEnd;
    }

    public Timestamp getRuntimeEnd() {
        return runtimeEnd;
    }
}
