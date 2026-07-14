#### DAY 8:



###### File class:

Helps to perform various operation in a file. Not capable of reading and writing in a file.



File file = new File("<path>");



###### METHODS:

file.createNewFile() - Creates new file.

exists() - Check whether file exists or not.

delete() - deletes file or folder.

getName() - Return file name.

getAbsolutePath() - Return full path.

length() - Return size in bytes.

mkdir() - Creates a directory. mkdirs() - Creates complete folder till root.





###### FileInputStream and FileOutputStream:

FileInputStream - Capable of reading file byte by byte (0-255).





###### **JDBC(Java DataBase Connectivity):**



**JDBC Api -> DriverManager -> JDBCDriver -> Database**

**JDBC API -** It's a kind of a rule book. Set of interfaces and classes in java.sql library.



Helps keep java code consistent for each database. Only the driver changes.



**DriverManager -** It's kind of a receptionist.

**DriverManager.getConnection()**





###### Statement and PreparedStatement:

In PS, values are given later.



Statement stmt = con.createStatement();

ResultSet res= stmt.executeQuery(<query>); // Directly give to sql. Fails if we give 1=1 instead of 101.



PreparedStatement stmt = con.prepareStatement(<query>);

ps.setInt(1,101); // Not allows to pass values other than Integer.



ResultSet res= ps.executeQuery();



#### **DAY 9:**



###### **JAVA 8 Features:**

**Lambda expression:** Helps reducing the boilerplate code. Should always have functional interface(only one method).

Greetings g = () -> System.out.println("Greetings");



**Stream API:** Collections help to store the data while Stream helps to process the data.



Popular methods of stream are:

MAP-manipulates the data, FILTER- filters the data, REDUCE-Give one final value.



int result = numbers.stream().filter(n -> n>3).map(n -> n\*5).reduce(0,Integer::sum);



**OPTIONAL CLASS:** Used to avoid NullPointerException.



Optional.ofNullable(value) -> If value present use ifPresent() : If not use orElse().





GENERICS AND GENERIC CLASS:







#### **DAY 10:**



###### **Annotations:**

Used to provide additional information about the code.



**Built-In** - Provided by java.



@Override - This method is overridden from parent class.

@Deprecated - This block will be removed in future. Method class and variable.



**Custom -**





###### **Design Patterns: Pattern that we choose to design our java program.**

**Singleton** - Only one object for whole program.

**Factory** - Give input take output. Don't know the depth.

**Observer** - When you change only object and other objects also get updated.

**Strategy** - Allows changing behavior of class at runtime without changing the actual class.





GENERICS, STATEMENT and PREPAREDSTATEMENTS

