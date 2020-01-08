package com.example.practiceimprove.base.util;

import org.springframework.beans.factory.annotation.Value;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author 杨锐
 * @description Redis工具类
 * @date 2020-01-07 下午8:35
 */
public final class RedisUtil {

    @Value("${spring.redis.host}")
    private static String host;
    @Value("${spring.redis.port}")
    private static int port;
    @Value("${spring.redis.ssl}")
    private static boolean ssl;
    @Value("spring.redis.password")
    private static String password;
    @Value("${string.redis.timeout}")
    private static int timeOut;

    private static JedisPool jedisPool;

    private static Jedis getJedis() {
        JedisPoolConfig jedisPoolConfig = null;
        if (null == jedisPool) {
            synchronized (RedisUtil.class) {
                jedisPoolConfig = new JedisPoolConfig();
                jedisPoolConfig.setMaxIdle(100);
                jedisPoolConfig.setMaxTotal(100);
                jedisPoolConfig.setMaxWaitMillis(60000);
                jedisPoolConfig.setMinIdle(10);
                jedisPool = new JedisPool(jedisPoolConfig, host, port, timeOut, password, ssl);
            }
        }
        Jedis jedis = jedisPool.getResource();
        jedis.select(1);
        return jedis;
    }
}
