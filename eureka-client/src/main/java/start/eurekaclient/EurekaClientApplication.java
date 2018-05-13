package start.eurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
@RequestMapping("/client")
public class EurekaClientApplication {
	
	@Autowired
	CallMe call;

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return call.hello();
	}
}
