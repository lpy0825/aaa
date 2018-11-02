package com.aaa.entity;

//机构认证
public class FMmechannism {
    private int mid;
    private String mname; //机构名称
    private String maddrs; //机构所在地
    private String mimage; //机构营业执照
    private String eid; //身份证号
    private String ename; //机构所有人
    private String eimage; //身份证正面照
    private FMuser fmuid;  //外键用户
    private FMauthentication Fmaid; //外键认证类型

    public FMmechannism() {
    }

    public FMmechannism(int mid, String mname, String maddrs, String mimage, String eid, String ename, String eimage, FMuser fmuid, FMauthentication fmaid) {
        this.mid = mid;
        this.mname = mname;
        this.maddrs = maddrs;
        this.mimage = mimage;
        this.eid = eid;
        this.ename = ename;
        this.eimage = eimage;
        this.fmuid = fmuid;
        Fmaid = fmaid;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMaddrs() {
        return maddrs;
    }

    public void setMaddrs(String maddrs) {
        this.maddrs = maddrs;
    }

    public String getMimage() {
        return mimage;
    }

    public void setMimage(String mimage) {
        this.mimage = mimage;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
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
        return "FMmechannism{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", maddrs='" + maddrs + '\'' +
                ", mimage='" + mimage + '\'' +
                ", eid='" + eid + '\'' +
                ", ename='" + ename + '\'' +
                ", eimage='" + eimage + '\'' +
                ", fmuid=" + fmuid +
                ", Fmaid=" + Fmaid +
                '}';
    }
}
