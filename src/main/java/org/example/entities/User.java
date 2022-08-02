package org.example.entities;

import java.util.Objects;

public class User {
    private int id;
    private String name;
    private int max_total_points;
    private int points;

    public User() {
    }

    public User(int id, String name, int max_total_points, int points) {
        this.id = id;
        this.name = name;
        this.max_total_points = max_total_points;
        this.points = points;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMax_total_points() {
        return max_total_points;
    }

    public void setMax_total_points(int max_total_points) {
        this.max_total_points = max_total_points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && max_total_points == user.max_total_points && points == user.points && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, max_total_points, points);
    }
}
