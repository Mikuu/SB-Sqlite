package com.arxman.demo.sqlite.repository;

import com.arxman.demo.sqlite.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {}
