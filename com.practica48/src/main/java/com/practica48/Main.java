package com.practica48;

import javax.xml.transform.Transformer;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.*;
public class Main {
	
	public static void main(String[] args) throws JAXBException {
		try {
		// TODO Auto-generated method stub
		//File archivoXml = new File("coches.xml");	
		JAXBContext context = JAXBContext.newInstance(autos.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		autos autos = (autos) unmarshaller.unmarshal(new File("src\\main\\resources\\coches.xml"));
	

		
		for (auto auto : autos.getAuto()) {
		      System.out.println("ID: " + auto.getId());
              System.out.println("Marca: " + auto.getMarca());
              System.out.println("Modelo: " + auto.getModelo());
              System.out.println("Año: " + auto.getAño());
              System.out.println("Color: " + auto.getColor());
              System.out.println("Tipo de motor: " + auto.getTipo_motor());
              System.out.println("Cilindrada: " + auto.getCilindrada());
              System.out.println("Potencia: " + auto.getPotencia());
//              System.out.println("Tipo de transmisión: " + auto.getTransmision().getTipo());
//              System.out.println("Velocidades de transmisión: " + auto.getTransmision().getVelocidades());
              System.out.println();		}
	
	}catch (JAXBException e) {
        e.printStackTrace();
    }
	}
}
	

	