package com.lkk.myb1.dao;

import com.lkk.myb1.dao.baseDao.AbstractBaseMapper;
import com.lkk.myb1.entity.TbUser;
import com.lkk.myb1.mapper.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: lkk
 * @Date: 2019/11/28 13:13
 * @Description:
 */
@Repository
public class UserMapper extends AbstractBaseMapper<TbUser,Integer> {

    @Autowired
    private TbUserMapper tbUserMapper;




    public List<TbUser> selectAll(){
        return tbUserMapper.selectAll();
    }


}