package com.voting.model;

public class User {
    private int id;
    private String name;
    private String email;
    private String voterId;
    private String password;
    private boolean hasVoted;

    public User() {}

    public User(int id, String name, String email, String voterId, String password, boolean hasVoted) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.voterId = voterId;
        this.password = password;
        this.hasVoted = hasVoted;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getVoterId() { return voterId; }
    public void setVoterId(String voterId) { this.voterId = voterId; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public boolean isHasVoted() { return hasVoted; }
    public void setHasVoted(boolean hasVoted) { this.hasVoted = hasVoted; }
}
