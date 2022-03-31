package com.example.myapplicationkootlin

class Clase1 {

    //Metodo de Ordenamiento: "Burbuja".
    fun ordenamientoBurbuja(arreglo: Array<Int>) {
        var aux:Int = 0;
        for(i in 0..arreglo.size-1){
            for(j in 0..arreglo.size-2){
                if (arreglo[j+1] < arreglo[j]) {
                    aux = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
    }

    //Metodo para Imprimir los Valores de la Matriz
    fun imprimirValores(arreglo: Array<Int>): String {
        var guardar:String = "";
        for(i in 0..arreglo.size-1){
            guardar += "[" + arreglo[i] + "] ";
        }
        return guardar;
    }
}