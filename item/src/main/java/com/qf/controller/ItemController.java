package com.qf.controller;

import com.qf.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    public String update() {
        itemService.update();
        return "ok";
    }

}
