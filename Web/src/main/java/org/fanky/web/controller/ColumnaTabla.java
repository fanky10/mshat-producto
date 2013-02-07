package org.fanky.web.controller;

public enum ColumnaTabla {
	NOMBRE(1,"Nombre","name"),
	PRECIO(2,"Precio","price");
	
	private int id;
	private String name;
	private String columName;
	private ColumnaTabla(int id,String name,String columnName){
		this.id = id;
		this.name = name;
		this.columName = columnName;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getColumnName(){
		return columName;
	}
	
}
