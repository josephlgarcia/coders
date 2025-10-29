package com.academia.coders.service;

import java.util.List;

import com.academia.coders.web.dto.CoderRequest;
import com.academia.coders.web.dto.CoderResponse;

public interface CoderService {

    CoderResponse crear(CoderRequest req);
    CoderResponse obtenerPorId(Long id);
    List<CoderResponse> listar();

}
