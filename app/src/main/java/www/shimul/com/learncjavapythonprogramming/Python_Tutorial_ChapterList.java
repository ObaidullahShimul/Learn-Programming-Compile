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

public class Python_Tutorial_ChapterList extends AppCompatActivity {

    private ExpandableListView expandableListView;
    private JavaCustomAdapter customadapter;
    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;
    private int lastexpandposition=-1;

    public static int py=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python__tutorial__chapter_list);



        setTitle("Java Tutorials");
        //-------menu-bar-----------
        prepareListData();
        expandableListView= (ExpandableListView) findViewById(R.id.pExpandablelistviewId);
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
                    case "About Python":
                        py=1;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Python Features":
                        py=2;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Python Variables":
                        py=3;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }


                switch(selected) {
                    case "Python Data Types":
                        py=4;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Python Keywords":
                        py=5;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Python Operators":
                        py=6;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Python Comments":
                        py=7;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Python Literals":
                        py=8;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Python if else":
                        py=9;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Python Loops":
                        py=10;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Python Break and Continue":
                        py=11;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Python Pass":
                        py=12;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Python Lists":
                        py=13;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Python Tuples":
                        py=14;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Python Sets":
                        py=15;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Python Dictionary":
                        py=16;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Python Functions":
                        py=17;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Python Modules":
                        py=18;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Python Exception":
                        py=19;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }


                switch(selected) {
                    case "Python OOPs Concepts":
                        py=20;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }


                switch(selected) {
                    case "Python Object Class":
                        py=21;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }

                switch(selected) {
                    case "Python Constructors":
                        py=22;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
                        startActivity(intentchild);
                        break;
                }


                switch(selected) {
                    case "Python Inheritance":
                        py=23;
                        Intent intentchild=new Intent(Python_Tutorial_ChapterList.this,Python_TutorialDisplay.class);
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


        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<>();

        listDataHeader.add("\t\tIntroduction");
        List<String> Intro = new ArrayList<>();
        Intro.add("About Python");
        Intro.add("Python Features");
        listDataChild.put(listDataHeader.get(0), Intro);

        //------header no 2 and its child----------
        listDataHeader.add("\t\tChapter 1");
        List<String> Chap1 = new ArrayList<>();
        Chap1.add("Python Variables");
        Chap1.add("Python Data Types");
        Chap1.add("Python Keywords");
        //Chap1.add("");
        listDataChild.put(listDataHeader.get(1), Chap1);


        //------header no 2 and its child----------
        listDataHeader.add("\t\tChapter 2");

        List<String> Chap2 = new ArrayList<>();
        Chap2.add("Python Operators");
        Chap2.add("Python Comments");
        Chap2.add("Python Literals");
        listDataChild.put(listDataHeader.get(2),Chap2);

        listDataHeader.add("\t\tChapter 3");
        List<String> Chap3 = new ArrayList<>();
        Chap3.add("Python if else");
        Chap3.add("Python Loops");
        Chap3.add("Python Break and Continue");
        listDataChild.put(listDataHeader.get(3), Chap3);


        listDataHeader.add("\t\tChapter 4");
        List<String> Chap4 = new ArrayList<>();
        Chap4.add("Python Pass");
        Chap4.add("Python Lists");
        Chap4.add("Python Tuples");
        Chap4.add("Python Sets");
        listDataChild.put(listDataHeader.get(4), Chap4);


        listDataHeader.add("\t\tChapter 5");
        List<String> Chap5 = new ArrayList<>();
        Chap5.add("Python Dictionary");
        Chap5.add("Python Functions");
        listDataChild.put(listDataHeader.get(5), Chap5);


        listDataHeader.add("\t\tChapter 6");
        List<String> Chap6 = new ArrayList<>();
        Chap6.add("Python Modules");
        Chap6.add("Python Exception");
        listDataChild.put(listDataHeader.get(6), Chap6);

        listDataHeader.add("\t\tChapter 7");
        List<String> Chap7 = new ArrayList<>();
        Chap7.add("Python OOPs Concepts");
        Chap7.add("Python Object Class");
        listDataChild.put(listDataHeader.get(7), Chap7);



        listDataHeader.add("\t\tChapter 8");
        List<String> Chap8 = new ArrayList<>();
        Chap8.add("Python Constructors");
        Chap8.add("Python Inheritance");
        //Chap8.add("Interface");
        listDataChild.put(listDataHeader.get(8), Chap8);




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
