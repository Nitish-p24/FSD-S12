package com.example.model;
import org.springframework.stereotype.Component;
@Component
public class Certification {
private int id = 642;
private String name = " Full Stack";
private String dateOfStart = "15-12-2025";
public int getId() { return id; }
public String getName() { return name; }
public String getDateOfStart() { return dateOfStart; }
@Override
public String toString() {
return "Certification [id=" + id +
", name=" + name +
", dateOfStart=" + dateOfStart + "]";
}
}