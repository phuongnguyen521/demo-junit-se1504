/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phuong.demo.junit.se1504.core;

import org.junit.runner.RunWith;
import org.junit.runners.AllTests;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 *
 * @author DELL
 */
@RunWith(Suite.class)
// test nhiều test case
// https://stackjava.com/junit/test-runner-va-test-suite-tao-bo-test-voi-junit.html
// https://www.youtube.com/watch?v=PyaXEvxXbrU&list=PLn9lhDYvf_3FtyXJj1sb_uziPkddMFlX3&index=5
@SuiteClasses({MathUtilDemoJUnitTest.class, MathUtilDemoAdvancedJUnitTest.class})
public class AllTest {
    
    //References:
    // https://howtodoinjava.com/junit/junit-parameterized-testcases-with-theory-and-datapoints/
    
    
    
    
}
