package com.dfc.pojo;


import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * //返回对象一定要序列化
 */

@Component
public class User implements Serializable {


    private static final long serialVersionUID = 6582224300870590204L;
    private  String my_id;
    private  String my_pw;

    public String getMy_id() {
        return my_id;
    }

    public void setMy_id(String my_id) {
        this.my_id = my_id;
    }

    public String getMy_pw() {
        return my_pw;
    }

    public void setMy_pw(String my_pw) {
        this.my_pw = my_pw;
    }

    @Override
    public String toString() {
        return "User{" +
                "my_id='" + my_id + '\'' +
                ", my_pw='" + my_pw + '\'' +
                '}';
    }
}
