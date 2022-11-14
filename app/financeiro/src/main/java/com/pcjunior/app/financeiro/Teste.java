package com.pcjunior.app.financeiro;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

import com.pcjunior.app.Calculadora;

public class Teste {
    public static void main(String[] args) {
		
	
		Calculadora calc = ServiceLoader.load(Calculadora.class).findFirst().get();
		System.out.println(calc.soma(2, 3, 4));
		

		
		// COMO ALTERAR ATRIBUTO PRIVATE USANDO REFLECTION
		try {
			Field fieldId = calc.getClass().getDeclaredFields()[0];			
			fieldId.setAccessible(true);
			System.out.println("antes de alterar: " + calc.getId());
			fieldId.set(calc, "def");
			System.out.println("depois de alterar: " + calc.getId());
			fieldId.setAccessible(false);			
		} catch (Exception e) {
				e.printStackTrace();
		} 		
		 
	}
}
