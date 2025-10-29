package com.academia.coders.web.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academia.coders.service.impl.CoderServiceImpl;
import com.academia.coders.web.dto.CoderRequest;
import com.academia.coders.web.dto.CoderResponse;

import jakarta.validation.Valid;



@RestController
@RequestMapping("/api/v1/coder")
public class CoderController {

    private final CoderServiceImpl service;

    public CoderController(CoderServiceImpl service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<CoderResponse> crear(@Valid @RequestBody CoderRequest req) {
        var response = service.crear(req);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    
    
    @GetMapping("/{id}")
    public ResponseEntity<CoderResponse> obtener(@PathVariable Long id) {
        return ResponseEntity.ok(service.obtenerPorId(id));
    }

    @GetMapping
    public ResponseEntity<List<CoderResponse>> listar() {
        return ResponseEntity.ok(service.listar());
    }
}
