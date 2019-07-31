package www.shimul.com.learncjavapythonprogramming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class C_InterViewQuestion extends AppCompatActivity {


    //Toolbar toolbarInterviewq;

    private ExpandableListView importantQlistviewId;

    private C_InterviewCustomAdapter customAdapter_team;

    //
    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;

    private int lastexpandposition=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c__inter_view_question);


        //toolbarInterviewq= (Toolbar) findViewById(R.id.toolbarInterviewQ);
        //toolbarInterviewq.setTitle("Interview Question");
        setTitle("C Interview Questions");

        prepareListData();

        importantQlistviewId= (ExpandableListView) findViewById(R.id.importantQlistviewId);

        ///
        customAdapter_team=new C_InterviewCustomAdapter(this,listDataHeader,listDataChild);
        importantQlistviewId.setAdapter(customAdapter_team);

        //listaner add
        importantQlistviewId.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int i, long id) {
                String groupName=listDataHeader.get(i);
                //Toast.makeText(getApplicationContext(),groupName,Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        //child listanter add
        importantQlistviewId.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int i, int i1, long id) {
                String child=listDataChild.get(listDataHeader.get(i)).get(i1);

                //final String selected = (String) customadapter.getChild(i, i1);

                // Switch case to open selected child element activity on child element selection.



                //Toast.makeText(getApplicationContext(),"Child Name: "+child,Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        ////
        importantQlistviewId.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int i) {
                if (lastexpandposition!=-1 && lastexpandposition!=i){
                    importantQlistviewId.collapseGroup(lastexpandposition);
                }

                lastexpandposition=i;
            }
        });
    }

    private void prepareListData() {

        listDataHeader=new ArrayList<>();
        listDataChild=new HashMap<>();

        listDataHeader.add("(01) \tWhat is C language?");
        List<String> q1=new ArrayList<>();
        q1.add("C language is a structure/procedure oriented, middle level " +
                "programming language developed at Bell Laboratories in 1972 by Dennis Ritchie.\n" + "\n");
        listDataChild.put(listDataHeader.get(0),q1);

        listDataHeader.add("(02) \tWho Developed C Language?");
        List<String> q2=new ArrayList<>();
        q2.add("C programming language was developed at Bell Laboratories in 1972 by Dennis Ritchie.");

        listDataChild.put(listDataHeader.get(1),q2);


        listDataHeader.add("(03) \tWhat is keyword auto for?");
        List<String> q3=new ArrayList<>();
        q3.add("By default every local variable of the function is automatic (auto). In the below function both the variables ‘i’ and ‘j’ are automatic variables.");

        listDataChild.put(listDataHeader.get(2),q3);


        listDataHeader.add("(04) \tWhat is a static variable?");
        List<String> q4=new ArrayList<>();
        q4.add("A static local variables retains its value between the function call and the default value is 0. The following function will print 1 2 3 if called thrice.");
        listDataChild.put(listDataHeader.get(3),q4);

        listDataHeader.add("(05) \tWhat is a NULL pointer?");
        List<String> q5=new ArrayList<>();
        q5.add("A pointer pointing to nothing is called so. Eg: char *p=NULL;");

        listDataChild.put(listDataHeader.get(4),q5);


        listDataHeader.add("(06) \tWhat is the meaning of base address of the array?");
        List<String> q6=new ArrayList<>();
        q6.add("The starting address of the array is called as the base address of the array.");

        listDataChild.put(listDataHeader.get(5),q6);

        listDataHeader.add("(07) \tWhere is C programming language used or uses of C language?");
        List<String> q7=new ArrayList<>();
        q7.add("C language is used to develop system applications that forms major portion " +
                "of operating systems such as Windows, UNIX and Linux. Operating systems, " +
                "C compiler and all UNIX application programs are written in C language. ");

        listDataChild.put(listDataHeader.get(6),q7);

        listDataHeader.add("(08) \tWhat is a dangling pointer?");
        List<String> q8=new ArrayList<>();
        q8.add("A pointer initially holding valid address, but later the held address is released or freed. Then such a pointer is called as dangling pointer.");

        listDataChild.put(listDataHeader.get(7),q8);


        listDataHeader.add("(09) \tWhat is the purpose of the keyword typedef?");
        List<String> q9=new ArrayList<>();
        q9.add("It is used to alias the existing type. Also used to simplify the complex declaration of the type.");

        listDataChild.put(listDataHeader.get(8),q9);


        listDataHeader.add("(10) \tWhat is lvalue and rvalue?");
        List<String> q10=new ArrayList<>();
        q10.add("The expression appearing on right side of the assignment operator is called as rvalue. Rvalue is assigned to lvalue, which appears on left side of the assignment operator. The lvalue should designate to a variable not a constant.");

        listDataChild.put(listDataHeader.get(9),q10);


        listDataHeader.add("(11) \tWhat is the difference between actual and formal parameters?");
        List<String> q11=new ArrayList<>();
        q11.add("The parameters sent to the function at calling end are called as actual parameters while at the receiving of the function definition called as formal parameters.");

        listDataChild.put(listDataHeader.get(10),q11);


        listDataHeader.add("(12) \tWhat is the difference between actual and formal parameters?");
        List<String> q12=new ArrayList<>();
        q12.add("The parameters sent to the function at calling end are called as actual parameters while at the receiving of the function definition called as formal parameters.");

        listDataChild.put(listDataHeader.get(11),q12);


        listDataHeader.add("(13) \tCan a program be compiled without main() function?");
        List<String> q13=new ArrayList<>();
        q13.add("Yes, it can be but cannot be executed, as the execution requires main() function definition.");

        listDataChild.put(listDataHeader.get(12),q13);


        listDataHeader.add("(14) \tWhat is the advantage of declaring void pointers?");
        List<String> q14=new ArrayList<>();
        q14.add("Yes, it can be but cannot be executed, as the execution requires main() function definition.");

        listDataChild.put(listDataHeader.get(13),q14);


        listDataHeader.add("(15) \tWhat is the advantage of declaring void pointers?");
        List<String> q15=new ArrayList<>();
        q15.add("When we do not know what type of the memory address the pointer variable is going to hold, then we declare a void pointer for such.");

        listDataChild.put(listDataHeader.get(14),q15);


        listDataHeader.add("(16) \tWhere an automatic variable is stored?");
        List<String> q16=new ArrayList<>();
        q16.add("Every local variable by default being an auto variable is stored in stack memory.");

        listDataChild.put(listDataHeader.get(15),q16);


        listDataHeader.add("(17) \tWhat is a nested structure?");
        List<String> q17=new ArrayList<>();
        q17.add("A structure containing an element of another structure as its member is referred so.");

        listDataChild.put(listDataHeader.get(16),q17);

        listDataHeader.add("(18) \tWhat is the difference between variable declaration and variable definition?");
        List<String> q18=new ArrayList<>();
        q18.add("Declaration associates type to the variable whereas definition gives the value to the variable.");

        listDataChild.put(listDataHeader.get(17),q18);



        listDataHeader.add("(19) \tWhat is a self-referential structure?");
        List<String> q19=new ArrayList<>();
        q19.add("A structure containing the same structure pointer variable as its element is called as self-referential structure.");

        listDataChild.put(listDataHeader.get(18),q19);

        listDataHeader.add("(20) \tDoes a built-in header file contains built-in function definition?");
        List<String> q20=new ArrayList<>();
        q20.add("No, the header file only declares function. The definition is in library which is linked by the linker.");

        listDataChild.put(listDataHeader.get(19),q20);


        listDataHeader.add("(21) \tExplain modular programming.");
        List<String> q21=new ArrayList<>();
        q21.add("Dividing the program in to sub programs (modules/function) to achieve the given task is modular approach. More generic functions definition gives the ability to re-use the functions, such as built-in library functions.");

        listDataChild.put(listDataHeader.get(20),q21);


        listDataHeader.add("(22) \tWhat is a token?");
        List<String> q22=new ArrayList<>();
        q22.add("A C program consists of various tokens and a token is either a keyword, an identifier, a constant, a string literal, or a symbol.");

        listDataChild.put(listDataHeader.get(21),q22);


        listDataHeader.add("(23) \tWhat is a preprocessor?");
        List<String> q23=new ArrayList<>();
        q23.add("Preprocessor is a directive to the compiler to perform certain things before the actual compilation process begins.");

        listDataChild.put(listDataHeader.get(22),q23);


        listDataHeader.add("(24) \tExplain the use of %i format specifier w.r.t scanf().");
        List<String> q24=new ArrayList<>();
        q24.add("Can be used to input integer in all the supported format.");

        listDataChild.put(listDataHeader.get(23),q24);

        listDataHeader.add("(25) \tDoes a break is required by default case in switch statement?");
        List<String> q25=new ArrayList<>();
        q25.add("Yes, if it is not appearing as the last case and if we do not want the control to flow to the following case after default if any.");

        listDataChild.put(listDataHeader.get(24),q25);


        listDataHeader.add("(26) \tWhen to user -> (arrow) operator.");
        List<String> q26=new ArrayList<>();
        q26.add("If the structure/union variable is a pointer variable, to access structure/union elements the arrow operator is used.");

        listDataChild.put(listDataHeader.get(25),q26);


        listDataHeader.add("(27) \tWhat are bit fields?");
        List<String> q27=new ArrayList<>();
        q27.add("We can create integer structure members of differing size apart from non-standard size using bit fields. Such structure size is automatically adjusted with the multiple of integer size of the machine.");

        listDataChild.put(listDataHeader.get(26),q27);


        listDataHeader.add("(28) \tWhat is a static function?");
        List<String> q28=new ArrayList<>();
        q28.add("A function’s definition prefixed with static keyword is called as a static function. You would make a function static if it should be called only within the same source code.");

        listDataChild.put(listDataHeader.get(27),q28);


        listDataHeader.add("(29) \tWhat are enumerations?");
        List<String> q29=new ArrayList<>();
        q29.add("Enumerations are list of integer constants with name. Enumerators are defined with the keyword enum.");

        listDataChild.put(listDataHeader.get(28),q29);

        listDataHeader.add("(30) \tWhat is a variable?");
        List<String> q30=new ArrayList<>();
        q30.add("A variable is the name storage.");

        listDataChild.put(listDataHeader.get(29),q30);

        listDataHeader.add("(31) \tWho designed C programming language?");
        List<String> q31=new ArrayList<>();
        q31.add("Dennis M Ritchie.");

        listDataChild.put(listDataHeader.get(30),q31);

        listDataHeader.add("(32) \tWhat is the full form of ANSI?");
        List<String> q32=new ArrayList<>();
        q32.add("American National Standards Institute.");

        listDataChild.put(listDataHeader.get(31),q32);

        listDataHeader.add("(33) \tIs 068 a valid octal number?");
        List<String> q33=new ArrayList<>();
        q33.add("No, it contains invalid octal digits.");

        listDataChild.put(listDataHeader.get(32),q33);

        listDataHeader.add("(34) \tWhat it the return value of a relational operator if it returns any?");
        List<String> q34=new ArrayList<>();
        q34.add("Return a value 1 if the relation between the expressions is true, else 0.");

        listDataChild.put(listDataHeader.get(33),q34);


        listDataHeader.add("(35) \tWhat is an infinite loop?");
        List<String> q35=new ArrayList<>();
        q35.add("A loop executing repeatedly as the loop-expression always evaluates to true such as\n" +
                "\n" +
                "while(0 == 0) {\n" +
                "}.");

        listDataChild.put(listDataHeader.get(34),q35);


        listDataHeader.add("(36) \tWhat is the default value of local and global variables?");
        List<String> q36=new ArrayList<>();
        q36.add("Local variables get garbage value and global variables get a value 0 by default.");

        listDataChild.put(listDataHeader.get(35),q36);


        listDataHeader.add("(37) \tCan a pointer access the array?");
        List<String> q37=new ArrayList<>();
        q37.add("Pointer by holding array’s base address can access the array.");

        listDataChild.put(listDataHeader.get(36),q37);


        listDataHeader.add("(38) \tWhat is a string length?");
        List<String> q38=new ArrayList<>();
        q38.add("It is the count of character excluding the ‘\\0’ character.");

        listDataChild.put(listDataHeader.get(37),q38);


        listDataHeader.add("(39) \tDefine a structure.");
        List<String> q39=new ArrayList<>();
        q39.add("A structure can be defined of collection of heterogeneous data items.");

        listDataChild.put(listDataHeader.get(38),q39);

        listDataHeader.add("(40) \tWhat is typecasting?");
        List<String> q40=new ArrayList<>();
        q40.add("Typecasting is a way to convert a variable/constant from one type to another type..");

        listDataChild.put(listDataHeader.get(39),q40);


        listDataHeader.add("(41) \tWhat is recursion?");
        List<String> q41=new ArrayList<>();
        q41.add("Function calling itself is called as recursion.");

        listDataChild.put(listDataHeader.get(40),q41);


        listDataHeader.add("(42) \tWhat is recursion?");
        List<String> q42=new ArrayList<>();
        q42.add("Function calling itself is called as recursion.");

        listDataChild.put(listDataHeader.get(41),q42);


        listDataHeader.add("(43) \tWhat is the maximum length of an identifier?");
        List<String> q43=new ArrayList<>();
        q43.add("Ideally it is 32 characters and also implementation dependent.");

        listDataChild.put(listDataHeader.get(42),q43);


        listDataHeader.add("(44) \tWhat is the default function call method?");
        List<String> q44=new ArrayList<>();
        q44.add("By default the functions are called by value.");

        listDataChild.put(listDataHeader.get(43),q44);

        listDataHeader.add("(45) \tWhat is the default function call method?");
        List<String> q45=new ArrayList<>();
        q45.add("By default the functions are called by value.");

        listDataChild.put(listDataHeader.get(44),q45);


        listDataHeader.add("(46) \tWhat is a constant pointer?");
        List<String> q46=new ArrayList<>();
        q46.add("A pointer which is not allowed to be altered to hold another address after it is holding one.");

        listDataChild.put(listDataHeader.get(45),q46);


        listDataHeader.add("(47) \tIs there a way to compare two structure variables?");
        List<String> q47=new ArrayList<>();
        q47.add("There is no such. We need to compare element by element of the structure variables.");

        listDataChild.put(listDataHeader.get(46),q47);

        listDataHeader.add("(48) \tWhat is a constant?");
        List<String> q48=new ArrayList<>();
        q48.add("A value which cannot be modified is called so. Such variables are qualified with the keyword const.");

        listDataChild.put(listDataHeader.get(47),q48);

        listDataHeader.add("(49) \tCan one function call another?");
        List<String> q49=new ArrayList<>();
        q49.add("Yes, any user defined function can call any function.");

        listDataChild.put(listDataHeader.get(48),q49);


        listDataHeader.add("(50) \tCan the structure variable be initialized as soon as it is declared?");
        List<String> q50=new ArrayList<>();
        q50.add("Yes, w.r.t the order of structure elements only.");

        listDataChild.put(listDataHeader.get(49),q50);


        //-------back button
        //setSupportActionBar(toolbarInterviewq);
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
