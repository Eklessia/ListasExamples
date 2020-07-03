package cl.talentodigital.ejerciciolistas;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListEjemploActivity extends AppCompatActivity {

    private RecyclerView rvJuegos;
    private JuegosAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ejemplo);
        rvJuegos = findViewById(R.id.rvJuegos);
        rvJuegos.setHasFixedSize(true);

        adapter = new JuegosAdapter(getFakeListJuegos());

        layoutManager = new LinearLayoutManager(this);

        rvJuegos.setAdapter(adapter);
        rvJuegos.setLayoutManager(layoutManager);
    }

    private ArrayList<Juegos> getFakeListJuegos() {
        ArrayList<Juegos> juegosFake = new ArrayList<>();
        juegosFake.add(getFakeJuego("Resident Evil 2"));
        juegosFake.add(getFakeJuego("Resident Evil 1"));
        juegosFake.add(getFakeJuego("Resident Evil 3"));
        juegosFake.add(getFakeJuego("Resident Evil 5"));
        juegosFake.add(getFakeJuego("Resident Evil 6"));
        juegosFake.add(getFakeJuego("Resident Evil 7"));
        juegosFake.add(getFakeJuego("Resident Evil 8"));
        juegosFake.add(getFakeJuego("Resident Evil 9"));
        juegosFake.add(getFakeJuego("Resident Evil dfsdf"));
        juegosFake.add(getFakeJuego("Resident Evil asdasd"));
        juegosFake.add(getFakeJuego("Resident Evil 2"));
        juegosFake.add(getFakeJuego("Resident Evil 2"));
        juegosFake.add(getFakeJuego("Resident Evil 2"));
        juegosFake.add(getFakeJuego("Resident Evil 2"));
        juegosFake.add(getFakeJuego("Resident Evil 2"));
        return juegosFake;
    }

    private Juegos getFakeJuego(String title) {
        return new Juegos(
                "http://juegos.jpg",
                title,
                "Esto es una descripción"
        );
    }
}
