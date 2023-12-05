package com.flowired.modelo;

import java.util.Date;

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
@Table(name = "Orden")
public class Orden {

	private Integer id_Orden;
	private String numero;
	private Date fecha_Creacion;
	private Date fecha_Recibida;
	private double total;

}
