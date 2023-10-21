package org.desenvolvedorkennedy.domain.repository;

import org.desenvolvedorkennedy.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
    boolean existsByAccountNumber(String accountNumber);
}
