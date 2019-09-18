package com.dfc.mappers;


import com.dfc.pojo.Message;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface MessageDao {

    Message getMessage(@Param("id") Integer id);

    List<Message>  getWholeMessage();

    List<Message>  getHighMessage();

    List<Message>  getSearchMessage(@Param("searchkey") String key);
    List<Message>  getSearchHighMessage(@Param("searchkey") String key);



    void UpdateWholeAppraise();



//    void  InsertMessage(@RequestParam("m_name") String mname, @RequestParam("c_name")String cname, @RequestParam("t_name")String tname, @RequestParam("Image_url")String Imageurl);
    void  InsertMessage(Message message);


}
