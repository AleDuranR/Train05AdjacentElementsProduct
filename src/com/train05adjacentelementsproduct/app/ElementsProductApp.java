package com.train05adjacentelementsproduct.app;

public class ElementsProductApp {

	public static void main(String[] args) {
		/*
		 * Given an array of integers, find the pair of adjacent 
		 * elements that has the largest product and return that 
		 * product.
		 */
		// Array declaration
		int[] myArray = new int[] {3, 6, -2, -5, 7, 3};
		// print array
        System.out.print(adjacentElementsProduct(myArray));
	}
	// Method to find 'adjacentElementsProduct'
	public static int adjacentElementsProduct(int[] inputArray) {
		int bigProduct = -1000;
		// Transverse though the array
	    for(int i = 0; i < inputArray.length - 1; i++){
	    	// Make the product
	        int testProduct = inputArray[i] * inputArray[i+1];
	        // find the if is the biggest
	        if(testProduct > bigProduct){
	        	// save it
	            bigProduct = testProduct;
	        }
	    }
	    return bigProduct;
	}
}
