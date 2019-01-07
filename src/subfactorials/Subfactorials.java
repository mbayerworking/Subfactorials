/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subfactorials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author morgan
 */
public class Subfactorials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Subfactorial n: ");
        long input = Integer.parseInt(br.readLine());
        
        findSubfactorial(input);
        
        System.out.println(findSubfactorial(input));
    }

    private static long findSubfactorial(long input) {
        long sF = input;
        
        if (sF == 0)
        {
            return 1;
        }
        if (sF == 1)
        {
            return 0;
        }
        else{
            return (long)(sF-1)*(findSubfactorial(sF-1)+findSubfactorial(sF-2));
        }
        
    }
}
