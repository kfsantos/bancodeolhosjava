package br.com.bancodeolhosjava.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.NotNull;

@Entity
public class Doador {
	@Id
	@GeneratedValue
	private Long id;
	@NotNull(message="Não pode ser vazio.")
	private String nome;
	private String idade;
	private String sexo;
	private String dataCaptacao;
	private String localDoacao;
	private String responsavel;
	private String grauParentesco;
	private String telefone;
	private String tec;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Endereco endereco;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private RelatorioDoador relatorioDoador;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private RelatorioProducao relatorioProducao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataCaptacao() {
		return dataCaptacao;
	}

	public void setDataCaptacao(String dataCaptacao) {
		this.dataCaptacao = dataCaptacao;
	}

	public String getLocalDoacao() {
		return localDoacao;
	}

	public void setLocalDoacao(String localDoacao) {
		this.localDoacao = localDoacao;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getGrauParentesco() {
		return grauParentesco;
	}

	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTec() {
		return tec;
	}

	public void setTec(String tec) {
		this.tec = tec;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public RelatorioDoador getRelatorioDoador() {
		return relatorioDoador;
	}

	public void setRelatorioDoador(RelatorioDoador relatorioDoador) {
		this.relatorioDoador = relatorioDoador;
	}

	public RelatorioProducao getRelatorioProducao() {
		return relatorioProducao;
	}

	public void setRelatorioProducao(RelatorioProducao relatorioProducao) {
		this.relatorioProducao = relatorioProducao;
	}

}
