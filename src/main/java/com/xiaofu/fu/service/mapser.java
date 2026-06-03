package com.xiaofu.fu.service;

import java.util.List;

import com.xiaofu.fu.pojo.map;

public interface  mapser {
    public List<map> selectall();
    public map selectmap(map m);
    public void deletemap(map m);
    public void updatemap(map m);
    public void insertmap(map m);
}
