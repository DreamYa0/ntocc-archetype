#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.api.enums;

import java.util.HashMap;

/**
 * @author dreamyao
 * @title
 * @date 2018/9/6 上午10:37
 * @since 1.0.0
 */
public enum SexTypeEnum {

    /**
     * 未打标
     */
    MAN(0, "男"),
    /**
     * 不感兴趣
     */
    WOMAN(1, "女"),

    ;

    private Integer code;
    private String name;

    SexTypeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    private final static HashMap<Integer, SexTypeEnum> VALUE_MAP = new HashMap<>();

    static {
        for (SexTypeEnum o : SexTypeEnum.values()) {
            VALUE_MAP.put(o.getCode(), o);
        }
    }

    public static SexTypeEnum valueOf(Integer siteStatusCode) {
        if (siteStatusCode == null) {
            return null;
        }
        SexTypeEnum v = VALUE_MAP.get(siteStatusCode);
        if (v == null) {
            throw new RuntimeException("Unkonw Code: " + siteStatusCode);
        }
        return v;
    }

    public static Boolean contain(String name) {
        if (name == null) {
            return false;
        }
        for (SexTypeEnum typeEnum : SexTypeEnum.values()) {
            if (typeEnum.name().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static Boolean contain(Integer code) {
        return VALUE_MAP.containsKey(code);
    }
}
