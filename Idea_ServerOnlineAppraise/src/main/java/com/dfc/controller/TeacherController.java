package com.dfc.controller;


import com.dfc.Service.MessageService;
import com.dfc.pojo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    //使用MessgaeService的方法
    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/im", method = RequestMethod.POST)
    public String InsertMessage(HttpServletRequest httpServletRequest, String mname, String cname, String tname, /*@RequestParam("mymessage") Message message,*/ @RequestParam("file") MultipartFile multipartFile) {
        String path = httpServletRequest.getSession().getServletContext().getRealPath("/");
        String targetpath = "upload";
        System.out.println(multipartFile.getOriginalFilename());
        String filename = multipartFile.getOriginalFilename() + ".png";

        String projectServerPath = httpServletRequest.getScheme() + "://" + httpServletRequest.getServerName() + ":" +
                httpServletRequest.getServerPort() + httpServletRequest.getContextPath();

//        System.out.println("真服务器地址:" + projectServerPath);
//        System.out.println(path);

        File targetFile = new File(path + targetpath);
        if (!targetFile.exists()) {
            targetFile.mkdir();
        }

        if (multipartFile != null && !multipartFile.isEmpty()) {



            try {
                File trueFile = new File(targetFile,filename);
                multipartFile.transferTo(trueFile);
            } catch (IOException e) {
                e.printStackTrace();
                return "failed";

            }


            String Imageurl = projectServerPath + "/"+ targetpath+"/" + filename;

           Message message =new Message();
           message.setMname(mname);
           message.setCname(cname);
           message.setTname(tname);
           message.setImageurl(Imageurl);
//            System.out.println(message);
//            messageService.InsertMessage(mname,cname,tname,Imageurl);

             messageService.InsertMessage(message);
        }else
        {
            System.out.println("上传文件为空");
        }



        return "success";
    }

}
