package cl.talentodigital.ejerciciolistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnIrALista;
    private Button btnIrALogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIrALista = findViewById(R.id.btnIrALista);
        btnIrALogin = findViewById(R.id.btnIrALogin);

        btnIrALista.setOnClickListener((View v) -> goToLista());
        btnIrALogin.setOnClickListener((View v) -> goToLogin());
    }

    private void goToLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    private void goToLista() {
        Intent intent = new Intent(this, ListEjemploActivity.class);
        startActivity(intent);
    }
}