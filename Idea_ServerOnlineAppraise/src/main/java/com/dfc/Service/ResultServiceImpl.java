package com.dfc.Service;


import com.dfc.mappers.ResultDao;
import com.dfc.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {
    @Autowired
    private ResultDao resultDao;


    @Override
    public void InsertAppraise(Result result) {
        resultDao.InsertAppraise(result);

    }

    @Override
    public Boolean IsAppraiseAgain(String id, String uid) {
        List<Result> results = resultDao.IsAppraiseAgain(id,uid);
        if (results.size()>0){
            return  true;
        }else {
            return  false;
        }
    }


}
