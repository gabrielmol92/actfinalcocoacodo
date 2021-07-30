package ar.edu.bue.codoacodo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "ALIMENTOS")
public class Alimento {

	@Id
	@Column(name = "ali_id")
	private Long codigo;
	
	@Column(name = "categoria")
	private String categoria;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "nombre")
	private long peso;
	
	@Column(name = "precio")
	private long precio;
	
	
	public Alimento() {
		// TODO Auto-generated constructor stub
	}




	public Alimento(Long codigo, String categoria, String marca, String tipo, long peso, long precio) {
		super();
		this.codigo = codigo;
		this.categoria = categoria;
		this.marca = marca;
		this.tipo = tipo;
		this.peso = peso;
		this.precio = precio;
	}




	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	


	public String getCategoria() {
		return categoria;
	}




	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}




	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public long getPeso() {
		return peso;
	}


	public void setPeso(long peso) {
		this.peso = peso;
	}


	public long getPrecio() {
		return precio;
	}


	public void setPrecio(long precio) {
		this.precio = precio;
	}




	@Override
	public String toString() {
		return "Alimento [codigo=" + codigo + ", categoria=" + categoria + ", marca=" + marca + ", tipo=" + tipo
				+ ", peso=" + peso + ", precio=" + precio + "]";
	}
	
}
