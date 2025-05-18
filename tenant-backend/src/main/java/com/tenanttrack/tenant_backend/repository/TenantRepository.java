package com.tenanttrack.tenant_backend.repository;
import com.tenanttrack.tenant_backend.model.Tenant;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TenantRepository extends MongoRepository<Tenant, String> {
}
