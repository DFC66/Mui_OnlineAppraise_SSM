package com.dfc.controller;


import com.dfc.Service.ResultService;
import com.dfc.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/result")
public class ResultController {

    @Autowired
    private ResultService resultService;

//插入数据
    @RequestMapping("/r1")
    public void InsertAppraise(Result result) {

        System.out.println(result);
        resultService.InsertAppraise(result);

    }

   @RequestMapping("/again")
    public Boolean IsAppraiseAgain(@RequestParam("key") String id, @RequestParam("account") String user_id) {
       System.out.println(id);
       System.out.println(user_id);
       return  resultService.IsAppraiseAgain(id, user_id);
    }

}
