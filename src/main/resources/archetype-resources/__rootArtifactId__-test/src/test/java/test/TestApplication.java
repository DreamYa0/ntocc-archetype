#set( $symbol_pound = '#' )
        #set( $symbol_dollar = '$' )
        #set( $symbol_escape = '\' )
package ${package}.test;

import com.atomic.schema.EnableAtomic;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import com.g7.framework.redisson.annotation.EnableRedisson;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author dreamyao
 * @title
 * @date 2018/8/25 下午1:00
 * @since 1.0.0
 */
@EnableAsync
@EnableCaching
@EnableRedisson
@EnableApolloConfig
@MapperScan(basePackages = {"com.**.dao.**"})
@EnableAtomic(projectName = "${parentArtifactId}",runner = "dreamyao")
@SpringBootApplication(scanBasePackages = {"com.ntocc"}, exclude = {DataSourceAutoConfiguration.class})
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}