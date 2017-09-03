package mang.sn.entity;


import java.io.Serializable;

import java.math.BigDecimal;

import java.sql.Timestamp;


public class SnNumber implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;

    /**
     * 单号计数类型0每天从1开始 1计数一直累加不清零 2计数每周从1开始 3计数每月从1开始 4计数每年从1开始
     */
    private BigDecimal snType;

    /**
     * 编号业务类型
     */
    private String busType;

    /**
     * 当前最大编号值
     */
    private Integer maxindex;

    /**
     * 当前日期(只用于code_type=0的情况)
     */
    private Timestamp numDate;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setSnType(BigDecimal snType) {
        this.snType = snType;
    }

    public BigDecimal getSnType() {
        return snType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getBusType() {
        return busType;
    }

    public void setMaxindex(Integer maxindex) {
        this.maxindex = maxindex;
    }

    public Integer getMaxindex() {
        return maxindex;
    }

    public void setNumDate(Timestamp numDate) {
        this.numDate = numDate;
    }

    public Timestamp getNumDate() {
        return numDate;
    }
}
