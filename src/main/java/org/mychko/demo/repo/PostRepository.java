package org.mychko.demo.repo;

import org.mychko.demo.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}