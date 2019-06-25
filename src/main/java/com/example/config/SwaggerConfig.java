package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    //配置docket以配置Swagger具体参数
    @Bean
    public Docket docket() {
        /*return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());*/
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.controller")).build();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("王开译","aaa.com","823439163@qq.com");
        return new ApiInfo("Swagger学习接口文档样例",
                "这是学习Swagger时生成的文档信息",
                "v1.0",
                "http::localhost:8080",
                contact,"",
                "",
                new ArrayList<>());
    }
}
