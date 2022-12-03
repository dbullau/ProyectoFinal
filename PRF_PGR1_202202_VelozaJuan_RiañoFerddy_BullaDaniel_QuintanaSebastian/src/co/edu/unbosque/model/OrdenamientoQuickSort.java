package co.edu.unbosque.model;

import java.util.ArrayList;

public class OrdenamientoQuickSort {
	
	private int[]a = {1,3,2,4,5,7,6,9,8,15,13,14,12,16,11,10};
	
	public int[] quicksort(int a[], int izq, int der) {
		int pivote = a[izq]; //se toma el primer elemento con el pivote
		int i = izq; // i hace la busqueda de izquierda a derecha
		int j = der; // j hace la busqueda de derecha a izquierda
		int aux; 
		while(i<j) { //mientras no se crucen las busquedas
			while(a[i] >= pivote && i < j) {
				i++; //busca algun elemento mayor que pivote
			}
			while(a[j] < pivote) {
				j--; //busca algun elemento menor que pivote
			}
			if(i < j) { //si no se cruzan
				aux = a[i]; //se intercambia
				a[i] = a[j];
				a[j] = aux;
			}
		}
		a[izq] = a[j]; // se coloca el pivote en su lugar de forma que vamos a tener
		a[j] = pivote; // los menores a la izquierda y los mayores a la derecha
		
		if(izq<j-1) {
			quicksort(a,izq,j-1);//ordenamos subarray izquierdo
		}
		if(j+1<der) {
			quicksort(a,j+1,der);//ordenamos el subarray derecho
		}
		return a;
		}
}
