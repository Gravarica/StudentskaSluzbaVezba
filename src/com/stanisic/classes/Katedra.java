package com.stanisic.classes;

import java.util.ArrayList;

public class Katedra {

	private String sifraKatedre;
	private String nazivKatedre;
	private Profesor sefKatedre;
	private ArrayList<Profesor> spisakProfesoraKatedre;
	
	//Konstruktori
	public Katedra() {}
	public Katedra(String sifra,String naziv,Profesor sef) {
		spisakProfesoraKatedre = new ArrayList<Profesor>();
		this.sifraKatedre=sifra;
		this.nazivKatedre=naziv;
		this.sefKatedre=sef;
	}
	public Katedra(Katedra k) {
		this.sifraKatedre=k.sifraKatedre;
		this.nazivKatedre=k.nazivKatedre;
		this.sefKatedre=k.sefKatedre;
		this.spisakProfesoraKatedre=k.spisakProfesoraKatedre;
	}
	
	//Geteri i seteri
	public String getSifraKatedre() {
		return sifraKatedre;
	}
	public String getNazivKatedre() {
		return nazivKatedre;
	}
	public Profesor getSefKatedre() {
		return sefKatedre;
	}
	public ArrayList<Profesor> getSpisakProfesoraKatedre() {
		return spisakProfesoraKatedre;
	}
	public void setSifraKatedre(String sifraKatedre) {
		this.sifraKatedre = sifraKatedre;
	}
	public void setNazivKatedre(String nazivKatedre) {
		this.nazivKatedre = nazivKatedre;
	}
	public void setSefKatedre(Profesor sefKatedre) {
		this.sefKatedre = sefKatedre;
	}
	public void setSpisakProfesoraKatedre(ArrayList<Profesor> spisakProfesoraKatedre) {
		this.spisakProfesoraKatedre = spisakProfesoraKatedre;
	}
	
}
