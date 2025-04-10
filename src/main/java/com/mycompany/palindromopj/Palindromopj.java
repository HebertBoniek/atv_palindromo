/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromopj;

import java.util.Locale;
import java.text.Normalizer;
/**
 *
 * @author aluno
 */
public class Palindromopj {
    public static boolean validaPalindromo(String s) { //método pra validar palindromo
    s = Normalizer.normalize(s, Normalizer.Form.NFD); //normalizar
    s = s.replaceAll("[^a-zA-z0-9]", "").toLowerCase(); //transforma em minusculo e ignora pontuações e caracteres especiais
    for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
           if (s.charAt(i) != s.charAt(j)) {
               return false;
           }
       }
       return true;
    }
    
    public static void main(String[] args) {
       String s1 = "ovo";
       String s2 = "carro";
       boolean b1 = validaPalindromo(s1);
       boolean b2 = validaPalindromo(s2);
       System.out.println(s1 + " e um palindromo? " + b1);
       System.out.println(s2 + " e um palindromo? " + b2);
    }
}