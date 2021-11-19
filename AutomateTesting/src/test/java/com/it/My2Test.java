package com.it;

import org.junit.*;

public class My2Test {
    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("AfterClass");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("@Before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("@After");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test
    public void test3(){
        System.out.println("test3");
    }
}
