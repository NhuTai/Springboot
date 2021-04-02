package com.nnt.demo.product;

import com.nnt.demo.model.Person;
import com.nnt.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(maxAge = 3600)
@Controller
@RestController
@RequestMapping(value = "/inox")
public class Inox {
    @Autowired
    private PersonService personService;

    @GetMapping(value = "test")
    public String Test(){
        return "test Inox";
    }

    @GetMapping(value = "insert")
    public String Insert(){
        Person p = new Person();
        p.setAddress("Thanh Hoa");
        p.setCity("Thanh Hoa");
        p.setLastName("Phuoc");
        p.setFirstName("Tran");
        personService.save(p);
        return "test Inox";
    }
}
