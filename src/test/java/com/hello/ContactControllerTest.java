package com.hello;


import org.junit.*;
import static org.junit.Assert.*;
/**
 * Created by alin- on 18.08.2017.
 */
public class ContactControllerTest {
    ContactController cl;
    @Before
    public void setUp() throws Exception {
       cl  = new ContactController();
    }

    @Test
    public void addDataToDB() throws Exception{
        cl.addDataToDB();

        assertEquals(10,cl.contactsToDB.size());
    }

}