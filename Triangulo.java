/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figurasgeometricas;

/**
 *
 * @author duvan, andres bernal
 * clase cuadrado que hereda de la clase padre Figuras2D
 */
public class Triangulo extends Figuras2D{
    // Variable que representa uno de los lados del triangulo
    private double lado1;
    // Variable que representa uno de los lados del triangulo
    private double lado2;
    // Variable que representa uno de los lados del triangulo
    private double lado3;
    // Variable que representa el semiperimetro del triangulo
    private double Sperimetro;
    // Variable que representa el area total del triangulo
    private double area;

    /**
     * Contructor principal de la clase, que solicita los siguientes atributos
     * @param lado1
     * @param lado2
     * @param lado3 
     */
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    /**
     * metodo hallarPerimetro que es heredado de la interfaz de Figuras
     */
    @Override
    public void hallarPerimetro() {
        Sperimetro = ((lado1 + lado2 + lado3)/2);
        area = Math.sqrt(Sperimetro*(Sperimetro - lado1)*(Sperimetro - lado2)*(Sperimetro - lado3));
    }
    /**
     * metodo imprimir que es heredado de la interfaz de Figuras, se especializa el metodo para la clase
     * realizando validaciones para verificar que tipo de triangulo ha sido ingresado
     * esto por medio de los lados que el usuario digita
     */
    @Override
    public void imprimir()
    {
        if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
            System.out.println("\nTriangulo equilatero ");
            System.out.println("El Perimetro del triangulo es: " + area);
        }
        else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
            System.out.println("\nTriangulo escaleno");
            System.out.println("El Perimetro del triangulo es: " + area);
        }
        else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.println("\nTriangulo isoceles ");
            System.out.println("El Perimetro del triangulo es: " + area);
        }
    }

    /**
     * @return the lado1
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * @param lado1 the lado1 to set
     */
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    /**
     * @return the lado2
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * @param lado2 the lado2 to set
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * @return the lado3
     */
    public double getLado3() {
        return lado3;
    }

    /**
     * @param lado3 the lado3 to set
     */
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    /**
     * @return the Sperimetro
     */
    public double getSperimetro() {
        return Sperimetro;
    }

    /**
     * @param Sperimetro the Sperimetro to set
     */
    public void setSperimetro(double Sperimetro) {
        this.Sperimetro = Sperimetro;
    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }
}
