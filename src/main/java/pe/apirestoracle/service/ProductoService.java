package pe.apirestoracle.service;

import java.util.List;
import java.util.Map;

import pe.apirestoracle.entity.Producto;

public interface ProductoService {
	List<Map<String,Object>>readAll();
	int create(Producto p);
	
	
}
