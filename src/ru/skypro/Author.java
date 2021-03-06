package ru.skypro;

import java.util.Objects;

public class Author {
    private String name;
    private final String secondName;


    public Author(String name,String secondName) {
        this.name = name;
        this.secondName = secondName;

    }

    public String getName() {
        return name;
    }
    public String getSecondName() {
        return secondName;
    }
    @Override
    public String toString() {
        return "?????: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && secondName.equals(author.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondName);
    }
}


