JAVA TECH CHALLENGE

Backend Coding Challenge 

Date - March 14, 2017

Contributor: Asit Kumar Ghosh, Intern Engineer, AppDirect.

Supported Functionality : Create and Cancel Subscription.

Product Name : xyz.

The project JavaTechChallenge ties AppDirect APIs with the web application 'web13',
running on local system getting exposed to the internet by ngrok. The project has 
implemented APIs to interact with the endpoint URLs for the subscription.

This project contains 6 packages, described as below:

com.asit.controller : It contains create and cancel classes which is responsible for 
					  making the connection using endpoint urls and also receiving 
					  and sending responses.
							  
com.asit.bean : Here all the classes resides that supports the json parsing after 
				converting it into string.
						
com.asit.dao : 	Here all the connection and Sql queries of database resides to insert, 
				delete, update and retrieving data.

com.asit.domain : Here all the get and set method resides which is required for retrieving,
				  inserting, updating and deleting data.
				  
com.asit.util :  Auth signature happens here and gets data from bean package and sets it
				 in domain package. 
				 
com.asit.service : It connects with dao and util package and all the computations required 
				   for create and cancel subscription resides here. 