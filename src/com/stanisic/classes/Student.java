package com.stanisic.classes;

import java.util.ArrayList;

import com.stanisic.enums.Status;

public class Student {
	
	private String prezime;
	private String ime;
	private String datumRodjenja;
	private Adresa adresaStudenta;
	private String kontaktTelefon;
	private String eMail;
	private String brojIndeksa;
	private int godUpisa;
	private int godStudija;
	private Status status;
	private double prosecnaOcena;
	private ArrayList<Ocena> spisakPolozenihIspita;
	private ArrayList<Ocena> spisakNepolozenihIspita;

	//Konstruktori
	public Student() {}
	public Student(String prz,String ime,String datumRodjenja,Adresa adresa,String telefon,String mail,String index,int godUpisa,int godStudija,Status status,double prosecnaOcena) {
		spisakPolozenihIspita = new ArrayList<Ocena>();
		spisakNepolozenihIspita = new ArrayList<Ocena>();
		this.prezime=prz;
		this.ime=ime;
		this.datumRodjenja=datumRodjenja;
		this.adresaStudenta=adresa;
		this.kontaktTelefon=telefon;
		this.eMail=mail;
		this.brojIndeksa=index;
		this.godUpisa=godUpisa;
		this.godStudija=godStudija;
		this.status=status;
		this.prosecnaOcena=prosecnaOcena;
	}
	public Student(Student s) {
		this.ime=s.ime;
		this.prezime=s.prezime;
		this.datumRodjenja=s.datumRodjenja;
		this.adresaStudenta=s.adresaStudenta;
		this.kontaktTelefon=s.kontaktTelefon;
		this.eMail=s.eMail;
		this.brojIndeksa=s.brojIndeksa;
		this.godUpisa=s.godUpisa;
		this.godStudija=s.godStudija;
		this.status=s.status;
		this.prosecnaOcena=s.prosecnaOcena;
		this.spisakNepolozenihIspita=s.spisakNepolozenihIspita;
		this.spisakPolozenihIspita=s.spisakPolozenihIspita;
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
	public Adresa getAdresaStudenta() {
		return adresaStudenta;
	}
	public void setAdresaStudenta(Adresa adresaStudenta) {
		this.adresaStudenta = adresaStudenta;
	}
	public String getKontaktTelefon() {
		return kontaktTelefon;
	}
	public void setKontaktTelefon(String kontaktTelefon) {
		this.kontaktTelefon = kontaktTelefon;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getBrojIndeksa() {
		return brojIndeksa;
	}
	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}
	public int getGodUpisa() {
		return godUpisa;
	}
	public void setGodUpisa(int godUpisa) {
		this.godUpisa = godUpisa;
	}
	public int getGodStudija() {
		return godStudija;
	}
	public void setGodStudija(int godStudija) {
		this.godStudija = godStudija;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public double getProsecnaOcena() {
		return prosecnaOcena;
	}
	public void setProsecnaOcena(double prosecnaOcena) {
		this.prosecnaOcena = prosecnaOcena;
	}
	public ArrayList<Ocena> getSpisakPolozenihIspita() {
		return spisakPolozenihIspita;
	}
	public void setSpisakPolozenihIspita(ArrayList<Ocena> spisakPolozenihIspita) {
		this.spisakPolozenihIspita = spisakPolozenihIspita;
	}
	public ArrayList<Ocena> getSpisakNepolozenihIspita() {
		return spisakNepolozenihIspita;
	}
	public void setSpisakNepolozenihIspita(ArrayList<Ocena> spisakNepolozenihIspita) {
		this.spisakNepolozenihIspita = spisakNepolozenihIspita;
	}

	
}
