package org.fanky.web.business;

import java.util.List;

import org.fanky.web.entity.Producto;
import org.springframework.transaction.annotation.Transactional;

public interface ProductoBAO {
	@Transactional
	public void addProducto(Producto producto);
	@Transactional
	public List<Producto> listProducto();
	@Transactional
	public void removeProducto(Integer id);
	@Transactional
	public Producto getProducto(Integer id);
	@Transactional
	public void updProducto(Producto producto);
}
