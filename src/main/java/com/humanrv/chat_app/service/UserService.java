package com.humanrv.chat_app.service;

import com.humanrv.chat_app.dto.UserDto;
import com.humanrv.chat_app.userpackage.User;

public interface UserService {
    User findByUsername(String username);
   
    User save(UserDto userDto);
   
   }
