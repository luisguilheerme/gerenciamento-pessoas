package com.luisguilherme.desafioattornatus.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.luisguilherme.desafioattornatus.entities.Endereco;
import com.luisguilherme.desafioattornatus.entities.Pessoa;


public class PessoaDTO {

	private Long id;
	private String nome;
	private Instant dataNascimento;

	private List<EnderecoDTO> enderecos = new ArrayList<>();

	public PessoaDTO() {

	}

	public PessoaDTO(Long id, String nome, Instant dataNascimento) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;		
	}
	
	public PessoaDTO(Pessoa entity) {
		id = entity.getId();
		nome = entity.getNome();
		dataNascimento = entity.getDataNascimento();
		for (Endereco e : entity.getEnderecos()) {
			enderecos.add(new EnderecoDTO(e));
		}
	}

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

	public Instant getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Instant dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<EnderecoDTO> getEnderecos() {
		return enderecos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaDTO other = (PessoaDTO) obj;
		return Objects.equals(id, other.id);
	}

}
