package org.uplifttech.sqlconnect.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.uplifttech.sqlconnect.entity.Blog;

import java.util.Optional;

@Repository
public interface BlogRepository extends CrudRepository<Blog, Integer> {
}
