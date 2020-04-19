package api.shop.apishopmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@ComponentScan(value= {"api"})
@EnableZuulProxy
@EnableDiscoveryClient
@EnableResourceServer
public class ApiShopManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiShopManagerApplication.class, args);
	}

}
