package com.aaa.entity;

//个人认证
public class FMpersonal {
    private int pid;
    private String name; //个人名字
    private String eid;  //身份证号
    private String eimage; //身份证前面
    private FMuser fmuid;  //外键用户
    private FMauthentication Fmaid; //外键认证类型

    public FMpersonal() {
    }

    public FMpersonal(int pid, String name, String eid, String eimage, FMuser fmuid, FMauthentication fmaid) {
        this.pid = pid;
        this.name = name;
        this.eid = eid;
        this.eimage = eimage;
        this.fmuid = fmuid;
        Fmaid = fmaid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEimage() {
        return eimage;
    }

    public void setEimage(String eimage) {
        this.eimage = eimage;
    }

    public FMuser getFmuid() {
        return fmuid;
    }

    public void setFmuid(FMuser fmuid) {
        this.fmuid = fmuid;
    }

    public FMauthentication getFmaid() {
        return Fmaid;
    }

    public void setFmaid(FMauthentication fmaid) {
        Fmaid = fmaid;
    }

    @Override
    public String toString() {
        return "FMpersonal{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", eid='" + eid + '\'' +
                ", eimage='" + eimage + '\'' +
                ", fmuid=" + fmuid +
                ", Fmaid=" + Fmaid +
                '}';
    }
}
