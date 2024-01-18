#set($symbol_pound='#')
        #set($symbol_dollar='$')
        #set($symbol_escape='\' )
package ${package}.biz;

import ${package}.api.bo.DemoReq;
import ${package}.dao.mapper.NtoccCarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dreamyao
 * @title
 * @date 2018/9/6 上午10:30
 * @since 1.0.0
 */
@Service
public class DemoBiz {

    @Autowired
    private NtoccCarMapper ntoccCarMapper;

    public Integer saveDemo(DemoReq req) {
        return 1;
    }
}
