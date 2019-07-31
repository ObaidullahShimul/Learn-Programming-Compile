package www.shimul.com.learncjavapythonprogramming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Python_Interview extends AppCompatActivity {


    private ExpandableListView importantQlistviewId;

    private C_InterviewCustomAdapter customAdapter_team;

    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;

    private int lastexpandposition=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python__interview);


        setTitle("Python Interview Questions");

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

        listDataHeader.add("(01) \tWhat is Python?");
        List<String> q1=new ArrayList<>();
        q1.add("Python is a high-level, interpreted, interactive and object-oriented scripting language. Python is designed to be highly readable. " +
                "It uses English keywords frequently where as other languages use punctuation, and it has fewer syntactical " +
                "constructions than other languages.");
        listDataChild.put(listDataHeader.get(0),q1);

        listDataHeader.add("(02) \tWhat are the benefits of using Python?");
        List<String> q2=new ArrayList<>();
        q2.add("The benefits of pythons are that it is simple and easy, portable, extensible, build-in data structure and it is an open source.");

        listDataChild.put(listDataHeader.get(1),q2);


        listDataHeader.add("(03) \t What is PEP 8?");
        List<String> q3=new ArrayList<>();
        q3.add("PEP 8 is a coding convention, a set of recommendation, about how to write your Python code more readable.");

        listDataChild.put(listDataHeader.get(2),q3);


        listDataHeader.add("(04) \tWhat is pickling and unpickling?");
        List<String> q4=new ArrayList<>();
        q4.add("Pickle module accepts any Python object and converts it into a string representation and dumps it into a file by " +
                "using dump function, this process is called pickling. While the process of retrieving original Python objects " +
                "from the stored string representation is called unpickling.");
        listDataChild.put(listDataHeader.get(3),q4);

        listDataHeader.add("(05) \tHow Python is interpreted?");
        List<String> q5=new ArrayList<>();
        q5.add("Python language is an interpreted language. Python program runs directly from the source code. It converts the " +
                "source code that is written by the programmer into an intermediate language, which is again translated into " +
                "machine language that has to be executed.");

        listDataChild.put(listDataHeader.get(4),q5);


        listDataHeader.add("(06) \tWhat are Python decorators?");
        List<String> q6=new ArrayList<>();
        q6.add("A Python decorator is a specific change that we make in Python syntax to alter functions easily.");

        listDataChild.put(listDataHeader.get(5),q6);

        listDataHeader.add("(07) \tWhat is the difference between list and tuple?");
        List<String> q7=new ArrayList<>();
        q7.add("The difference between list and tuple is that list is mutable while tuple is not. Tuple can be hashed " +
                "for e.g as a key for dictionaries.");

        listDataChild.put(listDataHeader.get(6),q7);

        listDataHeader.add("(08) \tHow are arguments passed by value or by reference?");
        List<String> q8=new ArrayList<>();
        q8.add("Everything in Python is an object and all variables hold references to the objects. The references values are " +
                "according to the functions; as a result you cannot change the value of the references. However, you can " +
                "change the objects if it is mutable.");

        listDataChild.put(listDataHeader.get(7),q8);


        listDataHeader.add("(09) \tWhat is Dict and List comprehensions are?");
        List<String> q9=new ArrayList<>();
        q9.add("They are syntax constructions to ease the creation of a Dictionary or List based on existing iterable.");

        listDataChild.put(listDataHeader.get(8),q9);


        listDataHeader.add("(10) \tWhat are the built-in type does python provides?");
        List<String> q10=new ArrayList<>();
        q10.add("There are mutable and Immutable types of Pythons built in types\nMutable built-in types\n" +
                "\n" +
                "List\n" +
                "Sets\n" +
                "Dictionaries\n\nImmutable built-in types\n" +
                "\n" +
                "Strings\n" +
                "Tuples\n" +
                "Numbers");

        listDataChild.put(listDataHeader.get(9),q10);


        listDataHeader.add("(11) \tWhat is namespace in Python?");
        List<String> q11=new ArrayList<>();
        q11.add("In Python, every name introduced has a place where it lives and can be hooked for. This is known as namespace. " +
                "It is like a box where a variable name is mapped to the object placed. Whenever the variable is searched out, " +
                "this box will be searched, to get corresponding object.");

        listDataChild.put(listDataHeader.get(10),q11);


        listDataHeader.add("(12) \tWhat is lambda in Python?");
        List<String> q12=new ArrayList<>();
        q12.add("It is a single expression anonymous function often used as inline function.");

        listDataChild.put(listDataHeader.get(11),q12);


        listDataHeader.add("(13) \tWhy lambda forms in python does not have statements?");
        List<String> q13=new ArrayList<>();
        q13.add("A lambda form in python does not have statements as it is used to make new function object and then return " +
                "them at runtime.");

        listDataChild.put(listDataHeader.get(12),q13);


        listDataHeader.add("(14) \tWhat is pass in Python?");
        List<String> q14=new ArrayList<>();
        q14.add("Pass means, no-operation Python statement, or in other words it is a place holder in compound statement, where there should be a blank left and nothing has to be written there.");

        listDataChild.put(listDataHeader.get(13),q14);


        listDataHeader.add("(15) \t In Python what are iterators?");
        List<String> q15=new ArrayList<>();
        q15.add("In Python, iterators are used to iterate a group of elements, containers like list.");

        listDataChild.put(listDataHeader.get(14),q15);


        listDataHeader.add("(16) \tWhat is unittest in Python?");
        List<String> q16=new ArrayList<>();
        q16.add("A unit testing framework in Python is known as unittest. It supports sharing of setups, automation testing, shutdown code for tests, aggregation of tests into collections etc.");

        listDataChild.put(listDataHeader.get(15),q16);


        listDataHeader.add("(17) \t In Python what is slicing?");
        List<String> q17=new ArrayList<>();
        q17.add("A mechanism to select a range of items from sequence types like list, tuple, strings etc. is known as slicing.");

        listDataChild.put(listDataHeader.get(16),q17);

        listDataHeader.add("(18) \tWhat are generators in Python?");
        List<String> q18=new ArrayList<>();
        q18.add("The way of implementing iterators are known as generators. It is a normal function except that it yields expression in the function.");

        listDataChild.put(listDataHeader.get(17),q18);



        listDataHeader.add("(19) \tWhat is docstring in Python?");
        List<String> q19=new ArrayList<>();
        q19.add("A Python documentation string is known as docstring, it is a way of documenting Python functions, modules and classes.");

        listDataChild.put(listDataHeader.get(18),q19);

        listDataHeader.add("(20) \tHow can you copy an object in Python?");
        List<String> q20=new ArrayList<>();
        q20.add("To copy an object in Python, you can try copy.copy () or copy.deepcopy() for the general case. You cannot copy all objects but most of them.");

        listDataChild.put(listDataHeader.get(19),q20);


        listDataHeader.add("(21) \tWhat is negative index in Python?");
        List<String> q21=new ArrayList<>();
        q21.add("Python sequences can be index in positive and negative numbers. For positive index, 0 is the first index, " +
                "1 is the second index and so forth. For negative index, (-1) is the last index and (-2) is the second last " +
                "index and so forth.");

        listDataChild.put(listDataHeader.get(20),q21);


        listDataHeader.add("(22) \tHow you can convert a number to a string?");
        List<String> q22=new ArrayList<>();
        q22.add("In order to convert a number into a string, use the inbuilt function str(). If you want a octal or hexadecimal representation, use the inbuilt function oct() or hex().");

        listDataChild.put(listDataHeader.get(21),q22);


        listDataHeader.add("(23) \tWhat is the difference between Xrange and range?");
        List<String> q23=new ArrayList<>();
        q23.add("Xrange returns the xrange object while range returns the list, and uses the same memory and no matter what the range size is.");

        listDataChild.put(listDataHeader.get(22),q23);


        listDataHeader.add("(24) \tWhat is module and package in Python?");
        List<String> q24=new ArrayList<>();
        q24.add("In Python, module is the way to structure program. Each Python program file is a module, which imports other modules like objects and attributes.");

        listDataChild.put(listDataHeader.get(23),q24);

        listDataHeader.add("(25) \tMention what are the rules for local and global variables in Python?");
        List<String> q25=new ArrayList<>();
        q25.add("Local variables: If a variable is assigned a new value anywhere within the function's body, it's assumed to be local.\n" +
                "\n" +
                "Global variables: Those variables that are only referenced inside a function are implicitly global.");

        listDataChild.put(listDataHeader.get(24),q25);


        listDataHeader.add("(26) \tHow can you share global variables across modules?");
        List<String> q26=new ArrayList<>();
        q26.add("To share global variables across modules within a single program, create a special module. " +
                "Import the config module in all modules of your application. The module will be available as a global " +
                "variable across modules.");

        listDataChild.put(listDataHeader.get(25),q26);


        listDataHeader.add("(27) \t Explain how to delete a file in Python?");
        List<String> q27=new ArrayList<>();
        q27.add("By using a command os.remove (filename) or os.unlink(filename)");

        listDataChild.put(listDataHeader.get(26),q27);


        listDataHeader.add("(28) \t Mention the use of the split function in Python?");
        List<String> q28=new ArrayList<>();
        q28.add("The use of the split function in Python is that it breaks a string into shorter strings using the " +
                "defined separator. It gives a list of all words present in the string.");

        listDataChild.put(listDataHeader.get(27),q28);


        listDataHeader.add("(29) \tWhat is the difference between deep and shallow copy?");
        List<String> q29=new ArrayList<>();
        q29.add("hallow copy is used when a new instance type gets created and it keeps the values that are copied in the new " +
                "instance.\n\nDeep copy is used to store the values that are already copied. Deep copy doesn’t " +
                "copy the reference pointers to the objects. ");

        listDataChild.put(listDataHeader.get(28),q29);

        listDataHeader.add("(30) \tHow can the ternary operators be used in python?");
        List<String> q30=new ArrayList<>();
        q30.add("The Ternary operator is the operator that is used to show the conditional statements. " +
                "This consists of the true or false values with a statement that has to be evaluated for it.");

        listDataChild.put(listDataHeader.get(29),q30);

        listDataHeader.add("(31) \tExplain what Flask is and its benefits?");
        List<String> q31=new ArrayList<>();
        q31.add("Flask is a web microframework for Python based on “Werkzeug, Jinja2 and good intentions” BSD license. " +
                "Werkzeug and Jinja2 are two of its dependencies. This means it will have little to no dependencies on external " +
                "libraries.  It makes the framework light while there is a little dependency to update and fewer security bugs.");

        listDataChild.put(listDataHeader.get(30),q31);

        listDataHeader.add("(32) \tWhat is dictionary in Python?");
        List<String> q32=new ArrayList<>();
        q32.add("The built-in datatypes in Python is called dictionary. It defines one-to-one relationship between keys" +
                " and values. Dictionaries contain pair of keys and their corresponding values. Dictionaries are indexed by keys.");

        listDataChild.put(listDataHeader.get(31),q32);

        listDataHeader.add("(33) \tWhat is monkey patching in Python?");
        List<String> q33=new ArrayList<>();
        q33.add("In Python, the term monkey patch only refers to dynamic modifications of a class or module at run-time.");

        listDataChild.put(listDataHeader.get(32),q33);

        listDataHeader.add("(34) \tHow can you generate random numbers in Python?");
        List<String> q34=new ArrayList<>();
        q34.add("Random module is the standard module that is used to generate the random number. The method is defined as:\n" +
                "\n" +
                "1 import random\n" +
                "2 random.random");

        listDataChild.put(listDataHeader.get(33),q34);


        listDataHeader.add("(35) \t Mention the differences between Django, Pyramid and Flask.");
        List<String> q35=new ArrayList<>();
        q35.add("Flask is a “microframework” primarily build for a small application with simpler requirements. " +
                "In flask, you have to use external libraries. Flask is ready to use.\n\n" +
                "Pyramid is built for larger applications. It provides flexibility and lets the developer use " +
                "the right tools for their project. The developer can choose the database, URL structure, templating style and more. " +
                "Pyramid is heavy configurable.\n\n" +
                "Django can also used for larger applications just like Pyramid. It includes an ORM.");

        listDataChild.put(listDataHeader.get(34),q35);


        listDataHeader.add("(36) \tWhat is map function in Python?");
        List<String> q36=new ArrayList<>();
        q36.add("map function executes the function given as the first argument on all the elements of the iterable given " +
                "as the second argument. If the function given takes in more than 1 arguments, then many iterables are given. " +
                "#Follow the link to know more similar functions.");

        listDataChild.put(listDataHeader.get(35),q36);


        listDataHeader.add("(37) \tExplain the use of decorators.");
        List<String> q37=new ArrayList<>();
        q37.add("Decorators in Python are used to modify or inject code in functions or classes. Using decorators, " +
                "you can wrap a class or function method call so that a piece of code can be executed before or after " +
                "the execution of the original code. Decorators can be used to check for permissions, modify or track the " +
                "arguments passed to a method, logging the calls to a specific method, etc.");

        listDataChild.put(listDataHeader.get(36),q37);


        listDataHeader.add("(38) \tWhat is the purpose of PYTHONPATH environment variable?");
        List<String> q38=new ArrayList<>();
        q38.add("PYTHONPATH - It has a role similar to PATH. This variable tells the Python interpreter where " +
                "to locate the module files imported into a program. It should include the Python source library " +
                "directory and the directories containing Python source code.");

        listDataChild.put(listDataHeader.get(37),q38);


        listDataHeader.add("(39) \tIs python a case sensitive language?");
        List<String> q39=new ArrayList<>();
        q39.add("Yes! Python is a case sensitive programming language.");

        listDataChild.put(listDataHeader.get(38),q39);

        listDataHeader.add("(40) \tWhat are the supported data types in Python?");
        List<String> q40=new ArrayList<>();
        q40.add("Python has five standard data types −\n" +
                "\n" +
                "Numbers\n" +
                "\n" +
                "String\n" +
                "\n" +
                "List\n" +
                "\n" +
                "Tuple\n" +
                "\n" +
                "Dictionary");

        listDataChild.put(listDataHeader.get(39),q40);


        listDataHeader.add("(41) \tWhat is a Python module?");
        List<String> q41=new ArrayList<>();
        q41.add("A module is a Python script that generally contains import statements, functions, classes and variable definitions, " +
                "and Python runnable code and it “lives” file with a ‘.py’ extension. zip files and DLL files can also be modules.Inside the module, you can refer to the module name as a string that is stored in the global variable name .");

        listDataChild.put(listDataHeader.get(40),q41);


        listDataHeader.add("(42) \tExplain the use of with statement?");
        List<String> q42=new ArrayList<>();
        q42.add("In python generally “with” statement is used to open a file, process the data present in the file, and also to close the file without calling a close() method. “with” statement makes the exception handling simpler by providing cleanup activities.");

        listDataChild.put(listDataHeader.get(41),q42);


        listDataHeader.add("(43) \tWhat is TkInter?");
        List<String> q43=new ArrayList<>();
        q43.add("TkInter is Python library. It is a toolkit for GUI development. It provides support for various GUI tools or widgets (such as buttons, labels, text boxes, radio buttons, etc) that are used in GUI applications. The common attributes of them include Dimensions, Colors, Fonts, Cursors, etc.");

        listDataChild.put(listDataHeader.get(42),q43);


        listDataHeader.add("(44) \tDoes Python supports interfaces like in Java? Explain.");
        List<String> q44=new ArrayList<>();
        q44.add("Python does not provide interfaces like in Java. Abstract Base Class (ABC) and its feature are provided by the Python’s “abc” module. Abstract Base Class is a mechanism for specifying what methods must be implemented by its implementation subclasses. The use of ABC’c provides a sort of “understanding” about methods and their expected behaviour. ");

        listDataChild.put(listDataHeader.get(43),q44);



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
