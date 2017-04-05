/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Federica
 */
public class Prova {
    
    public static void main(String[] s) {
        tipo <String> p1 = new tipo<String>(s[0]);
        tipo <Integer> p2 = new tipo<Integer>(10);
        String a = p1.getValue();
        System.out.println(a);
        Integer b = p2.getValue();
        System.out.println(b);
}
    
}
