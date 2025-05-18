package com.tenanttrack.tenant_backend.service;

import com.tenanttrack.tenant_backend.model.Tenant;
import com.tenanttrack.tenant_backend.repository.TenantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenantService {
    private final TenantRepository repo;
    public TenantService(TenantRepository repo){ this.repo = repo; }

    public List<Tenant> all(){ return repo.findAll(); }
    public Tenant add(Tenant t){ return repo.save(t); }
}