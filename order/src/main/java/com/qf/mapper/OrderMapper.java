package com.qf.mapper;

import org.apache.ibatis.annotations.Insert;

public interface OrderMapper {
    @Insert("insert into `order` values (0,'元宵')")
    void add();
}
