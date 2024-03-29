package com.brakeel.carros.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.brakeel.carros.R;
import com.brakeel.carros.entities.Car;
import com.brakeel.carros.listener.OnListClickInteractionListener;
import com.brakeel.carros.viewholder.CarViewHolder;

import java.util.List;

/**
 * Created by Kelvis Borges on 02/02/2018.
 */

public class CarListAdapter extends RecyclerView.Adapter<CarViewHolder> {

    private List<Car> mListCars;
    private OnListClickInteractionListener mOnListClickInteractionListener;

    public CarListAdapter(List<Car> cars, OnListClickInteractionListener listener) {
        this.mListCars = cars;
        this.mOnListClickInteractionListener = listener;
    }

    @Override
    public CarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View cardView = inflater.inflate(R.layout.row_car_list, parent, false);
        return new CarViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(CarViewHolder holder, int position) {
        Car car = this.mListCars.get(position);
        holder.bindData(car, this.mOnListClickInteractionListener);
    }

    @Override
    public int getItemCount() {
        return this.mListCars.size();

    }
}
