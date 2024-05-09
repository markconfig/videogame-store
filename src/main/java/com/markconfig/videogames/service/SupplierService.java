package com.markconfig.videogames.service;

import com.markconfig.videogames.domain.Supplier;
import com.markconfig.videogames.repository.SupplierRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {
    private final SupplierRepository supplierRepository;

    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    public List<Supplier> getAll() {
        return this.supplierRepository.findAllOrderByName();
    }

}
