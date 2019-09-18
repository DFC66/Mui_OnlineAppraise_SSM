package com.dfc.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;


@Component
public class Message implements Serializable {
    private  Integer id;
    private  String mname;
    private  String cname;
    private  String tname;
    private  String Imageurl;
    private  double wholeAppraise;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getImageurl() {
        return Imageurl;
    }

    public void setImageurl(String imageurl) {
        Imageurl = imageurl;
    }

    public double getWholeAppraise() {
        return wholeAppraise;
    }

    public void setWholeAppraise(double wholeAppraise) {
        this.wholeAppraise = wholeAppraise;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", mname='" + mname + '\'' +
                ", cname='" + cname + '\'' +
                ", tname='" + tname + '\'' +
                ", Imageurl='" + Imageurl + '\'' +
                ", wholeAppraise='" + wholeAppraise + '\'' +
                '}';
    }
}
