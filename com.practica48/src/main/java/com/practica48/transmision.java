package com.practica48;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement (name = "transmision")
@XmlType (propOrder = {"tipo", "velocidades"})
@XmlAccessorType(XmlAccessType.FIELD)

public class transmision {
	private String tipo;
	private Integer velocidades;
	
	public transmision() {}
	public transmision(String tipo, int velocidades) {
		this.tipo = tipo;
		this.velocidades = velocidades;
	}


    // Getters y setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(Integer velocidades) {
        this.velocidades = velocidades;
    }
}

