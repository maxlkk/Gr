package com.lkk.myb1.service;

import com.lkk.myb1.dao.UserMapper;
import com.lkk.myb1.entity.TbUser;
import com.lkk.myb1.service.baseService.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: lkk
 * @Date: 2019/11/28 13:14
 * @Description:
 */
@Service
public class UserService extends BaseService<TbUser,Integer> {
    @Autowired
    private UserMapper userDao;

    public List<TbUser> selectAll(){
        return userDao.selectAll();
    }

}