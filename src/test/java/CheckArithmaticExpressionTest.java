/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sathiya.checkarithmaticexpression.CheckArithmaticExpression;
import com.sathiya.checkarithmaticexpression.CheckArithmaticExpressionImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author smdgandhi
 */
public class CheckArithmaticExpressionTest {
    
    public CheckArithmaticExpressionTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void chkArithmaticExpTest() {
         
//         CheckArithmaticExpression chkArthExp = new CheckArithmaticExpressionImpl();
         CheckArithmaticExpression chkArthExp = new CheckArithmaticExpressionImpl();
         assertTrue(chkArthExp.chkArithmaticExp(""));
//       assertTrue(chkArthExp.chkArithmaticExp("1+2"));
//       assertTrue(chkArthExp.chkArithmaticExp("1 - 2"));
//       assertTrue(chkArthExp.chkArithmaticExp("(1 - 2)"));
         assertTrue(chkArthExp.chkArithmaticExp("(1 - 2) *"));
         assertTrue(chkArthExp.chkArithmaticExp("(1 + 38) * 4-5"));
         assertTrue(chkArthExp.chkArithmaticExp("7 * 6/2 + 8"));
         assertFalse(chkArthExp.chkArithmaticExp("-12) 1 // ("));
         
         
     }
}
