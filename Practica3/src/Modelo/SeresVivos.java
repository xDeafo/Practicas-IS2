/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Random;

/**
 *
 * @author Ventura
 */
public abstract class SeresVivos implements Comparable<SeresVivos>{
    
    public abstract boolean Reproducirse();
    
    @Override
    public int compareTo(SeresVivos o){
        if(o instanceof PezPequeño){
            return -1;
        }
        if(o instanceof GranDepredador){
            return 1;
        }
        return 0;
    }
}
