package com.poc.bagobackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeBirthday {

    private String name;
    private String birthday;
    private String email;
    private String phone;
    private String position;

}
