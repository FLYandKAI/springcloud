package Application.Controller;

import Application.client.SearchClient;
import com.netflix.discovery.EurekaClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private EurekaClient eurekaClient;
    @Autowired
    private SearchClient searchClient;
    @GetMapping("/customer")
    public String customer() {
//        System.out.println("coustomer");
//        //1 通过eurekaClient获取search服务的信息
//        InstanceInfo info = eurekaClient.getNextServerFromEureka("SEARCH", false);
//        //2 获取到访问的地址
//        String homePageUrl = info.getHomePageUrl();
//        System.out.println(homePageUrl);
//        //3 通过restTemplate访问
//        String result = restTemplate.getForObject(homePageUrl + "/search", String.class);
        //robbin使用访问
//        String result= restTemplate.getForObject("http://SEARCH/search", String.class);
        //feign使用
        String result= searchClient.search();
        return result;
    }
}
