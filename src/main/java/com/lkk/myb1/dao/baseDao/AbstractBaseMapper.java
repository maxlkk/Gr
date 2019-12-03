package com.lkk.myb1.dao.baseDao;


import com.lkk.myb1.baseMapper.BaseMapper;
import com.lkk.myb1.baseMapper.MyMapper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: lkk
 * @Date: 2019/11/29 10:05
 * @Description:
 */

public abstract class AbstractBaseMapper<T,ID extends Serializable> implements BaseMapper<T,ID> {

    @Autowired
    private MyMapper<T,ID> myMapper;

    @Override
    public int insert(T var1) {
        return myMapper.insert(var1);
    }

    @Override
    public int insertSelective(T var1) {
        return myMapper.insertSelective(var1);
    }

    @Override
    public int insertList(List<? extends T> var1) {
        return myMapper.insertList(var1);
    }

    @Override
    public int insertUseGeneratedKeys(T var1) {
        return myMapper.insertUseGeneratedKeys(var1);
    }

    @Override
    public T selectOne(T var1) {
        return myMapper.selectOne(var1);
    }

    @Override
    public List<T> select(T var1) {
        return myMapper.select(var1);
    }

    @Override
    public List<T> selectAll() {
        return myMapper.selectAll();
    }

    @Override
    public int selectCount(T var1) {
        return myMapper.selectCount(var1);
    }

    @Override
    public T selectByPrimaryKey(ID id) {
        return myMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<T> selectByExample(Example example) {
        return myMapper.selectByExample(example);
    }

    @Override
    public T selectOneByExample(Example example) {
        return myMapper.selectOneByExample(example);
    }

    @Override
    public int selectCountByExample(Example example) {
        return myMapper.selectCountByExample(example);
    }

    @Override
    public List<T> selectByRowBounds(T var1, RowBounds rowBounds) {
        return myMapper.selectByRowBounds(var1,rowBounds);
    }

    @Override
    public List<T> selectByExampleAndRowBounds(Example example, RowBounds rowBounds) {
        return myMapper.selectByExampleAndRowBounds(example,rowBounds);
    }

    @Override
    public int updateByPrimaryKey(T var1) {
        return myMapper.updateByPrimaryKey(var1);
    }

    @Override
    public int updateByPrimaryKeySelective(T var1) {
        return myMapper.updateByPrimaryKeySelective(var1);
    }

    @Override
    public int updateByExample(T varl, Example example) {
        return myMapper.updateByExample(varl,example);
    }

    @Override
    public int updateByExampleSelective(T varl, Example example) {
        return myMapper.updateByExampleSelective(varl,example);
    }

    @Override
    public int delete(T var1) {
        return myMapper.delete(var1);
    }

    @Override
    public int deleteByPrimaryKey(ID id) {
        return myMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteByExample(Example example) {
        return myMapper.deleteByExample(example);
    }
}