package com.ims.springjwt.services.impl;

import com.ims.springjwt.models.Buyer;
import com.ims.springjwt.models.OrderMaster;
import com.ims.springjwt.repository.BuyerRepository;
import com.ims.springjwt.repository.OrderMasterRepository;
import com.ims.springjwt.services.OrderMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderMasterServiceimpl implements OrderMasterService {

    @Autowired
    BuyerRepository buyerRepository;

    @Autowired
    OrderMasterRepository orderMasterRepository;

    @Override
    public List<Buyer> getBuyer() {
        return buyerRepository.findAll();
    }

    @Override
    public List<OrderMaster> saveOrderMasterList(List<OrderMaster> orderMasterList) {
        return orderMasterRepository.saveAll(orderMasterList);
    }

    @Override
    public OrderMaster saveOrderMaster(OrderMaster orderMaster) {
        return orderMasterRepository.save(orderMaster);
    }
}
