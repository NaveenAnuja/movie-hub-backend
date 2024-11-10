package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Admin;
import org.example.service.AdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/admin")
@RequiredArgsConstructor
public class Admin_Controller {

    private final AdminService service;

    @PostMapping("add-admin")
    public void addAdmin(@RequestBody Admin admin){
        service.addAdmin(admin);
    }

    @GetMapping("/view-admin")
    public List<Admin> getAdmin(){
        return service.getAdmin();
    }

    @PutMapping("/update-admin")
    public void updateAdmin(@RequestBody Admin admin){
        service.updateAdmin(admin);
    }

    @DeleteMapping("/delete-admin/{id}")
    public void deleteAdmin(@PathVariable Integer id){
        service.deleteAdmin(id);
    }

    @GetMapping("/search-admin/{id}")
    public Admin searchAdmin(@PathVariable Integer id){
        return service.searchAdmin(id);
    }
}
