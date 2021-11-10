package com.stanisic.classes;

public class Ocena {
	
	private Student student;
	private Predmet predmet;
	private int ocena;				//Obezbediti da su od 6-10
	private String datumPolaganja;

	//Konstruktori
	public Ocena() {}
	public Ocena(Student student,Predmet predmet,int ocena,String polaganje) {
		this.student=student;
		this.predmet=predmet;
		this.ocena=ocena;
		this.datumPolaganja=polaganje;
	}
	public Ocena(Ocena o) {
		this.student=o.student;
		this.predmet=o.predmet;
		this.ocena=o.ocena;
		this.datumPolaganja=o.datumPolaganja;
	}
	
	//Geteri i seteri
	public Student getStudent() {
		return student;
	}
	public Predmet getPredmet() {
		return predmet;
	}
	public int getOcena() {
		return ocena;
	}
	public String getDatumPolaganja() {
		return datumPolaganja;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public void setDatumPolaganja(String datumPolaganja) {
		this.datumPolaganja = datumPolaganja;
	}

	
}
