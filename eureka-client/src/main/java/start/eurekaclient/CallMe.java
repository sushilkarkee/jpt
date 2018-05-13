package start.eurekaclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eureka-server")
public interface CallMe {

	@RequestMapping("/server/hello")
	public String hello();
}
