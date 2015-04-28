package com.petitemasrata.myfragments;

/**
 * Created by rata on 23/04/15.
 */
public class CosasVarias {
    String nombre;
    double antiguedad;

    public CosasVarias(String nombre, double antiguedad) {
        this.nombre = nombre;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(double antiguedad) {
        this.antiguedad = antiguedad;
    }

}
