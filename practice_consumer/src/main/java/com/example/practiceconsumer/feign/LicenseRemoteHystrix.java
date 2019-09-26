package com.example.practiceconsumer.feign;

import com.example.practiceconsumer.feign.LicenseRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName LicenseRemoteHystrix
 * @Description TODO
 * @Author yangrui
 * @Date 2019/9/20
 **/
@Component
public class LicenseRemoteHystrix implements LicenseRemote {
    @Override
    public String license(@RequestParam String name1) {
        return name1+"message failed";
    }
}
