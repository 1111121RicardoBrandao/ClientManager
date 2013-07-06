/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientmanager;

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
public class InternetServiceTest {
    
    public InternetServiceTest() {
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
     * Test of getMonthlyCostM20 method, of class InternetService.
     */
    @Test
    public void testGetMonthlyCostM20() {
        System.out.println("Test getMonthlyCostM20");
        InternetService.setMonthlyCostM20(20);
        float expResult = 20.0F;
        float result = InternetService.getMonthlyCostM20();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setMonthlyCostM20 method, of class InternetService.
     */
    @Test
    public void testSetMonthlyCostM20() {
        System.out.println("Test setMonthlyCostM20");
        InternetService.setMonthlyCostM20(20);
        float aMonthlyCostM20 = 20.0F;
        InternetService.setMonthlyCostM20(aMonthlyCostM20);
    }

    /**
     * Test of getMonthlyCostM100 method, of class InternetService.
     */
    @Test
    public void testGetMonthlyCostM100() {
        System.out.println("Test getMonthlyCostM100");
        InternetService.setMonthlyCostM100(100);
        float expResult = 100.0F;
        float result = InternetService.getMonthlyCostM100();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setMonthlyCostM100 method, of class InternetService.
     */
    @Test
    public void testSetMonthlyCostM100() {
        System.out.println("Test setMonthlyCostM100");
        InternetService.setMonthlyCostM100(100);
        float aMonthlyCostM100 = 100.0F;
        InternetService.setMonthlyCostM100(aMonthlyCostM100);
    }

    /**
     * Test of getInternetSpeed method, of class InternetService.
     */
    @Test
    public void testGetInternetSpeed() {
        System.out.println("Test getInternetSpeed");
        InternetService instance = new InternetService("joana@gmail.com",InternetService.internetOptions.M100);
        InternetService.internetOptions expResult = InternetService.internetOptions.M100;
        InternetService.internetOptions result = instance.getInternetSpeed();
        assertEquals(expResult, result);
    }

    /**
     * Test of setInternetSpeed method, of class InternetService.
     */
    @Test
    public void testSetInternetSpeed() {
        System.out.println("Test setInternetSpeed");
        InternetService.internetOptions internetSpeed = InternetService.internetOptions.M100;
        InternetService instance = new InternetService("joao@sapo.pt",internetSpeed);
        instance.setInternetSpeed(internetSpeed);
        assertEquals(internetSpeed, instance.getInternetSpeed());
    }

    /**
     * Test of getIdAccount method, of class InternetService.
     */
    @Test
    public void testGetIdAccount() {
        System.out.println("Test getIdAccount");
        InternetService instance = new InternetService("0123A", InternetService.internetOptions.M20);
        String expResult = "0123A";
        String result = instance.getIdAccount();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdAccount method, of class InternetService.
     */
    @Test
    public void testSetIdAccount() {
        System.out.println("Test setIdAccount");
        String idAccount = "012A";
        InternetService instance = new InternetService("0123A", InternetService.internetOptions.M20);
        instance.setIdAccount(idAccount);
        assertEquals(idAccount, instance.getIdAccount());
    }

    /**
     * Test of calculateServicePayment method, of class InternetService.
     */
    @Test
    public void testCalculateServicePayment() {
        System.out.println("Test calculateServicePayment");
        InternetService.setMonthlyCostM20(20.0F);
        InternetService instance = new InternetService("0123A", InternetService.internetOptions.M20);
        float expResult = 20.0F;
        float result = instance.calculateServicePayment();
        assertEquals(expResult, result, 0.0);
    }
}