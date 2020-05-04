package tr.com.teb.tebws.optimus.config;

import io.quarkus.arc.DefaultBean;
import io.quarkus.arc.config.ConfigProperties;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ConfigProperties(prefix = "optimus")
public class OptimusConfiguration {

    @ConfigProperty(name = "optimus.password")
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
