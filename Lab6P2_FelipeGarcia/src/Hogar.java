
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
public class Hogar extends Objetos{
    
    private String LugarC;
    private String Inst;
    private int Garantia;

    public Hogar() {
    }
    public Hogar(String LugarC, String Inst, int Garantia, Color color, String Descripcion, String Marca, int Tamaño, String Calidad, Persona Ingreso) {
        super(color, Descripcion, Marca, Tamaño, Calidad, Ingreso);
        this.LugarC = LugarC;
        this.Inst = Inst;
        this.Garantia = Garantia;
    }

    public String getLugarC() {
        return LugarC;
    }
    public void setLugarC(String LugarC) {
        this.LugarC = LugarC;
    }

    public String getInst() {
        return Inst;
    }
    public void setInst(String Inst) {
        this.Inst = Inst;
    }

    public int getGarantia() {
        return Garantia;
    }
    public void setGarantia(int Garantia) {
        this.Garantia = Garantia;
    }

    @Override
    public String toString() {
        return "Hogar{" + "LugarC=" + LugarC + ", Inst=" + Inst + ", Garantia=" + Garantia + '}';
    }
    
    
}
