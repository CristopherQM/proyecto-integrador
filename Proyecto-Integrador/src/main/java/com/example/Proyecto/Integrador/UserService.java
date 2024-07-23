package com.example.Proyecto.Integrador;

import com.example.Proyecto.Integrador.dto.Userdto;

import java.util.List;

public interface UserService {
    List<Userdto> getAllUsers();
    Userdto getUserById(Long id);
    Userdto createUser(Userdto userDto);
    Userdto updateUser(Long id, Userdto userDto);
    void deleteUser(Long id);
}