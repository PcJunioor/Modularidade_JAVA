package com.pcjunior.app.calculo;

import com.pcjunior.app.Calculadora;
import com.pcjunior.app.calculo.interno.OperacoesAritmeticas;

import app.logging.Logger;


public class CalculadoraImpl implements Calculadora {
    private String id = "abc";
	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);	
		
	}

	public String getId() {
		return id;
	}
    
}
