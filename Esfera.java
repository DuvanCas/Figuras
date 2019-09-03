/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figurasgeometricas;

/**
 *
 * @author duvan, andres bernal
 * Clase esfera que hereda metodo de la clase padre Figuras3D
 */
public class Esfera extends Figuras3D{
    //Variable que representa el radio de la esfera 
    private int radio;
    //Variable que representa el volumen total de la esfera
    private double volumen;
    //Variable que representa el valor de PI
    private double PI = 3.1415;

    /**
     * Contructor principal de la clase esfera
     * @param radio 
     */
    public Esfera(int radio) {
        this.radio = radio;
    }
    /**
     * metodo hallarPerimetro que es heredado de la interfaz de Figuras
     */
    @Override
    public void hallarPerimetro() {
        volumen = PI *(radio^3);
    }
    /**
     * metodo hallarPerimetro que es heredado de la interfaz de Figuras
     */
    @Override
    public void imprimir()
    {
        System.out.println("\nEsfera..");
        System.out.println("El volumen de la esfera es: " + volumen);
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
