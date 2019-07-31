package www.shimul.com.learncjavapythonprogramming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import at.markushi.ui.CircleButton;

import static www.shimul.com.learncjavapythonprogramming.C_MainActivity.MCQ;

public class Java_MainActivity extends AppCompatActivity {

    CircleButton javaTutorialBtn,javaProgram,javaInterview,javaCompiler,javaMCQ,javaQuiz;
    public static int webValue=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java__main);

        //---------------------------
        setTitle("Java Programming");

        javaTutorialBtn=findViewById(R.id.javaTutorialBtnId);
        javaProgram=findViewById(R.id.javaProgramBtnId);
        javaInterview=findViewById(R.id.javaInterviewBtnId);
        javaCompiler=findViewById(R.id.javaCompilerBtnId);
        javaMCQ=findViewById(R.id.javaMcqBtnId);
        javaQuiz=findViewById(R.id.javaQuizBtnId);

        javaTutorialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Java_MainActivity.this,Java_ProgramList.class);
                startActivity(intent);
            }
        });

        javaProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Java_MainActivity.this,Java_ProgramList.class);
                startActivity(intent);
            }
        });

        javaInterview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Java_MainActivity.this,Java_Interview_Question.class);
                startActivity(intent);
            }
        });


        javaCompiler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webValue=1;
                Intent intent=new Intent(Java_MainActivity.this,Java_Compiler.class);
                startActivity(intent);
            }
        });

        javaMCQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MCQ=2;
                Intent intent=new Intent(Java_MainActivity.this,C_MCQ.class);
                startActivity(intent);
            }
        });

        javaQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //MCQ=2;
                Intent intent=new Intent(Java_MainActivity.this,Java_Quiz.class);
                startActivity(intent);
            }
        });


        //-------back button
        //setSupportActionBar(toolbarInterviewq);
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
