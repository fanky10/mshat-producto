package org.fanky.web.business;

import java.util.List;

import org.fanky.web.dao.ProductoDAO;
import org.fanky.web.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoBAOImpl implements ProductoBAO {
	
	@Autowired
	private ProductoDAO producto_dao;
	
	// @Transactional
	public void addProducto(Producto producto) {
		// TODO Auto-generated method stub
		producto_dao.addProducto(producto);

	}

	// @Transactional
	public List<Producto> listProducto() {
		// TODO Auto-generated method stub
		return producto_dao.listProducto();
	}

	// @Transactional
	public void removeProducto(Integer id) {
		// TODO Auto-generated method stub
		producto_dao.removeProducto(id);
	}
	
	public Producto getProducto(Integer id){
		return producto_dao.getProducto(id);
	}

	//@Override
	public void updProducto(Producto producto) {
		// TODO Auto-generated method stub
		producto_dao.updProducto(producto);
	}
	

}
