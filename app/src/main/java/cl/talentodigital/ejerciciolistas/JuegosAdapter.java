package cl.talentodigital.ejerciciolistas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class JuegosAdapter extends RecyclerView.Adapter<JuegosAdapter.JuegosViewHolder> {

    private ArrayList<Juegos> listadoDeJuegos;

    public JuegosAdapter(ArrayList<Juegos> listadoDeJuegos) {
        this.listadoDeJuegos = listadoDeJuegos;
    }

    @NonNull
    @Override
    public JuegosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View juegosItemView = inflater.inflate(R.layout.item_juegos, parent, false);

        return new JuegosViewHolder(juegosItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull JuegosViewHolder holder, int position) {
        holder.bind(listadoDeJuegos.get(position));
    }

    @Override
    public int getItemCount() {
        return listadoDeJuegos.size();
    }

    public class JuegosViewHolder extends RecyclerView.ViewHolder {

        private ImageView ivCaratula;
        private TextView tvTitulo;


        public JuegosViewHolder(@NonNull View itemView) {
            super(itemView);
            ivCaratula = itemView.findViewById(R.id.ivCaratulaJuego);
            tvTitulo = itemView.findViewById(R.id.tvTituloJuego);
        }

        public void bind(Juegos juegos){
            tvTitulo.setText(juegos.getTitulo());
            //TODO implementar Picasso ivCaratula
        }

    }
}
