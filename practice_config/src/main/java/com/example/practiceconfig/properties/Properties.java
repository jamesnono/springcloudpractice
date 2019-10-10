package com.example.practiceconfig.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Properties
 * @Description TODO
 * @Author yangrui
 * @Date 2019/9/27
 **/
@Component
@ConfigurationProperties(prefix = "my")
public class Properties {

    private List<String> servers = new ArrayList<String>();

    public List<String> getServers() {
        return servers;
    }

    public void setServers(List<String> servers) {
        this.servers = servers;
    }
}
