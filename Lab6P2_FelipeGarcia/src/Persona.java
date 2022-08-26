/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Persona {
    
    private String ID;
    private String Nombre;
    private int edad;
    private String sexo;
    private String Civil;
    private int Altura;
    private int Peso;

    public Persona() {
    }
    public Persona(String ID, String Nombre, int edad, String sexo, String Civil, int Altura, int Peso) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.Civil = Civil;
        this.Altura = Altura;
        this.Peso = Peso;
    }

    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCivil() {
        return Civil;
    }
    public void setCivil(String Civil) {
        this.Civil = Civil;
    }

    public int getAltura() {
        return Altura;
    }
    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    public int getPeso() {
        return Peso;
    }
    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Persona{" + "ID=" + ID + ", Nombre=" + Nombre + ", edad=" + edad + ", sexo=" + sexo + ", Civil=" + Civil + ", Altura=" + Altura + ", Peso=" + Peso + '}';
    }
    
    
}
