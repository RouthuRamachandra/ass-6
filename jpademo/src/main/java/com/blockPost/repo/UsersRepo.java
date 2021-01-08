package com.blockPost.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blockPost.entities.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users, Integer> {

}
