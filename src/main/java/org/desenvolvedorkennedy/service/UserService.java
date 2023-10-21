package org.desenvolvedorkennedy.service;

import org.desenvolvedorkennedy.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
    
}
