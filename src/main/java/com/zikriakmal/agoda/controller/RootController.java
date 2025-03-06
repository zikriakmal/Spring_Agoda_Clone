package com.zikriakmal.agoda.controller;

import com.zikriakmal.agoda.dto.WebResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class RootController {
    @GetMapping(
            path = "/",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<String> getRoot(){
        return WebResponse.<String>builder().data("This is Agoda clone REST API").build();
    }
}
