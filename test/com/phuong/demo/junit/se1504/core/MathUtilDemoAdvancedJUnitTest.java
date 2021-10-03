/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phuong.demo.junit.se1504.core;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SE150998 - Phượng
 */
public class MathUtilDemoAdvancedJUnitTest {
    
    private MathUtilDemoAdvanced advancedFixture;
    
    @Before
    public void setUp() {
        advancedFixture = new MathUtilDemoAdvanced();
        System.out.println("This is set up of MathUtilDemoAdvancedJunitTest");
    }
    
    @After
    public void tearDown() {
        advancedFixture = null;
        System.out.println("This is set up of MathUtilDemoAdvancedJunitTest");
    }
    
    @Test
    public void checkRectangleCirReturnsWell(){
        assertEquals(12, advancedFixture.RectangleCir(2, 4));
    }
    
    @Test
    public void checkRectangleAreaReturnsWell(){
        assertEquals(8, advancedFixture.RectangleArea(2, 4));
    }
    
    
    
}
