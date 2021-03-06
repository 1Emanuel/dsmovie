package com.nztech.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nztech.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail (String email);
		
}
