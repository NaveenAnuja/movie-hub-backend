package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Admin;
import org.example.entity.AdminEntity;
import org.example.repository.AdminRepository;
import org.example.service.AdminService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class AdminServiceImpl implements AdminService {

    private final AdminRepository repository;
    private final ModelMapper mapper;
    @Override
    public void addAdmin(Admin admin) {
        repository.save(mapper.map(admin, AdminEntity.class));
    }

    @Override
    public List<Admin> getAdmin() {
        List<Admin> adminList = new ArrayList<>();
        repository.findAll().forEach(adminEntity -> {
            adminList.add(mapper.map(adminEntity,Admin.class));
        });
        return adminList;
    }
    @Override
    public void updateAdmin(Admin admin) {
        repository.save(mapper.map(admin, AdminEntity.class));
    }

    @Override
    public void deleteAdmin(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Admin searchAdmin(Integer id) {
        return mapper.map(repository.findById(id),Admin.class);
    }

}
