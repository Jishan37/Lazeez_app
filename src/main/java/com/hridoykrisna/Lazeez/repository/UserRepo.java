package com.hridoykrisna.Lazeez.repository;

import com.hridoykrisna.Lazeez.model.Employee;
import com.hridoykrisna.Lazeez.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    @Query(value = "from User where email=?1 And password=?2")
    Optional<User> findByEmailAndPassword(String email, String password);
}
