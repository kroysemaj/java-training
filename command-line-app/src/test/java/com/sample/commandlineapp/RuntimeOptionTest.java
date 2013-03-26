package com.sample.commandlineapp;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RuntimeOptionTest {
	
	private RuntimeOption ro;
	
	@Test
	public void it_works_with_a_String() {
		ro = new RuntimeOption("string");
		assertEquals("string", ro.getValue());
	}
	
	@Test
	public void it_works_with_a_Boolean() {
		ro = new RuntimeOption(new Boolean(true));
		assertEquals(Boolean.TRUE, ro.getValue());
	}
	
	@Test
	public void it_works_with_a_List_of_File_objects() {
		ro = new RuntimeOption(new ArrayList<File>());
		assertEquals(ArrayList.class, ro.getValue().getClass());
	}

}
