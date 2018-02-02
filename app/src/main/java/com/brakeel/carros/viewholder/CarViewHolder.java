package com.brakeel.carros.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.brakeel.carros.R;
import com.brakeel.carros.entities.Car;

/**
 * Created by Kelvis Borges on 02/02/2018.
 */

public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextModel;

    public CarViewHolder(View itemView) {
        super(itemView);
        this.mTextModel = (TextView) itemView.findViewById(R.id.text_model);
    }

    public void bindData(Car car) {
        this.mTextModel.setText(car.model);
    }
}
