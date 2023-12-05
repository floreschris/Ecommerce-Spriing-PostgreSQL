package com.flowired.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Usuarios")
public class Usuario {

	private Integer id_Usuario;
	private String name;
	private String username;
	private String email;
	private String direction;
	private String phone;
	private String tipo;
	private String password;

}
