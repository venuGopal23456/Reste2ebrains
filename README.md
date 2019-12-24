"# Reste2ebrains" 

1)This is the file which contain simple rest example with default get mapping and retuning json object using simple pojo class which is done by the Dispatcher Servlet
2)add parent and web dependency in pom
3)create main class and controller class
4)create pojo class to return json string as a response


5)Create method which return response based on primary key


//add post method
1)Create a postmethod with no return type and then get the post body convert to topic instance and add to the servcie
2)Get the @RequestMapping properties (method ) and specify the enumeration requestmethod.post
3)In TopicService.java ,change the immuttable array into mutable by creating new arraylist.

//add update and Delete Resource
1)it almost same as post method.
2)Used for loop to traverse through the loop.
3)Delete is same as update.
4)Used Remove if statement.




//To run this program
mvn Spring-boot:run
localhost:8080
