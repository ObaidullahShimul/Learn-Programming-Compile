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

public class Python_ProgramDisplay extends AppCompatActivity {

    TextView flag;
    Button trybtnId;
    Toolbar mtoolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python__program_display);

        flag= (TextView) findViewById(R.id.imgflag);

        trybtnId= (Button) findViewById(R.id.trybtnId);

        mtoolbar= (Toolbar) findViewById(R.id.toolbar2);

        Bundle bundle=getIntent().getExtras();
        if (bundle!=null){
            mtoolbar.setTitle(bundle.getString("Python_Programs"));
            if(mtoolbar.getTitle().toString().equalsIgnoreCase("Add two numbers")){
                flag.setText(R.string.pyaddTwo);
            }
            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Adding two number by user input")){
                flag.setText(R.string.pyaddTowuserIn);
            }
            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Check a Number is Positive or Negative")){
                flag.setText(R.string.pypositiv);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Swapping Two Number")){
                flag.setText(R.string.pyswapping);
            }


            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Celsius to Fahrenheit Converter")){
                flag.setText(R.string.pycelsius);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Program Area of Triangle Given Numbers")){
                flag.setText(R.string.pyareaofTrian);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Check a Number Even or Odd")){
                flag.setText(R.string.pyeven);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Program to Reverse a Given Number")){
                flag.setText(R.string.pyreverse);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Multiplication Table using User Input")){
                flag.setText(R.string.pymultiplication);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Find Largest Number in List")){
                flag.setText(R.string.pylargestinlist);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Factorial Number")){
                flag.setText(R.string.pyfactorial);
            }



        }

        setSupportActionBar(mtoolbar);
        //-------back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);





        trybtnId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webValue=2;
                Intent intent=new Intent(Python_ProgramDisplay.this,Java_Compiler.class);
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
