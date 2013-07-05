/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientmanager;

import java.util.ArrayList;

/**
 *
 * @author Scare
 */
public class Client {
    
    private ArrayList<Service> clientServices;
    private String name;
    private int clientNumber;
    
    public Client(String name, int clientNumber) throws InvalidClientNumberException{
        this.setName(name);
        this.setClientServices(new ArrayList<Service>());
        this.setClientNumber(clientNumber);
    }
    
    /**
     * @return the clientServices
     */
    public ArrayList<Service> getClientServices() {
        return clientServices;
    }

    /**
     * @param clientServices the clientServices to set
     */
    public final void setClientServices(ArrayList<Service> clientServices) {
        this.clientServices = clientServices;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public final void setName(String name) {
        this.name = name;
    }

    /**
     * @return the clientNumber
     */
    public int getClientNumber() {
        return clientNumber;
    }
    
    /**
     * @param clientNumber the clientNumber to set
     */
    private void setClientNumber(int clientNumber) throws InvalidClientNumberException{
        if(clientNumber>0){
            this.clientNumber = clientNumber;}
        else{
            throw new InvalidClientNumberException(clientNumber);
        }
    }
    
    /**
     * @param clientServices the clientServices to set
     */
    public final void addClientService(Service s) {
        this.clientServices.add(s);
    }
    
    /**
     * @return the value of Monthly payment. Sum of all cost services of this client
     */
    public float calculateMonthlyPayment(){
        float paymentValue=0;
        for(Service s : clientServices){
            paymentValue=paymentValue+s.calculateServicePayment();
        }
        return paymentValue;
    }

    
}
