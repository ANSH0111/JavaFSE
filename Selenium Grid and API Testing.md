## Selenium Grid:

Used to run tests on multiple browsers and multiple machines. It provide distributed testing(executing test on multiple machines).

Helps in faster execution and saves time.



##### Selenium Architecture:



&#x09;		 HUB

&#x09;	|	  |	   |

&#x09;      Node1     Node2    Node 3



\-->Hub is central controller in Selenium Grid. Receives test execution requests, decide which test should run, send test to appropriate nodes and manages communication between scripts and nodes.



\--> Node is a machine or browser that actually executes the test.

Returns execution result to Hub.



**java -jar selenium-server.jar standalone**





### **API(APPLICATION PROGRAMMING INTERFACE):**



We use Api to help 2 applications communicate with each other.



##### Web Servers:

Subdivision of API designed to operate over the web using standardized protocols like HTTP/HTTPS. All web services are Api.



###### SOAP: Simple Object Access Protocol. XML-based protocol used for accessing web services over HTTP.



###### REST API : Representational State Transfer



###### WSDL(Web Service Description Language): XML-based language used to describe the operations, messages, and access details of a web service. Like a menu Card



###### METHODS:



1. GET    - Read info from another application.

2\. POST   - Creating new data.

3\. PUT    - Used to update the available data.

4\. DELETE - Used to delete the existing data.

5\. PATCH  - Used for partial updation of the data.



POSTMAN and REST Assured:
Postman allows us to manually test APIs. No coding required.



Rest Assured is like Selenium but for API testing. Used for API Automation.



##### Flow Of API TESTING:(Important)

Request->Response->Validation



REST ASSURED:
Given - Pre-conditions should be listed here.

When  - What request we want to send (GET).

Then  - Actual Validation. (Expectations).



given().when().get(<url>).then()



##### DOCKER:

It is not necessary if one project is running on my machine, it would run fine in another person's machine.

It is a tool that help to overcome this problem.



IMAGE     - package that contains everything needed to run an application.

CONTAINER - a runnable instance of a Docker Image.
Gather all the images and put it in the container.

