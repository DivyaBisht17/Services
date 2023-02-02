package com.training.service1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int id;
    private  String FirstName;
    private  String LastName;
    private  String Email;
    private  long MobileNo;

}
