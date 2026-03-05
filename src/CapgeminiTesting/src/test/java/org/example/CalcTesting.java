package org.example;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcTesting {
//    @Test
//    void addTest(){
//        Calc calc = new Calc();
//        int result = calc.add(10,20);
//       // Assertions. assertEquals(30,result);
//        assertEquals(30,result);
//    }
//    @ParameterizedTest
//     @CsvSource(
//             {
//                     "10, 20, 30",
//                     "'abc', 7, 12",
//                     "-10.5, '10.5', 0"
//             }
//     )
//    void addTest(int a, int b, int expected){
//        Calc calc = new Calc();
//        int result = calc.add(a,b);
//        assertEquals(expected,result);
//    }

//    void addTest(double a, double b, double expected){
//        Calc calc = new Calc();
//        double result = calc.add(a,b);
//        assertEquals(expected,result);
//    }

    @Test
    void addInvalidStringTest(){
        Calc calc = new Calc();
        assertThrows(IllegalArgumentException.class,
                ()-> calc.add("11","25"));
    }
}
