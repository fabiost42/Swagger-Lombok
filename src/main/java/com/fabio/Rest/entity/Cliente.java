package com.fabio.Rest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="Cliente")
@Data
@AllArgsConstructor
public class Cliente {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name="nombre")
	private String nombre;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="fecha")
	private LocalDate fecha;

	@Column(name="dni")
	private String dni;
	
	public Cliente() {};


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fecha=" + fecha + ", dni="
				+ dni + "]";
	}
	
}
