package www.shimul.com.learncjavapythonprogramming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import at.markushi.ui.CircleButton;
import static www.shimul.com.learncjavapythonprogramming.Java_MainActivity.webValue;
import static www.shimul.com.learncjavapythonprogramming.C_MainActivity.MCQ;

public class Python_MainActivity extends AppCompatActivity {

    CircleButton pythonTutorial,pythonProgram,pythonInterview,pythonCompiler,pythonMCQ,pythonQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python__main);

        //https://rextester.com/l/java_online_compiler

        //-----------------------------
        setTitle("Python Programming");

        pythonTutorial=findViewById(R.id.pythonTutorialBtnId);
        pythonProgram=findViewById(R.id.pythonProgramBtnId);
        pythonInterview=findViewById(R.id.pythonInterviewBtnId);
        pythonCompiler=findViewById(R.id.pythonCompilerBtnId);
        pythonMCQ=findViewById(R.id.pythonMcqBtnId);
        pythonQuiz=findViewById(R.id.pythonQuizBtnId);


        pythonTutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Python_MainActivity.this,Python_Tutorial_ChapterList.class);
                startActivity(intent);

            }
        });


        pythonProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Python_MainActivity.this,Python_ProgramList.class);
                startActivity(intent);

            }
        });


        pythonInterview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Python_MainActivity.this,Python_Interview.class);
                startActivity(intent);

            }
        });

        pythonCompiler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                webValue=2;
                Intent intent=new Intent(Python_MainActivity.this,Java_Compiler.class);
                startActivity(intent);

            }
        });


        pythonMCQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MCQ=3;
                Intent intent=new Intent(Python_MainActivity.this,C_MCQ.class);
                startActivity(intent);

            }
        });

        pythonQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Python_MainActivity.this,Python_Quiz.class);
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
