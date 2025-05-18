package com.tenanttrack.tenant_backend.controller;

import com.tenanttrack.tenant_backend.model.Tenant;
import com.tenanttrack.tenant_backend.service.TenantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tenants")
@CrossOrigin // allow React later
public class TenantController {

    private final TenantService service;
    public TenantController(TenantService service){ this.service = service; }

    @GetMapping
    public List<Tenant> getAll(){
        return service.all();
    }

    @PostMapping
    public Tenant create(@RequestBody Tenant tenant){
        return service.add(tenant);
    }
}