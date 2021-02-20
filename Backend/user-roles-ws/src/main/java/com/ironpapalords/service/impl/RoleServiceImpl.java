package com.ironpapalords.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ironpapalords.model.Role;
import com.ironpapalords.repository.RoleRepository;
import com.ironpapalords.service.RoleService;

@Service(value = "roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepo;

    @Override
    public Role findByNombre(String nombre) {
        Role role = roleRepo.findRoleByNombre(nombre);
        return role;
    }
}
