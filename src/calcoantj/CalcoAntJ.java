/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcoantj;

/**
 *
 * @author victo
 */
public class CalcoAntJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
    
    public int add(int a, int b) {
        return a+b;
    }
    
    public int minus(int a, int b) {
        return a-b;
    }
    
    public int multiply(int a, int b) {
        return a*b;
    }
    
    public float divide(int a, int b) throws Exception {
        if (b == 0) {
            throw new DivideByZeroException("Impossible de diviser par zéro");
        }
        Float bFloat = Float.valueOf(b);
        return a / bFloat;
    }
}
