package com.nnt.demo.controller;

import com.nnt.demo.model.Category;
import com.nnt.demo.model.Product;
import com.nnt.demo.service.CategoryService;
import com.nnt.demo.service.ProductService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(maxAge = 3600)
@Controller
@RestController
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @PostMapping(value = "/insert")
    public String insertProduct(@RequestBody JSONObject inputJson) {
        System.out.println(inputJson);
        int cateId = (Integer) inputJson.get("cateId");
        String name = (String) inputJson.get("name");
        String status = (String) inputJson.get("status");
        int quality = (Integer) inputJson.get("quality");
        int id = (Integer) inputJson.get("id");

        Category c = categoryService.findCategoryById(cateId);

        Product p = new Product();
        p.setCateId(c);
        p.setId(id);
        p.setName(name);
        p.setQuality(quality);
        p.setStatus(status);

        productService.save(p);
        return "product";
    }

}
