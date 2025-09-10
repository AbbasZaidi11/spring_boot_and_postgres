package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService service;

    public SoftwareEngineerController(SoftwareEngineerService service) {
        this.service = service;
    }

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return service.getAllSoftwareEngineers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SoftwareEngineer> getEngineerById(@PathVariable Integer id) {
        SoftwareEngineer se = service.getSoftwareEngineerById(id);
        return ResponseEntity.ok(se);
    }

    @PostMapping
    public ResponseEntity<SoftwareEngineer> addNewSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer) {
        SoftwareEngineer saved = service.insertSoftwareEngineer(softwareEngineer);
        // Return 201 Created with Location header
        return ResponseEntity.created(URI.create("/api/v1/software-engineers/" + saved.getId()))
                .body(saved);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEngineer(@PathVariable Integer id) {
        service.deleteSoftwareEngineer(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<SoftwareEngineer> updateEngineer(@PathVariable Integer id,
                                                           @RequestBody SoftwareEngineer updated) {
        SoftwareEngineer saved = service.updateSoftwareEngineer(id, updated);
        return ResponseEntity.ok(saved);
    }
}
