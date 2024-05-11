package com.practica48;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement (name = "autos") //elemento raiz
//@XmlAccessorType(XmlAccessType.FIELD)

public class autos {
//	@XmlElementWrapper(name = "autos")
//	@XmlElement (name = "auto")

	private ArrayList<auto> autos = new ArrayList<>();

	public autos() {}
	public autos(ArrayList<auto> auto) {
		this.autos = auto;
	}

	//@XmlElementWrapper (name= "autos")
	//@XmlElement(name = "auto")
	public ArrayList<auto> getAuto() {
		return autos;
	}
	@XmlElement(name="auto")
	public void setAutos(ArrayList<auto> autos) {
		this.autos = autos;
	}
	
	
}
