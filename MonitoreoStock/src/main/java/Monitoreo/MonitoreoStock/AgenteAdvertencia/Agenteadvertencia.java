package Monitoreo.MonitoreoStock.AgenteAdvertencia;
import Monitoreo.MonitoreoStock.producto.Producto;
public class Agenteadvertencia {
    public void alertarStockBajo(Producto producto) {
        if (producto.getCantidad() < 5) {
            System.out.println("¡ALERTA! El stock del Producto: " + producto.getNombre() + " es muy bajo, solo quedan " + producto.getCantidad() + " unidades.");
        }
    }
}
