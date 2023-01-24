package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem>  postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        //Define adapter
        this.prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter( postagens );
        recyclerPostagem.setAdapter( adapter );
    }

    public void prepararPostagens() {

        Postagem post;

        post = new Postagem("Walter Silva", "#tbt Viagem legal!!", R.drawable.imagem1);
        postagens.add( post );

        post = new Postagem("Hotel ws", "Viaje, aproveite nossos descontos", R.drawable.imagem2);
        postagens.add( post );

        post = new Postagem("Maria Luiza", "#Paris", R.drawable.imagem3);
        postagens.add( post );

        post = new Postagem("Marcos Paulo", "Que foto linda!!", R.drawable.imagem4);
        postagens.add( post );
    }
}