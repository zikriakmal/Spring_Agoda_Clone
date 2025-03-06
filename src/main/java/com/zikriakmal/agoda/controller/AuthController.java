package com.zikriakmal.agoda.controller;

import com.zikriakmal.agoda.dto.LoginRequest;
import com.zikriakmal.agoda.dto.LoginResponse;
import com.zikriakmal.agoda.dto.WebResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class AuthController {

    @PostMapping(
            path="/api/v1/auth/login",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<LoginResponse> login(@RequestBody LoginRequest request){
        return WebResponse.<LoginResponse>builder().data(LoginResponse.builder().accessToken("").expiredAt(1231L).build()).build();
    }

}
