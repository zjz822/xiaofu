package com.xiaofu.fu.controler;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xiaofu.fu.pojo.Result;
import com.xiaofu.fu.pojo.map;
import com.xiaofu.fu.service.mapserimpl;

@RestController
@RequestMapping("/map")
public class mapcontrol {
    private final mapserimpl Mapserimpl;

    public mapcontrol(mapserimpl Mapserimpl){
        this.Mapserimpl=Mapserimpl;
    }

    @GetMapping
    public Result selectall(){
        return Result.success(Mapserimpl.selectall());
    }

    @PostMapping("/once")
    public Result selectmap(@RequestBody map m){
        return Result.success(Mapserimpl.selectmap(m));
    }

    @PostMapping
    public Result insertmap(@RequestBody map m){
        Mapserimpl.insertmap(m);
        return Result.success();
    }

    @DeleteMapping
    public Result deletemap(@RequestBody map m){
        Mapserimpl.deletemap(m);
        return Result.success();
    }

    @PutMapping
    public Result updatemap(@RequestBody map m){
        Mapserimpl.updatemap(m);
        return Result.success();
    }
}
