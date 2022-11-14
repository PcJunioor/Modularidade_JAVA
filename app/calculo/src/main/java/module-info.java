module app.calculo {

    exports com.pcjunior.app.calculo;

    requires app.api.publica;
    requires app.logging;

    opens com.pcjunior.app.calculo
		to app.financeiro, app.logging;
	
	provides com.pcjunior.app.Calculadora
		with com.pcjunior.app.calculo.CalculadoraImpl;
    
    
}
