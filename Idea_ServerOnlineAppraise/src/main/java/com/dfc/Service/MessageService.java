package com.dfc.Service;

import com.dfc.pojo.Message;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface MessageService {

    Message getMessage(Integer id);
    List<Message> getWholeMessage();
    List<Message> getHighMessage();
    List<Message>  getSearchMessage(String key);
    List<Message>  getSearchHighMessage(@Param("searchkey") String key);

    void UpdateWholeAppraise();

//    void  InsertMessage(String mname, String cname, String tname, String Imageurl);

    void  InsertMessage(Message message);
}
