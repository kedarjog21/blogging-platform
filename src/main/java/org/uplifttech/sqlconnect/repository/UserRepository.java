package org.uplifttech.sqlconnect.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.uplifttech.sqlconnect.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
}
