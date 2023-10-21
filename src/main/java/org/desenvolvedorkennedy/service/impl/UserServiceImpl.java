package org.desenvolvedorkennedy.service.impl;

import java.util.NoSuchElementException;

import org.desenvolvedorkennedy.domain.model.User;
import org.desenvolvedorkennedy.domain.repository.UserRepository;
import org.desenvolvedorkennedy.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        String accountNumber = userToCreate.getAccount().getNumber();
        if (userRepository.existsByAccountNumber(accountNumber)) {
            throw new IllegalArgumentException("This Account Number already exists.");
        }
        return userRepository.save(userToCreate);
    }
    
}
