package org.fanky.web.dao;

import java.util.List;

import org.fanky.web.entity.Producto;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductoDAOImpl implements ProductoDAO {
	@Autowired
    private SessionFactory sessionFactory;
	
	public void addProducto(Producto producto) {
        sessionFactory.getCurrentSession().save(producto);
	}
	public void updProducto(Producto producto){
		
		sessionFactory.getCurrentSession().update(producto);
	}
	
	public List<Producto> listProducto() {
		return (List<Producto>) sessionFactory.getCurrentSession().createQuery("from Producto")
                .list();
	}

	public void removeProducto(Integer id) {
		//carga en memoria el producto seleccionado s/id
		Producto producto = (Producto) sessionFactory.getCurrentSession().load(Producto.class, id);
		
        if (producto != null) {
            sessionFactory.getCurrentSession().delete(producto);
        }

	}
	public Producto getProducto(Integer id){
		Producto p = (Producto) sessionFactory.getCurrentSession().get(Producto.class,id);
        if (p != null) {
        	return p;
        }
        return new Producto();
	}

}
