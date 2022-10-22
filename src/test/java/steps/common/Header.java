package steps.common;

import java.util.HashMap;
import java.util.Map;
import static base.EnvironmentVariable.*;

public class Header {
    public static Map<String, String> addHeaderWithAuth() {
        String PRIVATE_KEY = configPrivateKey();
        Map<String, String> header = new HashMap<String, String>();
        header.put("Content-Type", "application/json");
        header.put("Authorization", "Bearer " + PRIVATE_KEY);
        return header;
    }

    public static Map<String, String> addBasicHeader() {
        Map<String, String> header = new HashMap<String, String>();
        header.put("Content-Type", "application/json");
        return header;
    }
}
