package com.aaa.entity;


//微博认证
public class FMweibo {
    private int wid;
    private String wname; //微博名字
    private String wfollower; //粉丝数量
    private String wauth;   //是否大v
    private String eauthType;   //个人  机构
    private String eid; //身份证号
    private String eimage;  //身份证正面
    private FMuser fmuid;   // 用户外键
    private FMauthentication Fmaid; //认证类型
    private String ename; //个人名字

    public FMweibo() {
    }

    public FMweibo(int wid, String wname, String wfollower, String wauth, String eauthType, String eid, String eimage, FMuser fmuid, FMauthentication fmaid, String ename) {
        this.wid = wid;
        this.wname = wname;
        this.wfollower = wfollower;
        this.wauth = wauth;
        this.eauthType = eauthType;
        this.eid = eid;
        this.eimage = eimage;
        this.fmuid = fmuid;
        Fmaid = fmaid;
        this.ename = ename;
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getWfollower() {
        return wfollower;
    }

    public void setWfollower(String wfollower) {
        this.wfollower = wfollower;
    }

    public String getWauth() {
        return wauth;
    }

    public void setWauth(String wauth) {
        this.wauth = wauth;
    }

    public String getEauthType() {
        return eauthType;
    }

    public void setEauthType(String eauthType) {
        this.eauthType = eauthType;
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

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "FMweibo{" +
                "wid=" + wid +
                ", wname='" + wname + '\'' +
                ", wfollower='" + wfollower + '\'' +
                ", wauth='" + wauth + '\'' +
                ", eauthType='" + eauthType + '\'' +
                ", eid='" + eid + '\'' +
                ", eimage='" + eimage + '\'' +
                ", fmuid=" + fmuid +
                ", Fmaid=" + Fmaid +
                ", ename='" + ename + '\'' +
                '}';
    }
}
