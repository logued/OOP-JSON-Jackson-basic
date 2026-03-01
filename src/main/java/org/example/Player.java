package org.example;

public class Player {
    // === Fields ===
    private int _id;    // underscore indicates a field variable
    private String _name;
    private double _rating;

    // === Constructors ===
    // Creates: required no-arg constructor for Jackson deserialisation
    public Player() {
        _id = 0;
        _name = "";
        _rating = 0.0;
    }

    // Creates: convenience constructor for application code
    public Player(int id, String name, double rating) {
        _id = id;
        _name = name;
        _rating = rating;
    }

    // === Public API ===
    // Gets: the player id
    public int getId() {
        return _id;
    }

    // Sets: the player id
    public void setId(int id) {
        _id = id;
    }

    // Gets: the player name
    public String getName() {
        return _name;
    }

    // Sets: the player name
    public void setName(String name) {
        _name = name;
    }

    // Gets: the player rating
    public double getRating() {
        return _rating;
    }

    // Sets: the player rating
    public void setRating(double rating) {
        _rating = rating;
    }

    // === Overrides ===
    @Override
    public int hashCode() {
        return Integer.hashCode(_id);
    }

    @Override
    public String toString() {
        return "Player{id=" + _id + ", name='" + _name + "', rating=" + _rating + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player other = (Player) o;
        return _id == other._id
                && Double.compare(_rating, other._rating) == 0
                && java.util.Objects.equals(_name, other._name);
    }
}

