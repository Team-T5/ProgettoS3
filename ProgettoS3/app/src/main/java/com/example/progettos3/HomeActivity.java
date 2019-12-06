package com.example.progettos3;

import android.content.Intent;
import android.os.Bundle;

import com.example.progettos3.ui.login.LoginActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.MenuItem;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent i = getIntent();
        String UserName = i.getStringExtra("username");
        TextView txtUserName = this.findViewById(R.id.txtUsername);
        //txtUserName.setText(UserName);
        txtUserName.setText("Antonio");
        Button btnRicercaEsercizi = this.findViewById(R.id.btnRicercaEsercizi);
        Button btnInserimentoEsercizi = this.findViewById(R.id.btnInserimentoEsercizi);
        Button btnLogout = this.findViewById(R.id.btnLogout);
        btnRicercaEsercizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iRicercaEsercizi = new Intent(v.getContext(),RicercaEsercizi.class);
                startActivity(iRicercaEsercizi);
            }
        });

        btnInserimentoEsercizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iCronometroEsercizio = new Intent(v.getContext(),CronometroEsercizioActivity.class);
                startActivity(iCronometroEsercizio);
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLogin = new Intent(v.getContext(), LoginActivity.class);
                startActivity(iLogin);
            }
        });
        /*getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Home");
        getSupportActionBar().setSubtitle("Progetto S3");*/
        /*FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    /*public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }*/

}
