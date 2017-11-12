package cn.guxiangfly.testmyredisstarter;

import cn.guxiangfly.redis.EnableRedis;
import jdk.nashorn.internal.scripts.JD;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import redis.clients.jedis.Jedis;

@SpringBootApplication
@EnableRedis
public class TestmyredisstarterApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(TestmyredisstarterApplication.class, args);

		Jedis jedis = applicationContext.getBean(Jedis.class);
		jedis.set("name1","guxiangfly");
		System.out.println(jedis.get("name"));
	}
}
