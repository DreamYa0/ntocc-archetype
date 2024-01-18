#set($symbol_pound='#')
        #set($symbol_dollar='$')
        #set($symbol_escape='\' )
package ${package}.rest;

import com.g7.framework.cat.EnableCat;
import com.g7.framework.job.annotation.EnableJob;
import com.g7.framework.redisson.annotation.EnableRedisson;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
 * @author dreamyao
 * @title
 * @date 2018/8/25 下午1:00
 * @since 1.0.0
 */
@EnableCat
@EnableJob
@EnableAsync
@EnableCaching
@EnableRedisson
@EnableScheduling
@EnableApolloConfig
@MapperScan(basePackages = {"com.**.dao.**"})
@SpringBootApplication(scanBasePackages = {"com.ntocc"}, exclude = DataSourceAutoConfiguration.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}