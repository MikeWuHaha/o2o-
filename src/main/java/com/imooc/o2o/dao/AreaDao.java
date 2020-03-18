package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Area;

import java.util.List;

public interface AreaDao {

    /**
     * 列出列表区域
     * @return
     */
    List<Area> queryArea();
}
