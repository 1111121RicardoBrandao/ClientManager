/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientmanager;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Scare
 */
public class ClientTest {
    
    public ClientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Client.
     */
    @Test
    public void testGetName() throws InvalidClientNumberException {
        System.out.println("Test getName");
        Client instance = new Client("Joaquim",1);
        String expResult = "Joaquim";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Client.
     */
    @Test
    public void testSetName() throws InvalidClientNumberException {
        System.out.println("Test setName");
        String name = "Joaquim";
        Client instance = new Client("Joana",1);
        instance.setName(name);
        assertEquals(name, instance.getName());
    }

    /**
     * Test of getClientNumber method, of class Client.
     */
    @Test
    public void testGetClientNumber() throws InvalidClientNumberException {
        System.out.println("Test getClientNumber");
        Client instance = new Client("Joaquim",100);
        int expResult = 100;
        int result = instance.getClientNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of addClientService method, of class Client.
     */
    @Test
    public void testAddClientService() throws InvalidClientNumberException{
        System.out.println("Test addClientService");
        PhoneService s = new PhoneService("ABC", 123123123);
        Client instance = new Client("Joao", 1);
        instance.addClientService(s);
        assertEquals(instance.getClientServices().size(), 1);
    }

    /**
     * Test of calculateMonthlyPayment method, of class Client.
     */
    @Test
    public void testCalculateMonthlyPayment() throws InvalidClientNumberException {
        System.out.println("Test calculateMonthlyPayment");
        Client instance = new Client("Joaquim",100);
        PhoneService s = new PhoneService("ABC", 123123123);
        PhoneService.setMonthlyCostPhoneService(100);
        instance.addClientService(s);
        float expResult = 100.0F;
        float result = instance.calculateMonthlyPayment();
        assertEquals(expResult, result, 0.0);
    }
}