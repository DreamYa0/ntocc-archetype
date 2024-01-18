/**
 * @author dreamyao
 * @title 对外提供的业务类存放包路径，此包类的业务代码对 internal包的业务代码进行组合、包装、代理，provider模块调用此包中的方法
 * @date 2018/11/7 7:30 PM
 * @since 1.0.0
 */
#set($symbol_pound='#')
        #set($symbol_dollar='$')
        #set($symbol_escape='\' )
package ${package}.biz.external;