package com.example.progettos3_v2;

//Importazione delle librerie relative ad Android
import android.app.Application;

//Importazione delle librerie relative a Realm
import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MyApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();

        //Inizializazione in questo (this) contesto
        Realm.init(this);

        //Prelevo la configurazione attuale
        RealmConfiguration configuration = new RealmConfiguration.Builder().build();

        //Imposto la configurazione attuale come configurazione di default
        Realm.setDefaultConfiguration(configuration);
    }
}
