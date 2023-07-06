package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * Student
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-07-06T10:57:05.256333736Z[GMT]")

public class Student {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("grade")
  private Integer grade = null;

  public Student id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Student's ID
   * 
   * @return id
   **/
  @Schema(example = "1001", description = "Student's ID")

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Student name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Student's name
   * 
   * @return name
   **/
  @Schema(example = "Jane Doe", description = "Student's name")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Student grade(Integer grade) {
    this.grade = grade;
    return this;
  }

  /**
   * Student's final grade out of 100.
   * 
   * @return grade
   **/
  @Schema(example = "95", description = "Student's final grade out of 100.")

  public Integer getGrade() {
    return grade;
  }

  public void setGrade(Integer grade) {
    this.grade = grade;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(this.id, student.id) &&
        Objects.equals(this.name, student.name) &&
        Objects.equals(this.grade, student.grade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, grade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Student {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
