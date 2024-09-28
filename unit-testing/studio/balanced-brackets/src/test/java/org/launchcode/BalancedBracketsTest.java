package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {assertEquals(true, true);
    }
    // 1. Test only balanced brackets
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    // 2. Test string with no brackets at all
    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    // 3. Test balanced brackets with text inside
    @Test
    public void bracketsWithTextInsideReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    // 4. Test balanced brackets with text outside
    @Test
    public void textOutsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    // 5. Test nested balanced brackets
    @Test
    public void nestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    // 6. Test unbalanced with only opening bracket
    @Test
    public void onlyOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    // 7. Test unbalanced with only closing bracket
    @Test
    public void onlyClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    // 8. Test with closing bracket before opening
    @Test
    public void closingBeforeOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    // 9. Test unbalanced brackets with text inside
    @Test
    public void unbalancedBracketsWithTextInsideReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    // 10. Test unbalanced with extra closing bracket
    @Test
    public void extraClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    // 11. Test unbalanced with extra opening bracket
    @Test
    public void extraOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    // 12. Test string with balanced brackets and special characters
    @Test
    public void balancedBracketsWithSpecialCharactersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[{Launch}@#$%^&*()]"));
    }
}

