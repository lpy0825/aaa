package com.aaa.entity;

public class admin {

    private int aid;
    private String aname;
    private String apassword;
    private String image;


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

    public admin(int aid, String aname, String apassword, String image) {
        this.aid = aid;
        this.aname = aname;
        this.apassword = apassword;
        this.image = image;
    }

    @Override
    public String toString() {
        return "admin{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", apassword='" + apassword + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
