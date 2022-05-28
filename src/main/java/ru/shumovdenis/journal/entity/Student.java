package ru.shumovdenis.journal.entity;

import java.util.Date;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String middlename;
    private Date bDay;
    private String group;

    public Student(int id, String name, String surname, String middlename, Date bDay, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.bDay = bDay;
        this.group = group;
    }

    public Student(String name, String surname, String middlename, Date bDay, String group) {
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.bDay = bDay;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public Date getbDay() {
        return bDay;
    }

    public void setbDay(Date bDay) {
        this.bDay = bDay;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
