package com.littleitaly.littleitalybe.service;

import com.littleitaly.littleitalybe.model.*;
import com.littleitaly.littleitalybe.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoreService {

    @Autowired
    private AppetizerRepository appetizerRepository;

    @Autowired
    private DessertRepository dessertRepository;

    @Autowired
    private FirstCourseRepository firstCourseRepository;

    @Autowired
    private SecondCourseRepository secondCourseRepository;

    @Autowired
    private PizzaRepository pizzaRepository;


    public List<Appetizer> retrieveAppetizers() {

        Iterable<Appetizer> all = appetizerRepository.findAll();

        List<Appetizer> appetizers = new ArrayList<>();

        all.forEach(appetizers ::add);

        return appetizers;

    }

    public List<FirstCourse> retrieveFirstCourse() {

        Iterable<FirstCourse> all = firstCourseRepository.findAll();

        List<FirstCourse> firstCourses = new ArrayList<>();

        all.forEach(firstCourses ::add);

        return firstCourses;

    }

    public List<SecondCourse> retrieveSecondCourse() {

        Iterable<SecondCourse> all = secondCourseRepository.findAll();

        List<SecondCourse> secondCourses = new ArrayList<>();

        all.forEach(secondCourses ::add);

        return secondCourses;
    }

    public List<Pizza> retrievePizze() {

        Iterable<Pizza> all = pizzaRepository.findAll();

        List<Pizza> pizze = new ArrayList<>();

        all.forEach(pizze ::add);

        return pizze;
    }

    public List<Dessert> retrieveDesserts() {

        Iterable<Dessert> all = dessertRepository.findAll();

        List<Dessert> desserts = new ArrayList<>();

        all.forEach(desserts ::add);

        return desserts;
    }
}
