package com.dfc.mappers;

import com.dfc.pojo.Result;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResultDao {
    void InsertAppraise(Result result);


    List<Result> IsAppraiseAgain(@Param("myid") String id, @Param("myuserid") String uid);


}
