package br.com.management.competitions.microservice.controller.vo;

public class TeamVO {
    private Integer id;
    private String name;
    private String locality;
    private Integer idPlayer;

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

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public Integer getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(Integer idPlayer) {
        this.idPlayer = idPlayer;
    }
}