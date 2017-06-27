package quizappp.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static quizappp.quizapp.R.id.human;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView plants = (TextView) findViewById(R.id.plants);
        TextView animals = (TextView)  findViewById(R.id.animal);
        TextView human = (TextView)  findViewById(R.id.human);


        plants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openplants = new Intent(MainActivity.this, PlantsActivity.class);
                startActivity(openplants);
            }
        });



        animals.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent openanimals = new Intent(MainActivity.this, AnimalActivity.class);
                startActivity(openanimals);
            }
        });



        human.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent openhuman = new Intent(MainActivity.this, HumanActivity.class);
                startActivity(openhuman);
            }
        });
    }


public void SCORE(View view)
{

}

}