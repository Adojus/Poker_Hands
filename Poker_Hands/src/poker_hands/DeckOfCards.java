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
import java.util.Random;
/**
 *
 * @author Justis
 * Class for the deck of cards
 */
public class DeckOfCards {
    //Initials of symbols spades,diamonds,hearts,clubs
    private char[] cardSymbols = {'S','D','H','C'};
    //Number of cards in the deck
    private int cardCount = 52;
    //All card values
    private String[] cardValues = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    
    private String[] deck;
    
    public DeckOfCards(){}
    
    //generates a card deck
    public String[] generateDeck(){
        
        //String[] 
                deck = new String[cardCount];
        int count = -1;
        
        for( char symbol : cardSymbols ){
            for( String value : cardValues ){
                deck[++count] = symbol+value;
            }
        }     
        shuffleCardDeck();

        return deck;
    }
    
    private String[] shuffleCardDeck(){
        
        Random random = new Random();
        
        for(int i = 0; i < deck.length; i++){
            int indexToSwap = random.nextInt(deck.length);
            String temp = deck[indexToSwap];
            deck[indexToSwap]=deck[i];
            deck[i]=temp;
        }
        
        return deck;
    }
    
    
}
