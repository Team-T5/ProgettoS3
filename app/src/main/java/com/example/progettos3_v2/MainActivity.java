package com.example.progettos3_v2;

import androidx.appcompat.app.AppCompatActivity;
import io.realm.Realm;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Realm realm = Realm.getDefaultInstance();
        try{
            //Inserire il codice qui

        } catch( Error e){
            e.getMessage();
        }
        finally{
            realm.close();
        }
    }
}
