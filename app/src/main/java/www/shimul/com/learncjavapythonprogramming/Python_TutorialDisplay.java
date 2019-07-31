package www.shimul.com.learncjavapythonprogramming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import static www.shimul.com.learncjavapythonprogramming.C_Tutorial_ChapterList.cT;
import static www.shimul.com.learncjavapythonprogramming.Java_Tutorial_ChapterList.ja;
import static www.shimul.com.learncjavapythonprogramming.Python_Tutorial_ChapterList.py;

public class Python_TutorialDisplay extends AppCompatActivity {

    TextView tutorialText;
    Toolbar toolbarTutorialDis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python__tutorial_display);


        //flag= (ImageView) findViewById(R.id.imgflag);
        toolbarTutorialDis= (Toolbar) findViewById(R.id.toolbarTutorialDisplay);
        tutorialText= (TextView) findViewById(R.id.tutorialText);

        //trybtnId= (Button) findViewById(R.id.trybtnId);

        //showTutorialDiscription();

        if(py==1){
            toolbarTutorialDis.setTitle("About Python");
            tutorialText.setText(R.string.pyIntroduction);
        }

        else if(py==2){
            toolbarTutorialDis.setTitle("Python Features");
            tutorialText.setText(R.string.pyFeatures);
        }

        else if(py==3){
            toolbarTutorialDis.setTitle("Python Variables");
            tutorialText.setText(R.string.pyVariable);
        }

        else if(py==4){
            toolbarTutorialDis.setTitle("Python Data Types");
            tutorialText.setText(R.string.pyDataTypes);
        }

        else if(py==5){
            toolbarTutorialDis.setTitle("Python Keywords");
            tutorialText.setText(R.string.pyKeywords);
        }

        else if(py==6){
            toolbarTutorialDis.setTitle("Python Operators");
            tutorialText.setText(R.string.pyOperators);
        }

        else if(py==7){
            toolbarTutorialDis.setTitle("Python Comments");
            tutorialText.setText(R.string.pyComments);
        }

        else if(py==8){
            toolbarTutorialDis.setTitle("Python Literals");
            tutorialText.setText(R.string.pyLiterals);
        }

        else if(py==9){
            toolbarTutorialDis.setTitle("Python Decision Making");
            tutorialText.setText(R.string.pyIfelse);
        }

        else if(py==10){
            toolbarTutorialDis.setTitle("Python Loops");
            tutorialText.setText(R.string.pyLoops);
        }

        else if(py==11){
            toolbarTutorialDis.setTitle("Python Break and Continue");
            tutorialText.setText(R.string.pyBreak);
        }

        else if(py==12){
            toolbarTutorialDis.setTitle("Python Pass");
            tutorialText.setText(R.string.pyPass);
        }

        else if(py==13){
            toolbarTutorialDis.setTitle("Python Lists");
            tutorialText.setText(R.string.pyList);
        }

        else if(py==14){
            toolbarTutorialDis.setTitle("Python Tuples");
            tutorialText.setText(R.string.pyTuples);
        }

        else if(py==15){
            toolbarTutorialDis.setTitle("Python Sets");
            tutorialText.setText(R.string.pySets);
        }

        else if(py==16){
            toolbarTutorialDis.setTitle("Python Dictionary");
            tutorialText.setText(R.string.pyDictionary);
        }

        else if(py==17){
            toolbarTutorialDis.setTitle("Python Functions");
            tutorialText.setText(R.string.pyFunction);
        }

        else if(py==18){
            toolbarTutorialDis.setTitle("Python Modules");
            tutorialText.setText(R.string.pyModule);
        }



        else if(py==19){
            toolbarTutorialDis.setTitle("Python Exception");
            tutorialText.setText(R.string.pyException);
        }

        else if(py==20){
            toolbarTutorialDis.setTitle("Python OOPs Concepts");
            tutorialText.setText(R.string.pyOOPconcepts);
        }

        else if(py==21){
            toolbarTutorialDis.setTitle("Python Object Class");
            tutorialText.setText(R.string.pyObjectandClasses);
        }

        else if(py==22){
            toolbarTutorialDis.setTitle("Python Constructors");
            tutorialText.setText(R.string.pyConstructor);
        }

        else if(py==23){
            toolbarTutorialDis.setTitle("Python Inheritance");
            tutorialText.setText(R.string.pyInheritance);
        }



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
            //ja=0;
            //cT=0;
        }
        return super.onOptionsItemSelected(item);
    }


}
