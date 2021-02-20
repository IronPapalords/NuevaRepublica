package com.ironpapalords.model;

public class UserDTO {

	private String correo;
	private String clave;
	private String nombre;

	public User getUserFromDto(){
        User user = new User();
        user.setCorreo(correo);
        user.setClave(clave);
        user.setNombre(nombre);
        return user;
    }
	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}