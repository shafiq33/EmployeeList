package com.employee.entity;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Employee {
  @Id
  @GeneratedValue(stragey=GenerationType.AUTO)
  private Long id;
  private String name;
  private String email;
  private Integer salary;
  
}
