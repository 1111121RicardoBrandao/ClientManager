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
public class PhoneServiceTest {
    
    public PhoneServiceTest() {
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
     * Test of getIdOperator method, of class PhoneService.
     */
    @Test
    public void testGetIdOperator() {
        System.out.println("Test getIdOperator");
        PhoneService instance = new PhoneService("PT", 123123123);
        String expResult = "PT";
        String result = instance.getIdOperator();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdOperator method, of class PhoneService.
     */
    @Test
    public void testSetIdOperator() {
        System.out.println("Test setIdOperator");
        String idOperator = "OPTIMUS";
        PhoneService instance = new PhoneService("PT", 123123123);
        instance.setIdOperator(idOperator);
        assertEquals(idOperator, instance.getIdOperator());
    }

    /**
     * Test of getPhoneNumber method, of class PhoneService.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("Test getPhoneNumber");
        PhoneService instance = new PhoneService("PT", 123123123);
        int expResult = 123123123;
        int result = instance.getPhoneNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhoneNumber method, of class PhoneService.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("Test setPhoneNumber");
        int phoneNumber = 123456789;
        PhoneService instance = new PhoneService("PT", 123123123);
        instance.setPhoneNumber(phoneNumber);
        assertEquals(phoneNumber, instance.getPhoneNumber());
    }

    /**
     * Test of getMonthlyCostPhoneService method, of class PhoneService.
     */
    @Test
    public void testGetMonthlyCostPhoneService() {
        System.out.println("Test getMonthlyCostPhoneService");
        PhoneService.setMonthlyCostPhoneService(100);
        PhoneService instance = new PhoneService("PT", 123123123);
        float expResult = 100.0F;
        float result = instance.getMonthlyCostPhoneService();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setMonthlyCostPhoneService method, of class PhoneService.
     */
    @Test
    public void testSetMonthlyCostPhoneService() {
        System.out.println("Test setMonthlyCostPhoneService");
        float aMonthlyCost = 100.0F;
        PhoneService.setMonthlyCostPhoneService(aMonthlyCost);
        PhoneService instance = new PhoneService("PT", 123123123);
        float result = instance.getMonthlyCostPhoneService();
        assertEquals(aMonthlyCost, result, 0.0);
    }

    /**
     * Test of calculateServicePayment method, of class PhoneService.
     */
    @Test
    public void testCalculateServicePayment() {
        System.out.println("Test calculateServicePayment");
        PhoneService.setMonthlyCostPhoneService(100);
        PhoneService instance = new PhoneService("PT", 123123123);
        float expResult = 100.0F;
        float result = instance.calculateServicePayment();
        assertEquals(expResult, result, 0.0);
    }
}