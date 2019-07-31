package www.shimul.com.learncjavapythonprogramming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Java_Interview_Question extends AppCompatActivity {

    private ExpandableListView importantQlistviewId;

    private C_InterviewCustomAdapter customAdapter_team;

    //
    List<String> listDataHeader;
    HashMap<String,List<String>> listDataChild;

    private int lastexpandposition=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java__interview__question);


        setTitle("Java Interview Questions");

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

        listDataHeader.add("(01) \t What is JAVA?");
        List<String> q1=new ArrayList<>();
        q1.add("Java is a high-level programming language and is platform independent.\n" +
                "\n" + "Java is a collection of objects. It was developed by Sun Microsystems. " +
                "There are a lot of applications, websites and Games that are developed using Java.\n" + "\n");
        listDataChild.put(listDataHeader.get(0),q1);

        listDataHeader.add("(02) \tWhat are the features in JAVA?");
        List<String> q2=new ArrayList<>();
        q2.add("Oops concepts.\nPlatform independent\nHigh Performance\nMulti-threaded");

        listDataChild.put(listDataHeader.get(1),q2);


        listDataHeader.add("(03) \tHow does Java enable high performance?");
        List<String> q3=new ArrayList<>();
        q3.add("Java uses Just In Time compiler to enable high performance. JIT is used to convert the instructions into bytecodes.");

        listDataChild.put(listDataHeader.get(2),q3);


        listDataHeader.add("(04) \tWhat are the Java IDE’s?");
        List<String> q4=new ArrayList<>();
        q4.add("Eclipse and NetBeans are the IDE’s of JAVA.");
        listDataChild.put(listDataHeader.get(3),q4);

        listDataHeader.add("(05) \tWhat is meant by Local variable and Instance variable?");
        List<String> q5=new ArrayList<>();
        q5.add("Local variables are defined in the method and scope of the variables that have existed inside the method itself.\n" +
                "\n" +
                "An instance variable is defined inside the class and outside the method and scope of the variables exist throughout the class.");

        listDataChild.put(listDataHeader.get(4),q5);


        listDataHeader.add("(06) \tWhat is a Class?");
        List<String> q6=new ArrayList<>();
        q6.add("All Java codes are defined in a class. A Class has variables and methods.\n" +
                "\n" +
                "Variables are attributes which define the state of a class.\n" +
                "\n" +
                "Methods are the place where the exact business logic has to be done.");

        listDataChild.put(listDataHeader.get(5),q6);

        listDataHeader.add("(07) \tWhat is an Object?");
        List<String> q7=new ArrayList<>();
        q7.add("An instance of a class is called object. The object has state and behavior.\n" +
                "\n" +
                "Whenever the JVM reads the “new()” keyword then it will create an instance of that class.");

        listDataChild.put(listDataHeader.get(6),q7);

        listDataHeader.add("(08) \tWhat are the Oops concepts?");
        List<String> q8=new ArrayList<>();
        q8.add("Inheritance\n" +
                "Encapsulation\n" +
                "Polymorphism\n" +
                "Abstraction\n" +
                "Interface");

        listDataChild.put(listDataHeader.get(7),q8);


        listDataHeader.add("(09) \tWhat is Inheritance?");
        List<String> q9=new ArrayList<>();
        q9.add("Inheritance means one class can extend to another class. So that the codes can be reused from one class to another class.");

        listDataChild.put(listDataHeader.get(8),q9);


        listDataHeader.add("(10) \tWhat is Encapsulation?");
        List<String> q10=new ArrayList<>();
        q10.add("Purpose of Encapsulation:\n" +
                "\n" +
                "Protects the code from others.\n" +
                "Code maintainability.");

        listDataChild.put(listDataHeader.get(9),q10);


        listDataHeader.add("(11) \tWhat is Polymorphism?");
        List<String> q11=new ArrayList<>();
        q11.add("Polymorphism means many forms.\n" +
                "\n" + "A single object can refer the super class or sub-class depending on the reference type which is " +
                "called polymorphism.");

        listDataChild.put(listDataHeader.get(10),q11);


        listDataHeader.add("(12) \tWhat is meant by Method Overriding?");
        List<String> q12=new ArrayList<>();
        q12.add("Method overriding happens if the sub class method satisfies the below conditions with the Super class method:\n" +
                "\n" +
                "Method name should be same\n" +
                "Argument should be same\n" +
                "Return type also should be same");

        listDataChild.put(listDataHeader.get(11),q12);


        listDataHeader.add("(13) \tWhat is meant by Overloading?");
        List<String> q13=new ArrayList<>();
        q13.add("Method overloading happens for different classes or within the same class.\n" +
                "\n" +
                "For method overloading, subclass method should satisfy the below conditions with the Super " +
                "class method (or) methods in the same class itself:\n" +
                "Same method name\n" +
                "Different argument type\n" +
                "May have different return types");

        listDataChild.put(listDataHeader.get(12),q13);


        listDataHeader.add("(14) \tWhat is meant by Interface?");
        List<String> q14=new ArrayList<>();
        q14.add("Multiple inheritance cannot be achieved in java. To overcome this problem Interface concept is introduced.");

        listDataChild.put(listDataHeader.get(13),q14);


        listDataHeader.add("(15) \tWhat is meant by Abstract class?");
        List<String> q15=new ArrayList<>();
        q15.add("We can create the Abstract class by using “Abstract” keyword before the class name. An abstract class can have " +
                "both “Abstract” methods and “Non-abstract” methods that are a concrete class.");

        listDataChild.put(listDataHeader.get(14),q15);


        listDataHeader.add("(16) \tExplain about Public and Private access specifiers.");
        List<String> q16=new ArrayList<>();
        q16.add("Public members are visible in the same package as well as the outside package that is for other packages.\n\n" +
                "Private members are visible in the same class only and not for the other classes in the same package as well as classes in the outside packages.");

        listDataChild.put(listDataHeader.get(15),q16);


        listDataHeader.add("(17) \tWhat is mean by Collections in Java?");
        List<String> q17=new ArrayList<>();
        q17.add("Collection is a framework that is designed to store the objects and manipulate the design to store the objects.");

        listDataChild.put(listDataHeader.get(16),q17);

        listDataHeader.add("(18) \tWhat is mean by Exception?");
        List<String> q18=new ArrayList<>();
        q18.add("An Exception is a problem that can occur during the normal flow of an execution. A method can throw an exception when" +
                " something wails at runtime. If that exception couldn’t be handled, then the execution gets terminated before it completes the task.");

        listDataChild.put(listDataHeader.get(17),q18);



        listDataHeader.add("(19) \tWhat is the purpose of a Volatile Variable?");
        List<String> q19=new ArrayList<>();
        q19.add("Volatile variable values are always read from the main memory and not from thread’s cache memory. " +
                "This is used mainly during synchronization. It is applicable only for variables.");

        listDataChild.put(listDataHeader.get(18),q19);

        listDataHeader.add("(20) \tWhat are wrapper classes?");
        List<String> q20=new ArrayList<>();
        q20.add("Wrapper classes converts the java primitives into the reference types (objects). Every primitive data type has a class dedicated to it. These are known as wrapper classes because they “wrap” the primitive data type into an object of that class.");

        listDataChild.put(listDataHeader.get(19),q20);


        listDataHeader.add("(21) \tWhat is the difference between equals() and == ?");
        List<String> q21=new ArrayList<>();
        q21.add("Equals() method is defined in Object class in Java and used for checking equality of two objects defined by business logic.\n" +
                "“==” or equality operator in Java is a binary operator provided by Java programming language and used to compare primitives and objects. public boolean equals(Object o) is the method provided by the Object class. ");

        listDataChild.put(listDataHeader.get(20),q21);


        listDataHeader.add("(22) \tCan you override a private or static method in Java?");
        List<String> q22=new ArrayList<>();
        q22.add("You cannot override a private or static method in Java. If you create a similar method with same return type and same method arguments in child class then it will hide the super class method; this is known as method hiding.");

        listDataChild.put(listDataHeader.get(21),q22);


        listDataHeader.add("(23) \tWhat is association?");
        List<String> q23=new ArrayList<>();
        q23.add("Association is a relationship where all object have their own lifecycle and there is no owner. " +
                "Let’s take an example of Teacher and Student. Multiple students can associate with a single " +
                "teacher and a single student can associate with multiple teachers but there is no ownership between " +
                "the objects and both have their own lifecycle. These relationship can be one to one, One to many, many " +
                "to one and many to many.");

        listDataChild.put(listDataHeader.get(22),q23);


        listDataHeader.add("(24) \tWhat is composition in Java?.");
        List<String> q24=new ArrayList<>();
        q24.add("Composition is again specialized form of Aggregation and we can call this as a " +
                "“death” relationship. It is a strong type of Aggregation.");

        listDataChild.put(listDataHeader.get(23),q24);

        listDataHeader.add("(25) \tWhat do you mean by aggregation?");
        List<String> q25=new ArrayList<>();
        q25.add("Aggregation is a specialized form of Association where all object have their own lifecycle but there is ownership and child object can not belongs to another parent object. ");

        listDataChild.put(listDataHeader.get(24),q25);


        listDataHeader.add("(26) \tWhat is a static variable?");
        List<String> q26=new ArrayList<>();
        q26.add("Class variables also known as static variables are declared with the static keyword in a class, but outside a method, constructor or a block.");

        listDataChild.put(listDataHeader.get(25),q26);


        listDataHeader.add("(27) \tWhat do you mean by Access Modifier?");
        List<String> q27=new ArrayList<>();
        q27.add("Java provides access modifiers to set access levels for classes, variables, methods and constructors. A member has package or default accessibility when no accessibility modifier is specified.");

        listDataChild.put(listDataHeader.get(26),q27);


        listDataHeader.add("(28) \tWhat is a static function?");
        List<String> q28=new ArrayList<>();
        q28.add("A function’s definition prefixed with static keyword is called as a static function. You would make a function static if it should be called only within the same source code.");

        listDataChild.put(listDataHeader.get(27),q28);


        listDataHeader.add("(29) \tWhat is protected access modifier?");
        List<String> q29=new ArrayList<>();
        q29.add("Variables, methods and constructors which are declared protected in a superclass can be accessed only by the " +
                "subclasses in other package or any class within the package of the protected members' class.");

        listDataChild.put(listDataHeader.get(28),q29);

        listDataHeader.add("(30) \tWhen parseInt() method can be used?");
        List<String> q30=new ArrayList<>();
        q30.add("This method is used to get the primitive data type of a certain String.");

        listDataChild.put(listDataHeader.get(29),q30);

        listDataHeader.add("(31) \tWhy is StringBuffer called mutable?");
        List<String> q31=new ArrayList<>();
        q31.add("The String class is considered as immutable, so that once it is created a String object cannot be changed. If there is a necessity to make alot of modifications to Strings of characters then StringBuffer should be used.");

        listDataChild.put(listDataHeader.get(30),q31);

        listDataHeader.add("(32) \tWhat is the difference between StringBuffer and StringBuilder class?");
        List<String> q32=new ArrayList<>();
        q32.add("Use StringBuilder whenever possible because it is faster than StringBuffer. " +
                "But, if thread safety is necessary then use StringBuffer objects.");

        listDataChild.put(listDataHeader.get(31),q32);

        listDataHeader.add("(33) \tWhen super keyword is used?");
        List<String> q33=new ArrayList<>();
        q33.add("If the method overrides one of its superclass's methods, overridden method can be invoked through the use of the keyword super. " +
                "It can be also used to refer to a hidden field.");

        listDataChild.put(listDataHeader.get(32),q33);

        listDataHeader.add("(34) \tWhat do you mean by Multithreaded program?");
        List<String> q34=new ArrayList<>();
        q34.add("A multithreaded program contains two or more parts that can run concurrently. Each part of such a program is called a thread, and each thread defines a separate path of execution.");

        listDataChild.put(listDataHeader.get(33),q34);


        listDataHeader.add("(35) \tExplain garbage collection in Java?");
        List<String> q35=new ArrayList<>();
        q35.add("It uses garbage collection to free the memory. By cleaning those objects that is no longer reference by any of the program.\n");

        listDataChild.put(listDataHeader.get(34),q35);


        listDataHeader.add("(36) \tWhat is JAR file?");
        List<String> q36=new ArrayList<>();
        q36.add("JAR files is Java Archive fles and it aggregates many files into one. It holds Java classes in a library. JAR files are built on ZIP file format and have .jar file extension.");

        listDataChild.put(listDataHeader.get(35),q36);


        listDataHeader.add("(37) \tWhat is a WAR file?");
        List<String> q37=new ArrayList<>();
        q37.add("This is Web Archive File and used to store XML, java classes, and JavaServer pages. " +
                "which is used to distribute a collection of JavaServer Pages, Java Servlets, Java classes, " +
                "XML files, static Web pages etc.");

        listDataChild.put(listDataHeader.get(36),q37);


        listDataHeader.add("(38) \t What are Loops in Java? What are three types of loops?");
        List<String> q38=new ArrayList<>();
        q38.add("Looping is used in programming to execute a statement or a block of statement repeatedly. " +
                "There are three types of loops in Java:\n For Loop\nWhile Loop\nDo While Loop");

        listDataChild.put(listDataHeader.get(37),q38);


        listDataHeader.add("(39) \tWhat is the difference between continue and break statement?");
        List<String> q39=new ArrayList<>();
        q39.add("break and continue are two important keywords used in Loops. When a break keyword is used in a loop, " +
                "loop is broken instantly while when continue keyword is used, current iteration is broken and loop continues with next iteration.");

        listDataChild.put(listDataHeader.get(38),q39);

        listDataHeader.add("(40) \tWhat is the difference between double and float variables in Java?");
        List<String> q40=new ArrayList<>();
        q40.add("In java, float takes 4 bytes in memory while Double takes 8 bytes in memory. Float is single precision floating point decimal number while Double is double precision decimal number.");

        listDataChild.put(listDataHeader.get(39),q40);



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
