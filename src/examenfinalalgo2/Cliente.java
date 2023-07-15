/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinalalgo2;

/**
 *
 * @author Esteban QR
 */
public class Cliente {
    
    private int celular;
    private float dinero;

    public Cliente(int celular, float dinero) {
        this.celular = celular;
        this.dinero = dinero;
    }

    public Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }
    
    

    public boolean pagar() {
        
        return false;
    }

    public boolean recargarDinero() {
        
        return false;
    }

    public boolean getNombreCompleto() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
