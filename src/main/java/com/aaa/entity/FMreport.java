package com.aaa.entity;

import java.util.Date;

public class FMreport {
    private int rid;
    private String reportType;
    private String reportcontent;
    private String fmuid;
    private String reportuid;
    private Date time;

    public FMreport() {
    }

    public FMreport(int rid, String reportType, String reportcontent, String fmuid, String reportuid, Date time) {
        this.rid = rid;
        this.reportType = reportType;
        this.reportcontent = reportcontent;
        this.fmuid = fmuid;
        this.reportuid = reportuid;
        this.time = time;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportcontent() {
        return reportcontent;
    }

    public void setReportcontent(String reportcontent) {
        this.reportcontent = reportcontent;
    }

    public String getFmuid() {
        return fmuid;
    }

    public void setFmuid(String fmuid) {
        this.fmuid = fmuid;
    }

    public String getReportuid() {
        return reportuid;
    }

    public void setReportuid(String reportuid) {
        this.reportuid = reportuid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "FMreport{" +
                "rid=" + rid +
                ", reportType='" + reportType + '\'' +
                ", reportcontent='" + reportcontent + '\'' +
                ", fmuid='" + fmuid + '\'' +
                ", reportuid='" + reportuid + '\'' +
                ", time=" + time +
                '}';
    }
}
