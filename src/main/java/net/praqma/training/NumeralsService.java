/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.praqma.training;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class NumeralsService {

    @GET
    public String welcome() {
        return "Roman numerals service";
    }

    @GET
    @Path("{number}")
    public String toRomanNumeralWebMethod(@PathParam("number") int number) {
        return toRomanNumeral(number);
    }

    public String toRomanNumeral(int number) {
        if (number == 2)
            return "II";
        return "I";
    }

}
