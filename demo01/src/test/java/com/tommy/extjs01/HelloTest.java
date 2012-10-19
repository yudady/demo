package com.tommy.extjs01;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HelloTest {

	Hello hello;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("--setUpBeforeClass--------");

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("---tearDownAfterClass-------");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("---setUp-------");
		this.hello = new Hello();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("--tearDown--------");
	}

	@Test
	public void testSayHello() {
		System.out.println("--testSayHello--------");
		assertEquals("hello", hello.sayHello());
	}

}
