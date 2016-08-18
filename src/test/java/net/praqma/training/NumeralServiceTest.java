/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.praqma.training;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

/**
 *
 * @author Mads
 */
public class NumeralServiceTest {

    NumeralsService service = new NumeralsService();

    @Test
    public void testToRomanNumeralsWebMethod() {
        assertThat(service.toRomanNumeralWebMethod(2), is("II"));
        assertThat(service.toRomanNumeralWebMethod(1), is("I"));
    }

}
