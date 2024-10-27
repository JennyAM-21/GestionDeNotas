/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utpasdd.sistemanotas;

/**
 *
 * @author garci
 */
public class Alumno {
    private int id;
    private String nombre;
    private String apellido;
    private String dni;
    public Alumno(int id, String nombre, String apellido, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
    @Override
    public String toString() {
        return "Alumno{" + "ID=" + id + ", Nombre='" + nombre + '\'' +
               ", Apellido='" + apellido + '\'' + ", DNI='" + dni + '\'' + '}';
    }
}

