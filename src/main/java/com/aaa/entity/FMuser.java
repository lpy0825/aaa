package com.aaa.entity;

public class FMuser {

    private Integer Fmuid;  //用户主键
    private String Fmuname; //用户名称
    private String Fmupwd;  //用户密码
    private String Fmuphone;    //用户手机号
    private String Fmemali; //用户邮箱
    private Integer Fmstate;    //0 普通用户  1 会员用户
    private Integer Fmanchor;   //0 不是主播  1 是主播
    private String Fmuserimg;   //用户头像
    private String Fmsignature; //用户签名
    private Integer Fmcredibilty;   //信誉度
    private Integer shenhe; //0 正在审核 1审核通过 2未通过
    private Integer BP; //0禁止 1启用

    public Integer getFmuid() {
        return Fmuid;
    }

    public void setFmuid(Integer fmuid) {
        Fmuid = fmuid;
    }

    public String getFmuname() {
        return Fmuname;
    }

    public void setFmuname(String fmuname) {
        Fmuname = fmuname;
    }

    public String getFmupwd() {
        return Fmupwd;
    }

    public void setFmupwd(String fmupwd) {
        Fmupwd = fmupwd;
    }

    public String getFmuphone() {
        return Fmuphone;
    }

    public void setFmuphone(String fmuphone) {
        Fmuphone = fmuphone;
    }

    public String getFmemali() {
        return Fmemali;
    }

    public void setFmemali(String fmemali) {
        Fmemali = fmemali;
    }

    public Integer getFmstate() {
        return Fmstate;
    }

    public void setFmstate(Integer fmstate) {
        Fmstate = fmstate;
    }

    public Integer getFmanchor() {
        return Fmanchor;
    }

    public void setFmanchor(Integer fmanchor) {
        Fmanchor = fmanchor;
    }

    public String getFmuserimg() {
        return Fmuserimg;
    }

    public void setFmuserimg(String fmuserimg) {
        Fmuserimg = fmuserimg;
    }

    public String getFmsignature() {
        return Fmsignature;
    }

    public void setFmsignature(String fmsignature) {
        Fmsignature = fmsignature;
    }

    public Integer getFmcredibilty() {
        return Fmcredibilty;
    }

    public void setFmcredibilty(Integer fmcredibilty) {
        Fmcredibilty = fmcredibilty;
    }

    public Integer getShenhe() {
        return shenhe;
    }

    public void setShenhe(Integer shenhe) {
        this.shenhe = shenhe;
    }

    public Integer getBP() {
        return BP;
    }

    public void setBP(Integer BP) {
        this.BP = BP;
    }

    public FMuser() {
    }

    @Override
    public String toString() {
        return "FMuser{" +
                "Fmuid=" + Fmuid +
                ", Fmuname='" + Fmuname + '\'' +
                ", Fmupwd='" + Fmupwd + '\'' +
                ", Fmuphone='" + Fmuphone + '\'' +
                ", Fmemali='" + Fmemali + '\'' +
                ", Fmstate=" + Fmstate +
                ", Fmanchor=" + Fmanchor +
                ", Fmuserimg='" + Fmuserimg + '\'' +
                ", Fmsignature='" + Fmsignature + '\'' +
                ", Fmcredibilty=" + Fmcredibilty +
                ", shenhe=" + shenhe +
                ", BP=" + BP +
                '}';
    }

    public FMuser(Integer fmuid, String fmuname, String fmupwd, String fmuphone, String fmemali, Integer fmstate, Integer fmanchor, String fmuserimg, String fmsignature, Integer fmcredibilty, Integer shenhe, Integer BP) {
        Fmuid = fmuid;
        Fmuname = fmuname;
        Fmupwd = fmupwd;
        Fmuphone = fmuphone;
        Fmemali = fmemali;
        Fmstate = fmstate;
        Fmanchor = fmanchor;
        Fmuserimg = fmuserimg;
        Fmsignature = fmsignature;
        Fmcredibilty = fmcredibilty;
        this.shenhe = shenhe;
        this.BP = BP;
    }
}
