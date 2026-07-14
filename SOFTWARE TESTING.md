### SOFTWARE TESTING:

###### SDLC:

Planning, Designing, Development, Testing, Deployment, Maintenance.



###### STLC:

Requirement analysis - Review the software requirements to identify testable aspects

Test planning - How many tests, environment(Normally done by senior people).

Test design - Test design document will be created.

Execution - Test the app/website developed by the developer and **take screenshots**.

Defect Reporting - Tell the developer about the defects or bugs in the app/website.

Test closure - Once all the defects are addressed, close the case.



###### Project and Product difference:

In project, we have a start date, end date and once it is delivered it ends. It's testing is fixed.

In product, we continuously try to improve the product day by day. It's testing is continuous.





###### V MODEL:

Development and testing will be done in parallel.



Requirements           ↔ Acceptance Testing(planned)

3\) System Design       ↔ System Testing(planned) Frontend system, backend system..

2\) Architecture        ↔ Integration Testing(planned) Top to bottom

1\) Code                ↔ Unit Testing(planned)



GUI -> Graphical User Interface testing focused on frontend testing. Part of system testing.



###### FUNCTIONAL AND NON-FUNCTIONAL TESTING:

What is your application is functional testing, how is your application is your non-functional testing.

Checking key functionalities like LOGIN,PAYMENT,REGISTRATION come under Functional Testing.

Checking performance parameters like Speed, Scalability, Security come under Non-Functional Testing.



###### QA,QE,QC:

QA: Only the process. Focuses on preventing the defects. e.g- Recipe. Early in the phase.

QE: Always focus on automation. e.g- Smart oven. Throughout the life cycle.

QC: Normal testing that we do. e.g- Taste before serve. After build phase.



###### White Box and Black Box testing:

Black box - Without knowing the code. Done by testers.

White box - Knowing the code. Done by developers(not restricted).



###### Static and dynamic testing:

Static - Testing done without executing the code. Review test cases, validate the test cases etc.

Dynamic - Testing done by executing the code.



###### Verification and validation:

Verification - Just a review of whether the test cases map to the requirements. Ensure all features are properly specified.

Validation - Actual execution. Can users logIn, signUp, make transaction etc.



###### TYPES OF TESTING :

1\) Re-Testing: Follow the steps again and again as soon as developer fixes the bug. Used during the defect life cycle.

2\) Regression Testing: Testing for the next version release of an app.

3\) Exploratory Testing: Tester explores the website just like an actual user.

4\) Adhoc Testing: Kind of ET, quick check not a structured testing.

5\) Sanity Testing: Test only a particular part of an app.

6\) Smoke Testing: One particular tester tests the app initially. Then others join in.

7\) End-To-End Testing: Complete testing done in this type.



###### Test Scenario and test case:

Scenario - Derive test scenarios during test planning phase. High level idea of what tests will the website go through.

Test Case - During the design phase, including the scenario as well. Detailed steps explaining how the tests will be executed.

Test environment - All tools and all required for testing



###### Test Metrics:

No. of test cases

Executed test cases

Blocked test cases - Environment issues.



NORA = Total - (Executed + Blocked) Test cases

Pass percentage = Passed/Total \* 100

Execution percentage = (Total executed/Total test cases) \* 100



Defect density : (Defects/Executed test cases)

<0.1 good,>0.5 bad



###### **SPRINTS:**

Generally for small amount of time where the team works on a specific feature. Goes for a maximum of 2 weeks. e.g - Login Feature for 2 weeks.



###### **SCRUM:**

It is a kind of discussion between each member of the project. Scrum Master manages the Scrum.



###### **RTM:**

For each requirement, whether the testing is done or not is verified through the Requirement Traceability Matrix.



**FRS** - Tells requirements at a very high level. 

**Test Artifacts** - Documents which we have created. BRD->Test Plan->Test Scenario->Test Case.



###### **DEFECT LIFE CYCLE**:

Entire steps defect goes through is DLC.

1 - new

2- assigned

3- in-progress

4- retest

5- closed



**USER STORY IN JIRA IS NOTHING BUT THE REQUIREMENTS.**



## **STORY POINT:**

Efforts we are going to make in testing. If effort is small , 1-2 story point is given. For higher efforts, story point increases. Testers give story points based on Fibonacci number system.

POINTS TO CONSIDER : Test Cases, Automation effort involved.



###### **DOR, DOD:**

Definition of Ready - User story ready to start the work. Environment, requirements are ready.

Definition of Done  - Development, testing everything is done and ready for deployment.



##### **Events in SPRINT:**

**SPRINT RETROSPECTIVE**: What went well, what are the things that we have to improve.

**SPRINT REVIEW**: Explanation of the tasks assigned.

**SPRINT REFINEMENT AND SPRINT PLANNING CALLS**: What user story is there, planning done in this step. Refinement means the final decision made by the Client and the teams.



##### TEST CASE DESIGN TECHNIQUES:

EP/ECP - Equivalence Partitioning is dividing data in groups and testing one value from each groups. AGAR EK CHL RI HAI GROUP ME TO BAAKI BHI CHLEGI.

BVA    - Boundary Value Analysis is testing the boundary values are working fine or not. Max,+-1 and Min,+-1.

DECISION TABLES - All the permutations and combinations that we can do.



**SELF REVIEW AND PEER REVIEW**: Always reviewing the work that we have done.



###### POINTS IN JIRA:

Project - Main project that we will be working on.

Issues  - Task,User story, defect all are categorized under issues.

Workflow- Steps that a particular task will go through.



###### **TYPES OF ISSUES:**

1. Epic: Very big work. Topmost layer.
2. Story: Small requirement.
3. Task: Work we are going to do for the story.
4. Bug: Defect raised by the tester.
5. Test Case: Detailed test steps.



###### BACKLOG:

Place where we will have the tasks that we need to accomplish in the future.

PRODUCT BACKLOG - Entire TODO LIST.

SPRINT BACKLOG  - Items we need to cover in the current Sprint.



As a user story, I want X so that Y can happen.



###### ACCEPTANCE CRITERIA:

Conditions that should be accomplished to make the user story to DONE status.



###### SUITE:

Group of test cases for a specific functionality.
Regression : Executed and Updated for every new version release.

Smoke : Set of test cases designed for end-to-end testing.



###### Zephyre plugins:

Used to upload test cases from excel sheet to jira tool.



Velocity - Amount of work a team completes in a SPRINT.

Sprint burnout - Amount of work remaining in the sprint.

