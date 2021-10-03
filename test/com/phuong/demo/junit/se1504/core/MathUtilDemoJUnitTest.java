/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phuong.demo.junit.se1504.core;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;



/**
 *
 * @author DELL
 */
public class MathUtilDemoJUnitTest {
    
    private MathUtilDemo fixture;
    
    @Before
    public void setup(){
        fixture = new MathUtilDemo();
        System.out.println("This is set up of MathUtilDemoJunitTest");
    }
    
    @After
    public void teardown(){
        fixture = null;
        System.out.println("This is tear down of MathUtilDemoJunitTest");
    }
    
    @Test
    public void checkAdditionReturnsWell(){
        assertEquals(5, fixture.add(2, 3));
    }
    
    @Test
    public void checkSubReturnsWell(){
        assertEquals(-1, fixture.sub(1, 2));
    }
}
