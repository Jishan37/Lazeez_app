package com.hridoykrisna.Lazeez.service;

import com.hridoykrisna.Lazeez.model.User;

public interface UserService {
    void saveUser(User user);

    int makeLogin(User user);
}
