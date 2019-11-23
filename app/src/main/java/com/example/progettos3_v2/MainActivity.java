package com.example.progettos3_v2;

import androidx.appcompat.app.AppCompatActivity;
import io.realm.Realm;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(){
        Realm realm = Realm.getDefaultInstance();
        try{
            //Prelevo i valori delle caselle di testo e della checkbox
            EditText editUsername, editPassword;
            CheckBox checkRicordami;

            String strUsername, strPassword;
            Boolean Ricordami;

            editUsername = findViewById(R.id.editUsername);
            editPassword = findViewById(R.id.editPassword);
            checkRicordami = findViewById(R.id.checkRicordami);

            strUsername = editUsername.getText();
            strPassword = editPassword.getText();
            if(checkRicordami.isChecked()){
                Ricordami = true;
            }
            else{
                Ricordami = false;
            }

            /*
            Inserire la query qui
             */


            /*
            Se la query ha avuto successo e la checkbox è stata spuntata bisogna inserire i dati in una sessione
             */

            /*
            Passare alla schermata principale dell'app
             */

        } catch( Error e){
            e.getMessage();
        }
        finally{
            realm.close();
        }
    }
}
