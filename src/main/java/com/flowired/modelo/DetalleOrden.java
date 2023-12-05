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
@Table(name = "Detalle_Orden")
public class DetalleOrden {

	private Integer id_Detalle_Orden;
	private String name;
	private double cantidad;
	private double precio;
	private double total;
	private double total_one;

}
