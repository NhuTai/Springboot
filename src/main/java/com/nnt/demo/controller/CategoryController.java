package com.nnt.demo.controller;


import com.nnt.demo.model.Category;
import com.nnt.demo.service.CategoryService;
import com.nnt.demo.service.ProductService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(maxAge = 3600)
@Controller
@RestController
@RequestMapping(value = "/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping(value = "/insert")
    public String insertCategory(@RequestBody JSONObject inputJson){
        
        String name = (String)inputJson.get("name");
        Category c = new Category();
        c.setName(name);
        categoryService.save(c);
        return "";
    }
}
