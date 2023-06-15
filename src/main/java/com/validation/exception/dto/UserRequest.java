package com.validation.exception.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@ToString
public class UserRequest {
    private String name;
    private String email;
    private String mobile;
    private String gender;
    private int age;
    private String nationality;

}
