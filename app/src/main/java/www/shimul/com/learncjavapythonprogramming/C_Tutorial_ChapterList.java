package www.shimul.com.learncjavapythonprogramming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class C_Tutorial_ChapterList extends AppCompatActivity {

    private ExpandableListView expandableListView;
    private JavaCustomAdapter customadapter;
    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;
    private int lastexpandposition=-1;

    public static int cT=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c__tutorial__chapter_list);


        setTitle("C Tutorials");
        //-------menu-bar-----------
        prepareListData();
        expandableListView= (ExpandableListView) findViewById(R.id.cExpandablelistviewId);
        //----menu custome adapter
        customadapter=new JavaCustomAdapter(this,listDataHeader,listDataChild);
        expandableListView.setAdapter(customadapter);

        //-----Group listener add-----
        expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int i, long id) {
                String groupName=listDataHeader.get(i);
                Toast.makeText(getApplicationContext(),groupName, Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        //-------child listener add--------
        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int i, int i1, long id) {
                String child=listDataChild.get(listDataHeader.get(i)).get(i1);

                final String selected = (String) customadapter.getChild(
                        i, i1);

                // Switch case to open selected child element activity on child element selection.


                //Intent intent;
                switch(selected) {
                    case "About C":
                        cT=1;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);

                        //intentchild.putExtra("Tutorial_discription",expandableListView.getItemAtPosition(i).toString());
                        startActivity(intentchild);
                        //break;
                }

                switch(selected) {
                    case "Overview":
                        cT=2;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Basic Syntax":
                        cT=3;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }


                switch(selected) {
                    case "Data Type":
                        cT=4;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Variable":
                        cT=5;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Constants":
                        cT=6;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Storage Classes":
                        cT=7;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Operators":
                        cT=8;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Decision Making":
                        cT=9;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Loop":
                        cT=10;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Function":
                        cT=11;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Scoper Rule":
                        cT=12;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Array":
                        cT=13;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Pointer":
                        cT=14;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "String":
                        cT=15;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Structure":
                        cT=16;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Union":
                        cT=17;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Bit Fields":
                        cT=18;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Input and Output":
                        cT=19;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }


                switch(selected) {
                    case "File I/O":
                        cT=20;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Preprocessor":
                        cT=21;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Header File":
                        cT=22;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Type Casting":
                        cT=23;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Error Handiling":
                        cT=24;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Recursion":
                        cT=25;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Variable Arguments":
                        cT=26;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }


                switch(selected) {
                    case "Memory Management":
                        cT=27;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Command Line Argument":
                        cT=28;
                        Intent intentchild=new Intent(C_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }



                //Toast.makeText(getApplicationContext(),"Child Name: "+child,Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        //------ only single menu selected----
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int i) {
                if (lastexpandposition!=-1 && lastexpandposition!=i){
                    expandableListView.collapseGroup(lastexpandposition);
                }

                lastexpandposition=i;
            }
        });


        //-------back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


    }

    //------menu-bar-------
    private void prepareListData() {

        //String[] headerstring=getResources().getStringArray(R.array.header_title);
        //String[] childstring=getResources().getStringArray(R.array.child_title);

        //
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();

        listDataHeader.add("Introduction");

        List<String> Intro = new ArrayList<>();
        Intro.add("About C");
        Intro.add("Overview");
        listDataChild.put(listDataHeader.get(0), Intro);

        //------header no 2 and its child----------
        listDataHeader.add("Chapter 1");

        List<String> Chap1 = new ArrayList<>();
        Chap1.add("Basic Syntax");
        Chap1.add("Data Type");
        Chap1.add("Variable");
        Chap1.add("Constants");
        listDataChild.put(listDataHeader.get(1), Chap1);


        //------header no 2 and its child----------
        listDataHeader.add("Chapter 2");

        List<String> Chap2 = new ArrayList<>();
        Chap2.add("Storage Classes");
        Chap2.add("Operators");
        Chap2.add("Decision Making");
        listDataChild.put(listDataHeader.get(2),Chap2);

        listDataHeader.add("Chapter 3");

        List<String> Chap3 = new ArrayList<>();
        Chap3.add("Loop");
        Chap3.add("Function");
        listDataChild.put(listDataHeader.get(3), Chap3);


        listDataHeader.add("Chapter 4");

        List<String> Chap4 = new ArrayList<>();
        Chap4.add("Scoper Rule");
        Chap4.add("Array");
        listDataChild.put(listDataHeader.get(4), Chap4);


        listDataHeader.add("Chapter 5");

        List<String> Chap5 = new ArrayList<>();
        Chap5.add("Scoper Rule");
        Chap5.add("Array");
        listDataChild.put(listDataHeader.get(5), Chap5);



        listDataHeader.add("Chapter 6");

        List<String> Chap6 = new ArrayList<>();
        Chap6.add("Pointer");
        Chap6.add("String");
        Chap6.add("Structure");
        listDataChild.put(listDataHeader.get(6), Chap6);



        listDataHeader.add("Chapter 7");

        List<String> Chap7 = new ArrayList<>();
        Chap7.add("Union");
        Chap7.add("Bit Fields");
        listDataChild.put(listDataHeader.get(7), Chap7);


        listDataHeader.add("Chapter 8");

        List<String> Chap8 = new ArrayList<>();
        Chap8.add("Input and Output");
        Chap8.add("File I/O");
        Chap8.add("Preprocessor");
        listDataChild.put(listDataHeader.get(8), Chap8);

        listDataHeader.add("Chapter 9");

        List<String> Chap9 = new ArrayList<>();
        Chap9.add("Header File");
        Chap9.add("Type Casting");
        listDataChild.put(listDataHeader.get(9), Chap9);


        listDataHeader.add("Chapter 10");

        List<String> Chap10 = new ArrayList<>();
        Chap10.add("Error Handiling");
        Chap10.add("Recursion");
        listDataChild.put(listDataHeader.get(10), Chap10);


        listDataHeader.add("Chapter 11");

        List<String> Chap11 = new ArrayList<>();
        Chap11.add("Variable Arguments");
        Chap11.add("Memory Management");
        Chap11.add("Command Line Argument");
        listDataChild.put(listDataHeader.get(11), Chap11);




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
