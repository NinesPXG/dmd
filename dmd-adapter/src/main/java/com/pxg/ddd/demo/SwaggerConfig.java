package com.pxg.ddd.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableOpenApi
public class SwaggerConfig {

    /**
     * swagger-ui:  http://localhost:8080/swagger-ui/index.html
     * knife4j:  http://localhost:8080/doc.html
     *
     * to do:
     * swagger3 @Tag异常
     * knif4j 内部自冲突
     */

    @Bean
    public Docket petApi(){
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.pxg.ddd.demo.web"))
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("Demo")
                .description("接口文档")
                .version("1.0")
                .build();
    }

}
