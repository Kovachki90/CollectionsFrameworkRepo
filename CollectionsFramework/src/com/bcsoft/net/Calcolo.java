package com.bcsoft.net;

public class Calcolo {

	private Long idCalcolo;
	private double importoCalcolo;
	private String descrizioneCalcolo;
	
	public Calcolo(Long idCalcolo, double importoCalcolo, String descrizione) {
		super();
		this.idCalcolo = idCalcolo;
		this.importoCalcolo = importoCalcolo;
		this.descrizioneCalcolo = descrizione;
	}
	
	
	public Long getIdCalcolo() {
		return idCalcolo;
	}
	public void setIdCalcolo(Long idCalcolo) {
		this.idCalcolo = idCalcolo;
	}
	public double getImportoCalcolo() {
		return importoCalcolo;
	}
	public void setImportoCalcolo(double importoCalcolo) {
		this.importoCalcolo = importoCalcolo;
	}
	public String getDescrizioneCalcolo() {
		return descrizioneCalcolo;
	}
	public void setDescrizioneCalcolo(String descrizioneCalcolo) {
		this.descrizioneCalcolo = descrizioneCalcolo;
	}
	
	
}
