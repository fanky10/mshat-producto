package org.fanky.web.controller;

import java.util.Map;


import org.fanky.web.business.ProductoBAO;
import org.fanky.web.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ProductoController {
	private static final String DEFAULT_REDIRECT = "/lista.html";
	@Autowired
	private ProductoBAO bao_product;
	
	@RequestMapping("/testenum.html")
	public String showEnum(Map<String, Object> map) {

        map.put("columnas", ColumnaTabla.values() );
        map.put("productoList", bao_product.listProducto());
        return "test_enum";
    }
	
	//
	// mapean todas las request con html --> para que sea formateado con tiles
	//
	@RequestMapping({"/","/lista.html"})
	public String listProducts(Map<String, Object> map) {

        map.put("productoList", bao_product.listProducto());
 
        return "producto_list";
    }
	@RequestMapping("/alta_producto.html")
	public String altaProducto(Map<String, Object> map) {
    	
        map.put("producto", new Producto());
        
        return "producto_add";
    }
	
	@RequestMapping("/mod_producto/{productoId}")
	public String editProduct(@PathVariable("productoId")
    Integer producto_id, Map<String, Object> map) {
    	Producto producto = bao_product.getProducto(producto_id);
    	System.out.println("[FANKY-DEBUG]: "+producto.getId()+" - " +producto.getNombre()+" - "+producto.getPrecio());
        map.put("producto", producto);
 
        return "producto_edit";
    }
	
	//
	// mapean todos los comandos de edicion, add, edit & delete
	//
	
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addProduct(@ModelAttribute("producto")
    	Producto producto, BindingResult result) {
    	//System.out.println("[FANKY-DEBUG]: "+producto.getNombre());
        bao_product.addProducto(producto);
 
        return "redirect:"+DEFAULT_REDIRECT;
    }
    //cabeceada, porque no se llamar a edit xD
    @RequestMapping(value = "/mod_producto/edit", method = RequestMethod.POST)
    public String editProduct(@ModelAttribute("producto")
    	Producto producto, BindingResult result) {
    	//System.out.println("[FANKY-DEBUG]: "+producto.getId()+" - " +producto.getNombre()+" - "+producto.getPrecio());
        bao_product.updProducto(producto);
 
        return "redirect:"+DEFAULT_REDIRECT;
    }
    @RequestMapping("/delete/{productoId}")
    public String delProduct(@PathVariable("productoId")
    Integer producto_id) {
 
        bao_product.removeProducto(producto_id);
 
        return "redirect:"+DEFAULT_REDIRECT;
    }
}
