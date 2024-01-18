#set($symbol_pound='#')
        #set($symbol_dollar='$')
        #set($symbol_escape='\' )
package ${package}.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.g7.framework.common.dto.Request;
import com.g7.framework.common.dto.Result;
import ${package}.api.bo.DemoReq;
import ${package}.api.service.DemoService;
import ${package}.biz.DemoBiz;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * @author dreamyao
 * @title
 * @date 2018/9/7 上午9:43
 * @since 1.0.0
 */
@Service
@org.springframework.stereotype.Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoBiz demoBiz;

    @Override
    public Result<Integer> savePersonMessage(Request<DemoReq> request) {

        Result<Integer> result = Result.create();
        DemoReq demo = request.getData();
        return result.success(demoBiz.saveDemo(demo));
    }
}
