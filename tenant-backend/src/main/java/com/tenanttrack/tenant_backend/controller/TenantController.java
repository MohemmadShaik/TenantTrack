package com.tenanttrack.tenant_backend.controller;

import com.tenanttrack.tenant_backend.model.Tenant;
import com.tenanttrack.tenant_backend.service.TenantService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
@RequestMapping("/api/tenants")
@CrossOrigin(origins = "http://localhost:3000") // Allow React frontend
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
    
    @PutMapping("/{id}")
    public Tenant update(@PathVariable String id, @RequestBody Tenant tenant) {
        return service.update(id, tenant);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // Return 204 on successful deletion
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

}