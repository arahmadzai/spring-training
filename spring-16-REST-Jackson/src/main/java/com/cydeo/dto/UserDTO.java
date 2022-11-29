package com.cydeo.dto;

import com.cydeo.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private String email;
    private String password;
    private String username;
    private UserRole role;

    @JsonManagedReference // This field is going to be serialized (will allow accountDTO to convert to jason obj inside userDTO)
    private AccountDTO account;

}
