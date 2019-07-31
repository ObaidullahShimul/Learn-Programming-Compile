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

public class C_ProgramDisplay extends AppCompatActivity {

    TextView flag;
    Button trybtnId;
    Toolbar mtoolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c__program_display);

        flag= (TextView) findViewById(R.id.imgflag);

        trybtnId= (Button) findViewById(R.id.trybtnId);

        mtoolbar= (Toolbar) findViewById(R.id.toolbar2);

        Bundle bundle=getIntent().getExtras();
        if (bundle!=null){
            mtoolbar.setTitle(bundle.getString("Program_Name"));
            if(mtoolbar.getTitle().toString().equalsIgnoreCase("Hello World Program")){
                flag.setText(R.string.first_program);
            }
            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Print Integer Entered by the User")){
                flag.setText(R.string.second);
            }
            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Add Two Integers")){
                flag.setText(R.string.third);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Find ASCII Value of a Character")){
                flag.setText(R.string.asci);
            }


            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Demonstrate the Working of long")){
                flag.setText(R.string.longpro);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Multiply two Floating Point Numbers")){
                flag.setText(R.string.fourth);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Find the Size of int float")){
                flag.setText(R.string.five);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Swap Two Numbers")){
                flag.setText(R.string.six);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Check a Number is Even or Odd")){
                flag.setText(R.string.seven);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Find Largest Number Among Three Numbers")){
                flag.setText(R.string.eight);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Check Leap Year")){
                flag.setText(R.string.nine);
            }

            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Check Number is Positive/Negative")){
                flag.setText(R.string.ten);
            }
            else if(mtoolbar.getTitle().toString().equalsIgnoreCase("Sum Numbers Using for Loop")){
                flag.setText(R.string.eleven);
            }


        }

        setSupportActionBar(mtoolbar);
        //-------back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);





        trybtnId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webValue=3;
                Intent intent=new Intent(C_ProgramDisplay.this,Java_Compiler.class);
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
