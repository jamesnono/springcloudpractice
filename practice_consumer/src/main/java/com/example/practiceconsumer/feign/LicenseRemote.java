package com.example.practiceconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="practiceimprove",fallback =LicenseRemoteHystrix.class)
public interface LicenseRemote {

    @RequestMapping("/hello/test111")
    public String license(@RequestParam("name") String name1);
}
