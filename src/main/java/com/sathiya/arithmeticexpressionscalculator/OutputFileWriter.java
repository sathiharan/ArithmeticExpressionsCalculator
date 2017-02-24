/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sathiya.arithmeticexpressionscalculator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author smdgandhi
 */
public class OutputFileWriter{
        
    /**
     *
     * @param lineList
     * @throws IOException
     */
    protected static void write(List<String> lineList) throws IOException{
        final String pathOutputFile = 
                "D:\\workspace\\Interview\\ArithmeticExpressionsCalculator\\ArthieticExpOutput.txt";        
        Files.write(Paths.get(pathOutputFile),lineList);        
    }    
}
