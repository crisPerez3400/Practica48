package com.practica48;
import java.util.ArrayList;
import javax.xml.bind.annotation.*;
@XmlRootElement (name = "auto")
@XmlType(propOrder= {"id", "marca", "modelo", "año", "color", "tipo_motor", "cilindrada", "potencia"})

public class auto {
	private String id;
	private String marca;
	private String modelo;
	private Integer año;
	private String color;
	private String tipo_motor;
	private String cilindrada;
	private Integer potencia;
	//private ArrayList<transmision> auto = new ArrayList<>();
	//private String transmision_tipo;
//	private transmision transmision;
	


public auto() {}
public auto(String id, String marca, String modelo, Integer año, String color, String tipo_motor, String cilindrada,
			Integer potencia,transmision  transmision) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.color = color;
		this.tipo_motor = tipo_motor;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
//		this.transmision = transmision;
	}




public String getId() {
	return id;
}



@XmlElement
public void setId(String id) {
	this.id = id;
}




public String getMarca() {
	return marca;
}



@XmlElement
public void setMarca(String marca) {
	this.marca = marca;
}




public String getModelo() {
	return modelo;
}



@XmlElement
public void setModelo(String modelo) {
	this.modelo = modelo;
}




public Integer getAño() {
	return año;
}



@XmlElement
public void setAño(Integer año) {
	this.año = año;
}




public String getColor() {
	return color;
}



@XmlElement
public void setColor(String color) {
	this.color = color;
}




public String getTipo_motor() {
	return tipo_motor;
}



@XmlElement
public void setTipo_motor(String tipo_motor) {
	this.tipo_motor = tipo_motor;
}




public String getCilindrada() {
	return cilindrada;
}



@XmlElement
public void setCilindrada(String cilindrada) {
	this.cilindrada = cilindrada;
}




public Integer getPotencia() {
	return potencia;
}



@XmlElement
public void setPotencia(Integer potencia) {
	this.potencia = potencia;
}


/*

public transmision getTransmision() {
	return transmision;
}



@XmlElement
public void setTransmision(transmision transmision) {
	this.transmision = transmision;
}
*/
// Getters y setters

}
