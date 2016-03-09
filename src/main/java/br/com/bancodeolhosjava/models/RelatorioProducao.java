package br.com.bancodeolhosjava.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RelatorioProducao {
	@Id
	@GeneratedValue
	private Long id;
	private int globosOcularesObtidos;
	private int globosOcularesDescartados;
	private int corneasPreservadas;
	private int opticas;
	private int corneasDescartadas;
	private int esclerasPreservadas;
	private int esclerasDescartadas;
	private int esclerasDistribuidas;
	private int tectonica;
	private String motivoDescarte;
	private String causaDaMorte;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getGlobosOcularesObtidos() {
		return globosOcularesObtidos;
	}

	public void setGlobosOcularesObtidos(int globosOcularesObtidos) {
		this.globosOcularesObtidos = globosOcularesObtidos;
	}

	public int getGlobosOcularesDescartados() {
		return globosOcularesDescartados;
	}

	public void setGlobosOcularesDescartados(int globosOcularesDescartados) {
		this.globosOcularesDescartados = globosOcularesDescartados;
	}

	public int getCorneasPreservadas() {
		return corneasPreservadas;
	}

	public void setCorneasPreservadas(int corneasPreservadas) {
		this.corneasPreservadas = corneasPreservadas;
	}

	public int getOpticas() {
		return opticas;
	}

	public void setOpticas(int opticas) {
		this.opticas = opticas;
	}

	public int getCorneasDescartadas() {
		return corneasDescartadas;
	}

	public void setCorneasDescartadas(int corneasDescartadas) {
		this.corneasDescartadas = corneasDescartadas;
	}

	public int getEsclerasPreservadas() {
		return esclerasPreservadas;
	}

	public void setEsclerasPreservadas(int esclerasPreservadas) {
		this.esclerasPreservadas = esclerasPreservadas;
	}

	public int getEsclerasDescartadas() {
		return esclerasDescartadas;
	}

	public void setEsclerasDescartadas(int esclerasDescartadas) {
		this.esclerasDescartadas = esclerasDescartadas;
	}

	public int getEsclerasDistribuidas() {
		return esclerasDistribuidas;
	}

	public void setEsclerasDistribuidas(int esclerasDistribuidas) {
		this.esclerasDistribuidas = esclerasDistribuidas;
	}

	public int getTectonica() {
		return tectonica;
	}

	public void setTectonica(int tectonica) {
		this.tectonica = tectonica;
	}

	public String getMotivoDescarte() {
		return motivoDescarte;
	}

	public void setMotivoDescarte(String motivoDescarte) {
		this.motivoDescarte = motivoDescarte;
	}

	public String getCausaDaMorte() {
		return causaDaMorte;
	}

	public void setCausaDaMorte(String causaDaMorte) {
		this.causaDaMorte = causaDaMorte;
	}

}
