package collectionFramework;

import java.util.Random;
import java.util.Scanner;

public class UseOfArray7b {
	/*
	 * Author: Tofael
	 */
	public static void main(String[] args) {

        int [] a = new int[5];

        Random random = new Random();  //class
      
        for(int i=0; i<a.length; i++) {
            a[i] = random.nextInt(100); //if has boundary
            System.out.println(a[i]);
        }

    }

}
