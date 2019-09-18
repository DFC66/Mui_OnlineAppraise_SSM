package com.dfc.controller;


import com.alibaba.fastjson.JSON;
import com.dfc.Service.MessageService;
import com.dfc.pojo.Message;
import com.dfc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


//本控制器是对JSP页面的测试
@Controller
@RequestMapping("/test")
public class TestController  {

    @Autowired
    private MessageService messageService;


@RequestMapping("/boy")
    public  String boy(Model model){
     model.addAttribute("model","123456");
    System.out.println("进来了");
    return  "boy";
}

    @RequestMapping( "/test01")
    public  void  test1 (Model model){
        model.addAttribute("model","能获取model");
        System.out.println("试一试");

    }

   @PostMapping("/test02")
   @ResponseBody
     public List<Message> test2(User user)  {


       return messageService.getWholeMessage();
      }


//下面是测试类

//    @RequestMapping ("/t1")
//    public  String  getText(Model model){
//        TeacherMessage teacherMessage = messageService.getMessage(123);
//        model.addAttribute("model", teacherMessage);
////       model.addAttribute("model","9876asd");
//        return  "boy";
//
//    }



    @RequestMapping("/t2")
    public  String t2(HttpServletResponse response, Model model) throws IOException {

        List<Message> wholeMessage = messageService.getWholeMessage();
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("");

        if (wholeMessage !=null){
            model.addAttribute("model2", JSON.toJSONString(wholeMessage));
        }else {
            System.out.println("失败");

        }

        return  "girl";


    }




}
