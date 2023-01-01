package com.example.dividend;

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

        String s = "Hello my name is %s";

        String[] names = {"GREEN", "RED", "BLUE"};

        for (String name : names) {
            System.out.println(String.format(s, name));
        }

    }

}
