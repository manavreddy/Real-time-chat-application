package com.humanrv.chat_app.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.humanrv.chat_app.dto.UserDto;
import com.humanrv.chat_app.userpackage.User;

public interface UserRepository extends JpaRepository<User, Long> {

 User findByUsername(String username);

 User save(UserDto userDto);
}