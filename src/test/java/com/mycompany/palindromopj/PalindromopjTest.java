package com.mycompany.palindromopj;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author aluno
 */
public class PalindromopjTest {

    public PalindromopjTest() {
    }
    
    @Test
    public void testValidaPalindromoComPalavraSimples() {
        assertTrue(Palindromopj.validaPalindromo("ovo"));
        assertTrue(Palindromopj.validaPalindromo("radar"));
        assertTrue(Palindromopj.validaPalindromo("arenera"));
    }

    @Test
    public void testValidaPalindromoComFrase() {
        assertTrue(Palindromopj.validaPalindromo("Ame a ema"));
        assertTrue(Palindromopj.validaPalindromo("Socorram-me subi no ônibus em Marrocos"));
        assertTrue(Palindromopj.validaPalindromo("Anita lava a tina"));
    }

    @Test
    public void testValidaPalindromoComEspacosEMaiusculas() {
        assertTrue(Palindromopj.validaPalindromo("Ame a ema"));
        assertTrue(Palindromopj.validaPalindromo("Socorram-me subi no ônibus em Marrocos"));
    }

    @Test
    public void testValidaPalindromoComNumeros() {
        assertTrue(Palindromopj.validaPalindromo("12321"));
        assertFalse(Palindromopj.validaPalindromo("12345"));
    }

    @Test
    public void testValidaPalindromoComPalavraNaoPalindroma() {
        assertFalse(Palindromopj.validaPalindromo("teste"));
        assertFalse(Palindromopj.validaPalindromo("java"));
    }

    @Test
    public void testValidaPalindromoComStringVazia() {
        assertTrue(Palindromopj.validaPalindromo(""));
    }

    @Test
    public void testValidaPalindromoComEspacos() {
        assertTrue(Palindromopj.validaPalindromo("    "));
    }

    @Test
    public void testValidaPalindromoComCaracteresEspeciais() {
        assertTrue(Palindromopj.validaPalindromo("A@ma@"));
        assertFalse(Palindromopj.validaPalindromo("Ex@mpl@"));
    }
}