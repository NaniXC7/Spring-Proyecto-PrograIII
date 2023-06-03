package com.curso.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.ecommerce.model.Producto;
import com.curso.ecommerce.repository.ProductoDAO;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoDAO productoDAO;
	
	@Override
	public Producto save(Producto producto) {
		return productoDAO.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer id) {
		return productoDAO.findById(id);
	}

	@Override
	public void update(Producto producto) {
		productoDAO.save(producto);
	}

	@Override
	public void delete(Integer id) {
		productoDAO.deleteById(id);
		
	}

	

	
	
}
