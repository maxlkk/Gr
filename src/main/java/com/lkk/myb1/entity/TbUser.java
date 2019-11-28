package com.lkk.myb1.entity;

import javax.persistence.*;

@Table(name = "tb_user")
public class TbUser {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * code码
     */
    private String code;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别：1-男，2-女
     */
    private String six;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取code码
     *
     * @return code - code码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置code码
     *
     * @param code code码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取性别：1-男，2-女
     *
     * @return six - 性别：1-男，2-女
     */
    public String getSix() {
        return six;
    }

    /**
     * 设置性别：1-男，2-女
     *
     * @param six 性别：1-男，2-女
     */
    public void setSix(String six) {
        this.six = six;
    }
}