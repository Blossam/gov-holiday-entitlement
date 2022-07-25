•	First created project with Maven built tool with main and test-suit. 

•	In POM.xml I have applied few decencies and plugins  

•	In main there is I have call Utility extend to ManageDriver that is multi-level inheritance.

•	In Utility there are multi method but there are two get text from elements with different parameter  (By By and web element- elements) same method name but different parameter. That is called method overloading (reusable method) which is polymorphism. 

•	Loging to my page is an abstract creating pages where we are hiding code so we don’t have to use much code in step definition. I have created different pages to easy and quick solve any particular page issue. 

•	In pages I have found elements and created methods those methods I have called them in step definition  

•	Hook is open and close the browsers and whenever the scenario gets failed it take screen shot.

•	Test runner is first point to run the test there we’re giving feature path and glue path there also you can give tags smoke, sanity and regression in test runner and feature file also I gave cucumber and extend report plugin and the information will print in report after class

•	 In config property you can define global variable whenever the variable changes we don’t have to change any code, we can change it directly from here. 

•	Log4j2 creating log for the report it stores in SRC main folder – java- it will create log folder and it will store logs. 

•	Property reader will implement singleton design pattern it makes constructor private, create static method to get instance and create a static member variable that how you can make singleton design pattern it uses for only create one instance. Property reader reads the property from config property file it’s open the browser 

•	Target --> Extent Reports there is report.html there you can see full report
