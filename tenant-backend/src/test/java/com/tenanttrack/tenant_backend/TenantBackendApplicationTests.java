package com.tenanttrack.tenant_backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;

@SpringBootTest
class TenantBackendApplicationTests {

	@Test
@WithMockUser(username = "admin", roles = {"USER"}) // Mock user for testing
	// This annotation allows the test to run with a mock user having the role "USER"
	void contextLoads() {
	}

}
