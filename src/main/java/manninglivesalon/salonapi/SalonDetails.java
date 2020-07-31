package manninglivesalon.salonapi;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("salon")
public class SalonDetails {

    private String name;

    private String address;

    private String city;

    private String state;

    private String zipcode;

    private String phone;

}
