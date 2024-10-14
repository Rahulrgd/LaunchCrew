package com.launchcrew.launchcrew_app.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    // private UUID id; //Not Needed
    private String fullName;
    private String email;
    private String role;
}
