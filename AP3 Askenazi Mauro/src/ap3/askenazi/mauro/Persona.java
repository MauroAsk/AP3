
package ap3.askenazi.mauro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private String email;

    public Persona(int dni, String nombre, String apellido, String direccion, int telefono, String email) {
        setDni(dni);
        setNombre(nombre);
        setApellido(apellido);
        setDireccion(direccion);
        setTelefono(telefono);
        setEmail(email);
    }

     public void setDni(int dni) {
        if (dni < 1 || dni > 99999999) {
            throw new IllegalArgumentException("El DNI debe ser un valor entre 1 y 99999999.");
        }
        this.dni = dni;
    }
     
    public void setNombre(String nombre) {
        if (nombre.length() > 32) {
            throw new IllegalArgumentException("El nombre no debe superar los 32 caracteres.");
        }
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        if (apellido.length() > 32) {
            throw new IllegalArgumentException("El apellido no debe superar los 32 caracteres.");
        }
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        if (direccion.length() > 48) {
            throw new IllegalArgumentException("La dirección no debe tener más de 48 caracteres.");
        }
        this.direccion = direccion;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public int getDni() {
        return dni;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }


}

