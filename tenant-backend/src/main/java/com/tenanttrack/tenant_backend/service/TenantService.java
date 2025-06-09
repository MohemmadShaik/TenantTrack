package com.tenanttrack.tenant_backend.service;

import com.tenanttrack.tenant_backend.model.Tenant;
import com.tenanttrack.tenant_backend.repository.TenantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TenantService {
    private final TenantRepository repo;
    public TenantService(TenantRepository repo){ this.repo = repo; }

    public List<Tenant> all(){ return repo.findAll(); } //GET
    public Tenant add(Tenant t){ return repo.save(t); } //PUT

    //UPDATE
    public Tenant update(String id, Tenant updatedTenant) {
        Optional<Tenant> existingTenant = repo.findById(id);
        if (existingTenant.isPresent()) {
            Tenant tenant = existingTenant.get();
            tenant.setName(updatedTenant.getName());
            tenant.setPhone(updatedTenant.getPhone());
            tenant.setDoj(updatedTenant.getDoj());
            tenant.setRoomNumber(updatedTenant.getRoomNumber());
            tenant.setRent(updatedTenant.getRent());
            return repo.save(tenant);
        } else {
            throw new RuntimeException("Tenant not found with id: " + id);
        }
    }

    //DELETE
    public void delete(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Tenant not found with id: " + id);
        }
    }
}