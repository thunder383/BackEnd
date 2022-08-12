package com.patel.autofind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service

public class UserServiceImplementation implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public List<Users> getAllUsers() {
        return userRepo.findAll();
    }
}
