package com.dependency.management.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
public interface PriceService {
     String fetchIntradayPrice();

     String fetchWeeklyPrice();

     String fetchMonthlyPrice();
}
