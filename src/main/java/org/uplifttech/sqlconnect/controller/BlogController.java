package org.uplifttech.sqlconnect.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uplifttech.sqlconnect.records.BlogCreationRequest;
import org.uplifttech.sqlconnect.service.BlogService;

@RestController
@RequestMapping(value = "/v1/blogs")
@RequiredArgsConstructor
@Slf4j
public class BlogController {

    private final BlogService blogService;

    @PostMapping
    public void createBlog(@RequestBody BlogCreationRequest blogCreationRequest) {
    log.info("Blog creation request : {}",blogCreationRequest);
    blogService.createBlog(blogCreationRequest);
    }
}
