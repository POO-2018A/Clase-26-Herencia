/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author chalosalvador
 */
public class Profesor extends Empleado {
    
    private int aniosExperiencia;
    private String profesion;
    
    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
        this.nombre = "Ing. " + this.nombre;
    }
    
    public Profesor(String nombre, String apellido, int aniosExperiencia) {
        super(nombre, apellido);
        this.aniosExperiencia = aniosExperiencia;
    }
    
    @Override
    public String getNombre(){
        return "El profesor se llama: " + nombre;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    
    
}
