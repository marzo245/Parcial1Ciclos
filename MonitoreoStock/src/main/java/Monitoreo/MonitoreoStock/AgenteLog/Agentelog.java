package Monitoreo.MonitoreoStock.AgenteLog;
import Monitoreo.MonitoreoStock.producto.Producto;

public class Agentelog {
    public void logStockChange(Producto producto) {
        System.out.println("Producto: " + producto.getNombre() + " -> " + producto.getCantidad() + " unidades disponibles");
        if (producto.getCantidad() < 5) {
            System.out.println("ALERTA!!! El stock del Producto: " + producto.getNombre() + " es muy bajo, solo quedan " + producto.getCantidad() + " unidades.");
        }
    }
}

