package Selenuim_Architecture;

public class Info_knowledge {
//Selenuim-->Automates browsers not desktop base application 
//advantages->
//1)Multi-Browser compatiblity,
//2)Multi-Language support
//3) Execution is Faster,
//4) Locating web elements(locators)
//5)HandlingDynamic Webelements	(sudden changes in elements)

//Disadvantages->Knowlede of OOps concept
//2)NO desktop base application
//3)free so no customer support 	
	
	                                  // Selenuim webdriver architecture working principle
	
//1)when we write a code of selenium, an HTTP request is created (when we write and run that code of selenuim http request is created at that time)
//2)this request created - it goes to browser driver(HTTP->request goes as via HTTP server in the form of JSON (data-format)directly to browser driver )

	
	
	
/*  Easy language 1) After you trigger the test, complete Selenuim code(client) which we have written will be converted to Json format
 * 2)Generated Json is sent to Browser Driver(server) through HTTP Protocol Note:->Each browser contains a separate browser driver 
 * 3)Browser Drivers communicate with it's respectiver Browser and executes the commands by interpreting Json which it recieved on the browser
 * 4)Browser Driver recieves reponsees back from the browser and it sends Json responce back to client . 
 * 
 * 
 * our selenuim code is in client libarary ->once we run execute our code ->it will be converted in Json wire protocol 
 * ->send via HTTP->to browser driver -->and browser driver commuincate with respective browser 
 * -->and browser execite code and send response to back to browser driver in jason format 
 * --> and browser driver will get reponse in Json format from browser ->and browser driver send it back to our client code as output 
 * 
 * 
 * 
 * 
 * 
 * */
	
	
}



