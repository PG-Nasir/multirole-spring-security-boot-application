package com.example.registrationlogindemo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.registrationlogindemo.entity.Role;
import com.example.registrationlogindemo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("roleService")
public class RoleService {

	
	@Autowired
    private RoleRepository roleRepository;
	
	
	public RoleService(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}
	
	public List<Role> findAll(){
		List<Role> roles = new ArrayList<>();
		roles = roleRepository.findAll();
		return roles;
	}

	public void save(Role role){
		roleRepository.save(role);
	}
	
	public void delete(int id){
		roleRepository.deleteById(id);

	}

	public Role findRole(String role) {
		// TODO Auto-generated method stub
		return roleRepository.findByRole(role);
	}

	public List<Role> findByIdIn(List<Long> roleIds) {
		return roleRepository.findByIdIn(roleIds);
	}
}
