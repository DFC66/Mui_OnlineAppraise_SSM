package com.dfc.Service;

import com.dfc.pojo.Result;

import java.util.List;

public interface ResultService {
    void InsertAppraise( Result result);
    Boolean IsAppraiseAgain(String id ,String uid);

}
