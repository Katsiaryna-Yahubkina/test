package com.epam.automation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClientTest {

    private Client client;

    @Before
    public void createClient() {
         client = new Client("Tommi yang", "2");
    }

    @Test
    public void getIdTest()
    {
        assertEquals(client.getId(), "2");
    }

    @Test
    public void getFullNameTest()
    {
        assertEquals(client.getFullName(), "Tommi yang");
    }
}
