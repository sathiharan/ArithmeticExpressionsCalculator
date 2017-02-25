/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sathiya.checkarithmaticexpression;

import com.sathiya.checkarithmaticexpression.CheckArithmaticExpression;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author smdgandhi
 */
public class CheckArithmaticExpressionImpl implements CheckArithmaticExpression{

    @Override
    public boolean chkArithmaticExp(String aritExpression) {
        String regexDigit = "\\d*";
//        String regexWhiteSpace = "\\s*";
        String regexOperators = "[-+/\\*]*";
        String regexWithOutExp = regexDigit+regexOperators+regexDigit;
        String regexWithExp = "[(]*" +  regexWithOutExp +"[)]*";
        
        Pattern pat = Pattern.compile(regexWithExp+regexOperators+regexWithExp);
        Matcher match = pat.matcher(aritExpression.replaceAll(" ", ""));
        return match.matches();
    }
}
