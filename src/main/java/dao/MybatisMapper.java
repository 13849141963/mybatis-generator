package dao;

import pojo.Mybatis;

public interface MybatisMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mybatis record);

    int insertSelective(Mybatis record);

    Mybatis selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mybatis record);

    int updateByPrimaryKey(Mybatis record);
}