#set( $symbol_pound = '#' )
        #set( $symbol_dollar = '$' )
        #set( $symbol_escape = '\' )
package ${package}.api.service;

import com.g7.framework.common.dto.Request;
import com.g7.framework.common.dto.Result;
import ${package}.api.bo.DemoReq;
/**
 * @author dreamyao
 * @title demo 服务
 * @date 2018/9/6 上午10:26
 * @since 1.0.0
 */
public interface DemoService {

    /**
     * 保存demo信息
     * @param request demo信息
     * @return 保存后的信息ID
     * @title 保存demo信息
     * @author dreamyao
     * @tables 涉及的数据库表字段
     * @special 特殊说明
     * @uri 给前端调用的请求路径
     * @since 1.0.0
     */
    Result<Integer> savePersonMessage(Request<DemoReq> request);
}
