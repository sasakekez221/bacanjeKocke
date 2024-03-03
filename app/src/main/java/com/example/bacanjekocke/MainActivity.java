package com.example.bacanjekocke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    private ImageView kockaImg;
    private Button bacajKocku;
    private Random rand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kockaImg = findViewById(R.id.kockaImg);
        bacajKocku = findViewById(R.id.buttonBacaj);
        rand = new Random();

        bacajKocku.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                bacanjeKocke();
            }
        });
    }

    private void bacanjeKocke(){
        int randomBroj = rand.nextInt(6)+1;
        if (randomBroj == 1){
            kockaImg.setImageResource(R.drawable.dice_1);
        } else if (randomBroj == 2) {
            kockaImg.setImageResource(R.drawable.dice_2);
        } else if (randomBroj == 3) {
            kockaImg.setImageResource(R.drawable.dice_3);
        } else if (randomBroj == 4) {
            kockaImg.setImageResource(R.drawable.dice_4);
        } else if (randomBroj == 5) {
            kockaImg.setImageResource(R.drawable.dice_5);
        } else if (randomBroj == 6) {
            kockaImg.setImageResource(R.drawable.dice_6);
        }

    }

}