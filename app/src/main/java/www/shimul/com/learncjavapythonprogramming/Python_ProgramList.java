package www.shimul.com.learncjavapythonprogramming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Python_ProgramList extends AppCompatActivity {

    ListView listView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python__program_list);


        toolbar= (Toolbar) findViewById(R.id.pythontoolbar);
        toolbar.setTitle("Python Programs");

        listView= (ListView) findViewById(R.id.pythonProgramListViewId);

        String[] program_name=getResources().getStringArray(R.array.program_name);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Python_ProgramList.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.pythonProgram_name));
        //listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(Python_ProgramList.this,Python_ProgramDisplay.class);
                intent.putExtra("Python_Programs",listView.getItemAtPosition(position).toString());
                startActivity(intent);

            }
        });



        listView.setAdapter(adapter);

        setSupportActionBar(toolbar);
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
