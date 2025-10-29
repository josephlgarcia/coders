package com.academia.coders.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.academia.coders.entity.CoderEntity;
import com.academia.coders.repository.CoderRepository;
import com.academia.coders.service.CoderService;
import com.academia.coders.web.dto.CoderRequest;
import com.academia.coders.web.dto.CoderResponse;

@Service
public class CoderServiceImpl implements CoderService {

    private final CoderRepository repo;

    public CoderServiceImpl(CoderRepository repo){
        this.repo = repo;
    }

    @Transactional
    @Override
    public CoderResponse crear(CoderRequest req) {
        
        if (repo.existsByNombreIgnoreCase(req.getNombre())) {
            throw new IllegalArgumentException("Nombre duplicado");
        }

        var coder = new CoderEntity();
        coder.setNombre(req.getNombre());
        coder.setEdad(req.getEdad());
        coder.setEmail(req.getEmail());
        coder.setClan(req.getClan());
        var saved = repo.save(coder);
        return new CoderResponse(saved.getNombre(), saved.getEdad(), saved.getEmail(), saved.getClan());
    }
    
    @Transactional(readOnly = true)
    @Override
    public CoderResponse obtenerPorId(Long id) {
        var coder = repo.findById(id).orElseThrow(() -> new NoSuchElementException("El coder no se encuentra registrado"));
        return new CoderResponse(coder.getNombre(), coder.getEdad(), coder.getEmail(), coder.getClan());
    }

    @Transactional
    @Override
    public List<CoderResponse> listar() {
        return repo.findAll().stream()
                .map(coder -> new CoderResponse(coder.getNombre(), coder.getEdad(), coder.getEmail(), coder.getClan()))
                .toList();
    }


}
