/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.expensemanager.model;

import java.math.BigDecimal;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class Expense {

    private BigDecimal amount;
    private String description;
    
    public Expense(BigDecimal amount, String description) {
        if (description == null || amount == null ||
                description.trim().length() <= 0 ||
                amount.signum() == 0 || amount.signum() == -1) {
            throw new IllegalArgumentException();
        }
        
        this.amount = amount;
        this.description = description;
    }
    
}
