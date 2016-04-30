/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioCifrado;

/**
 *
 * @author Estudiante
 */
public class Cash implements Asset {
    
    protected double amount;

    public Cash(double amount) {
        this.amount = amount;
    }
    
    @Override
    public double getMarketValue() {
        double valorEnElMercado;
      
        valorEnElMercado = amount;
        return valorEnElMercado;
    }

    @Override
    public double getProfit() {
        return 0;
    }
     
}
