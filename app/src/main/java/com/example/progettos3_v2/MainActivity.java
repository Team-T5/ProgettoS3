package com.example.progettos3_v2;

import androidx.appcompat.app.AppCompatActivity;
import io.realm.Realm;
import java.lang.String;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View view){
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

            strUsername = editUsername.getText().toString();
            strPassword = editPassword.getText().toString();
            if(checkRicordami.isChecked()){
                Ricordami = true;
            }
            else{
                Ricordami = false;
            }

            //Mi assicuro che i campi siano inseriti
            if(strUsername.isEmpty()){
                String toastMessage = getString(R.string.insertUsername);
                Toast toast = Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_LONG);
                toast.show();
            }
            else{
                if(strPassword.isEmpty()){
                    String toastMessage = getString(R.string.insertPassword);
                    Toast toast = Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_LONG);
                    toast.show();
                }
                else{
                    /*
                    Inserire la query qui
                     */


                    /*
                    Se la query ha avuto successo e la checkbox è stata spuntata bisogna inserire i dati in una sessione
                     */

                    /*
                    Passare alla schermata principale dell'app
                     */
                }
            }


        } catch( Error e){
            e.getMessage();
        }
        finally{
            realm.close();
        }
    }

    public void gotoRegistrati(View view){
        //Funzione per andare alla finestra di registrazione
        Intent intent = new Intent(this, Registrazione.class);
        startActivity(intent);
    }
}
