package com.restApi.RestAPI.jpa;

import com.restApi.RestAPI.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Integer> {
}
