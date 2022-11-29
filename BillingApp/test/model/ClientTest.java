package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    @Test
    public final void testClientFormatable() {
/* result
Eskimoo.bv
Mrs.Claus
North Pole Street 1
info@eskimoo.com
South Pole
*/

        // Arrange
        Client c1 = new Client("Eskimoo.bv", "Mrs.Claus", "North Pole Street 1", "info@eskimoo.com", "South Pole");

        //Act
        String theFormat = c1.format();

        //Assert
        assertEquals("Eskimoo.bv\nMrs.Claus\nNorth Pole Street 1\ninfo@eskimoo.com\nSouth Pole\n",theFormat);
    }


}