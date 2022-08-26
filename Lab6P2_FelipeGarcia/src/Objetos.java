
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Objetos {
    
    private Color color;
    private String Descripcion;
    private String Marca;
    private int Tamaño;
    private String Calidad;
    private Persona Ingreso;

    public Objetos() {
    }
    public Objetos(Color color, String Descripcion, String Marca, int Tamaño, String Calidad, Persona Ingreso) {
        this.color = color;
        this.Descripcion = Descripcion;
        this.Marca = Marca;
        this.Tamaño = Tamaño;
        this.Calidad = Calidad;
        this.Ingreso = Ingreso;
    }

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getMarca() {
        return Marca;
    }
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getTamaño() {
        return Tamaño;
    }
    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
    }

    public String getCalidad() {
        return Calidad;
    }
    public void setCalidad(String Calidad) {
        this.Calidad = Calidad;
    }

    public Persona getIngreso() {
        return Ingreso;
    }
    public void setIngreso(Persona Ingreso) {
        this.Ingreso = Ingreso;
    }

    @Override
    public String toString() {
        return "Objetos{" + "color=" + color + ", Descripcion=" + Descripcion + ", Marca=" + Marca + ", Tama\u00f1o=" + Tamaño + ", Calidad=" + Calidad + ", Ingreso=" + Ingreso + '}';
    }
    
}
