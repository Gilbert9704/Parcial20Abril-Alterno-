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
public class MutualFund extends ShareAsset {
    protected double totalShares;

    public MutualFund(double totalShares, String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice);
        this.totalShares = totalShares;
    }

    
    @Override
    public double getProfit() {
        double profit;
        
        profit = totalShares * currentPrice - totalCost;
        return profit;
    }

    @Override
    public double getMarketValue() {
        double valorEnElMercado;
        
        valorEnElMercado = totalShares * currentPrice;
        return valorEnElMercado;
    }
    
}
