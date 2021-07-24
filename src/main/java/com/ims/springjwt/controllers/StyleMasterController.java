package com.ims.springjwt.controllers;

import com.ims.springjwt.models.Category;
import com.ims.springjwt.models.Item;
import com.ims.springjwt.models.StyleMaster;
import com.ims.springjwt.services.StyleMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api")
public class StyleMasterController {
    @Autowired
    StyleMasterService styleMasterService;

    @GetMapping("/getCategory")
    public List<Category> OrderMasterCategory()
    {
        return styleMasterService.OrderMasterCategory();
    }

    @GetMapping("/getItem")
    public List<Item> OrderMasterItem()
    {
        return styleMasterService.OrderMasterItem();
    }

    @PostMapping("/saveStyleMaster")
    public List<StyleMaster> saveStyleMaster(@RequestBody List<StyleMaster> styleMasterList)
    {
        return styleMasterService.saveStyleMaster(styleMasterList);
    }

    @GetMapping("/getStyleMaster")
    public List<StyleMaster> getStyleMaster()
    {
        return styleMasterService.getStyleMaster();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id)
    {
        return styleMasterService.deleteProduct(id);
    }

    @GetMapping("/getItemByCategory/{id}")
    public List<Item> OrderMasterItemFindByCategory(@PathVariable Long id)
    {
        return styleMasterService.OrderMasterItemFindByCategory(id);
    }
}
