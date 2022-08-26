/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author felip
 */
public class Gerente extends Persona{
    
    String Usuario;
    String Contraseña;
    String Cargo;

    public Gerente() {
    }
    public Gerente(String Usuario, String Contraseña, String Cargo, String ID, String Nombre, int edad, String sexo, String Civil, int Altura, int Peso) {
        super(ID, Nombre, edad, sexo, Civil, Altura, Peso);
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Cargo = Cargo;
    }

    public String getUsuario() {
        return Usuario;
    }
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getCargo() {
        return Cargo;
    }
    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    @Override
    public String toString() {
        return "Gerente{" + "Usuario=" + Usuario + ", Contrase\u00f1a=" + Contraseña + ", Cargo=" + Cargo + '}';
    }
    
    
}
