package wang.angi.sample.reactive.redis;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettucePoolingClientConfiguration;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializationContext;

/**
 * @author angi
 */
@SpringBootApplication
public class SampleReactiveRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleReactiveRedisApplication.class, args);
    }

    /**
     * LettuceConnectionFactory
     *
     * @return
     */
//    @Bean
//    public ReactiveRedisConnectionFactory lettuceConnectionFactory() {
//        // 单机
//        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
//        redisStandaloneConfiguration.setHostName("localhost");
//        redisStandaloneConfiguration.setPort(6379);
//
//        // 连接池
//        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
//        poolConfig.setMinIdle(1);
//        poolConfig.setMaxIdle(5);
//
//        // 客户端配置
//        LettuceClientConfiguration lettuceClientConfiguration = LettucePoolingClientConfiguration.builder().poolConfig(poolConfig).build();
//        return new LettuceConnectionFactory(redisStandaloneConfiguration, lettuceClientConfiguration);
//    }

    /**
     * ReactiveRedisTemplate
     *
     * @return
     */
//    @Bean
//    ReactiveRedisTemplate<String, String> reactiveRedisTemplate(ReactiveRedisConnectionFactory connectionFactory) {
//        return new ReactiveRedisTemplate<>(connectionFactory, RedisSerializationContext.string());
//    }

}
