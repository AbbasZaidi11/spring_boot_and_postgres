package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SoftwareEngineerService {
    private final SoftwareEngineerRepository repository;

    public SoftwareEngineerService(SoftwareEngineerRepository repository) {
        this.repository = repository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return repository.findAll();
    }

    public SoftwareEngineer getSoftwareEngineerById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalStateException(id + " not found"));
    }

    public SoftwareEngineer insertSoftwareEngineer(SoftwareEngineer se) {
        return repository.save(se);
    }

    public void deleteSoftwareEngineer(Integer id) {
        repository.deleteById(id);
    }

    public SoftwareEngineer updateSoftwareEngineer(Integer id, SoftwareEngineer updated) {
        SoftwareEngineer existing = getSoftwareEngineerById(id);
        existing.setName(updated.getName());
        existing.setTechStack(updated.getTechStack());
        return repository.save(existing);
    }
}
