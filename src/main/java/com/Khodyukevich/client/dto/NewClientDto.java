package com.Khodyukevich.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
public class NewClientDto {
    @NotBlank
    @Size(min = 6, max = 60)
    private String fullName;
    @NotBlank
    private String phoneNumber;
    @Email
    @NotBlank
    @Size(min = 6, max = 60)
    private String email;
    @NotNull
    private Long passport;
}
