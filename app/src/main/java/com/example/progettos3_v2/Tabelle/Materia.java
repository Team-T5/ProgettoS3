package com.example.progettos3_v2.Tabelle;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Materia extends RealmObject {

    @PrimaryKey
    @Required
    int ID;

    @Required
    String Nome;

    //Metodo costruttore
    public void Materia(int id, String nome){
        this.ID = id;
        this.Nome = nome;
    }

    //Getters
    public int getID() {
        return ID;
    }

    public String getNome() {
        return Nome;
    }
}
