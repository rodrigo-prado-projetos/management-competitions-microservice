package br.com.management.competitions.microservice.controller.dto;

import br.com.management.competitions.microservice.enumeration.NationalityEnum;

public class PlayerDTO {
    private String name;
    private String birthDate;
    private NationalityEnum nationality;
    private TeamDTO team;
}