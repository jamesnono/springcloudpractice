package com.example.practiceimprove.test.properties;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @ClassName ProfileTest
 * @Description TODO
 * @Author yangrui
 * @Date 2019/9/27
 **/
@Profile("dev")
@Component
public class ProfileTest {

    private String profileName;

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }
}
