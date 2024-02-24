package com.restApi.RestAPI.jpa;

import com.restApi.RestAPI.User.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository  extends JpaRepository<Post,Integer> {
}
