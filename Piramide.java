/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figurasgeometricas;

/**
 *
 * @author duvan, andres bernal
 * Clase piramide que hereda metodo de la clase padre Figuras3D
 */
public class Piramide extends Figuras3D{
    //Variable que representa la base de la piramide
    private int base;
    //Variable que representa la altura de la piramide
    private int altura;
    //Variable que representa el volumen total de la piramide
    private double volumen;

    /**
     * Contructor principal de la clase piramide
     * @param base
     * @param altura 
     */
    public Piramide(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    /**
     * metodo hallarPerimetro que es heredado de la interfaz de Figuras
     */
    @Override
    public void hallarPerimetro() {
        setVolumen((getBase() * getAltura()) / 3);
    }
    /**
     * metodo hallarPerimetro que es heredado de la interfaz de Figuras
     */
    @Override
    public void imprimir()
    {
        System.out.println("\nPiramide");
        System.out.println("El volumen de la piramide es: " + volumen);
    }

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the volumen
     */
    public double getVolumen() {
        return volumen;
    }

    /**
     * @param volumen the volumen to set
     */
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
}
