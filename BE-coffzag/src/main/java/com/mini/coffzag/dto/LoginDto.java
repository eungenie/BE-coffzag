package com.mini.coffzag.dto;

import com.sun.istack.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {

    @NotNull
    private String username;

    @NotNull
    private String password;
}
