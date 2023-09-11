import org.springdoc.core.GroupedOpenApi;
import org.springdoc.core.SwaggerUiConfigParameters;
import org.springdoc.core.SwaggerUiConfigProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SwaggerConfig implements WebMvcConfigurer {

    @Value("${springdoc.api-docs.enabled:true}")
    private boolean enableSwagger;

    @Bean
    public GroupedOpenApi api() {
        String[] paths = {"/**"};
        return GroupedOpenApi.builder()
                .group("APIs")
                .pathsToMatch(paths)
                .build();
    }

    // Other configuration methods...

    @Bean
    public SwaggerUiConfigParameters swaggerUiConfigParameters(SwaggerUiConfigProperties swaggerUiConfigProperties) {
        return new SwaggerUiConfigParameters(swaggerUiConfigProperties);
    }

    // Conditionally enable or disable Swagger UI based on the property value
    @Bean
    @Primary
    public SwaggerUiConfigProperties swaggerUiConfigProperties() {
        SwaggerUiConfigProperties properties = new SwaggerUiConfigProperties();
        properties.setEnabled(enableSwagger);
        return properties;
    }
}