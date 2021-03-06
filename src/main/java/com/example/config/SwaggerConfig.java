package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Autowired
    Environment environment;
    //配置docket以配置Swagger具体参数
    @Bean
    public Docket docketUser() {
       /* Profiles profiles = Profiles.of("prod");
        boolean isEnable = environment.acceptsProfiles(profiles);
        *//*return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());*//*
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(!isEnable)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.controller"))
                .build();*/
        Parameter token = new ParameterBuilder()
                .name("token")
                .description("用户登录令牌")
                .parameterType("header")
                .modelRef(new ModelRef("String"))
                .required(true)
                .build();
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(token);
        return new Docket(DocumentationType.SWAGGER_2).globalOperationParameters(parameters);
    }
  /*  @Bean
    public Docket docketHello() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("你好")
                .select().paths(PathSelectors.ant("/hello")).build();

    }*/

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
