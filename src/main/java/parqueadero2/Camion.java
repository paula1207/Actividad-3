/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero2;

public class Camion extends Vehiculo {
    private double capacidadCarga;

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidad) {
        this.capacidadCarga = capacidad;
    }
    
    @Override
    public double getTarifa(){
        return 4000.0;
    }
}
