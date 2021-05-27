package com.ironpapalords.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ironpapalords.model.Rol;
import com.ironpapalords.repository.RolRepository;
import com.ironpapalords.service.RolService;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    private RolRepository rolRepository;

    @Override
    public Rol findByNombre(String nombre) {
        Rol rol = rolRepository.findRoleByNombre(nombre);
        return rol;
    }
}
