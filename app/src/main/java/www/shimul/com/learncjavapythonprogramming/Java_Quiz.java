package www.shimul.com.learncjavapythonprogramming;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Java_Quiz extends AppCompatActivity {


    RadioGroup radioGroup1,radioGroup2,radioGroup3,radioGroup4,radioGroup5;
    RadioGroup radioGroup6,radioGroup7,radioGroup8,radioGroup9,radioGroup10;

    //RadioButton radioButton1,radioButton2;
    //RadioButton answerradio,answerradio2;
    Button submitbtn;

    TextView scoreTextView;
    TextView worngAnsShowText;

    public static int correctAnsScore=0;
    public static int correctAns=0;

    public static int lastMark_in_Java;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java__quiz);


        radioGroup1= (RadioGroup) findViewById(R.id.radioGroup_1);
        radioGroup2= (RadioGroup) findViewById(R.id.radioGroup_2);
        radioGroup3= (RadioGroup) findViewById(R.id.radioGroup_3);
        radioGroup4= (RadioGroup) findViewById(R.id.radioGroup_4);
        radioGroup5= (RadioGroup) findViewById(R.id.radioGroup_5);
        radioGroup6= (RadioGroup) findViewById(R.id.radioGroup_6);
        radioGroup7= (RadioGroup) findViewById(R.id.radioGroup_7);
        radioGroup8= (RadioGroup) findViewById(R.id.radioGroup_8);
        radioGroup9= (RadioGroup) findViewById(R.id.radioGroup_9);
        radioGroup10= (RadioGroup) findViewById(R.id.radioGroup_10);
        //radioButton1= (RadioButton) findViewById(R.id.correct_A1);
        //radioButton2= (RadioButton) findViewById(R.id.correct_A2);
        submitbtn= (Button) findViewById(R.id.btn_submit);

        scoreTextView= (TextView) findViewById(R.id.scoreId);
        worngAnsShowText= (TextView) findViewById(R.id.wrongAns);



        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Java Quiz");
        //actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.quiz_ac_color)));

        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clickValue=1;

                if (radioGroup1.getCheckedRadioButtonId() == R.id.correct_A1) {
                    correctAnsScore += 2;
                    correctAns++;
                }

                if (radioGroup2.getCheckedRadioButtonId() == R.id.correct_A2) {
                    correctAnsScore += 2;
                    correctAns++;
                }

                if (radioGroup3.getCheckedRadioButtonId() == R.id.correct_A3) {
                    correctAnsScore += 2;
                    correctAns++;
                }
                if (radioGroup4.getCheckedRadioButtonId() == R.id.correct_A4) {
                    correctAnsScore += 2;
                    correctAns++;
                }
                if (radioGroup5.getCheckedRadioButtonId() == R.id.correct_A5) {
                    correctAnsScore += 2;
                    correctAns++;
                }
                if (radioGroup6.getCheckedRadioButtonId() == R.id.correct_A6) {
                    correctAnsScore += 2;
                    correctAns++;
                }
                if (radioGroup7.getCheckedRadioButtonId() == R.id.correct_A7) {
                    correctAnsScore += 2;
                    correctAns++;
                }
                if (radioGroup8.getCheckedRadioButtonId() == R.id.correct_A8) {
                    correctAnsScore += 2;
                    correctAns++;
                }
                if (radioGroup9.getCheckedRadioButtonId() == R.id.correct_A9) {
                    correctAnsScore += 2;
                    correctAns++;
                }

                if (radioGroup10.getCheckedRadioButtonId() == R.id.correct_A10) {
                    correctAnsScore += 2;
                    correctAns++;
                }

                Toast.makeText(Java_Quiz.this, "Quiz Submitted Correctly", Toast.LENGTH_SHORT).show();
                scoreTextView.setText(Integer.toString(correctAnsScore));
                worngAnsShowText.setText(Integer.toString(correctAns));
                submitbtn.setEnabled(false);

                lastMark_in_Java=correctAnsScore;

            }

        });

        /*if (clickValue==1){
            submitbtn.setEnabled(false);
        }*/




        //back button icon
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



    }


    public void ResetQuizbtn(View view){
        //answerOneEditText.setText("");
        scoreTextView.setText("0");
        correctAnsScore=0;
        worngAnsShowText.setText("0");
        correctAns=0;

        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();
        radioGroup4.clearCheck();
        radioGroup5.clearCheck();
        radioGroup6.clearCheck();
        radioGroup7.clearCheck();
        radioGroup8.clearCheck();
        radioGroup9.clearCheck();
        radioGroup10.clearCheck();

        submitbtn.setEnabled(true);

    }


    //----back button--------
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        scoreTextView.setText("0");
        correctAnsScore=0;
        worngAnsShowText.setText("0");
        correctAns=0;
        if (item.getItemId()==android.R.id.home){
            this.finish();

        }
        return super.onOptionsItemSelected(item);


    }

    //--------------------------interstitial ad--------------------------------
}
