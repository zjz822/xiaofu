package com.xiaofu.fu.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.xiaofu.fu.mapper.mapdao;
import com.xiaofu.fu.pojo.map;

@Service
public class mapserimpl implements mapser{
    private final mapdao Mapdao;

    public mapserimpl(mapdao Mapdao){
        this.Mapdao=Mapdao;
    }

    @Override
    public List<map> selectall(){
        return Mapdao.selectall();

    }

    @Override
    public map selectmap(map m){
    return Mapdao.selectmap(m);
    }

    @Override
    public void deletemap(map m){
        Mapdao.deletemap(m);
    }

    @Override
    public void insertmap(map m){
        Mapdao.insertmap(m);
    }

    @Override
    public void updatemap(map m){
        Mapdao.updatemap(m);
    }
}
