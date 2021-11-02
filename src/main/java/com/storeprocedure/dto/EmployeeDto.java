package com.storeprocedure.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class EmployeeDto implements Serializable {

    private String name;

    private String email;

    private String phone;
}
