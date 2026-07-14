## JENKINS:

Open-source tool that acts like an automation assistant that automatically takes code,

CAN DO ALL STEPS AUTOMATICALLY, ONLY IF CONFIGURATION SETUP IS RIGHT.



Dev writes code ->push to GitHub ->Jenkins triggered -> Jenkins Pulls latest code -> Maven builds the project ->TestNG runs selenium tests -> Jenkins shows test report



##### JENKINS TERMINOLOGIES:

1. JOB       : 1 automation task. e.g- Run regression suite.
2. BUILD     : 1 execution of a Jenkins Job.
3. WORKSPACE : Folder where Jenkins keeps the project code during execution.



###### WEBHOOK/PUSH MODEL is a mechanism where one app automatically notifies another app when an event happens.



4\. Console Output : Step-by-step logs of what Jenkins did.

5\. Pipeline       : Sequence of steps Jenkins follows from start to end.



##### JENKINS+MAVEN+TESTNG COMMAND:

mvn clean test                     -> For selenium maven projects, Jenkin executes maven like this.

mvn test -DsuiteXMLFile=testng.xml -> If project use TestNG, used to execute Suite file.



##### JENKINS Triggers:

Triggers means when should Jenkins start the job.



1.Manual Trigger    -> User click "Build Now".

2.CodePush Trigger  -> Job run when dev pushes code. Webhook concept used

3.Scheduled Trigger -> Run at particular time

4.Poll SCM          -> Checks Git periodically for changes



## CUCUMBER:

BDD(Behavior Driven Development) is an approach where we describe Application behaviour in simple English .



Cucumber is a tool/plugin that is used in the BDD. It uses a language called **Gherkin**.



Feature -> Tells functionality that is to be tested. e.g - Login functionality

Scenario -> What we are going to test. e.g - Successful login

Given -> Precondition. e.g - User on the login page

When -> All actions should be listed against When. e.g- When user enters valid credentials

AND -> Other result/ Additional actions. e.g- User clicks the login button.

Then -> Expected result



Feature File    : Contains business readable scenarios

Step definition : All methods for gherkin scenarios

Runner class    : Starting point of the Cucumber framework @RunWith(Cucumber.class)

Hooks           : Certain things that need to be done before and after the testing

