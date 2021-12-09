package com.sprint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


//SWAGGER CONFIGURATON FOR API DOCUMENTATION
@Configuration

public class SwaggerConfiguration {
	  @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.sprint"))
                .paths(PathSelectors.any())
                .build().apiInfo(apiEndPointInfo());
        
    }
    public ApiInfo apiEndPointInfo() {
        return new ApiInfoBuilder().title("Online Nursery Plant Application")
                .description("Plant Nursery")
                .licenseUrl("http://www.apache.org/licenses/LICENCE-2.0.html")
                .version("0.0.1-SNAPSHOT")
                .build();
    }
}
