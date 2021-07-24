package com.ims.springjwt.controllers;

import com.ims.springjwt.models.Buyer;
import com.ims.springjwt.models.OrderMaster;
import com.ims.springjwt.services.OrderMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api")
public class OrderMasterController {
    @Autowired
    OrderMasterService orderMasterService;

    @GetMapping("/getBuyer")
    public List<Buyer> getBuyer()
    {
        return orderMasterService.getBuyer();
    }

    @PostMapping("/saveOrderMasterList")
    public List<OrderMaster> saveOrderMasterList(@RequestBody List<OrderMaster> orderMasterList)
    {
        return orderMasterService.saveOrderMasterList(orderMasterList);
    }

    @PostMapping("/saveOrderMaster")
    public OrderMaster saveOrderMaster(@RequestBody OrderMaster orderMaster)
    {
        return orderMasterService.saveOrderMaster(orderMaster);
    }

}
