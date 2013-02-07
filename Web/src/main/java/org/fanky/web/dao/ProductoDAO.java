package org.fanky.web.dao;

import java.util.List;

import org.fanky.web.entity.Producto;

public interface ProductoDAO {
	public void addProducto(Producto producto);

	public void updProducto(Producto producto);

	public void removeProducto(Integer id);

	public Producto getProducto(Integer id);

	public List<Producto> listProducto();

}
