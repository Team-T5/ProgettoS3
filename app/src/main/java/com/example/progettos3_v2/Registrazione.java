package com.example.progettos3_v2;

import android.os.Bundle;

import java.lang.String;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registrazione extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrazione);
    }

    public void Registrati(View view){

        //Prelevo i dati dall'interfaccia
        EditText editUsername, editPassword, editConfermaPassword;
        String strUsername, strPassword, strConfermaPassword;

        editUsername = findViewById(R.id.editUsername);
        editPassword = findViewById(R.id.editPassword);
        editConfermaPassword = findViewById(R.id.editConfermaPassword);

        strUsername = editUsername.getText().toString();
        strPassword = editPassword.getText().toString();
        strConfermaPassword = editConfermaPassword.toString();

        //Mi assicuro che tutti i dati siano stati inseriti
        if(strUsername.isEmpty()){
            String toastMessage = getString(R.string.insertUsername);
            Toast toast = Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_LONG);
            toast.show();
        } else{
            if(strPassword.isEmpty()){
                String toastMessage = getString(R.string.insertPassword);
                Toast toast = Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_LONG);
                toast.show();
            }
            else{
                if(strConfermaPassword.isEmpty()){
                    String toastMessage = getString(R.string.insertConfirmPassword);
                    Toast toast = Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_LONG);
                    toast.show();
                }
                else{
                    //Tutti i campi sono inseriti e procedo con l'elaborazione

                    //I campi relativi all password e alla sua conferma devono essere uguali
                    if(!strPassword.equals(strConfermaPassword)){
                        String toastMessage = getString(R.string.differentPasswordInputs);
                        Toast toast = Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_LONG);
                        toast.show();
                    }
                    //Le password coincidono, quindi posso fare la query per l'iserimento

                    /*
                    Tenere a mente che l'Username può essere già presente nel database, quindi
                    bisogna prevedere un messaggio di errore apposito
                     */

                    /*
                    Inserire la query qui
                     */
                }
            }
        }

    }



}
