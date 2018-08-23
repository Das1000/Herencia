package herencia_practica;


public class Sistemas extends Empleados{
    private int id;
    private int num_terminal;
    private int num_operador;
    private int bono;

    public Sistemas(String nombre, int num_empleado, int num_seguro, int edad,
            String antiguedad,int id, int num_terminal, int num_operador, int bono) {
        
        super(nombre,num_empleado,num_seguro,edad,antiguedad);
        
        this.id = id;
        this.num_terminal = num_terminal;
        this.num_operador = num_operador;
        this.bono = bono;
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum_terminal() {
        return num_terminal;
    }

    public void setNum_terminal(int num_terminal) {
        this.num_terminal = num_terminal;
    }

    public int getNum_operador() {
        return num_operador;
    }

    public void setNum_operador(int num_operador) {
        this.num_operador = num_operador;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }
    
    
}