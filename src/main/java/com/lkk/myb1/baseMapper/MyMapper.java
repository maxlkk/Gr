package com.lkk.myb1.baseMapper;

import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.io.Serializable;

@RegisterMapper
public interface MyMapper<T,ID extends Serializable> extends Mapper<T>, MySqlMapper<T> {
}
