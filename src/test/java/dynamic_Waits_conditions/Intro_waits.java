package dynamic_Waits_conditions;

//webelement takes more time to load  eg->component-2-9 seconds[your internet speed, API reponses,if dev is working on something -changing or update]
//our scrpit is working fine but in second time it fails so we use waits

public class Intro_waits {	
//	three types of Waits:->
	
//1)implicit waits->Across the complete Selenium code
// apply the implicit wait condition and let's say you give 10 seconds.Than you typically are asking Selenium to wait max 10sec for webelement to load, and if not throw error.
//give no such element exception
//2)explicit waits->
//you can target individual Welement (if one or two element taking time to load we can use explicit )
//	     Thread.sleep(2000)               v/s                         WebdriverWait
//1.Mandate to wait                                      1.the moment it identify it will move on. else if the time is lapsed(10 sec)it will throw error
//2.it slow down the code                             2. it is not slow down code. it works individuale 
//similarity->they both works on individual Webelements
	
//3)fluent waits
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
