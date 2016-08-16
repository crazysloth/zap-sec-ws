package nz.ac.auckland;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.zaproxy.clientapi.core.ClientApi;

/**
 * Created by jonas on 12/08/16.
 */

@Configuration
@PropertySource("classpath:application.properties")
public class ZapClientConfig {



    @Bean
    public ClientApi zapClientApi() {
        ClientApi clientApi = ClientApi(
    }

}
