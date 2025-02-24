package edu.icet.student_management.entity;

import edu.icet.student_management.util.GenderType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "student")
public class StudentEntity {
    private Integer id;
    private String name;
    private String address;
    private Integer age;
    private GenderType gender;
}
