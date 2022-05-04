package com.br.school.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;


@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Student extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -6598443222882103283L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
}
