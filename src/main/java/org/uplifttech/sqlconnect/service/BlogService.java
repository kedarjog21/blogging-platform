package org.uplifttech.sqlconnect.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.uplifttech.sqlconnect.entity.Blog;
import org.uplifttech.sqlconnect.records.BlogCreationRequest;
import org.uplifttech.sqlconnect.repository.BlogRepository;

@Service
@RequiredArgsConstructor
@Slf4j
public class BlogService {

   private final BlogRepository blogRepository;

    public void createBlog(BlogCreationRequest blogCreationRequest) {
        log.info("Calling service" + blogCreationRequest);
        Blog blog= new Blog();
        blog.setContent(blogCreationRequest.content());
        blog.setTitle(blogCreationRequest.title());

        blogRepository.save(blog);
    }
}
