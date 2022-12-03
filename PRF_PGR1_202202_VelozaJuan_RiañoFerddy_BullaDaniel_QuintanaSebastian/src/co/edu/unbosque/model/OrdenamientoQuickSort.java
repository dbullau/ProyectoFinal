package co.edu.unbosque.model;

import java.util.ArrayList;

public class OrdenamientoQuickSort {
	
	public ArrayList<BosTinderDTO> quicksort(ArrayList<BosTinderDTO>btdto, int izq, int der) {
		ArrayList<BosTinderDTO> pivote = btdto; //se toma el primer elemento con el pivote
		int i = izq; // i hace la busqueda de izquierda a derecha
		int j = der; // j hace la busqueda de derecha a izquierda
		int aux; 
		while(i<j) { //mientras no se crucen las busquedas
			while(ArrayList<btdto>>=pivote && i < j) {
				i++; //busca algun elemento mayor que pivote
			}
			while(ArrayList<btdto> < pivote) {
				j--; //busca algun elemento menor que pivote
			}
			if(i < j) { //si no se cruzan
				aux = this.btdto[i]; //se intercambia
				this.btdto[i] = this.btdto[j];
				this.btdto[j] = aux;
			}
		}
		this.btdto[izq] = this.btdto[j]; // se coloca el pivote en su lugar de forma que vamos a tener
		this.btdto[j] = pivote; // los menores a la izquierda y los mayores a la derecha
		
		if(izq<j-1) {
			quicksort(btdto,izq,j-1);//ordenamos subarray izquierdo
		}
		if(j+1<der) {
			quicksort(btdto,j+1,der);//ordenamos el subarray derecho
		}
		return btdto;
		}
}
