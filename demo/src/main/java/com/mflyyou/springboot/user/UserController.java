package com.mflyyou.springboot.user;

import com.mflyyou.springboot.user.api.UserApi;
import com.mflyyou.springboot.user.api.request.CreateUserRequest;
import com.mflyyou.springboot.user.api.response.CreateUserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController implements UserApi {

    @Override
    @PostMapping("")
    public CreateUserResponse create(@RequestBody CreateUserRequest request) {
        log.info("Create user request: {}", request);
        return CreateUserResponse.builder()
                .id(10086L)
                .build();
    }
}
