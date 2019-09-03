/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figurasgeometricas;

/**
 *
 * @author duvan, andres bernal
 */
/**
 * clase cuadrado que hereda de la clase padre Figuras2D 
 */
public class Cuadrado extends Figuras2D{
    //variable que representa uno de los lados del cuadrado
    private int lado;
    //variable que representa uno de los lados del cuadrado
    private int lado1;
    //variable que representa el perimetro total del cuadrado
    private double perimetro;

    /**
     * Contructor principal de la clase
     * @param lado
     * @param lado1 
     */
    public Cuadrado(int lado, int lado1) {
        this.lado = lado;
        this.lado1 = lado1;
    }
    /**
     * metodo hallarPerimetro que es heredado de la interfaz de Figuras
     */
    @Override
    public void hallarPerimetro() {
        perimetro = lado * lado1;
    }
    /**
     * metodo imprimir que es heredado de la interfaz de Figura
     */
    @Override
    public void imprimir()
    {
        if(lado == lado1){
            System.out.println("\nCuadrado..");
            System.out.println("El Perimetro del cuadrado es: " + perimetro);
        }
        else
        {
            System.out.println("\nRectangulo..");
            System.out.println("El Perimetro del rectangulo es: " + perimetro);
        }
    }

    /**
     * @return the lado
     */
    public int getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(int lado) {
        this.lado = lado;
    }
}
