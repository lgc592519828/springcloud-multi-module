
package cn.gcheng.ribbonresttemplate.controller;

import cn.gcheng.ribbonresttemplate.entity.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * FileName: MemberController
 * Author:   LIUGUOCHENG
 * Date:     2020/9/29 16:50
 * Description:
 */
@RestController
public class MemberController {
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/borrow")
    public String borrow(String id) {
        String url = "http://provider-service:8761/bsn?id=" + id;
        Book forObject = restTemplate.getForObject(url, Book.class);
        return forObject.toString();
    }

    @RequestMapping("/get")
    public String get() {
        return "1";
    }
}