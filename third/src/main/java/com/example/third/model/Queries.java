package com.example.third.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "queries")

public class Queries {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name= "age")
    private Integer age;

    @Column(name = "active")
    private String active;

    @Column(name="phonenumber")
    private double phonenumber = Math.random()*Math.pow(10,10);

    @Column(name = "designation")
    private String designation;
    
    @Column(name= "salary")
    private double salary = Math.random()*1000000;

    public Queries() {
    }

    public Queries(Long id, String name, Integer age, String active, double phonenumber, String designation,
            double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.active = active;
        this.phonenumber = phonenumber;
        this.designation = designation;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public double getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(double phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Queries [id=" + id + ", name=" + name + ", age=" + age + ", active=" + active + ", phonenumber="
                + phonenumber + ", designation=" + designation + ", salary=" + salary + "]";
    }

    
}
