package com.qf.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.qf.mapper.ItemMapper;
import com.qf.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import javax.annotation.Resource;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private RestTemplate restTemplate;
    @Resource
    private ItemMapper itemMapper;

    @Override
    @Transactional
    @LcnTransaction
    public void update() {
        // 库存减一,调用订单，添加一个订单
        String result = restTemplate.getForObject("http://localhost8080/order", String.class);


        itemMapper.update();

    }
}
