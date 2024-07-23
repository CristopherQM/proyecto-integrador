package com.example.Proyecto.Integrador;

import com.example.Proyecto.Integrador.dto.Userdto;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private final Map<Long, Userdto> users = new HashMap<>();
    private Long nextId = 1L;

    @Override
    public List<Userdto> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    @Override
    public Userdto getUserById(Long id) {
        return users.get(id);
    }

    @Override
    public Userdto createUser(Userdto userDto) {
        userDto.setId(nextId++);
        users.put(userDto.getId(), userDto);
        return userDto;
    }

    @Override
    public Userdto updateUser(Long id, Userdto userDto) {
        if (users.containsKey(id)) {
            userDto.setId(id);
            users.put(id, userDto);
            return userDto;
        }
        return null;
    }

    @Override
    public void deleteUser(Long id) {
        users.remove(id);
    }
}
