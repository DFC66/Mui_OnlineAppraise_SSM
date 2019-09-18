package com.dfc.mappers;

import com.dfc.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> getLogin(User user);



}
