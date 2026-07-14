# APACHE POI:

Library that helps us read and write Excel Files using Java.



**EXCEL READ:**

\---

**EXCEL WRITE:**

**---**



###### **APACHE POM:**

Each webpage is represented as a class.

SCREENSHOT IN FILE EXPLORER.



Calendar using action - Selenium DatePicker(Actions class)



Popup calendar.

Actions action = new Actions(driver);

action.moveToElement(driver.findElement(By.id("date"))).click().perform();

driver.findElement(By.xpath("//a\[text='29']")).click();



# TESTNG:

Java based testing framework that helps in creating and executing test cases.

Note: You do not need to write main(). Instead we use @Test annotation which serves as the starting point for the program.



@Test

public void testmethodname()
{
1 - Setup

&#x09;2 - Execute

&#x09;3 - Validate (Assertions)

}



##### **Assertions:**

What - Validation checkpoints in our test script.

Why  - They help us to validate the assumptions and also catch logical errors early.



**Hard Assertion** - As soon as failure is encountered, program stops.

Used in critical functionalities like:

1. Login

2\. Payment

**Soft Assertion** - Program runs fully even if error is encountered.

Used in less critical functionalities like:

1. Name mismatch

2\.



Annotations: Heirarchy in SCREENSHOT.

@BeforeMethod runs then @Test then @AfterMethod.

@BeforeClass runs only once before test.



##### **DATA DRIVEN TESTING:**

\---



##### **Priority Test:**

Applied only on @Test annotation. Default priority =0.

Priority order - -1,0,1,2 ...

e.g - @Test(priority =1)



##### **Dependency in TestNG:**

Drawback of priority: One test with high priority fails, the other tests run even if the first is failed.



If we introduce dependency, the test dependent on the failed test will not execute.

@Test(dependsOnMethods = "login") public void search(){}



##### **TestNG Report Generation:**

test-output folder has all the reports of the test cases executed.



indexfile, testng-result difference = indexfile has all the detailed results that we can read while testng-result is same just in the XML format.



##### **TestNG with 2 Classes:**

Using the XML file, we can run 2 classes in the order we need them to be executed.

**NOTE:** Gives the combined report of all the files.



##### **Running parallel tests in TestNG:**

parallel keyword and thread-count keyword.

Helps run multiples classes,tests or suites etc. in parallel.

Each thread should run independently.



###### **Multi/Cross Browser Testing:**

For real projects, use Parallel execution.
Pass the parameters from the xml.



##### **Rerun fail test cases:**

There could be problems like server issues, we try to re run the test cases. 2 ways are --> manually rerun and automation rerun.



**xml case of rerunning:**

testng-failed.xml - Report put in the test-ng output folder.



**Retry analyzer:** Automatically make failed test cases to rerun.



##### **Reporter Class:**

Helps to add whatever details we need to add in our report.



PDF Report and Email - TestNg can't create pdf directly.

1\. Create html report and convert it into a pdf. **DIY**

