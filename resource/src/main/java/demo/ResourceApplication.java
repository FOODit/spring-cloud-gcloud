package demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.security.oauth2.resource.EnableOAuth2Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@SpringBootApplication
@RestController
@EnableOAuth2Resource
public class ResourceApplication {
    @RequestMapping("/")
    public Map<String, String> home() {
        Map<String, String> resp = new HashMap();
        resp.put("id", UUID.randomUUID().toString());
        resp.put("content", "Hello from Mick");
        return resp;
    }

    public static void main(String[] args) {
        SpringApplication.run(ResourceApplication.class, args);
    }

}
