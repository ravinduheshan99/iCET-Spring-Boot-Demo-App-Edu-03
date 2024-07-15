package edu.icet.demo.model;

import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer studentId;
    private String firstName;
    private String lastName;
    private String province;
}
