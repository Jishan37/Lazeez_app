package com.hridoykrisna.Lazeez.service.impl;

import com.hridoykrisna.Lazeez.Utils.CommonUtils;
import com.hridoykrisna.Lazeez.model.User;
import com.hridoykrisna.Lazeez.repository.UserRepo;
import com.hridoykrisna.Lazeez.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceIMPL implements UserService {
    private final UserRepo userRepo;

    @Override
    public void saveUser(User user) {
        System.out.println(user);
        userRepo.save(user);
    }

    @Override
    public int makeLogin(User user) {
        Optional<User> data = userRepo.findByEmailAndPassword(user.getEmail(), user.getPassword());
        if (data.isPresent()) {
            CommonUtils.isUserAuthenticate = true;
            CommonUtils.user = data.get();
            return 1;
        } else {
            return 0;
        }
    }
}
