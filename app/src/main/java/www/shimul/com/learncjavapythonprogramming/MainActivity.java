package www.shimul.com.learncjavapythonprogramming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import at.markushi.ui.CircleButton;

public class MainActivity extends AppCompatActivity {


    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;

    CircleButton cProgramming,javaProgramming,pythonProgramming;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //-----------log In-------------------
        firebaseAuth = FirebaseAuth.getInstance();
        firebaseUser = firebaseAuth.getCurrentUser();
        //userEmail.setText(firebaseUser.getEmail());


        //--------------------Activity Id-------------------
        cProgramming=findViewById(R.id.cLanguageBtn);
        javaProgramming=findViewById(R.id.javaLanguageBtn);
        pythonProgramming=findViewById(R.id.pythonLanguageBtn);


        //----------------C Main Activtiy----------------
        cProgramming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,C_MainActivity.class);
                startActivity(intent);

            }
        });


        //----------------Java Main Activtiy----------------
        javaProgramming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Java_MainActivity.class);
                startActivity(intent);

            }
        });

        //----------------Python Main Activtiy----------------
        pythonProgramming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Python_MainActivity.class);
                startActivity(intent);

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_item,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==R.id.logOutId){

            FirebaseAuth.getInstance().signOut();
            Intent intent = new Intent(MainActivity.this, LogInMain.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);

        }
        else if (item.getItemId()==R.id.profileId){

            Intent intent=new Intent(MainActivity.this,ProfileInfo.class);
            startActivity(intent);
        }

        else if (item.getItemId()==R.id.shareId){

            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");

            String subject="Learn Programming and Compile Support\nDeveloped By Md Obaidullah Haque";
            String body="Learn Programming and Compile Support basically Programming App Whether you are an experienced programmer or not, " +
                    "this APP is intended for everyone who wishes to learn the C, JAVA, PYTHON, Programming language.\n" +
                    "\n" + "There is no need to download anything - Just click on the chapter you wish " +
                    "to begin from, and follow the instructions. Good luck!" + "Feature:\n\nTutorials\nPrograms\nInterview Question\nCompile Program\nProgramming MCQ\nQuiz\nLearning Progress";

            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);

            startActivity(intent.createChooser(intent,"Share with"));
        }
        return super.onOptionsItemSelected(item);
    }
}
