package com.aaa.entity;

public class Fmcontenttype {
    private Integer tid;
    private String contenttype;
    private Integer typeid;
    private Fmtype fmtype;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getContenttype() {
        return contenttype;
    }

    public void setContenttype(String contenttype) {
        this.contenttype = contenttype;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Fmtype getFmtype() {
        return fmtype;
    }

    public void setFmtype(Fmtype fmtype) {
        this.fmtype = fmtype;
    }

    @Override
    public String toString() {
        return "Fmcontenttype{" +
                "tid=" + tid +
                ", contenttype='" + contenttype + '\'' +
                ", typeid=" + typeid +
                ", fmtype=" + fmtype +
                '}';
    }

    public Fmcontenttype(Integer tid, String contenttype, Integer typeid, Fmtype fmtype) {
        this.tid = tid;
        this.contenttype = contenttype;
        this.typeid = typeid;
        this.fmtype = fmtype;
    }
}
