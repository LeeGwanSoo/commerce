package com.commerce.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .title("Commerce API")
                .description("Commerce API 를 제공합니다.")
                .version("1.0.0");

//        // Security 스키마 설정
//        SecurityScheme bearerAuth = new SecurityScheme()
//                .type(SecurityScheme.Type.HTTP)
//                .scheme("bearer")
//                .bearerFormat("Authorization")
//                .in(SecurityScheme.In.HEADER)
//                .name(HttpHeaders.AUTHORIZATION);
//
//        // Security 요청 설정
//        SecurityRequirement addSecurityItem = new SecurityRequirement();
//        addSecurityItem.addList("Authorization");
//
//        return new OpenAPI()
//                // Security 인증 컴포넌트 설정
//                .components(new Components().addSecuritySchemes("Authorization", bearerAuth))
//                // API 마다 Security 인증 컴포넌트 설정
//                .addSecurityItem(addSecurityItem)
//                .info(info);

        // Security 설정 - access 헤더를 사용
        SecurityScheme accessHeaderScheme = new SecurityScheme()
                .type(SecurityScheme.Type.APIKEY)   // API Key 타입 사용
                .name("access")                     // 헤더 이름 'access'
                .in(SecurityScheme.In.HEADER)       // 헤더에서 전달됨
                .description("JWT Access Token을 입력하세요.");

        // Security 요구사항 설정
        SecurityRequirement securityRequirement = new SecurityRequirement()
                .addList("access"); // 'access'라는 스키마 추가

        return new OpenAPI()
                .components(new Components().addSecuritySchemes("access", accessHeaderScheme))
                .addSecurityItem(securityRequirement) // 모든 요청에 Security 적용
                .info(info);
    }
}