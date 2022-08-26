/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class PGeneral extends Persona{
    
    private String Ocupacion;
    private String Horario;
    private int Semanas;
    private int Sueldo;

    public PGeneral() {
    }
    public PGeneral(String Ocupacion, String Horario, int Semanas, int Sueldo, String ID, String Nombre, int edad, String sexo, String Civil, int Altura, int Peso) {
        super(ID, Nombre, edad, sexo, Civil, Altura, Peso);
        this.Ocupacion = Ocupacion;
        this.Horario = Horario;
        this.Semanas = Semanas;
        this.Sueldo = Sueldo;
    }

    public String getOcupacion() {
        return Ocupacion;
    }
    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }
    
    public String getHorario() {
        return Horario;
    }
    public void setHorario(String Horario) {
        this.Horario = Horario;
    }
    
    public int getSemanas() {
        return Semanas;
    }
    public void setSemanas(int Semanas) {
        this.Semanas = Semanas;
    }

    public int getSueldo() {
        return Sueldo;
    }
    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    @Override
    public String toString() {
        return "PGeneral{" + "Ocupacion=" + Ocupacion + ", Horario=" + Horario + ", Semanas=" + Semanas + ", Sueldo=" + Sueldo + '}';
    }
    
}
