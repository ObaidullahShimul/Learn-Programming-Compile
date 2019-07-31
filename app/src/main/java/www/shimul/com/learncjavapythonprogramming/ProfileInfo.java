package www.shimul.com.learncjavapythonprogramming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import static www.shimul.com.learncjavapythonprogramming.C_Quiz.lastMark_in_C;
import static www.shimul.com.learncjavapythonprogramming.Java_Quiz.lastMark_in_Java;
import static www.shimul.com.learncjavapythonprogramming.Python_Quiz.lastMark_in_Python;

public class ProfileInfo extends AppCompatActivity {

    TextView userEmail;
    Button userLogout;

    TextView cMarks,jMarks,pMarks;

    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_info);

        setTitle("Profile");

        userEmail = findViewById(R.id.userEmailShowId);
        userLogout = findViewById(R.id.profileLogOutbtnId);

        firebaseAuth = FirebaseAuth.getInstance();
        firebaseUser = firebaseAuth.getCurrentUser();

        userEmail.setText(firebaseUser.getEmail());

        //------------------------marks display----------------
        cMarks=findViewById(R.id.cMarksId);
        jMarks=findViewById(R.id.jMarksId);
        pMarks=findViewById(R.id.pMarksId);

        cMarks.setText(Integer.toString(lastMark_in_C));
        jMarks.setText(Integer.toString(lastMark_in_Java));
        pMarks.setText(Integer.toString(lastMark_in_Python));


        //--------------------User Log Out---------------------
        userLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(ProfileInfo.this, LogInMain.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });



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
