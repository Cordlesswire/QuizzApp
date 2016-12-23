package com.example.android.quizzapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.R.attr.checked;
import static com.example.android.quizzapp.R.id.blizzard;
import static com.example.android.quizzapp.R.id.prisoner;

public class MainActivity extends AppCompatActivity {

    // int score shows how many good answers were given by a player
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // method sumUp counts final score

    public void sumUp(View view) {

        // this part identifies all RadioButtons, Checkboxes that have correct answers. It also verifies if those radio/checkboxes are checked

        RadioButton blizzard = (RadioButton) findViewById(R.id.blizzard);
        boolean isBlizzard = blizzard.isChecked();

        RadioButton threeRaces = (RadioButton) findViewById(R.id.threeRaces);
        boolean isthree = threeRaces.isChecked();

        RadioButton zergLeader = (RadioButton) findViewById(R.id.kerrigan);
        boolean isZergLeader = zergLeader.isChecked();

        RadioButton terranLeader = (RadioButton) findViewById(R.id.arthurus);
        boolean isTerranLeader = terranLeader.isChecked();

        RadioButton tychus = (RadioButton) findViewById(R.id.prisoner);
        boolean isTychus = tychus.isChecked();

        CheckBox protossUnit1 = (CheckBox) findViewById(R.id.protoss_unit_1);
        boolean isProtossUnit1 = protossUnit1.isChecked();

        CheckBox protossUnit2 = (CheckBox) findViewById(R.id.protoss_unit_2);
        boolean isProtossUnit2 = protossUnit2.isChecked();

// this part creates String that was given by a player in EditText field and it turns it to lower case

        EditText openText = (EditText) findViewById(R.id.answer);
        String openAnswer = openText.getText().toString().toLowerCase();


        //Using "if" statement, method is counting points. It adds 1 point every time the right answer is given


        if (isBlizzard) {
            score = score + 1;
        }

        if (isthree) {
            score = score + 1;
        }

        if (isZergLeader) {
            score = score + 1;
        }

        if (isTerranLeader) {
            score = score + 1;
        }

        if (isTychus) {
            score = score + 1;
        }

        // there are two right answers for this question and both checkboxes should be checked. That is why "&&" operetor is used.

        if (isProtossUnit1 && isProtossUnit2) {
            score = score + 1;
        }

        // answer given in text entry need to contain word "void". Thanks to toLowerCase() method, player receives a point even if he/she types upper case letters.

        if (openAnswer.contains("void")) {
            score = score + 1;
        }

        // this creates toast message that shows score of a player

        Toast.makeText(this, "Your score: " + score, Toast.LENGTH_SHORT).show();

        // after toast message, method resets "score" value back to 0.

        score = 0;
    }


}
