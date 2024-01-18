#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.api.message;

import ${package}.api.enums.SexTypeEnum;
import lombok.Data;
import java.io.Serializable;

/**
 * @author dreamyao
 * @title MQ发送的消息实体类，提供给调用方，方便调用做消息的反序列化
 * @date 2018/9/6 上午10:35
 * @since 1.0.0
 */
@Data
public class DemoMessage implements Serializable {

    private static final long serialVersionUID = -8422281992328333373L;

    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private SexTypeEnum sexType;
}
