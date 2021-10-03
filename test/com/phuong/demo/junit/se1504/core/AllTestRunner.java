/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phuong.demo.junit.se1504.core;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
* @author SE150998 - Phượng
 */
public class AllTestRunner {
    
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(AllTest.class);
        
        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println("All Test Case are: " + result.wasSuccessful());
    }
    
}
