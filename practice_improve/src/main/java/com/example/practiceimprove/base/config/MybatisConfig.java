package com.example.practiceimprove.base.config;

import com.example.practiceimprove.base.database.DynamicDataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MybatisConfig
 * @Description TODO
 * @Author yangrui
 * @Date 2019/10/10
 **/
@Configuration
@MapperScan(basePackages = {"com.example.practiceimprove.test.dao.mybatis.mapper"})
public class MybatisConfig {

    @Resource
    private Environment env;

    public BasicDataSource createBasicDataSource(){
        BasicDataSource basicDataSource = new BasicDataSource();
//        basicDataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
//        basicDataSource.setUrl(env.getProperty("spring.datasource.url"));
//        basicDataSource.setUsername(env.getProperty("spring.datasource.username"));
//        basicDataSource.setPassword(env.getProperty("spring.datasource.password"));
        basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("root");
        basicDataSource.setTestOnBorrow(true);
        basicDataSource.setTestWhileIdle(true);
        return basicDataSource;
    }
    public BasicDataSource masterDataSource(){
        BasicDataSource basicDataSource= createBasicDataSource();
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        return basicDataSource;
    }

    public BasicDataSource slave01DataSource(){
        BasicDataSource basicDataSource= createBasicDataSource();
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/mysql1?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        return basicDataSource;
    }

    public BasicDataSource slave02DataSource(){
        BasicDataSource basicDataSource= createBasicDataSource();
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/mysql2?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        return basicDataSource;
    }

    @Bean
    public DynamicDataSource dataSource(){
        Map<Object,Object> mapDataSource =new HashMap<Object, Object>();
        mapDataSource.put("master",masterDataSource());
        mapDataSource.put("slave_01",slave01DataSource());
        mapDataSource.put("slave_02",slave02DataSource());
        DynamicDataSource dataSource =new DynamicDataSource();
        dataSource.setTargetDataSources(mapDataSource);
        dataSource.setDefaultTargetDataSource(masterDataSource());
        return dataSource;
    }

//    @Bean
//    public SqlSessionFactory sqlSessionFactory(DynamicDataSource ds) throws Exception {
//        SqlSessionFactoryBean sfb = new SqlSessionFactoryBean();
//        sfb.setDataSource(ds);
//        sfb.setMapperLocations(
//                new PathMatchingResourcePatternResolver().getResources("classpath*:com/example/**/sqlMap/*MySql.xml"));
//        return sfb.getObject();
//    }
//
//    @Bean
//    public JdbcTemplate jdbcTemplate(DynamicDataSource dataSource) {
//        JdbcTemplate jdbcTemplate = new JdbcTemplate();
//        jdbcTemplate.setDataSource(dataSource);
//        return jdbcTemplate;
//    }
}
