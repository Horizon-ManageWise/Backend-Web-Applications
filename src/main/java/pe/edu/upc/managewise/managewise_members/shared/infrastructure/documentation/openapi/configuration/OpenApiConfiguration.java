package pe.edu.upc.managewise.managewise_members.shared.infrastructure.documentation.openapi.configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {

    @Bean
    public OpenAPI managewiseMembersOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("ManageWise My DB API")
                        .description("API para la gestión de miembros en la plataforma ManageWise.")
                        .version("v1.0.0")
                        .termsOfService("https://www.example.com/terms")
                        .contact(new Contact()
                                .name("Soporte ManageWise")
                                .email("soporte@managewise.com")
                                .url("https://www.managewise.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0.html"))
                )
                .externalDocs(new ExternalDocumentation()
                        .description("Documentación adicional de la API")
                        .url("https://github.com/Horizon-ManageWise/Horizon/tree/develop"));
    }
}
