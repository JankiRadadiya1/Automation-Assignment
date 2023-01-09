package basicwebapp;
//methods  declaretion(only names) in webdriver interface  -> but all the methods implemntation is in the classes like chromedriver, etc
//some methods are in webdriver and some methods are in cherome driver class too
public class Intro_of_Webdriver_Interface {
	 
//	class ->chromedriver , Firefoxdriver, edgedriver, safaridriver etc. ->contains methods like close, geturl, openbrowser, etc-->to use this methods we have to create object of that class
//Chromedriver driver = new Chromedriver();-->driver object here has access to all the methods of chromedriver class	
	
// but if we create object of chromedriver it only get access of chromedriver class methods not firefox,edge or safari classes methods
	//In every classes methods is same but implementation is different for firefox , edge and chrome ->method overloding
	
//on top of this classes is webdriver is a head master which tell what  rules to follow -> this classes are following the rules and creating the methods so everyone use common methods
	
//	webdriver  have methods (get url , close etc) it only has method name(empty body) not the implementation 
	//it's class responsiblity to implement the methods declared in the interface 
//	eg-> class(chromedriver,edgedriver,safaridriver,firefoxdriver) implements Webdriver{
	
//so all the classes agreeing to implement all the methods present in webdriver interface (all the classes agreed to implement the webdriver interface methods)
	
//so now we want to access webdriver methods too but if we write  Chromedriver driver = new Chromedriver() it only access chromdriver methods not firefox or other classes methods  
	
	//so if we refer driver object to webdriver interface  (webdriver driver  = new chromedriver())
//driver object has access to the methods of chromedriver which defined in webdriver interface	

}
