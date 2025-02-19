/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero2;
public class Automovil extends Vehiculo {
    private String tipoCombustible;

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipo) {
        this.tipoCombustible = tipo;
    }
    
    @Override
    public double getTarifa(){
        return 2000.0;
    }
}
