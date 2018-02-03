package com.brakeel.carros.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.brakeel.carros.R;
import com.brakeel.carros.constants.CarrosContants;
import com.brakeel.carros.data.CarMock;
import com.brakeel.carros.entities.Car;

public class DetailsActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();
    private CarMock mCarMock;
    private Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        // Instancia Variaveis
        this.mCarMock = new CarMock(this);

        // Instancia de elementos de interface
        this.mViewHolder.imgCarPicture = (ImageView) findViewById(R.id.img_car_pic);
        this.mViewHolder.textCarModel = (TextView) findViewById(R.id.text_car_model);
        this.mViewHolder.textManuFacturer = (TextView) findViewById(R.id.text_manufacture);
        this.mViewHolder.textHorsePower = (TextView) findViewById(R.id.text_horse_power);
        this.mViewHolder.textPrice = (TextView) findViewById(R.id.text_price);

        // Obtem o valor passado por parametro
        this.getDataFromActivity();

        // Atribui os valores aos elementos de interface
        this.setData();

    }

    private void setData() {
        this.mViewHolder.textCarModel.setText(this.mCar.model);
        this.mViewHolder.imgCarPicture.setImageDrawable(this.mCar.picture);
        this.mViewHolder.textHorsePower.setText(String.valueOf(this.mCar.horsePower));
        this.mViewHolder.textPrice.setText("R$ "+String.valueOf(this.mCar.price));
    }

    private void getDataFromActivity() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.mCar = this.mCarMock.get(extras.getInt(CarrosContants.CARRO_ID));
        }
    }

    private static class ViewHolder {
        ImageView imgCarPicture;
        TextView textCarModel;
        TextView textManuFacturer;
        TextView textHorsePower;
        TextView textPrice;
    }
}
