package com.example.rngesus.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class PlayerCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "id", updatable = false, nullable = false)
    private int id;

    @NotNull
    @Size(min=2, max=50)
    private String name;

    @ManyToOne
    private Race race;

    @ManyToMany
    private List<CharacterClass> classes = new ArrayList<CharacterClass>();

    @ManyToMany
    private List<AbilityScore> abilityScores = new ArrayList<AbilityScore>();

    public PlayerCharacter(String name) {
        this.name = name;
    }

    public PlayerCharacter() { }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public List<CharacterClass> getClasses() {
        return classes;
    }

    public void addClass(CharacterClass aClass) {
        this.classes.add(aClass);
    }

    public void addClass(CharacterClass aClass) {
        this.classes.add(aClass);
    }

}
