package com.local;

import com.local.bean.ConfigInfo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConfigurationOldApplication.class)
@ActiveProfiles("dev")
@TestPropertySource(
        properties = {
                "spring.cloud.nacos.config.namespace=learn-dev"
        }
)
class ConfigurationOldApplicationTests {
    @Resource
    private ConfigInfo configInfo;

    @Test
    void testConfig() {
        assert "abc".equalsIgnoreCase(configInfo.getText());
        assert "123".equalsIgnoreCase(configInfo.getCode());
        assert "configuration_test".equalsIgnoreCase(configInfo.getMessage());
    }

}
