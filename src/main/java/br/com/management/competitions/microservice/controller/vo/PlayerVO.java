package br.com.management.competitions.microservice.controller.vo;

import br.com.management.competitions.microservice.enumeration.NationalityEnum;

public class PlayerVO {
    private Integer id;
    private String name;
    private String birthDate;
    private NationalityEnum nationality;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public NationalityEnum getNationality() {
        return nationality;
    }

    public void setNationality(NationalityEnum nationality) {
        this.nationality = nationality;
    }
}
