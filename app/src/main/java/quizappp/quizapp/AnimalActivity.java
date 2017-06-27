package quizappp.quizapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.app.AlertDialog;
import android.widget.RadioGroup;
import android.widget.Toast;

import static quizappp.quizapp.R.id.animal;

public class AnimalActivity extends AppCompatActivity {
    double total =0;

    RadioButton Q1A1, Q1A2, Q1A3, Q1A4, Q2A1, Q2A2, Q2A3, Q2A4, Q3A1, Q3A2, Q3A3, Q3A4, Q4A1, Q4A2, Q4A3, Q4A4, Q5A1, Q5A2, Q5A3, Q5A4;
    RadioGroup G1,G2, G3, G4,G5;
    Button score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        score = (Button)findViewById(R.id.animal_score_button);

        G1 = (RadioGroup) findViewById(R.id.animal_quest1_group);
        Q1A3=(RadioButton)findViewById(R.id.animal_quest1_radio3);
        Q1A2=(RadioButton)findViewById(R.id.animal_quest1_radio2);
        Q1A4=(RadioButton)findViewById(R.id.animal_quest1_radio4);
        Q1A1=(RadioButton)findViewById(R.id.animal_quest1_radio1);

        G2 = (RadioGroup) findViewById(R.id.animal_quest2_group);
        Q2A3=(RadioButton)findViewById(R.id.animal_quest2_radio3);
        Q2A2=(RadioButton)findViewById(R.id.animal_quest2_radio2);
        Q2A4=(RadioButton)findViewById(R.id.animal_quest2_radio4);
        Q2A1=(RadioButton)findViewById(R.id.animal_quest2_radio1);

        G3 = (RadioGroup) findViewById(R.id.animal_quest3_group);
        Q3A3=(RadioButton)findViewById(R.id.animal_quest3_radio3);
        Q3A2=(RadioButton)findViewById(R.id.animal_quest3_radio2);
        Q3A4=(RadioButton)findViewById(R.id.animal_quest3_radio4);
        Q3A1=(RadioButton)findViewById(R.id.animal_quest3_radio1);

        G4 = (RadioGroup) findViewById(R.id.animal_quest4_group);
        Q4A3=(RadioButton)findViewById(R.id.animal_quest4_radio3);
        Q4A2=(RadioButton)findViewById(R.id.animal_quest4_radio2);
        Q4A4=(RadioButton)findViewById(R.id.animal_quest4_radio4);
        Q4A1=(RadioButton)findViewById(R.id.animal_quest4_radio1);

        G5 = (RadioGroup) findViewById(R.id.animal_quest5_group);
        Q5A3=(RadioButton)findViewById(R.id.animal_quest5_radio3);
        Q5A2=(RadioButton)findViewById(R.id.animal_quest5_radio2);
        Q5A4=(RadioButton)findViewById(R.id.animal_quest5_radio4);
        Q5A1=(RadioButton)findViewById(R.id.animal_quest5_radio1);








        G1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if(Q1A3.isChecked())
                {
                    Q1A3.setTextColor(Color.RED);
                    total++;
                    Q1A3.setEnabled(false);
                    Q1A1.setEnabled(false);
                    Q1A2.setEnabled(false);
                    Q1A4.setEnabled(false);

                }
                if(Q1A2.isChecked())
                {
                    Q1A2.setTextColor(Color.RED);
                    Q1A2.setEnabled(false);
                    Q1A3.setEnabled(false);
                    Q1A1.setEnabled(false);
                    Q1A4.setEnabled(false);


                }

                if(Q1A1.isChecked())
                {
                    Q1A1.setTextColor(Color.RED);
                    Q1A1.setEnabled(false);
                    Q1A3.setEnabled(false);
                    Q1A2.setEnabled(false);
                    Q1A4.setEnabled(false);

                }

                if(Q1A4.isChecked())
                {
                    Q1A4.setTextColor(Color.RED);
                    Q1A4.setEnabled(false);
                    Q1A3.setEnabled(false);
                    Q1A1.setEnabled(false);
                    Q1A2.setEnabled(false);


                }


            }
        });

        G2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if(Q2A3.isChecked())
                {
                    Q2A3.setTextColor(Color.RED);
                    total++;
                    Q2A3.setEnabled(false);
                    Q2A1.setEnabled(false);
                    Q2A2.setEnabled(false);
                    Q2A4.setEnabled(false);

                }
                if(Q2A2.isChecked())
                {
                    Q2A2.setTextColor(Color.RED);
                    Q2A2.setEnabled(false);
                    Q1A3.setEnabled(false);
                    Q1A1.setEnabled(false);
                    Q1A4.setEnabled(false);

                }

                if(Q2A1.isChecked())
                {
                    Q2A1.setTextColor(Color.RED);
                    Q2A1.setEnabled(false);
                    Q1A3.setEnabled(false);
                    Q1A2.setEnabled(false);
                    Q1A4.setEnabled(false);

                }

                if(Q2A4.isChecked())
                {
                    Q2A4.setTextColor(Color.RED);
                    Q2A4.setEnabled(false);
                    Q1A3.setEnabled(false);
                    Q1A1.setEnabled(false);
                    Q1A2.setEnabled(false);


                }


            }
        });

        G3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if(Q3A4.isChecked())
                {
                    Q3A4.setTextColor(Color.RED);
                    total++;
                    Q3A3.setEnabled(false);
                    Q3A1.setEnabled(false);
                    Q3A2.setEnabled(false);
                    Q3A4.setEnabled(false);

                }
                if(Q3A2.isChecked())
                {
                    Q3A2.setTextColor(Color.RED);
                    Q3A2.setEnabled(false);

                    Q1A3.setEnabled(false);
                    Q1A1.setEnabled(false);
                    Q1A4.setEnabled(false);

                }

                if(Q3A1.isChecked())
                {
                    Q3A1.setTextColor(Color.RED);
                    Q3A1.setEnabled(false);

                    Q1A3.setEnabled(false);
                    Q1A2.setEnabled(false);
                    Q1A4.setEnabled(false);

                }

                if(Q3A3.isChecked())
                {
                    Q3A3.setTextColor(Color.RED);
                    Q3A3.setEnabled(false);

                    Q1A1.setEnabled(false);
                    Q1A2.setEnabled(false);
                    Q1A4.setEnabled(false);

                }


            }
        });

        G4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if(Q4A3.isChecked())
                {
                    Q4A3.setTextColor(Color.RED);
                    total++;
                    Q4A3.setEnabled(false);
                    Q4A1.setEnabled(false);
                    Q4A2.setEnabled(false);
                    Q4A4.setEnabled(false);

                }
                if(Q4A2.isChecked())
                {
                    Q4A2.setTextColor(Color.RED);
                    Q4A2.setEnabled(false);

                }

                if(Q4A1.isChecked())
                {
                    Q4A1.setTextColor(Color.RED);
                    Q4A1.setEnabled(false);

                    Q1A3.setEnabled(false);
                    Q1A2.setEnabled(false);
                    Q1A4.setEnabled(false);

                }

                if(Q4A4.isChecked())
                {
                    Q4A4.setTextColor(Color.RED);
                    Q4A4.setEnabled(false);
                    Q1A3.setEnabled(false);
                    Q1A1.setEnabled(false);
                    Q1A2.setEnabled(false);


                }


            }
        });

        G5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if(Q5A3.isChecked())
                {
                    Q5A3.setTextColor(Color.RED);
                    total++;
                    Q5A3.setEnabled(false);
                    Q5A1.setEnabled(false);
                    Q5A2.setEnabled(false);
                    Q5A4.setEnabled(false);

                }
                if(Q5A2.isChecked())
                {
                    Q5A2.setTextColor(Color.RED);
                    Q5A2.setEnabled(false);

                    Q1A3.setEnabled(false);
                    Q1A1.setEnabled(false);
                    Q1A4.setEnabled(false);

                }

                if(Q5A1.isChecked())
                {
                    Q5A1.setTextColor(Color.RED);
                    Q5A1.setEnabled(false);

                    Q1A3.setEnabled(false);
                    Q1A2.setEnabled(false);
                    Q1A4.setEnabled(false);

                }

                if(Q5A4.isChecked())
                {
                    Q5A4.setTextColor(Color.RED);
                    Q5A4.setEnabled(false);

                    Q1A3.setEnabled(false);
                    Q1A1.setEnabled(false);
                    Q1A2.setEnabled(false);

                }


            }
        });




        score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        AnimalActivity.this);

                // set title
                alertDialogBuilder.setTitle("Animal Quiz");

                // set dialog message
                alertDialogBuilder
                        .setMessage("Your Score " + total)
                        .setCancelable(false)
                        .setPositiveButton("Happy",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                // if this button is clicked, close
                                // current activity
                                AnimalActivity.this.finish();
                            }
                        })
                        .setNegativeButton("Not Happy",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                // if this button is clicked, just close
                                // the dialog box and do nothing
                                dialog.cancel();
                            }
                        });

                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();

            }
        });
    }


}
