package com.br.school.model;

import com.br.school.model.enums.Discipline;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Teacher extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -1475309083372097884L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Discipline discipline;

    private String phone;

    @Email
    private String email;
}
