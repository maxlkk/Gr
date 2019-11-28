package com.lkk.myb1.service;

import com.lkk.myb1.dao.UserDao;
import com.lkk.myb1.entity.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: lkk
 * @Date: 2019/11/28 13:14
 * @Description:
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<TbUser> selectAll(){
        return userDao.selectAll();
    }

}