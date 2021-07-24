package com.ims.springjwt.services;

import com.ims.springjwt.models.Buyer;
import com.ims.springjwt.models.Category;
import com.ims.springjwt.models.Item;
import com.ims.springjwt.models.OrderMaster;

import java.util.List;

public interface OrderMasterService {
    List<Buyer> getBuyer();

    List<OrderMaster> saveOrderMasterList(List<OrderMaster> orderMasterList);

    OrderMaster saveOrderMaster(OrderMaster orderMaster);
}
