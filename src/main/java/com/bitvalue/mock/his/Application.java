package com.bitvalue.mock.his;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@ServletComponentScan
public class Application
{
    public static void main( String[] args )
    {
        SpringApplication.run(Application.class, args);
    }
}
