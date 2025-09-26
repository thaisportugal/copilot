package br.com.bradesco.cnsg.srv.formata.aceitedig;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Test class to verify that the Application configuration loads correctly.
 * This test ensures that the BeanDefinitionStoreException is resolved.
 */
@SpringBootTest
class ApplicationTest {

    /**
     * Test that verifies the application context loads successfully
     * without throwing a BeanDefinitionStoreException.
     */
    @Test
    void contextLoads() {
        // This test will fail if there are configuration issues
        // The test passes if the Spring Boot context loads successfully
    }
}