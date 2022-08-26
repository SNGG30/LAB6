
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
public class Zapatos extends Objetos{
    
    private int talla;
    private String DescripcionSuel;
    private int comodidad;

    public Zapatos() {
    }
    public Zapatos(int talla, String DescripcionSuel, int comodidad, Color color, String Descripcion, String Marca, int Tamaño, String Calidad, Persona Ingreso) {
        super(color, Descripcion, Marca, Tamaño, Calidad, Ingreso);
        this.talla = talla;
        this.DescripcionSuel = DescripcionSuel;
        this.comodidad = comodidad;
    }

    public int getTalla() {
        return talla;
    }
    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getDescripcionSuel() {
        return DescripcionSuel;
    }
    public void setDescripcionSuel(String DescripcionSuel) {
        this.DescripcionSuel = DescripcionSuel;
    }

    public int getComodidad() {
        return comodidad;
    }
    public void setComodidad(int comodidad) {
        this.comodidad = comodidad;
    }

    @Override
    public String toString() {
        return "Zapatos{" + "talla=" + talla + ", DescripcionSuel=" + DescripcionSuel + ", comodidad=" + comodidad + '}';
    }
    
    
}
