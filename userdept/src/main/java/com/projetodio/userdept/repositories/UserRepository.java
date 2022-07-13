package com.projetodio.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetodio.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
