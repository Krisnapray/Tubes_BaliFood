package com.Dwipa.myrecyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String title = "Mode List";
    private RecyclerView rvFruits;
    private ArrayList<Makanan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvFruits = findViewById(R.id.rv_heroes);
        rvFruits.setHasFixedSize(true);

        list.addAll(DataMakanan.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvFruits.setLayoutManager(new LinearLayoutManager(this));
        ListMakanan listMakanan = new ListMakanan(list);
        rvFruits.setAdapter(listMakanan);

        listMakanan.setOnItemClickCallback(new ListMakanan.OnItemClickCallback() {
            @Override
            public void onItemClicked(Makanan data) {
                showSelectedHero(data);
            }
        });
    }

    private void showRecyclerGrid() {
        rvFruits.setLayoutManager(new GridLayoutManager(this, 2));
        GridMakananAdapter gridFruitsAdapter = new GridMakananAdapter(list);
        rvFruits.setAdapter(gridFruitsAdapter);

        gridFruitsAdapter.setOnItemClickCallback(new GridMakananAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Makanan data) {
                showSelectedHero(data);
            }
        });
    }

    private void showRecyclerCardView() {
        rvFruits.setLayoutManager(new LinearLayoutManager(this));
        CardViewMakananAdapter cardViewMakananAdapter = new CardViewMakananAdapter(list);
        rvFruits.setAdapter(cardViewMakananAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                break;

            case R.id.action_grid:
                title = "Mode Grid";
                showRecyclerGrid();
                break;

            case R.id.action_cardview:
                title = "Mode CardView";
                showRecyclerCardView();
                break;
        }
        setActionBarTitle(title);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showSelectedHero(Makanan makanan) {
        Toast.makeText(this, "Kamu memilih " + makanan.getName(), Toast.LENGTH_SHORT).show();
    }
}
