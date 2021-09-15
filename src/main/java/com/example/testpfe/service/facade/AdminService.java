package com.example.testpfe.service.facade;


import com.example.testpfe.bean.Admin;

import java.util.Optional;

public interface AdminService {
	Optional<Admin> findByLogin (String login);

	Boolean existsByLogin(String login);

	Boolean existsByEmail(String email);

	public Admin save (Admin user);
}
