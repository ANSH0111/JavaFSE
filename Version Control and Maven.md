### Version Control



##### Version Control system

Suppose 3 people are working on the same project. Version control helps to track changes to files over time.



##### Git Architecture



Working directory -> Staging Area -> Repository



1. Your actual files
2. Temporary area before saving
3. Final saved version(history maintained)



##### GitHub

(DAY1) clone -> modify -> add -> commit -> push -> (DAY2) pull



##### BRANCHING AND MERGE CONFLICT

BRANCH - Seperate copy of your code where you can work safely.

Seperate path to work preventing any failures with the main branch.
MERGE CONFLICT - Git is confused which code to keep:-/

Happens when two people change the same code.



Step 1: Create project locally

Step 2: git init (Start tracking the project using Git)

Step 3: git add .

Step 4: git commit -m "<message>" (Helps to save the file locally)

Step 5: Create repo

Step 6: Connect local -> GitHub

git remote add origin <path>

Step 7: git push



### DEVOPS AND MAVEN



##### Devops

Development + Operations working together to deliver software faster and better. It focuses on Collab,Automation and continuous delivery.



Without devOps, ops deploys later and bugs come late which results in late release of the project.



##### MAVEN:

It is a build tool that helps us manage our project easily.



Without Maven, we add jars manually one by one. With maven, just write one file pom.xml and everything downloads automatically.



##### Managing dependencies and plugins:

Dependencies are ready-made code written by others. External libs(JARs) that our project needs.



Plugins are Maven's assistants that DO work. It executes tasks,generate reports and executes test.



Flow : Write dependencies in pom.xml->Maven downloads JARs -> Write test code using libraries.

IMPORTANT SS in EXPLORER.



MAVEN IDENTITIES OR MAVEN COORDINATES ARE:
groupId - company that created that particular library

artifactId - actual library. e.g - selenium

version - what version library belongs to



##### MAVEN BUILD CYCLE:

Step by step process Maven follows when we run a comment.

1.clean   - Helps to remove all the old files.

2.compile - Convert java code into machine code.

3.test    - Executes all the tests or execution of the code.

4.package - Used to create output JAR files.

5.install - Install JAR files in our local system. Stores project in our local system.



mvn clean install - Command for initiating maven build cycle.

