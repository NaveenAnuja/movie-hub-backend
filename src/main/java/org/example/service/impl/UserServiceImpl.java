package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.User;
import org.example.entity.UserEntity;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final ModelMapper mapper;
    @Override
    public void addUser(User user) {
        repository.save(mapper.map(user, UserEntity.class));
    }

    @Override
    public List<User> getUsers() {
        List<User> userList = new ArrayList<>();
        repository.findAll().forEach(userEntity -> {
            userList.add(mapper.map(userEntity,User.class));
        });
        return userList;
    }

    @Override
    public void updateUser(User user) {
        repository.save(mapper.map(user,UserEntity.class));
    }

    @Override
    public void deleteUserById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public User searchUserById(Integer id) {
        return mapper.map(repository.findById(id),User.class);
    }

    @Override
    public User searchUserByMail(String email) {
        return mapper.map(repository.findByEmail(email),User.class);
    }
}
