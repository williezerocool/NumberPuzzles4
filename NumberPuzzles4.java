/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberpuzzles4;

/**
 *
 * @author kendrabooker
 */
public class NumberPuzzles4 {

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) {
            
            for ( int a=1; a< 46; a++ ) {
              
                for ( int b=1; b < 46; b++ ) {
                
                    for ( int c=1; c< 46; c++ ) {
                    
                        for ( int d=1; d< 46; d++ ) {
                        
                            int sum = a + b + c + d;
                            int a2 = a + 2;
                            int b2 = b -2;
                            int c2 = c * 2;
                            int d2 = d / 2;
                            
                            if ( sum == 45 && a2 == b2 && b2 == c2 && c2 == d2 ) {
                                System.out.println( a + " " + b + " " + c + " " + d );
                            }
                        }
                        
                    }
                }
            }
        
    
        
        }
    }
    

