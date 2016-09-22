/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author L115student
 */
public abstract class ServiceTipManager implements TipManager, EnumManager {
    private double minBill = 0;
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;
    
    private ServiceQuality serviceQuality;
    
    public abstract double getTip();
    
    @Override
    public final double getMinBill(){
        return minBill;
    }

    public final double getGoodRate() {
        return goodRate;
    }

    public final double getFairRate() {
        return fairRate;
    }

    public final double getPoorRate() {
        return poorRate;
    }
    
    
    public final void setRates(double goodRate, double fairRate, double poorRate) {
        if(poorRate >= 0 && poorRate <= 1){
            this.poorRate = poorRate; 
        }
        if(fairRate >= poorRate && fairRate <= goodRate){
            this.fairRate = fairRate; 
        }
        if(goodRate >= fairRate){
            this.goodRate = goodRate;
        }
    }
    
    public final void setServiceRating(EnumManager.ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public EnumManager.ServiceQuality getServiceQuality() {
        return serviceQuality;
    }
}
