package com.lkk.myb1.baseMapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.util.List;
@RegisterMapper
public interface BaseMapper<T,ID extends Serializable>  {

    /**
     * 插入
     * @param var1
     * @return
     */
    int insert(T var1);

    /**
     *  按固定属性插入
     * @param var1
     * @return
     */
    int insertSelective(T var1);

    /**
     * 批量插入
     * @param var1
     * @return
     */
    int insertList(List<? extends T> var1);

    /**
     * 返回主键插入
     * @param var1
     * @return
     */
    int insertUseGeneratedKeys(T var1);

    /**
     * 查询一个
     * @param var1
     * @return
     */
    T selectOne(T var1);

    /**
     * 查询
     * @param var1
     * @return
     */
    List<T> select(T var1);

    /**
     * 获取所有
     * @return
     */
    List<T> selectAll();

    /**
     * 查询符合条件的总数
     * @param var1
     * @return
     */
    int selectCount(T var1);

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    T selectByPrimaryKey(ID id);

    /**
     * 根据模板查询
     * @param example
     * @return
     */
    List<T> selectByExample(Example example);

    /**
     * 模板查询一个
     * @param example
     * @return
     */
    T selectOneByExample(Example example);

    /**
     * 根据模板查数量
     * @param example
     * @return
     */
    int selectCountByExample(Example example);

    /**
     * 根据行号查询
     * @param var1
     * @param rowBounds
     * @return
     */
    List<T> selectByRowBounds(T var1, RowBounds rowBounds);

    /**
     * 根据模板和行号查询
     * @param example
     * @param rowBounds
     * @return
     */
    List<T> selectByExampleAndRowBounds(Example example, RowBounds rowBounds);


    /**
     * 根据主键更新，将设置的属性进行更新，如不设置属性自动更新为null
     * @param var1
     * @return
     */
    int updateByPrimaryKey(T var1);

    /**
     * 根据主键进行更新，将设置的属性进行更新，没有设置的属性不更新
     * @param var1
     * @return
     */
    int updateByPrimaryKeySelective(T var1);

    /**
     * 根据模板更新，全字段更新
     * @param varl
     * @param example
     * @return
     */
    int updateByExample(T varl,Example example);

    /**
     * 根据模板更新，选定字段
     * @param varl
     * @param example
     * @return
     */
    int updateByExampleSelective(T varl,Example example);


    /**
     * 删除
     * @param var1
     * @return
     */
    int delete(T var1);

    /**
     * 根据id删除
      * @param id
     * @return
     */
    int deleteByPrimaryKey(ID id);

    /**
     * 根据模板删除
     * @param example
     * @return
     */
    int deleteByExample(Example example);




}
