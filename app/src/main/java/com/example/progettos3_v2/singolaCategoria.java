package com.example.progettos3_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class singolaCategoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singola_categoria);

        /*
        La query di prelievo delle materie deve essere all'interno dell' onCreate perché quando
        la schermata si apre i dati devono essere già disponibili.

        La selezione di una voce dell'elenco che non sia vuota è un evento che causa la comparsa
        degli elementi della categoria.

        Selezionata anche la categoria compare il pulsante.

        Pseudo codice:
        Materia.onChanege(){
                Se materia == null  //L'utente potrebe selezionare di nuovo null
                        Imposta categoria e pulsante invisibili e non cliccabili
                Altrimenti
                        Esegui la query per prelevare le categorie correlate alla materia
                        e stampa lo spinner delle cagegorie

        Fare lo stesso ragionamento con le voci di Categoria e con il pulsante
         */
    }
}
