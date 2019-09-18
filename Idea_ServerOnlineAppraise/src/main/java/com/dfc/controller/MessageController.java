package com.dfc.controller;

import com.dfc.Service.MessageService;
import com.dfc.pojo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//相当于Controller+responsebody
@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageService;


    @ModelAttribute
    public void initWholeAppraise(){

        messageService.UpdateWholeAppraise();
        System.out.println("初始化，更新完成");
    }


    @RequestMapping("/m1")
    public  List<Message> getwholeMessage()  {
       return  messageService.getWholeMessage();
    }


    @RequestMapping("/m2")
 public  List<Message>  getHighMessage(){
        return  messageService.getHighMessage();
 }




    @RequestMapping("/m3")
    public  List<Message>  getSearchMessage(@RequestParam("searchkey") String key){
        System.out.println(key);
        return  messageService.getSearchMessage(key);
    }

    @RequestMapping("/m4")
    public  List<Message>  getSearchHighMessage(@RequestParam("searchkey") String key){
        System.out.println(key);
        return  messageService.getSearchHighMessage(key);
    }



    @RequestMapping("/detail")
    public Message getSingleTeacherMessage(@RequestParam("keyid") String id){
        System.out.println(id);
        return messageService.getMessage(Integer.parseInt(id));
    }




























}
