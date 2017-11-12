package cn.guxiangfly.redis;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * EnableRedis
 *
 * @author guxiang
 * @date 2017/11/12
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(RedisAutoConfiguration.class)
public @interface EnableRedis {

}
