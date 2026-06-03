package com.xiaofu.fu.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.xiaofu.fu.pojo.user;

@Mapper
public interface usersdao {
    @Select("Select 1 from users where username=#{username} and password =#{password}")
    public Integer login(user u);
    
    @Insert("insert into users values (#{username},#{password})")
    public void register(user u);
}
