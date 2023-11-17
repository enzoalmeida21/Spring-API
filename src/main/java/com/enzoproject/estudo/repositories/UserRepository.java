package com.enzoproject.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enzoproject.estudo.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
