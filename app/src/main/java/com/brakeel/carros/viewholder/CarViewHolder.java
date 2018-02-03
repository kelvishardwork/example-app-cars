package com.brakeel.carros.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.brakeel.carros.R;
import com.brakeel.carros.entities.Car;
import com.brakeel.carros.listener.OnListClickInteractionListener;

/**
 * Created by Kelvis Borges on 02/02/2018.
 */

/**
 * Responsavel por fazer as manipulacoes de elementos de interface
 */
public class CarViewHolder extends RecyclerView.ViewHolder {

    // Elemento da interface
    private ImageView mImgCarPicturer;
    private TextView mTextCarModel;
    private TextView mTextViewDetails;


    public CarViewHolder(View itemView) {
        super(itemView);

        this.mImgCarPicturer = (ImageView) itemView.findViewById(R.id.img_car_pic);
        this.mTextCarModel = (TextView) itemView.findViewById(R.id.text_car_model);
        this.mTextViewDetails = (TextView) itemView.findViewById(R.id.text_view_details);

    }

    public void bindData(final Car car, final OnListClickInteractionListener listener) {
        // Altera Valores
        this.mImgCarPicturer.setImageDrawable(car.picture);
        this.mTextCarModel.setText(car.model);

        // Adicionando evento do detalhes
        this.mTextViewDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(car.id);
            }
        });
    }
}
