package com.br.school.model.enums;

public enum Discipline {

    ART("Arte"),
    CHEMISTRY("Química"),
    GEOGRAPHY("Geografia"),
    HISTORY("História"),
    MUSIC("Música"),
    SCIENCE("Ciência"),
    ENGLISH("Inglês"),
    TECHNOLOGIES("Tecnologias"),
    LANGUAGES("Linguagens"),
    MATH("Matemática"),
    PHYSICAL_EDUCATION("Educação física"),
    RELIGIOUS_EDUCATION("Ensino religioso"),
    BIOLOGY("Biologia"),
    PHYSICS("Física");

    private final String value;
    Discipline(String value) {
        this.value = value;
    }

}
