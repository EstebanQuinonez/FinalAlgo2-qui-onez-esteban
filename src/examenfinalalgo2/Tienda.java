/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinalalgo2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Esteban QR
 */
public class Tienda {
    private String nombre;
    private String ruc;
    private String direccion;
    public List<Cliente> listaClientes;
    
    public Tienda() {
        listaClientes = new ArrayList<>();
    }

     public void agregarCliente(Cliente c) {

        if (!listaClientes.contains(c)) {
            listaClientes.add(c);
            System.out.println("Cliente agregado correctamente.");
        } else {
            System.out.println("El cliente ya existe en la lista.");
        }
    }

    public void agregarCategoria(Categoria cat) {
    }

    public void agregarProducto(Producto p) {
    }

    public Producto[] buscarProductoPorCategoria(Categoria cat) {
        return null;
    }

    public Producto[] buscarProductoPorNombre(String nombre) {
        return null;
    }

    public Persona autenticar(String email, String password) {
        return null;
    } 
}
