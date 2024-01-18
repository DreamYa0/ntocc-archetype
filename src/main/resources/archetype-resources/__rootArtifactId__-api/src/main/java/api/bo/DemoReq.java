#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.api.bo;

import ${package}.api.enums.SexTypeEnum;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author dreamyao
 * @title
 * @date 2018/9/6 上午10:35
 * @since 1.0.0
 */
@Data
public class DemoReq implements Serializable{

    private static final long serialVersionUID = -8422281992328333373L;

    /**
     * 姓名
     */
    @NotEmpty
    private String name;
    /**
     * 年龄
     */
    @NotNull
    private Integer age;

    /**
     * 性别
     */
    @NotNull
    private SexTypeEnum sexType;
}
