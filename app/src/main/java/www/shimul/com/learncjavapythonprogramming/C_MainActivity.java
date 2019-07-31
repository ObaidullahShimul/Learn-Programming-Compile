package www.shimul.com.learncjavapythonprogramming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import at.markushi.ui.CircleButton;

import static www.shimul.com.learncjavapythonprogramming.Java_MainActivity.webValue;

public class C_MainActivity extends AppCompatActivity {

    public static int MCQ=0;

    CircleButton cTutorial,cPrograms,cInterview,cCompiler,cMCQ,cquizbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c__main);

        setTitle("C Programming");


        cTutorial=findViewById(R.id.cTutorialBtnId);
        cPrograms=findViewById(R.id.cProgramsBtnId);
        cInterview=findViewById(R.id.cInterviewBtnId);
        cCompiler=findViewById(R.id.cCompilerBtnId);
        cquizbtn=findViewById(R.id.cquizBtnId);
        cMCQ=findViewById(R.id.cMcqBtnId);


        //------------------C Tutorial------------------------
        cTutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(C_MainActivity.this,C_Tutorial_ChapterList.class);
                startActivity(intent);
            }
        });

        //------------------C Programs------------------------
        cPrograms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(C_MainActivity.this,C_ProgramList.class);
                startActivity(intent);
            }
        });

        //------------------C Interview------------------------
        cInterview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(C_MainActivity.this,C_InterViewQuestion.class);
                startActivity(intent);
            }
        });

        //------------------C Compiler------------------------
        cCompiler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webValue=3;
                Intent intent=new Intent(C_MainActivity.this,Java_Compiler.class);
                startActivity(intent);
            }
        });


       //------------------C MCQ------------------------
        cMCQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MCQ=1;
                Intent intent=new Intent(C_MainActivity.this,C_MCQ.class);
                startActivity(intent);
            }
        });

        //------------------C Quiz------------------------
        cquizbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(C_MainActivity.this,C_Quiz.class);
                startActivity(intent);
            }
        });


        //-------back button
        //setSupportActionBar(toolbarInterviewq);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    //-----------back button--------
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
