package Application.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("SEARCH")  //指定服务名称
public interface SearchClient {
    //value 目标服务器的请求路径
    @RequestMapping(value ="/search",method = RequestMethod.GET)
    String search();
}
