package com.aaa.entity;

public class Fmtype {
    private int tid;
    private String type;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "fmtype{" +
                "tid=" + tid +
                ", type='" + type + '\'' +
                '}';
    }



}
