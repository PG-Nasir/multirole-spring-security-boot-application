package com.example.registrationlogindemo.repository;

import com.example.registrationlogindemo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
    @Query("SELECT r FROM Role r WHERE r.name = ?1")
    Role findByRole(String role);

    void deleteById(int id);

    List<Role> findByIdIn(List<Long> roleIds);

}
