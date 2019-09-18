package com.dfc.Service;

import com.dfc.mappers.UserDao;
import com.dfc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public Boolean getLogin(User user) {
        List<User> login = userDao.getLogin(user);
//        System.out.println("??????????????????"+login);
        if (login.size()>0){
            return  true;
        }else {
            return  false;
        }

    }
}
