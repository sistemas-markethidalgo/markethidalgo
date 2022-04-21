package com.markethidalgo.markethidalgo.model;
import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;
  String Nombre;
  String Apellido;
  Long Edad;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public Long getEdad() {
        return Edad;
    }

    public void setEdad(Long edad) {
        Edad = edad;
    }

    public Persona(Long id, String nombre, String apellido, Long edad) {
        this.id = id;
        Nombre = nombre;
        Apellido = apellido;
        Edad = edad;
    }

    public Persona() {
    }
}
