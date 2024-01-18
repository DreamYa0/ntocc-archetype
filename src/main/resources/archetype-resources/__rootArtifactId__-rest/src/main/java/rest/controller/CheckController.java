#set($symbol_pound='#')
        #set($symbol_dollar='$')
        #set($symbol_escape='\' )
package ${package}.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * @author dreamyao
 * @title 健康检查
 * @date 2018/8/18 下午10:00
 * @since 1.0.0
 */
@Controller
public class CheckController {

    @RequestMapping("/check")
    public void check(HttpServletResponse response) {
        response.setStatus(HttpServletResponse.SC_OK);
    }
}
