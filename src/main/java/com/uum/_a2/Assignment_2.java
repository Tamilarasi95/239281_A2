/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a2;

import static assignment_2.Assignment_2.LineOfCount;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author TAMILARASI
 */
public class Assignment_2 {
    
        public static int LineCount, BlankCount, CommentCount =0;
        public static int actual;
        
    /**
     *
     * @return
     */
    public static int LineOfCount() throws FileNotFoundException {
        try {
            String directory = null;
            InputStream is = new FileInputStream(directory);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            string line=null;

            while (br.readLine() != null) {
                LineCount++;
                
       } catch (IOException e) {
        System.out.println("LOC = " + LineOfCount);
        }
            }
        return LineCount;
        
    }
   
        
         public static int BlankCount() {
        try {
            String directory = null;
           InputStream is = new FileInputStream(directory);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            string line=null;

           while (br.readLine() != null) {
                if (readLIne.trim().length() == 0) {
                    BlankCount++;
                }
            }
        } catch (IOException e) {
           System.out.println("Blank = " + BlankCount); 
        }
        return BlankCount;
    }
         
          public static int CommentCount() {
        try {
            String directory;
            InputStream is = new FileInputStream(directory);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            string line=null;

           while (br.readLine() != null) {
                if (readLine.contains("//")) {
                    CommentCount++;
                }
            }
        } catch (IOException e) {
           System.out.println("Comment = " + CommentCount);
        }
        return CommentCount;
    }
          
        public static int actualLOC() {
        int LineOfCount = 0;
        actual = (LineOfCount - (BlankCount + CommentCount));
        System.out.println("Actual LOC = " + actual);
        return actual;
    }
    }
    


