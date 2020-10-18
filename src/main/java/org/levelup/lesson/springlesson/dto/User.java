package org.levelup.lesson.springlesson.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


@Data
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@JsonAutoDetect
@Validated
public class User {
    private String name;

    @Min(18)
    @Max(70)
    private Integer age;

    @NotNull
    private String bornCity;
    //@Email
    private String employerName;
}
