package com.dependency.management.controller;

import com.dependency.management.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PriceController {

    @Autowired
    PriceService priceService;
    //Intraday call
    @GetMapping("/daily")
    public String intradayPrice(){
        String result = priceService.fetchIntradayPrice();
        return result;
    }
    //weekly call
    @GetMapping("/weekly")
    public String weeklyPrice(){
        String result = priceService.fetchWeeklyPrice();
        return result;
    }
    //monthly call
    @GetMapping("/monthly")
    public String monthlyPrice(){
        String result = priceService.fetchMonthlyPrice();
        return result;
    }
}
