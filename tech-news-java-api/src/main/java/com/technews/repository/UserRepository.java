package com.technews.repository;

import com.technews.model.User;
// for inheriting the methods used to access the database for standard CRUD operations.
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//class-level annotation
@Repository

public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByEmail(String email) throws Exception;
}
