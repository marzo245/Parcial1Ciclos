package Monitoreo.MonitoreoStock.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import Monitoreo.MonitoreoStock.servicio.ServicioProducto;
import Monitoreo.MonitoreoStock.producto.Producto;
@RestController
@RequestMapping("/productos")
public class ControladorProducto {
    @Autowired
//    private ServicioProducto servicioProducto;

    @PostMapping
    public ResponseEntity<Void> agregarProducto(@RequestBody Producto producto) {
//        servicioProducto.agregarProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PatchMapping("/{nombre}/stock")
    public ResponseEntity<Void> actualizarStock(@PathVariable String nombre, @RequestParam int cantidad) {
 //       servicioProducto.actualizarStock(nombre, cantidad);
        return ResponseEntity.ok().build();
    }
}
