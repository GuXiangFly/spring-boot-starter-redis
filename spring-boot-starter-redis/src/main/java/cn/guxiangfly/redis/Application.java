package cn.guxiangfly.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import redis.clients.jedis.Jedis;

/**
 * Application
 *
 * @author guxiang
 * @date 2017/11/12
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        Jedis jedis = applicationContext.getBean(Jedis.class);
        jedis.set("name","guxiangfly");
        System.out.println(jedis.get("name"));
    }
}
