package com.ironpapalords.service;

import com.ironpapalords.model.Role;

public interface RoleService {
    Role findByNombre(String name);
}
