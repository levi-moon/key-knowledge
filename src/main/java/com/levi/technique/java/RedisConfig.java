package com.levi.technique.java;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * springboot项目中，解决redis中命令行可以get到值，但是Java程序get不到值的问题；
 */
@Slf4j
@Configuration
public class RedisConfig extends CachingConfigurerSupport {

    /**
     * redisTemplate配置
     *
     * @param lettuceConnectionFactory
     * @return
     */
    @Bean
    public RedisTemplate<String,Object> redisTemplate(LettuceConnectionFactory lettuceConnectionFactory){
        log.info(" ---- redis config init ----");
        Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = jackson2JsonRedisSerializer();
        RedisTemplate<String,Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(lettuceConnectionFactory);
        RedisSerializer<?> stringSerializer = new StringRedisSerializer();
        // key 序列化
        redisTemplate.setKeySerializer(stringSerializer);
        // value 序列化
        redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
        // hash key 序列化
        redisTemplate.setHashKeySerializer(stringSerializer);
        // hash value 序列化
        redisTemplate.setHashValueSerializer(jackson2JsonRedisSerializer);
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }

    private Jackson2JsonRedisSerializer jackson2JsonRedisSerializer(){
        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(objectMapper);
        return jackson2JsonRedisSerializer;
    }
}
