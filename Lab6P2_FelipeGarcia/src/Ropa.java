
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
public class Ropa extends Objetos{
    
    private int talla;
    private String tela;
    private String pais;

    public Ropa() {
    }
    public Ropa(int talla, String tela, String pais, Color color, String Descripcion, String Marca, int Tamaño, String Calidad, Persona Ingreso) {
        super(color, Descripcion, Marca, Tamaño, Calidad, Ingreso);
        this.talla = talla;
        this.tela = tela;
        this.pais = pais;
    }

    public int getTalla() {
        return talla;
    }
    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getTela() {
        return tela;
    }
    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", tela=" + tela + ", pais=" + pais + '}';
    }
    
}
