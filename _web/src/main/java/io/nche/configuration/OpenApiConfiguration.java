package io.nche.configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class OpenApiConfiguration {

    private static String VERSION;

    @Bean
    public OpenAPI api(){
        return new OpenAPI()
                .info(apiInfo())
                .externalDocs(springdocDoc());
    }


    public Info apiInfo() {
        return new Info().title("Swagger API 문서")
                .description("API와 연동된 Swagger 문서입니다.")
                .version(VERSION);
    }

    public ExternalDocumentation springdocDoc(){
        return new ExternalDocumentation()
                .description("springdoc-openapi Docs")
                .url("https://springdoc.org/");
    }

    @Value("${api.version}")
    private void setVERSION(String version){
        VERSION = version;
    }
}
