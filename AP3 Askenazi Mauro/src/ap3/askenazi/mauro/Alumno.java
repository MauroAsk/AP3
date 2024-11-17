
package ap3.askenazi.mauro;

class Alumno extends Persona {
    private String curso;
    private int matricula;

    public Alumno(int dni, String nombre, String apellido, String direccion, int telefono, String email, String curso, int matricula) {
        super(dni, nombre, apellido, direccion, telefono, email);
        setCurso(curso);
        setMatricula(matricula);
    }

     public void setCurso(String curso) {
        this.curso = curso;
    }
     
      public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String getCurso() {
        return curso;
    }

    public int getMatricula() {
        return matricula;
    }
}