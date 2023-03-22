package com.dependency.management.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PriceServiceImpl implements PriceService{
    RestTemplate restTemplate;
    @Override
    public String fetchIntradayPrice() {
        restTemplate = new RestTemplate();
        String uri = "https://www.alphavantage.co/query?function=TIME_SERIES_DAILY_ADJUSTED&symbol=RELIANCE.BSE&outputsize=full&apikey=NO1TIEL2R260NYT6.";
        String result = restTemplate.getForObject(uri,String.class);
        System.out.print("result :: "+result);
        return result;
    }
}
