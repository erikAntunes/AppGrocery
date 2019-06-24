package br.com.digitalhouse.digitalhousegroceryapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.digitalhousegroceryapp.adapter.ProdutoAdapter;
import br.com.digitalhouse.digitalhousegroceryapp.model.Produto;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentCompras extends Fragment {


    public FragmentCompras() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_compras,container,false);

        List<Produto> listaProdutos = getListaProdutos();

        ProdutoAdapter produtoAdapter = new ProdutoAdapter(listaProdutos);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(view.getContext());

        RecyclerView recyclerView = view.findViewById(R.id.produtos_recycle_view);

        recyclerView.setAdapter(produtoAdapter);
        recyclerView.setLayoutManager(layoutManager);


        return view;
    }
    private List<Produto> getListaProdutos(){

        List<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto();
        produto1.setQuantidade(2);
        produto1.setUnidade("kg");
        produto1.setDescricao("Cebola");
        produto1.setComprado(false);
        listaProdutos.add(produto1);

        Produto produto2 = new Produto();
        produto2.setQuantidade(2);
        produto2.setUnidade("kg");
        produto2.setDescricao("Cenoura");
        produto2.setComprado(false);
        listaProdutos.add(produto2);

        Produto produto3 = new Produto();
        produto3.setQuantidade(2);
        produto3.setUnidade("kg");
        produto3.setDescricao("Batata");
        produto3.setComprado(false);
        listaProdutos.add(produto3);

        Produto produto4 = new Produto();
        produto4.setQuantidade(2);
        produto4.setUnidade("kg");
        produto4.setDescricao("Arroz");
        produto4.setComprado(false);
        listaProdutos.add(produto4);

        return listaProdutos;


    }
}

