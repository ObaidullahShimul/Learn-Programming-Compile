package www.shimul.com.learncjavapythonprogramming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ListAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Java_Tutorial_ChapterList extends AppCompatActivity {


    //------menu-bar----------
    private ExpandableListView expandableListView;
    private JavaCustomAdapter customadapter;
    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;
    private int lastexpandposition=-1;

    public static int ja=0;

    //Toolbar toolbarTutorialList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java__tutorial__chapter_list);

        setTitle("Java Tutorials");
        //-------menu-bar-----------
        prepareListData();
        expandableListView= (ExpandableListView) findViewById(R.id.javaExpandablelistviewId);
        //----menu custome adapter
        customadapter= new JavaCustomAdapter(this,listDataHeader,listDataChild);
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
                    case "About Java":
                        ja=1;
                        Intent intentchild=new Intent(Java_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Overview":
                        ja=2;
                        Intent intentchild=new Intent(Java_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Java Variable":
                        ja=3;
                        Intent intentchild=new Intent(Java_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }


                switch(selected) {
                    case "Java Operators":
                        ja=4;
                        Intent intentchild=new Intent(Java_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Java Keywords":
                        ja=5;
                        Intent intentchild=new Intent(Java_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Control Statements":
                        ja=6;
                        Intent intentchild=new Intent(Java_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Java Switch":
                        ja=7;
                        Intent intentchild=new Intent(Java_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Loops in Java":
                        ja=8;
                        Intent intentchild=new Intent(Java_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Java Break":
                        ja=9;
                        Intent intentchild=new Intent(Java_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Java Continue":
                        ja=10;
                        Intent intentchild=new Intent(Java_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Java Comments":
                        ja=11;
                        Intent intentchild=new Intent(Java_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Java OOP Concepts":
                        ja=12;
                        Intent intentchild=new Intent(Java_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Constructor":
                        ja=13;
                        Intent intentchild=new Intent(Java_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Java Inheritance":
                        ja=14;
                        Intent intentchild=new Intent(Java_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Method Overloading":
                        ja=15;
                        Intent intentchild=new Intent(Java_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Method Overriding":
                        ja=16;
                        Intent intentchild=new Intent(Java_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Abstraction":
                        ja=17;
                        Intent intentchild=new Intent(Java_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Interface":
                        ja=18;
                        Intent intentchild=new Intent(Java_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Java Array":
                        ja=19;
                        Intent intentchild=new Intent(Java_Tutorial_ChapterList.this,C_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }


                switch(selected) {
                    case "Access Modifier":
                        ja=20;
                        Intent intentchild=new Intent(Java_Tutorial_ChapterList.this,C_TutorialDisplay.class);
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

        listDataHeader.add("\t\tIntroduction");

        List<String> Intro = new ArrayList<>();
        Intro.add("About Java");
        Intro.add("Overview");
        listDataChild.put(listDataHeader.get(0), Intro);

        //------header no 2 and its child----------
        listDataHeader.add("\t\tChapter 1");

        List<String> Chap1 = new ArrayList<>();
        Chap1.add("Java Variable");
        Chap1.add("Java Operators");
        Chap1.add("Java Keywords");
        //Chap1.add("");
        listDataChild.put(listDataHeader.get(1), Chap1);


        //------header no 2 and its child----------
        listDataHeader.add("\t\tChapter 2");

        List<String> Chap2 = new ArrayList<>();
        Chap2.add("Control Statements");
        Chap2.add("Java Switch");
        Chap2.add("Loops in Java");
        listDataChild.put(listDataHeader.get(2),Chap2);

        listDataHeader.add("\t\tChapter 3");

        List<String> Chap3 = new ArrayList<>();
        Chap3.add("Java Break");
        Chap3.add("Java Continue");
        Chap3.add("Java Comments");
        listDataChild.put(listDataHeader.get(3), Chap3);


        listDataHeader.add("\t\tChapter 4");

        List<String> Chap4 = new ArrayList<>();
        Chap4.add("Java OOP Concepts");
        Chap4.add("Constructor");
        listDataChild.put(listDataHeader.get(4), Chap4);


        listDataHeader.add("\t\tChapter 5");

        List<String> Chap5 = new ArrayList<>();
        Chap5.add("Java Inheritance");
        //Chap5.add("File and I/O");
        //Chap5.add("Exceptions");
        listDataChild.put(listDataHeader.get(5), Chap5);



        listDataHeader.add("\t\tChapter 6");

        List<String> Chap6 = new ArrayList<>();
        Chap6.add("Method Overloading");
        Chap6.add("Method Overriding");
        listDataChild.put(listDataHeader.get(6), Chap6);



        listDataHeader.add("\t\tChapter 7");

        List<String> Chap7 = new ArrayList<>();
        Chap7.add("Abstraction");
        Chap7.add("Interface");
        listDataChild.put(listDataHeader.get(7), Chap7);


        listDataHeader.add("\t\tChapter 8");

        List<String> Chap8 = new ArrayList<>();
        Chap8.add("Java Array");
        listDataChild.put(listDataHeader.get(8), Chap8);

        listDataHeader.add("\t\tChapter 9");

        List<String> Chap9 = new ArrayList<>();
        Chap9.add("Access Modifier");
        //Chap9.add("Collection");
        listDataChild.put(listDataHeader.get(9), Chap9);



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
