/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

import java.util.Random;

/**
 *
 * @author Ventura
 */
public class Utilidades {
     public static int CalculaRandom(int min, int max){
        Random rdn = new Random();
        return rdn.nextInt(max - min + 1) + min;
    }
     
     public static long CalculaRandomLong(long min, long max){
        Random rdn = new Random();
        return rdn.nextLong() * (max - min + 1) + min;
    }
}


