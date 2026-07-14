##### FRAMEWORK :

It is a ready-made structure that helps us to organize our code.

Without framework : Code duplicated, unorganized etc.



##### TYPES OF AUTOMATION FRAMEWORK:



###### 1.DATA DRIVEN:

Running the same test using different data.



###### 2.KEYWORD DRIVEN:

Instead of writing complicated code, we use simple words which are called keywords.

Non-technical people can contribute when this framework is involved.



###### 3.PAGE FACTORY:

It is a way to store all locators in one place and use them easily.

e.g - Change userID one place, it gets changed at every place. This helps in less duplication and easy maintenance.

**PAGE CLASS** - All locators stored in one place.

**TEST CLASS** - What action to perform.



IN PAGE FACTORY,WE USE:

@FindBy - Locate elements

PageFactory.initElements() - To initialize



###### 4.MODULAR FRAMEWORK:

Breaking the application into small parts (modules) and writing separate code for each part.



###### 5.HYBRID





##### DESIGN PATTERNS:

Best practices used in the setup(Framework).

1.POM(Already done)

2.SINGLETON:

Uses only 1 object means only one browser.

We create only 1 driver and use it everywhere.



3.FACTORY:

Create object based on input.

Based on input, create different drivers.



##### CUSTOM LOGGING FOR LOG4J:

LOG4j - Class that helps keep writing notes while your test is running.

Without log4j, if test fails we don't get to know where it failed.



**NOTE:PRINT STATEMENT CANNOT SAVE LOGS IN FILE.**

Different levels in the SCREENSHOT.

Info->Debug->Warn->Error->Fatal



SCREENSHOTS CAPTURE: Take ss of all pages,defects. Not needed at every step.

Use Listener Concept, like whenever test fails screenshot would be taken.

