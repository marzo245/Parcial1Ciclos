package Monitoreo.MonitoreoStock;

import java.util.HashMap;
import java.util.Locale.Category;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import Monitoreo.MonitoreoStock.categoria.Categoria;
import Monitoreo.MonitoreoStock.producto.Producto;
@SpringBootApplication
public class MonitoreoStockApplication {
	public static void main(String[] args) {
		SpringApplication.run(MonitoreoStockApplication.class, args);
	};
}
