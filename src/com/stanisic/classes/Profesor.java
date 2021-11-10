package com.stanisic.classes;

import java.util.ArrayList;

public class Profesor {

	private String prezime;
	private String ime;
	private String datumRodjenja;
	private Adresa adresaProfesora;
	private String kontaktTelefon;
	private String eMail;
	private Adresa adresaKancelarije;
	private String brojLicne;
	private String zvanje;
	private int godineStaza;
	private ArrayList<Predmet> spisakPredmetaProfesora;
	
	//Konstruktori
	public Profesor() {}
	public Profesor(String prz,String ime,String datumRodj,Adresa adresa,String telefon,String mail,Adresa kancelarija,String licna,String zvanje,int godStaza) {
		spisakPredmetaProfesora = new ArrayList<Predmet>();
		this.prezime=prz;
		this.ime=ime;
		this.datumRodjenja=datumRodj;
		this.kontaktTelefon=telefon;
		this.adresaProfesora=adresa;
		this.adresaKancelarije=kancelarija;
		this.eMail=mail;
		this.brojLicne=licna;
		this.zvanje=zvanje;
		this.godineStaza=godStaza;
	}
	public Profesor(Profesor p) {
		this.prezime=p.prezime;
		this.ime=p.ime;
		this.datumRodjenja=p.datumRodjenja;
		this.kontaktTelefon=p.kontaktTelefon;
		this.adresaProfesora=p.adresaProfesora;
		this.adresaKancelarije=p.adresaKancelarije;
		this.eMail=p.eMail;
		this.brojLicne=p.brojLicne;
		this.zvanje=p.zvanje;
		this.godineStaza=p.godineStaza;
		this.spisakPredmetaProfesora=p.spisakPredmetaProfesora;
	}
	
	//Geteri i seteri
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getDatumRodjenja() {
		return datumRodjenja;
	}
	public void setDatumRodjenja(String datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}
	public String getKontaktTelefon() {
		return kontaktTelefon;
	}
	public void setKontaktTelefon(String kontaktTelefon) {
		this.kontaktTelefon = kontaktTelefon;
	}
	public Adresa getAdresaProfesora() {
		return adresaProfesora;
	}
	public void setAdresaProfesora(Adresa adresaProfesora) {
		this.adresaProfesora = adresaProfesora;
	}
	public Adresa getAdresaKancelarije() {
		return adresaKancelarije;
	}
	public void setAdresaKancelarije(Adresa adresaKancelarije) {
		this.adresaKancelarije = adresaKancelarije;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getBrojLicne() {
		return brojLicne;
	}
	public void setBrojLicne(String brojLicne) {
		this.brojLicne = brojLicne;
	}
	public String getZvanje() {
		return zvanje;
	}
	public void setZvanje(String zvanje) {
		this.zvanje = zvanje;
	}
	public int getGodineStaza() {
		return godineStaza;
	}
	public void setGodineStaza(int godineStaza) {
		this.godineStaza = godineStaza;
	}
	public ArrayList<Predmet> getSpisakPredmetaProfesora() {
		return spisakPredmetaProfesora;
	}
	public void setSpisakPredmetaProfesora(ArrayList<Predmet> spisakPredmetaProfesora) {
		this.spisakPredmetaProfesora = spisakPredmetaProfesora;
	}
}
