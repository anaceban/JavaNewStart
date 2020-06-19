package com.project.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String pass;
    private String email;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(int id, String name, String pass, String email) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.email = email;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", pass='").append(pass).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPass(), getEmail());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId() == user.getId() &&
                Objects.equals(getName(), user.getName()) &&
                Objects.equals(getPass(), user.getPass()) &&
                Objects.equals(getEmail(), user.getEmail());
    }
    //    @Override
//    public boolean equals(Object o) {
//        boolean isEqual = false;
//        if (this.getName() == o.getClass().getName() && this.getPass() == o.getClass().getName()) {
//            isEqual = true;
//        }
//        return isEqual;
//    }
}
