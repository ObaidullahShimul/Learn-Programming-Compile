package www.shimul.com.learncjavapythonprogramming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static www.shimul.com.learncjavapythonprogramming.Java_MainActivity.webValue;

public class Java_ProgramDisplay extends AppCompatActivity {

    TextView flag;
    Button trybtnId;
    Toolbar mtoolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java__program_display);


        flag= (TextView) findViewById(R.id.imgflag);

        trybtnId= (Button) findViewById(R.id.trybtnId);

        mtoolbar= (Toolbar) findViewById(R.id.toolbar2);

        Bundle bundle=getIntent().getExtras();
        if (bundle!=null){
            mtoolbar.setTitle(bundle.getString("Java_Programs"));
            if(mtoolbar.getTitle().toString().equalsIgnoreCase("Print Hello World")){
                flag.setText(R.string.displayHello);
            }
            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Print Small Letter Alphabet")){
                flag.setText(R.string.printAlphabet);
            }
            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Add Two Integers")){
                flag.setText(R.string.addTwoNumber);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Add two Integer in user Input")){
                flag.setText(R.string.addTwoUsingInput);
            }


            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Display 1 to 10 using for loop")){
                flag.setText(R.string.forLoop);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Swapping Two Number")){
                flag.setText(R.string.swapping);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Exam Pass or Fail using if else")){
                flag.setText(R.string.if_else);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Check a Number Even or Odd")){
                flag.setText(R.string.evenOdd);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Multiplication Table using User Input")){
                flag.setText(R.string.multipicationTable);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Fahrenheit to Celsius Converter")){
                flag.setText(R.string.fahrenheit);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Find Largest Number amon three Integer")){
                flag.setText(R.string.largestThree);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Factorial Number")){
                flag.setText(R.string.factorialPro);
            }
            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Reverse String")){
                flag.setText(R.string.reverseString);
            }


        }

        setSupportActionBar(mtoolbar);
        //-------back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);





        trybtnId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webValue=1;
                Intent intent=new Intent(Java_ProgramDisplay.this,Java_Compiler.class);
                startActivity(intent);
            }
        });
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
