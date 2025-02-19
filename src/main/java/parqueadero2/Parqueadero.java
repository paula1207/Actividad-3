/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parqueadero2;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.Duration;


public class Parqueadero {
    private List<Vehiculo> vehiculos = new ArrayList<>();

    public void registrarEntrada(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo con placa " + vehiculo.getPlaca() + " registrado.");
        
        imprimirEstado();
    }

    public double registrarSalida(String placa) {
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equals(placa)) {
                vehiculos.remove(v);
                System.out.println("Vehículo con placa " + placa + " ha salido.");
                imprimirEstado();
                return calcularTarifa(v);
                
            }
        }
        return 0;
    }
    private double calcularTarifa(Vehiculo vehiculo){
        LocalDateTime horaEntrada = vehiculo.getHoraEntrada();
        LocalDateTime horaSalida = LocalDateTime.now();
        Duration duration = Duration.between(horaEntrada, horaSalida);
        long horasCobradas = Math.round(duration.toMinutes()/60.0);
        double costo = horasCobradas* vehiculo.getTarifa();
        System.out.println("Horas cobradas: " + horasCobradas);
        return costo;
        
        
        
        
    }

    public List<Vehiculo> consultarEstado() {
        return vehiculos;
    }
    
    private void imprimirEstado(){
        System.out.println("vehiculos en el parqueadero:");
        
        for (Vehiculo v : vehiculos) {
            System.out.println(v.getPlaca());
        }
    }
}