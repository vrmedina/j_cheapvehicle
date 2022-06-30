/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculobarato;

import java.util.Scanner;

/**
 *
 * @author Victor Medina
 */
public class Main {
    
    public static int indexVehBarato(VehiculoBarato coches[]) {
        float precio;
        int indice = 0;
        
        precio = coches[0].getPrecio();
        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String marca, nombre;
        int modelo, nVeh, indexBarato;
        float precio;
        System.out.println("*** Programa que calcula el carro que tiene menor precio ***");
        System.out.print("Digite la cantidad de vehiculos: ");
        nVeh = in.nextInt();
        
        VehiculoBarato coches[] = new VehiculoBarato[nVeh];
        
        for (int i = 0; i < coches.length; i++) {
            in.nextLine();
            System.out.println("Digite las caracteristicas del coche "+(i+1)+":");
            System.out.print("Marca: ");
            marca = in.nextLine();
            System.out.print("Nombre: ");
            nombre = in.nextLine();
            System.out.print("Modelo: ");
            modelo = in.nextInt();
            System.out.print("Precio: ");
            precio = in.nextFloat();
            
            coches[i] = new VehiculoBarato(marca, nombre, modelo, precio);
            System.out.println("---------------------------------------------------");
        }
        
        indexBarato = indexVehBarato(coches);
        System.out.println("El coche mas barato es: ");
        System.out.println(coches[indexBarato].mostrarDatos());
    }
}
