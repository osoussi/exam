package org.core.certification.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Lina",
                        email = "linadh081@gmail.com"
                ),
                description = "OpenApi documentation for Exam and Certification management",
                title = "OpenApi specification - Lina Dhahbi",
                version = "1.0"
        ),
        servers = {
                @Server(
                        description = "Local ENV",
                        url = "http://localhost:8989"
                )
        }
)
public class OpenApiConfiguration {
}
