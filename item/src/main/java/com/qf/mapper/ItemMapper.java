package com.qf.mapper;

import org.apache.ibatis.annotations.Update;

public interface ItemMapper {

    @Update("update item set name = name -1 where id = 1")
    void update();
}
