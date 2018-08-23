package herencia_practica;

public class Empleados {
    
    private String nombre;
    private int num_empleado;
    private int num_seguro;
    private int edad;
    private String antiguedad;
    
   
    public Empleados (String nombre, int num_empleado, int num_seguro, int edad,
            String antiguedad){
        this.nombre = nombre;
        this.num_empleado = num_empleado;
        this.num_seguro = num_seguro;
        this.edad = edad;
        this.antiguedad = antiguedad;
        
    }
    


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }

    public int getNum_seguro() {
        return num_seguro;
    }

    public void setNum_seguro(int num_seguro) {
        this.num_seguro = num_seguro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }
  
    }
