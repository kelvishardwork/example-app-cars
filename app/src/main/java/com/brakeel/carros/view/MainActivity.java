package com.brakeel.carros.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.brakeel.carros.R;
import com.brakeel.carros.adapter.CarListAdapter;
import com.brakeel.carros.constants.CarrosContants;
import com.brakeel.carros.data.CarMock;
import com.brakeel.carros.entities.Car;
import com.brakeel.carros.listener.OnListClickInteractionListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewHolder mViewHolder = new ViewHolder();
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


        this.mContext = this;

        CarMock carMock = new CarMock(this);
        List<Car> carList = new ArrayList<>();
        carList.addAll(carMock.getList());


        // 1 - Obter a recycleview
        this.mViewHolder.recyclerCars = (RecyclerView) this.findViewById(R.id.rvCars);

        OnListClickInteractionListener listener = new OnListClickInteractionListener() {

            @Override
            public void onClick(int id) {
                Bundle bundle = new Bundle();
                bundle.putInt(CarrosContants.CARRO_ID, id);

                Intent intent = new Intent(mContext, DetailsActivity.class);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        };

        // 2 - Definir adapter
        CarListAdapter carListAdapter = new CarListAdapter(carList,listener);
        this.mViewHolder.recyclerCars.setAdapter(carListAdapter);

        // 3 - Definir layout
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        this.mViewHolder.recyclerCars.setLayoutManager(linearLayoutManager);

    }


    private static class ViewHolder {
        RecyclerView recyclerCars;
    }
}
