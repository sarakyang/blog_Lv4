package com.sparta.blog.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequestDto {
    @NotBlank
    @Pattern(message = "잘못된 username 입니다. ",regexp = "^[a-z0-9]{4,10}$")
    private String username;
    @NotBlank
    @Pattern(message = "잘못된 password 입니다. ",regexp = "^[a-z0-9A-Z!@#$%^&*(){}*/]{8,15}$")
    private String password;
    private boolean admin = false;
    private String adminToken ="";
}
