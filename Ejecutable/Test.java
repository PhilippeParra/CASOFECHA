package Ejecutable;

import modelo.Fecha;

public class Test 
{
    public static void main(String[] args) 
    {
        Fecha miFecha = new Fecha();

        miFecha.setDia(12);
        miFecha.setMes(11);
        miFecha.setAnio(2022);

        System.out.println(miFecha.toString());

        Fecha miOtraFecha = new Fecha(10, 8, 2010);

        System.out.println(miOtraFecha.toString());

        if (miFecha.equals(miOtraFecha)) {
            System.out.println("Las fechas SÍ son iguales!");
        } else {
            System.out.println("Las fechas NO son iguales!");
        }

        System.out.println("---------------------");
        miFecha.addDias(180);
        System.out.println(miFecha.toString());

        System.out.println("---------------------");
        
    }
}