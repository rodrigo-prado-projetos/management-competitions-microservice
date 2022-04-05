package br.com.management.competitions.microservice.controller.dto;

public class MatchTeamTournamentDTO {
    private String teamName;
    private String tournamentName;
    private String matchLocation;
    private String matchDate;
    private String matchHour;


    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public String getMatchLocation() {
        return matchLocation;
    }

    public void setMatchLocation(String matchLocation) {
        this.matchLocation = matchLocation;
    }

    public String getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(String matchDate) {
        this.matchDate = matchDate;
    }

    public String getMatchHour() {
        return matchHour;
    }

    public void setMatchHour(String matchHour) {
        this.matchHour = matchHour;
    }
}
