package com.voting.model;

public class Candidate {
    private int id;
    private String name;
    private String party;
    private String symbol;
    private int votes;

    public Candidate() {}

    public Candidate(int id, String name, String party, String symbol, int votes) {
        this.id = id;
        this.name = name;
        this.party = party;
        this.symbol = symbol;
        this.votes = votes;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getParty() { return party; }
    public void setParty(String party) { this.party = party; }

    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }

    public int getVotes() { return votes; }
    public void setVotes(int votes) { this.votes = votes; }
}
