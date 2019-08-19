package com.wuhan.wht.basic.user.dao;

import com.wuhan.wht.basic.user.model.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}