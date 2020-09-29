
package cn.gcheng.eurekaserver.controller;

import cn.gcheng.eurekaserver.entity.Book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 用于Ribbon 的服务提供
 * Author:   LIUGUOCHENG
 * Date:     2020/9/29 15:06
 * Description:
 */
@RestController
public class BookController {

    /**
     * 模拟服务端接口
     * @param id
     * @param request
     * @return
     */
    @GetMapping("/bsn")
    public String bsn(String id, HttpServletRequest request) {
        Book book = new Book();
        if ("1".equals(id)) {
            book.setId("1");
            book.setName("达芬奇");
            book.setDesc(String.valueOf(request.getLocalPort()));
        } else {
            book.setId("2");
            book.setName("马可波罗");
            book.setDesc(String.valueOf(request.getLocalPort()));
        }
        return book.toString();
    }
}