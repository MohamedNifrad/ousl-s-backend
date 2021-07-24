package com.ims.springjwt.services;

import com.ims.springjwt.models.Category;
import com.ims.springjwt.models.Item;
import com.ims.springjwt.models.StyleMaster;

import java.util.List;

public interface StyleMasterService {
    List<Category> OrderMasterCategory();

    List<Item> OrderMasterItem();

    List<StyleMaster> saveStyleMaster(List<StyleMaster> styleMasterList);

    List<StyleMaster> getStyleMaster();

    String deleteProduct(Long id);

    List<Item> OrderMasterItemFindByCategory(Long id);
}
