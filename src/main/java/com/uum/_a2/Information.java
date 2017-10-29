/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author TAMILARASI
 */
public class Information {
  
    public static string Semester;
    public static string  Course;
    public static string  Group;
    public static string  Task;
    public static int MatricNumber;
    String line;

    public Information() {
        this.line = null;
    }
    
         
         
         public void Info(File file) throws IOException {
         try {
            String directory = null;
           InputStream is = new FileInputStream(directory);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            string line=null;
    
        while (br.readLine() != null) {
        if (readLine.contains("//Semester: #")) {
            System.out.println("indexof(Semester) = " + indexof(Semester));
            System.out.println("Semester = " + Semester);
        }
        if (readLine.contains("//Course: #")) {
            System.out.println("indexof(Course) = " + indexof(Course));
            System.out.println("Course = " + Course);
        }
        if (readLine.contains("//Group: #")) {
            System.out.println("indexof(Group) = " + indexof(Group));
            System.out.println("Group = " + Group);
        }
        if (readLine.contains("//Task #")) {
            System.out.println("indexof(Task) = " + indexof(Task));
            System.out.println("Task = " + Task);
        }
        if (readLine.contains("//MatricNumber: #")) {
            System.out.println("indexof(MatricNumber) = " + indexof(MatricNumber));
            System.out.println("MatricNumber = " + MatricNumber);
        }
}

        catch (IOException e) {
                
           return Information;
        }
    }
    }

   
    }







