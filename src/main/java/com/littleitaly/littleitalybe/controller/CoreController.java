package com.littleitaly.littleitalybe.controller;

import com.littleitaly.littleitalybe.model.*;
import com.littleitaly.littleitalybe.service.CoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/")
@CrossOrigin(origins = "http://localhost:3000")
public class CoreController {

    @Autowired
    private CoreService coreService;

    @GetMapping(path="/appetizers")
    public List<Appetizer> retrieveAppetizers (){
        return this.coreService.retrieveAppetizers();
    }

    @GetMapping(path="/firstCourses")
    public List<FirstCourse> retrieveFirstCourse(){
        return this.coreService.retrieveFirstCourse();
    }

    @GetMapping(path="/secondCourses")
    public List<SecondCourse> retrieveSecondCourse (){
        return this.coreService.retrieveSecondCourse();
    }

    @GetMapping(path="/pizze")
    public List<Pizza> retrievePizze (){
        return this.coreService.retrievePizze();
    }

    @GetMapping(path="/desserts")
    public List<Dessert> retrieveDesserts (){
        return this.coreService.retrieveDesserts();
    }


}
