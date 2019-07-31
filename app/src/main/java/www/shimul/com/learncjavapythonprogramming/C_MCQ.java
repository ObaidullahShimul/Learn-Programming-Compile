package www.shimul.com.learncjavapythonprogramming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import static www.shimul.com.learncjavapythonprogramming.C_MainActivity.MCQ;

public class C_MCQ extends AppCompatActivity {


    //Toolbar mcq_toolbar;
    TextView mcqDisplayView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c__mcq);


        //mcq_toolbar= (Toolbar) findViewById(R.id.mcq_toolbar);
        //mcq_toolbar.

        mcqDisplayView=findViewById(R.id.mcqDisplayTextId);

        if (MCQ==1){
            setTitle("C Programming MCQ");
            mcqDisplayView.setText(R.string.mcq_question_ans);

        }

        if (MCQ==2){
            setTitle("Java Programming MCQ");
            mcqDisplayView.setText(R.string.java_mcq_question_ans);
        }


        if (MCQ==3){
            setTitle("Python Programming MCQ");
            mcqDisplayView.setText(R.string.pythonMCQ);
        }

        //setSupportActionBar(mcq_toolbar);
        //-------back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }

    //----back button--------
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

