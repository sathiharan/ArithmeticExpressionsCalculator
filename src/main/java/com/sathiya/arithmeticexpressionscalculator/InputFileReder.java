/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sathiya.arithmeticexpressionscalculator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author smdgandhi
 */
public class InputFileReder {

    List<String> lineList = new ArrayList();

    /**
     * This Method is used the read the line from the input file.
     *
     * @return Reading the input file lines as List String
     * @exception IOException On Reading file error.
     * @see IOException
     */
    protected List<String> read() throws IOException {        
        final String pathInputFile = "D:\\workspace\\Interview\\ArithmeticExpressionsCalculator\\ArthieticExp.txt";

        Stream<String> stm = Files.lines(Paths.get(pathInputFile));
        lineList = stm.collect(Collectors.toList());
        return lineList;
    }
}
