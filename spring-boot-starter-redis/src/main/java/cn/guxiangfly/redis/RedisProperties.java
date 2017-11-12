package cn.guxiangfly.redis;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * RedisProperties
 *
 * @author guxiang
 * @date 2017/11/12
 */
@ConfigurationProperties(prefix = "redis")
public class RedisProperties {
    private String host = "127.0.0.0.1";
    private Integer port = 6379;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
