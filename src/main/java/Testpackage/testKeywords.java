/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testpackage;

/**
 *
 * @author TAMILARASI
 */
public class testKeywords {

    public String[] Keywords;

    /**
     *
     */
    String countKeywords;
    public testKeywords() {
        this.Keywords = new String[]{"abstract", "assert", "boolean", "break", "byte", "case", 
            "catch", "char", "class", "continue", "default","do", "double", "else", "enum", "extends",
            "final", "finally", "float", "for", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", 
            "new", "package", "private", "protected", "public", "return", "short", "static", 
            "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", 
            "void", "volatile", "while", "true", "null", "false", "const", "goto"};
    }
    
     public void countKeywords(){
        for (String Keyword : Keywords) {
            int count[] = new int[Keywords.length];
        }
     
     for (int x = 0; x < Keywords.length; x++) {
                        if (readLine.contains(Keywords[x])) {
                            int[] count = null;
                            count[x] = count[x] + 1;
}
     }
     }
}
                    

    

