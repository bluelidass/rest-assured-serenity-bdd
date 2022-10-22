package base;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.configuration.SystemPropertiesConfiguration;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class EnvironmentVariable {
    static SystemPropertiesConfiguration configuration = new SystemPropertiesConfiguration(
            SystemEnvironmentVariables.createEnvironmentVariables());
    static EnvironmentVariables env = configuration.getEnvironmentVariables();

    public static String BASE_URL = config().getProperty("BaseUrl");

    public static String configPrivateKey() {
        String accessToken = System.getProperty("token");

        if (accessToken == null) {
            return config().getProperty("token");
        }
        return accessToken;
    }

    static EnvironmentSpecificConfiguration config() {
        return EnvironmentSpecificConfiguration.from(env);
    }

}
