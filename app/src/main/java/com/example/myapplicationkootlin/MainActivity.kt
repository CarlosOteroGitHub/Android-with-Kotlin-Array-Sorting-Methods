package com.example.myapplicationkootlin

/*

Author: Ing. Carlos Otero Ramírez

 */

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() , View.OnClickListener {

    var objeto = Clase1();
    var arreglo: Array<Int> = arrayOf(23, 9, 129, 6);

    var button1:Button ?= null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.setTitle("Metodos de Ordenamiento");

        button1 = findViewById(R.id.AM1_id1);
        button1!!.setOnClickListener(this);

        dialogoAlerta(null, "Elementos del arreglo al Principio: " + objeto.imprimirValores(arreglo));
        objeto.ordenamientoBurbuja(arreglo);
        dialogoAlerta(null, "Elementos del arreglo ordenados: " + objeto.imprimirValores(arreglo));
    }

    fun dialogoAlerta(view: View?, mensaje: String){
        val builder = AlertDialog.Builder(this);
        builder.setTitle("Mensaje Informativo!");
        builder.setMessage(mensaje);
        builder.show();
    }

    override fun onClick(v: View?){
        when(v?.id) {
            R.id.AM1_id1 ->
                System.exit(0);
        }
    }
}