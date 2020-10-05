package com.RouletteAPI.model;

public class Roulette {

	private int idRoulette;
	private int rouletteNumber;
	private boolean state;

	public int getIdRoulette() {
		return idRoulette;
	}

	public void setIdRoulette(int idRoulette) {
		this.idRoulette = idRoulette;
	}

	public int getRouletteNumber() {
		return rouletteNumber;
	}

	public void setRouletteNumber(int rouletteNumber) {
		this.rouletteNumber = rouletteNumber;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

}