package com.url.shortner.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/user/")
public class UserController {

    @GetMapping("/info")
    public Map<String, Object> info(@AuthenticationPrincipal OAuth2User principal) {
        return principal.getAttributes();
    }
}
