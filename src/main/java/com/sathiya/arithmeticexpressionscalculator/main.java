/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sathiya.arithmeticexpressionscalculator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author smdgandhi
 */
public class main {

    public static void main(String[] args) {

        InputFileReder inputFileReder = new InputFileReder();
        CalculateArithmaticExpression cae = new CalculateArithmaticExpression();
        List<String> lineList = new ArrayList();

        System.out.println("****************************************************");
        System.out.println("Arithmetic Expressions Calculator");
        System.out.println("****************************************************");
        try {
            lineList = inputFileReder.read();
            lineList.forEach(System.out::println);
            OutputFileWriter.write(lineList);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        cae.calculate();

    }

}
