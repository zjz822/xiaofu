package com.xiaofu.fu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.xiaofu.fu.pojo.map;

@Mapper
public interface  mapdao {

    @Select("select * from map")
    List<map> selectall();
    
    map selectmap(map m);

    @Insert("insert into map (name,age,hobby) values (#{name},#{age},#{hobby})")
    void insertmap(map m);

    @Update("update map set name=#{name},age=#{age},hobby=#{hobby} where id =#{id}")
    void updatemap(map m);

    @Delete("delete from map where id=#{id}")
    void deletemap(map m);
}
