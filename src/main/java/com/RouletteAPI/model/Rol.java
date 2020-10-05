package com.RouletteAPI.model;

public class Rol {

	private int idRol;
	private RolName rolName;

	public Rol() {
	}

	public Rol(RolName rolName) {
		this.rolName = rolName;
	}

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public RolName getRolName() {
		return rolName;
	}

	public void setRolName(RolName rolName) {
		this.rolName = rolName;
	}

}