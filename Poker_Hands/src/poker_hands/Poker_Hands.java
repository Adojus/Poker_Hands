/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker_hands;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.*;
import java.io.BufferedWriter;
import javax.swing.*;
import java.awt.*;
import java.io.InputStreamReader;
import java.util.Collections;


/**
 *
 * @author Justis
 */
public class Poker_Hands {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DeckOfCards deck = new DeckOfCards();
        String[] deckArray = deck.generateDeck();
        
        for(int i=0;i<deckArray.length;i++){
            System.out.print(deckArray[i]+" ");
            if(i%13==0 && i!=0){
                System.out.print("\n");
            }
        }
        System.out.println("\nsize: "+deckArray.length);
        
        
    }
    
}
