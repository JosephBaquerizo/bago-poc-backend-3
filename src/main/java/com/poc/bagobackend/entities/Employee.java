package com.poc.bagobackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private int id;
    private String name;
    private Country country;
    private String company;
    private Date date;
    private String status;
    private boolean verified;
    private int activity;
    private Representative representative;
    private double balance;

}

