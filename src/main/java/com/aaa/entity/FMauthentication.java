package com.aaa.entity;

//认证类型
public class FMauthentication {
    private int aid;
    private String authentication; //认证类型

    public FMauthentication() {
    }

    public FMauthentication(int aid, String authentication) {
        this.aid = aid;
        this.authentication = authentication;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAuthentication() {
        return authentication;
    }

    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    @Override
    public String toString() {
        return "FMauthentication{" +
                "aid=" + aid +
                ", authentication='" + authentication + '\'' +
                '}';
    }


}
