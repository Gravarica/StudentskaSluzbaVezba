package com.stanisic.classes;

import java.util.ArrayList;

import com.stanisic.enums.Semestar;

public class Predmet {

	private String sifraPredmeta;
	private String nazivPredmeta;
	private Semestar semestar;
	private int godIzvodjenja;
	private Profesor predmetniProfesor;
	private int ESPB;
	private ArrayList<Student> spisakPolozenih;
	private ArrayList<Student> spisakPalih;

	//Konstruktori
	public Predmet() {}
	public Predmet(String sifra,String naziv,Semestar semestar,int godIzvodjenja,Profesor predmetniProfesor,int ESPB) {
		spisakPolozenih = new ArrayList<Student>();
		spisakPalih = new ArrayList<Student>();
		this.sifraPredmeta=sifra;
		this.nazivPredmeta=naziv;
		this.semestar=semestar;
		this.godIzvodjenja=godIzvodjenja;
		this.predmetniProfesor=predmetniProfesor;
		this.ESPB=ESPB;
	}
	public Predmet(Predmet p) {
		this.sifraPredmeta=p.sifraPredmeta;
		this.nazivPredmeta=p.nazivPredmeta;
		this.semestar=p.semestar;
		this.godIzvodjenja=p.godIzvodjenja;
		this.predmetniProfesor=p.predmetniProfesor;
		this.ESPB=p.ESPB;
		this.spisakPolozenih=p.spisakPolozenih;
		this.spisakPalih=p.spisakPalih;
	}
	
	//Geteri i seteri
	public String getSifraPredmeta() {
		return sifraPredmeta;
	}
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}
	public Semestar getSemestar() {
		return semestar;
	}
	public int getGodIzvodjenja() {
		return godIzvodjenja;
	}
	public Profesor getPredmetniProfesor() {
		return predmetniProfesor;
	}
	public int getESPB() {
		return ESPB;
	}
	public ArrayList<Student> getSpisakPolozenih() {
		return spisakPolozenih;
	}
	public ArrayList<Student> getSpisakPalih() {
		return spisakPalih;
	}
	public void setSifraPredmeta(String sifraPredmeta) {
		this.sifraPredmeta = sifraPredmeta;
	}
	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	public void setSemestar(Semestar semestar) {
		this.semestar = semestar;
	}
	public void setGodIzvodjenja(int godIzvodjenja) {
		this.godIzvodjenja = godIzvodjenja;
	}
	public void setPredmetniProfesor(Profesor predmetniProfesor) {
		this.predmetniProfesor = predmetniProfesor;
	}
	public void setESPB(int eSPB) {
		ESPB = eSPB;
	}
	public void setSpisakPolozenih(ArrayList<Student> spisakPolozenih) {
		this.spisakPolozenih = spisakPolozenih;
	}
	public void setSpisakPalih(ArrayList<Student> spisakPalih) {
		this.spisakPalih = spisakPalih;
	}	
}
