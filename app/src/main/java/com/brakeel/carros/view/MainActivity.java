package com.brakeel.carros.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.brakeel.carros.R;
import com.brakeel.carros.adapter.CarListAdapter;
import com.brakeel.carros.data.CarMock;
import com.brakeel.carros.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarMock carMock = new CarMock();
        List<Car> carList = new ArrayList<>();
        carList.addAll(carMock.getList());


        // 1 - Obter a recycleview
        this.mViewHolder.recyclerCars = (RecyclerView) this.findViewById(R.id.rvCars);

        // 2 - Definir adapter
        CarListAdapter carListAdapter = new CarListAdapter(carList);
        this.mViewHolder.recyclerCars.setAdapter(carListAdapter);

        // 3 - Definir layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.mViewHolder.recyclerCars.setLayoutManager(linearLayoutManager);

    }


    private static class ViewHolder{
        RecyclerView recyclerCars;
    }
}
