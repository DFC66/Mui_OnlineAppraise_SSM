package com.dfc.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Result implements Serializable {
    private  Integer id;
    private String user_id;
    private String m_name;
   private  String c_name;
   private  String t_name;
    private  Integer appraise1;
    private  Integer appraise2;
    private  Integer appraise3;
    private  Integer appraise4;
    private  Integer appraise5;
    private  Integer appraise6;
    private  Integer appraise7;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public Integer getAppraise1() {
        return appraise1;
    }

    public void setAppraise1(Integer appraise1) {
        this.appraise1 = appraise1;
    }

    public Integer getAppraise2() {
        return appraise2;
    }

    public void setAppraise2(Integer appraise2) {
        this.appraise2 = appraise2;
    }

    public Integer getAppraise3() {
        return appraise3;
    }

    public void setAppraise3(Integer appraise3) {
        this.appraise3 = appraise3;
    }

    public Integer getAppraise4() {
        return appraise4;
    }

    public void setAppraise4(Integer appraise4) {
        this.appraise4 = appraise4;
    }

    public Integer getAppraise5() {
        return appraise5;
    }

    public void setAppraise5(Integer appraise5) {
        this.appraise5 = appraise5;
    }

    public Integer getAppraise6() {
        return appraise6;
    }

    public void setAppraise6(Integer appraise6) {
        this.appraise6 = appraise6;
    }

    public Integer getAppraise7() {
        return appraise7;
    }

    public void setAppraise7(Integer appraise7) {
        this.appraise7 = appraise7;
    }

    @Override
    public String toString() {
        return "Result{" +
                "id=" + id +
                ", user_id='" + user_id + '\'' +
                ", m_name='" + m_name + '\'' +
                ", c_name='" + c_name + '\'' +
                ", t_name='" + t_name + '\'' +
                ", appraise1=" + appraise1 +
                ", appraise2=" + appraise2 +
                ", appraise3=" + appraise3 +
                ", appraise4=" + appraise4 +
                ", appraise5=" + appraise5 +
                ", appraise6=" + appraise6 +
                ", appraise7=" + appraise7 +
                '}';
    }
}
