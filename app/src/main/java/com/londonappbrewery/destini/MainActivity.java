package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    private TextView textView;
    private Button buttontop,buttonbottom;
    private int index =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        textView = findViewById(R.id.storyTextView);
        buttontop = findViewById(R.id.buttonTop);
        buttonbottom = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        buttontop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(index==1) {
                    textView.setText(R.string.T3_Story);
                    buttontop.setText(R.string.T3_Ans1);
                    buttonbottom.setText(R.string.T3_Ans2);
                    index = 3;
                }
                else if(index == 3)
                {
                    textView.setText(R.string.T6_End);
                    buttonbottom.setVisibility(View.GONE);
                    buttontop.setVisibility(View.GONE);
                    index = 6;
                }
                else if(index==2)
                {
                    textView.setText(R.string.T3_Story);
                    buttontop.setText(R.string.T3_Ans1);
                    buttonbottom.setText(R.string.T3_Ans2);
                    index = 3;
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        buttonbottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(index==1) {
                    textView.setText(R.string.T2_Story);
                    buttontop.setText(R.string.T2_Ans1);
                    buttonbottom.setText(R.string.T2_Ans2);
                    index = 2;
                }
                else if(index == 3)
                {
                    textView.setText(R.string.T5_End);
                    buttonbottom.setVisibility(View.GONE);
                    buttontop.setVisibility(View.GONE);
                    index = 5;

                }
                else if(index==2)
                {
                    textView.setText(R.string.T4_End);
                    buttonbottom.setVisibility(View.GONE);
                    buttontop.setVisibility(View.GONE);
                    index = 4;

                }

            }
        });

    }
}
