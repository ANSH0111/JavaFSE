# DAY1:

What, Why, How - Ask these 3 questions for any new problem



WHAT :

Role of QEA - Quality engineering and assurance



WHY:

Prevent bugs and saves time



HOW:

Write scripts and tests



###### I.MANUAL TESTING AND AUTOMATION TESTING:

Manual Testing is time consuming and need to be done after every new change.

Automation Testing executes test automatically by writing scripts in Java and selenium.



##### JAVA Programming Language:

Robust, Secure, Object-Oriented, Platform-independent and multi-threaded



JVM - Translator

JRE - Gives a place to run java program (environment)

JDK - Consists all the tools required to run java code



###### Data types:

Primitive Data Types - Built-in, store only single value, fixed memory size. byte, short, int, long, float, double, char, Boolean.

Non-Primitive Data Types - Complex and store multiple values with flexible memory size. string, arrays, classes, objects, interfaces etc.



###### 3 tier architecture:

Presentation - User interacts here

Application layer - Processes requests and applies logic

Data layer - Stores data



Implicit Casting(Widening Casting) - small to big, No data loss

Explicit (Narrowing) casting - big to small, data loss may occur



Classes are created without taking any space in the memory.



# DAY 2:

##### OOPS Principles:



1.Inheritance : Properties and behavior of a class is inherited by another class.



2.Encapsulation : Relate to university database. You can apply for revaluation and not change marks directly. Uses getters and setters.



3.Polymorphism:

Method overloading : Same method different parameters. Should be in the same class. AKA Compile-Time Polymorphism. example- adding 1,2,3 variables.

Method overriding : Same method same parameters. Parent child relationship. AKA Run-Time Polymorphism. example- Cat and dog sound.



4.Data abstraction : Hides implementation details using abstract classes and interfaces. abstract classes can have both abstract and concrete methods, while interfaces can only have abstract methods achieving 100% abstraction(instead in java 8).



# DAY 3:



###### Static members:

static variable is common variable shared across the class.

static method need to be called with the Class Name.

static block executed as soon as the class is created.



this and super cannot be used with static.



###### final keyword:

final variables cannot change

final method cannot be overridden

final class cannot be inherited



###### this keyword:

refers to the current object.

when instance vars and methods have same name, Java gets confused.



###### Array - 1D and 2D



###### Strings go to STRING CONSTANT POOL(Special memory area in Java for String Literals).

###### But if we use new keyword while creating a String, it is stored as separate object in heap memory.



# DAY 4:



##### Exceptions:

Unexpected situations that obstruct the normal flow of the program's execution.



**Checked** - CompileTime exceptions. FileNotFound, IOException, SQLException 3rd party

**Unchecked** - RunTime exceptions. DivisionByZero, IndexOutOfBounds Logical errors



# DAY 5:



###### Custom exceptions:

To handle errors gracefully and give a better explanation of the error in business logic.



1.Checked custom - extends Exception, forces handling, used for business rules

2.Unchecked custom - extends RunTimeException, no force, used for programmer mistakes



###### **Collections framework**:

Unified architecture for handling various objects.

Iterable :

&#x09;Collection

&#x09;List

&#x09;Set

&#x09;Queue



Map (Seperate hierarchy)



###### NOTE : Iterable is at the top because all concepts under it using looping concepts.



###### List:

Order maintained, duplicates allowed, Index-based access



A. ArrayList - Fast access, order maintained, duplicates allowed, Slow insertion and deletion at the middle.

B. LinkedList - Slow access(traversal required) , order maintained, duplicates allowed, Fast insertion and deletion.

C. Vector - Thread-safe(synchronous), old and similar to ArrayList.

D. Stack - Follows Last-In-First-Out principle.





# DAY 6:



###### Set interface:

Order not preserved, No duplicates

Set do not store data itself, for that it has various classes.



HashSet - Fast performance because of hashCode, unique elements, order not preserved.

Linked HashSet - Maintains order. Bit slower than hashSet because it connects elements through linked list also.

TreeSet - Maintains order and sort elements in ascending order. null values not allowed.



###### Map interface:

Stores data in the form of key-value pairs. key should be unique but values can be same.



HashMap - Uses hashTable, no order, allows only one null key, no null values.

LinkedHashMap - Maintains order.

TreeMap - Maintains sorting order by using method (R-B) tree. No null keys.

HashTable - Thread-safe(synchronous), old but asked in interviews. No null keys .





###### Iterator:

Used to go through the collection one element at a time.

hasNext(): Checks if next element exists or not.

next(): Returns current element and moves pointer to the next element.

remove(): Removes current element.



Works with list and set.



###### ListIterator :

Backward traversal also possible.

same functions as Iterator. ONLY for ArrayList \& LinkedList.

previous()

hasPrevious()

etc.



# DAY 7:



###### SDLC :



1.Requirement(Business Requirement Document)

2.Design

3.Development

4.Testing(Requirement Traceability matrix (RTM),UAM(User Acceptance Testing))

5.Deployment



**Process** - 1 running instance of Java program



**Thread** - Independent path of execution inside the same Java process. Runs independently but share the same memory space.



###### Life cycle of thread:



1\. new - creation or thread is being initialized.

2\. runnable - ready to run and waiting for CPU. start() is called.

3\. running - gets the CPU time. run() used.

4\. waiting - paused temporarily. sleep() used.

5\. dead - run() stops.



join() - Process that helps to make one thread wait before the other completes its execution. t.join()-t will start to work other thread will wait.

In a single row, we can't extend 2 classes. Then in this case, we use runnable interface.



###### Character Streams:



Used to read and write text data.

BufferedReader/BufferedWriter - read/write the line (Used along with fileReader or fileWriter)

FileReader - read/write letter by letter. Overwrites the data.



BufferedReader br = new BufferedReader(new FileReader("file.txt"));

BufferedWriter br = new BufferedWriter(new FileWriter("file.txt"));



Comparable and comparator differences in a screenshot.

