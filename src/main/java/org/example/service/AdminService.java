package org.example.service;

import org.example.dto.Admin;

import java.util.List;

public interface AdminService {
    void addAdmin(Admin admin);

    List<Admin> getAdmin();

    void updateAdmin(Admin admin);

    void deleteAdmin(Integer id);

    Admin searchAdmin(Integer id);
}
