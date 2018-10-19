package com.qa.InfiniteTerrainSystem;

import java.util.Scanner;

public class InfiniteTerrainSystem {
public InfiniteTerrainSystem () {
	

	Scanner sc = new Scanner(System.in);
	int horizontalMove = sc.nextInt();
	

	Scanner CC = new Scanner(System.in);
	int verticalMove = sc.nextInt();
	
	

	
	if ( horizontalMove ==2  &&   verticalMove == 3) {
		System.out.println("You found the treasue, Now you are rich!");
		
	}
	else {
		System.out.println(" you Died, sorry");
	}
		
	
	
	   
	
		
		
}
	
	
}