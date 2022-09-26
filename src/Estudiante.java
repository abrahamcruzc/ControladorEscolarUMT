/**
 * metodo que hace algo
 * @version 1.0
 * @author Abraham Cruz
 */

public class Estudiante {
    private Integer matricula;
    private String nombre;
    private Integer edad;
    private Integer semestre;
    private String facultad;
    private Double promedio;

    //constructor
    public Estudiante() {
        setMatricula(0);
        setNombre("N/A");
        setEdad(0);
        setSemestre(0);
        setFacultad("N/A");
        setPromedio(0.);
    }
    //constructor
    public Estudiante(Integer matricula, String nombre, Integer edad, Integer semestre, String facultad, Double promedio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
        this.semestre = semestre;
        this.facultad = facultad;
        this.promedio = promedio;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public String getFacultad() {
        return facultad;
    }

    public Double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "matricula=" + matricula +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", semestre=" + semestre +
                ", facultad='" + facultad + '\'' +
                ", promedio=" + promedio +
                '}';
    }
}
