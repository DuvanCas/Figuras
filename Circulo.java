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
 * clase circulo que hereda de la clase padre Figuras2D
 */
public class Circulo extends Figuras2D{
    //Variable que representa el radio del circulo
    private int radio;
    //Variable que representa el perimetro total del circulo
    double perimetro;
    //Variable que representa el valor para PI
    private double PI = 3.1415;

    /**
     * Contructor principal de la clase
     * @param radio 
     */
    public Circulo(int radio) {
        this.radio = radio;
    }
    /**
     * metodo hallarPerimetro que es heredado de la interfaz de Figuras
     */
    @Override
    public void hallarPerimetro() {
        perimetro = PI * ((radio)^2);
    }
    /**
     * metodo imprimir que es heredado de la interfaz de Figuras
     */
    @Override
    public void imprimir()
    {
        System.out.println("\nCirculo.");
        System.out.println("El Perimetro del circulo es: " + perimetro);
    }
    /**
     * @return the radio
     */
    public int getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }

    /**
     * @return the PI
     */
    public double getPI() {
        return PI;
    }

    /**
     * @param PI the PI to set
     */
    public void setPI(double PI) {
        this.PI = PI;
    }
}
