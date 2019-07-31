package www.shimul.com.learncjavapythonprogramming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import static www.shimul.com.learncjavapythonprogramming.C_Tutorial_ChapterList.cT;
import static www.shimul.com.learncjavapythonprogramming.Java_Tutorial_ChapterList.ja;

public class C_TutorialDisplay extends AppCompatActivity {

    TextView tutorialText;
    Toolbar toolbarTutorialDis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c__tutorial_display);


        //flag= (ImageView) findViewById(R.id.imgflag);
        toolbarTutorialDis= (Toolbar) findViewById(R.id.toolbarTutorialDisplay);
        tutorialText= (TextView) findViewById(R.id.tutorialText);

        //trybtnId= (Button) findViewById(R.id.trybtnId);

        //showTutorialDiscription();

        if(cT==1){
            toolbarTutorialDis.setTitle("About C");
            tutorialText.setText(R.string.aboutc);
        }

        else if(cT==2){
            toolbarTutorialDis.setTitle("Overview");
            tutorialText.setText(R.string.overview);
        }

        else if(cT==3){
            toolbarTutorialDis.setTitle("Basic Syntax");
            tutorialText.setText(R.string.basicsyn);
        }

        else if(cT==4){
            toolbarTutorialDis.setTitle("Data Type");
            tutorialText.setText(R.string.datatype);
        }

        else if(cT==5){
            toolbarTutorialDis.setTitle("Variable");
            tutorialText.setText(R.string.variable);
        }

        else if(cT==6){
            toolbarTutorialDis.setTitle("Constant");
            tutorialText.setText(R.string.constant);
        }

        else if(cT==7){
            toolbarTutorialDis.setTitle("Storage Classes");
            tutorialText.setText(R.string.storageclass);
        }

        else if(cT==8){
            toolbarTutorialDis.setTitle("Operators");
            tutorialText.setText(R.string.operators);
        }

        else if(cT==9){
            toolbarTutorialDis.setTitle("Decision Making");
            tutorialText.setText(R.string.decision);
        }

        else if(cT==10){
            toolbarTutorialDis.setTitle("Loop");
            tutorialText.setText(R.string.loop);
        }

        else if(cT==11){
            toolbarTutorialDis.setTitle("Function");
            tutorialText.setText(R.string.function);
        }

        else if(cT==12){
            toolbarTutorialDis.setTitle("Scoper Rule");
            tutorialText.setText(R.string.scoperule);
        }

        else if(cT==13){
            toolbarTutorialDis.setTitle("Array");
            tutorialText.setText(R.string.array);
        }

        else if(cT==14){
            toolbarTutorialDis.setTitle("Pointer");
            tutorialText.setText(R.string.pointer);
        }

        else if(cT==15){
            toolbarTutorialDis.setTitle("String");
            tutorialText.setText(R.string.darinda);
        }

        else if(cT==16){
            toolbarTutorialDis.setTitle("Structure");
            tutorialText.setText(R.string.structure);
        }

        else if(cT==17){
            toolbarTutorialDis.setTitle("Union");
            tutorialText.setText(R.string.unions);
        }

        else if(cT==18){
            toolbarTutorialDis.setTitle("Bit Fields");
            tutorialText.setText(R.string.bitfields);
        }



        else if(cT==19){
            toolbarTutorialDis.setTitle("Input and Output");
            tutorialText.setText(R.string.input_ouput);
        }

        else if(cT==20){
            toolbarTutorialDis.setTitle("File I/O");
            tutorialText.setText(R.string.file_io);
        }

        else if(cT==21){
            toolbarTutorialDis.setTitle("Preprocessor");
            tutorialText.setText(R.string.processor);
        }

        else if(cT==22){
            toolbarTutorialDis.setTitle("Header File");
            tutorialText.setText(R.string.header_file);
        }

        else if(cT==23){
            toolbarTutorialDis.setTitle("Type Casting");
            tutorialText.setText(R.string.typecusting);
        }

        else if(cT==24){
            toolbarTutorialDis.setTitle("Error Handiling");
            tutorialText.setText(R.string.vurida);
        }

        else if(cT==25){
            toolbarTutorialDis.setTitle("Recursion");
            tutorialText.setText(R.string.recursion);
        }

        else if(cT==26){
            toolbarTutorialDis.setTitle("Variable Arguments");
            tutorialText.setText(R.string.variable_argument);
        }

        else if(cT==27){
            toolbarTutorialDis.setTitle("Memory Management");
            tutorialText.setText(R.string.memory_man);
        }
        else if(cT==28){
            toolbarTutorialDis.setTitle("Command Line Argument");
            tutorialText.setText(R.string.command_line);
        }




        //-------------------java----------------------

        if(ja==1){
            toolbarTutorialDis.setTitle("About Java");
            tutorialText.setText(R.string.aboutjava);
        }

        if(ja==2){
            toolbarTutorialDis.setTitle("Overview of Java");
            tutorialText.setText(R.string.javaoverview);
        }

        if(ja==3){
            toolbarTutorialDis.setTitle("Java Variables");
            tutorialText.setText(R.string.javavariable);
        }

         if(ja==4){
            toolbarTutorialDis.setTitle("Java Operators");
            tutorialText.setText(R.string.javaOperators);
        }

        else if(ja==5){
            toolbarTutorialDis.setTitle("Java Keywords");
            tutorialText.setText(R.string.javaKeywords);
        }

        else if(ja==6){
            toolbarTutorialDis.setTitle("Java Control Statements");
            tutorialText.setText(R.string.javaControlStatement);
        }

        else if(ja==7){
            toolbarTutorialDis.setTitle("Java Switch");
            tutorialText.setText(R.string.javaSwitchs);
        }

        else if(ja==8){
            toolbarTutorialDis.setTitle("Loops in Java");
            tutorialText.setText(R.string.javaLoops);
        }

        else if(ja==9){
            toolbarTutorialDis.setTitle("Java Break");
            tutorialText.setText(R.string.javaBreak);
        }

        else if(ja==10){
            toolbarTutorialDis.setTitle("Java Continue");
            tutorialText.setText(R.string.javaContinue);
        }

        else if(ja==11){
            toolbarTutorialDis.setTitle("Java Comments");
            tutorialText.setText(R.string.javaComments);
        }

        else if(ja==12){
            toolbarTutorialDis.setTitle("Java OOP Concepts");
            tutorialText.setText(R.string.javaOopConcept);
        }

        else if(ja==13){
            toolbarTutorialDis.setTitle("Java Constructor");
            tutorialText.setText(R.string.javaConstructor);
        }

        else if(ja==14){
            toolbarTutorialDis.setTitle("Java Inheritance");
            tutorialText.setText(R.string.javaInheritance);
        }

        else if(ja==15){
            toolbarTutorialDis.setTitle("Method Overloading");
            tutorialText.setText(R.string.javaOverloading);
        }

        else if(ja==16){
            toolbarTutorialDis.setTitle("Method Overriding");
            tutorialText.setText(R.string.javaOverriding);
        }

        else if(ja==17){
            toolbarTutorialDis.setTitle("Abstraction");
            tutorialText.setText(R.string.javaOverriding);
        }

        else if(ja==18){
            toolbarTutorialDis.setTitle("Interface");
            tutorialText.setText(R.string.javaOverriding);
        }

        else if(ja==19){
            toolbarTutorialDis.setTitle("Java Array");
            tutorialText.setText(R.string.javaArray);
        }

        else if(ja==20){
            toolbarTutorialDis.setTitle("Access Modifer in Java");
            tutorialText.setText(R.string.javaAccessModifer);
        }


       /* Bundle bundle=getIntent().getExtras();
        if (bundle!=null) {
            toolbarTutorialDis.setTitle(bundle.getString("Tutorial_discription"));
            if (toolbarTutorialDis.getTitle().toString().equalsIgnoreCase("About_C")) {
                tutorialText.setText(R.string.aboutc);
            }


        }*/

        setSupportActionBar(toolbarTutorialDis);
        //-------back button-------------
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



    }

    //----back button--------
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            this.finish();
            ja=0;
            cT=0;
        }
        return super.onOptionsItemSelected(item);
    }


}
