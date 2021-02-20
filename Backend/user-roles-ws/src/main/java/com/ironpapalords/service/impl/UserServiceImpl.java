package com.ironpapalords.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ironpapalords.model.Role;
import com.ironpapalords.model.User;
import com.ironpapalords.model.UserDTO;
import com.ironpapalords.repository.UserRepository;
import com.ironpapalords.service.RoleService;
import com.ironpapalords.service.UserService;

@Service(value = "userService")
public class UserServiceImpl {//implements UserDetailsService, UserService {

//    @Autowired
//    private RoleService roleService;
//
//    @Autowired
//    private UserRepository userRepo;
//
//    public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
//    	System.out.println(" correo "+correo);
//        Optional<User> userOpt = userRepo.findById(correo);
//        User user = userOpt.get();
//        if(user == null){
//            throw new UsernameNotFoundException("Invalid username or password.");
//        }
//        return new org.springframework.security.core.userdetails.User(user.getCorreo(), user.getClave(), getAuthority(user));
//    }
//
//    private Set<SimpleGrantedAuthority> getAuthority(User user) {
//        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
//        user.getRoles().forEach(role -> {
//            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getNombre()));
//        });
//        return authorities;
//    }
//
//    public List<User> findAll() {
//        List<User> list = new ArrayList<>();
//        userRepo.findAll().iterator().forEachRemaining(list::add);
//        return list;
//    }
//
//    @Override
//    public User findOne(String correo) {
//        return userRepo.findByCorreo(correo);
//    }
//
//    @Override
//    public User save(UserDTO user) {
//
//        User nUser = user.getUserFromDto();
//        nUser.setClave(user.getClave());
//
//        Role role = roleService.findByNombre("USER");
//        Set<Role> roleSet = new HashSet<>();
//        roleSet.add(role);
//
//        if(nUser.getCorreo().split("@")[1].equals("admin.edu")){
//            role = roleService.findByNombre("ADMIN");
//            roleSet.add(role);
//        }
//
//        nUser.setRoles(roleSet);
//        return userRepo.save(nUser);
//    }
}
