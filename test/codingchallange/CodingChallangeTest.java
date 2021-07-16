/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingchallange;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodingChallangeTest {
    
    @org.junit.Test
    public void testReadFiles() {
                
        String file = "C:\\Users\\Zeeshan Mirza\\Documents\\NetBeansProjects\\codingChallange\\src\\codingchallange\\InputData.txt";
        int[] expResult =CodingChallange.readFiles(file);
        int[] result = CodingChallange.readFiles(file);
        assertArrayEquals(expResult, result);
        
    }  
    @Test
    public void testSum() {
        
        int a[]=new int[]{9441,1791};
        CodingChallange.Sum(a);
       assertEquals(3740,CodingChallange.Sum(a));   
    }
    
}
