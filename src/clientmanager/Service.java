/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientmanager;

/**
 *
 * @author Scare
 */
public abstract class Service {
    
    private float monthlyCost;
    
    /**
     * @instantiate object service
     */
    public  Service(float cost){
        monthlyCost = cost;
    }

    /**
     * @return the monthlyCost
     */
    public float getMonthlyCost() {
        return monthlyCost;
    }

    /**
     * @param monthlyCost the monthlyCost to set
     */
    public void setMonthlyCost(float monthlyCost) {
        this.monthlyCost = monthlyCost;
    }
    
    public abstract float calculateServicePayment();
}
