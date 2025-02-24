package edu.icet.student_management.dto;

import edu.icet.student_management.util.GenderType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    private Integer id;
    private String name;
    private String address;
    private Integer age;
    private GenderType gender;
}
