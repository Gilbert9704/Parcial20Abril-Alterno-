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
public class DividentStock extends Stock {
    
    protected double dividends;

    public DividentStock(double dividends, int totalShares, String symbol, double totalCost, double currentPrice) {
        super(totalShares, symbol, totalCost, currentPrice);
        this.dividends = dividends;
    }
    
    @Override
    public double getProfit(){
        double profit;
        
        profit = totalShares * currentPrice - totalCost;
        return profit;
    }
    
    @Override
    public double getMarketValue(){
        double valorMercado;
        
        valorMercado = super.getMarketValue() + dividends;
        return valorMercado;
    }
}
