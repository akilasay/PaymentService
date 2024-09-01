package com.ak.payment.swaggerConfig;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The type Swagger config.
 */
public class swaggerConfig {


    /**
     * The type Open api config.
     */
    @Configuration
    public class OpenApiConfig {

        /**
         * Payment api grouped open api.
         *
         * @return the grouped open api
         */
        @Bean
        public GroupedOpenApi paymentApi() {
            return GroupedOpenApi.builder()
                    .group("payment-api")
                    .pathsToMatch("/api/**")
                    .build();
        }
    }

}



