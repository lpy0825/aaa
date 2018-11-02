package com.aaa.entity;

public class admin {

    private int aid;
    private String aname;
    private String apassword;
    private String image;
    private String email;
    private String motto;
    private String realname;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public admin(int aid, String aname, String apassword, String image, String email, String motto, String realname) {
        this.aid = aid;
        this.aname = aname;
        this.apassword = apassword;
        this.image = image;
        this.email = email;
        this.motto = motto;
        this.realname = realname;
    }


    public admin() {
    }

    @Override
    public String toString() {
        return "admin{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", apassword='" + apassword + '\'' +
                ", image='" + image + '\'' +
                ", email='" + email + '\'' +
                ", motto='" + motto + '\'' +
                ", realname='" + realname + '\'' +
                '}';
    }
}
