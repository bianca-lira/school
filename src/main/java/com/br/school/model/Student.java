package com.br.school.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;


@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Student extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -6598443222882103283L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    private String address;

    @NotNull
    private String responsiblePhone;

    @NotBlank
    private Long registration;

    @Email
    private String email;

    @NotBlank
    private LocalDate birthDate;
}
