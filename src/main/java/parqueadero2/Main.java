/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero2;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();

        // Crear un automóvil y registrarlo
        Automovil auto = new Automovil();
        auto.setPlaca("ABC123");
        auto.setMarca("Toyota");
        auto.setModelo("Corolla");
        auto.setHoraEntrada(LocalDateTime.now().minusMinutes(150));
        auto.setTipoCombustible("Gasolina");

        parqueadero.registrarEntrada(auto);
        
        Camion camion = new Camion();
        camion.setPlaca("ABC234");
        camion.setMarca("chevrolet");
        camion.setModelo("npr");
        camion.setHoraEntrada(LocalDateTime.now().minusMinutes(90));
        camion.setCapacidadCarga(5000);
        
        parqueadero.registrarEntrada(camion);
        
        
        Motocicleta moto = new Motocicleta();
        moto.setPlaca("ABC34D");
        moto.setMarca("KTM");
        moto.setModelo("Duke");
        moto.setCilindraje(200);
        moto.setHoraEntrada(LocalDateTime.now().minusMinutes(30));
        
        parqueadero.registrarEntrada(moto);
        
        
        
        
        
        
 

        // Mostrar estado del parqueadero
        System.out.println("Vehículos en parqueadero: " + parqueadero.consultarEstado().size());

        // Registrar salida
        double tarifa = parqueadero.registrarSalida("ABC123");
        System.out.println("Tarifa a pagar: $" + tarifa);
        tarifa = parqueadero.registrarSalida("ABC234");
        System.out.println("Tarifa a pagar: $" + tarifa);
        
   
        tarifa = parqueadero.registrarSalida("ABC34D");
        System.out.println("Tarifa a pagar: $" + tarifa);
        
    }
    
}
