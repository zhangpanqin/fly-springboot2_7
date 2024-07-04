package com.mflyyou.springboot.user.api;

import com.mflyyou.springboot.user.api.request.CreateUserRequest;
import com.mflyyou.springboot.user.api.response.CreateUserResponse;

/**
 * @author zhangpanqin
 */
public interface UserApi {
    CreateUserResponse create(CreateUserRequest request);
}
