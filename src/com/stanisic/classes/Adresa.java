package com.stanisic.classes;

public class Adresa {
	
	private String ulica;
	private int broj;
	private String grad;
	private String drzava;
	
	//Konstruktori
	public Adresa() {}
	public Adresa(String ulica,int broj,String grad,String drzava) {
		this.ulica=ulica;
		this.broj=broj;
		this.grad=grad;
		this.drzava=drzava;
	}
	public Adresa(Adresa a) {
		this.ulica=a.ulica;
		this.broj=a.broj;
		this.grad=a.grad;
		this.drzava=a.drzava;
	}
	
	//Geteri i seteri
	public String getUlica() {
		return ulica;
	}
	public int getBroj() {
		return broj;
	}
	public String getGrad() {
		return grad;
	}
	public String getDrzava() {
		return drzava;
	}
	public void setUlica(String ulica) {
		this.ulica = ulica;
	}
	public void setBroj(int broj) {
		this.broj = broj;
	}
	public void setGrad(String grad) {
		this.grad = grad;
	}
	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}
}
