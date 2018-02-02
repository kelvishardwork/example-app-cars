package com.brakeel.carros.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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



        this.mCarMock = new CarMock();

        this.mViewHolder.textModel = (TextView) findViewById(R.id.text_model);
        this.mViewHolder.textHorsePower = (TextView) findViewById(R.id.text_horse_power);
        this.mViewHolder.textPrice = (TextView) findViewById(R.id.text_price);

        this.getDataFromActivity();
        this.setData();

    }

    private void setData() {
        this.mViewHolder.textModel.setText(this.mCar.model);
        this.mViewHolder.textHorsePower.setText(String.valueOf(this.mCar.horsePower));
        this.mViewHolder.textPrice.setText(String.valueOf(this.mCar.price));
    }

    private void getDataFromActivity() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.mCar = this.mCarMock.get(extras.getInt(CarrosContants.CARRO_ID));
        }
    }

    private static class ViewHolder {
        TextView textModel;
        TextView textHorsePower;
        TextView textPrice;
    }
}
