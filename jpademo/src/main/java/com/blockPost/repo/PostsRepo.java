package com.blockPost.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blockPost.entities.Posts;

@Repository
public interface PostsRepo extends JpaRepository<Posts, Integer> {

}
