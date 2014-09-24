package tuntikirjaus.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigurationProfile {

    @Value("${profile.name}")
    private String name;

    public String getName() {
        return name;
    }
}