package manninglivesalon.salonapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SalonDetailsConfig {

    @Bean
    public SalonDetails salonDetails() {
        return new SalonDetails();
    }

}
