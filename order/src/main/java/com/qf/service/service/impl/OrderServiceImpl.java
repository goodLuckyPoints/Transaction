package com.qf.service.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.qf.mapper.OrderMapper;
import com.qf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    @Transactional
    @LcnTransaction
    public void add() {
        orderMapper.add();
    }
}
