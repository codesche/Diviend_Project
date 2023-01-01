package com.example.dividend;

import com.example.dividend.model.Company;
import com.example.dividend.scraper.Scraper;
import com.example.dividend.scraper.YahooFinanceScraper;
import java.io.IOException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DividendProjectApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DividendProjectApplication.class, args);

        Scraper scraper = new YahooFinanceScraper();
//        var result = scraper.scrap(Company.builder().ticker("O").build());

        var result = scraper.scrapCompanyByTicker("MMM");

        System.out.println(result);
    }

}
