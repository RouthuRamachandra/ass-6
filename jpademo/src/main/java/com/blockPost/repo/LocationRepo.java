package com.blockPost.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blockPost.entities.Location;

@Repository
public interface LocationRepo extends JpaRepository<Location, Integer> {

}
