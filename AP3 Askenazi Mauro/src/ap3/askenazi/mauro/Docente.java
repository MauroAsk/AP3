
package ap3.askenazi.mauro;

class Docente extends Persona {
    private String cargo;
    private int legajo;

    public Docente(int dni, String nombre, String apellido, String direccion, int telefono, String email, String cargo, int legajo) {
        super(dni, nombre, apellido, direccion, telefono, email);
       setCargo(cargo);
       setLegajo(legajo);
    }

     public void setCargo(String cargo) {
        this.cargo = cargo;
    }
     
      public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    
    public String getCurso() {
        return cargo;
    }

    public int getMatricula() {
        return legajo;
    }
}