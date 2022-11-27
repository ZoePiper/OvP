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
        //assertEquals("Eskimoo.bv\n Mrs.Claus\n North Pole Street 1\n info@eskimoo.com\n South Pole\n",theFormat);
    }


}