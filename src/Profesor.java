public class Profesor {

    private String nombre;
    private String materia;
    private Integer edad;
    private String facultad;
    private Integer clave;

    public Profesor(){
        setNombre("N/A");
        setMateria("N/A");
        setEdad(0);
        setFacultad("N/A");
        setClave(0);
    }

    public Profesor(String nombre, String materia, Integer edad, String facultad, Integer clave){
        this.nombre = nombre;
        this.materia = materia;
        this.edad = edad;
        this.facultad = facultad;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public Integer getClave() {
        return clave;
    }

    public void setClave(Integer clave) {
        this.clave = clave;
    }

    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", materia='" + materia + '\'' +
                ", edad=" + edad +
                ", facultad='" + facultad + '\'' +
                ", clave='" + clave + '\'' +
                '}';
    }
}
