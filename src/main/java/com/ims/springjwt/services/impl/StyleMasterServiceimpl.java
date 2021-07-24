package com.ims.springjwt.services.impl;

import com.ims.springjwt.models.Category;
import com.ims.springjwt.models.Item;
import com.ims.springjwt.models.StyleMaster;
import com.ims.springjwt.repository.CategoryRepository;
import com.ims.springjwt.repository.ItemRepository;
import com.ims.springjwt.repository.StyleMasterRepository;
import com.ims.springjwt.services.StyleMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StyleMasterServiceimpl implements StyleMasterService {
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    StyleMasterRepository styleMasterRepository;

    @Override
    public List<Category> OrderMasterCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public List<Item> OrderMasterItem() {
        return itemRepository.findAll();
    }

    @Override
    public List<StyleMaster> saveStyleMaster(List<StyleMaster> styleMasterList) {
        return styleMasterRepository.saveAll(styleMasterList);
    }

    @Override
    public List<StyleMaster> getStyleMaster() {
        return styleMasterRepository.findAll();
    }

    @Override
    public String deleteProduct(Long id) {
        styleMasterRepository.deleteById(id);
        return "product removed !! " + id;
    }

    @Override
    public List<Item> OrderMasterItemFindByCategory(Long id) {
        return itemRepository.findByCategory_Id(id);
    }
}
