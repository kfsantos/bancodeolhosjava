package br.com.bancodeolhosjava.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RelatorioDoador {
	@Id
	@GeneratedValue
	private Long id;
	private String dataLocalEnucl;
	private String dataDistribuicaoDescarte;
	private String classificacaoCornea;
	private String receptor;
	private String dataTx;
	private String equipeTx;
	private String localTx;
	private String tipoDeTx;

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDataLocalEnucl() {
		return dataLocalEnucl;
	}

	public void setDataLocalEnucl(String dataLocalEnucl) {
		this.dataLocalEnucl = dataLocalEnucl;
	}

	public String getDataDistribuicaoDescarte() {
		return dataDistribuicaoDescarte;
	}

	public void setDataDistribuicaoDescarte(String dataDistribuicaoDescarte) {
		this.dataDistribuicaoDescarte = dataDistribuicaoDescarte;
	}

	public String getClassificacaoCornea() {
		return classificacaoCornea;
	}

	public void setClassificacaoCornea(String classificacaoCornea) {
		this.classificacaoCornea = classificacaoCornea;
	}

	public String getReceptor() {
		return receptor;
	}

	public void setReceptor(String receptor) {
		this.receptor = receptor;
	}

	public String getDataTx() {
		return dataTx;
	}

	public void setDataTx(String dataTx) {
		this.dataTx = dataTx;
	}

	public String getEquipeTx() {
		return equipeTx;
	}

	public void setEquipeTx(String equipeTx) {
		this.equipeTx = equipeTx;
	}

	public String getLocalTx() {
		return localTx;
	}

	public void setLocalTx(String localTx) {
		this.localTx = localTx;
	}

	public String getTipoDeTx() {
		return tipoDeTx;
	}

	public void setTipoDeTx(String tipoDeTx) {
		this.tipoDeTx = tipoDeTx;
	}
}
