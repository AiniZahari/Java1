# Java1
A java assignment

This assignment requires users to input data to perform several tasks 
such as, user can selects a student and the system will display student's 
result (percentage marks and grades) in Maths, Bussiness, Java, Design and 
Project courses. User also can select a course to display highest, lowest 
and average percentage marks in the course. This program also allows user 
to modify all student's result one record at a time and finally displaying 
the whole results table along with each student's average mark, each course's 
average mark and name of the student with the highest average mark.

For this assignment, object oriented programming (OOP) is much more suitable 
rather than procedural style. Object oriented programming means a programming 
language that uses objects rather than using data fields. In this context, object 
that has been created is from instances of a class. In this assignment, there are 4 
classes involved. 

There are a lot of codes and system tasks that need repetition in this exercise for 
example: Input checking and input menus (Main Menu, Course Menu & Student's Menu). By writing
the same codes over and over again, programmer might create typing errors.
Therefore, specific methods must be created to overcome the problem. Specific method 
that has been created will be called whenever it is needed in the program. 

However, in this assignment, there are few codes that are a bit similar to each other. For example: Formula for 
getting average percentage is almost in a similar format. The only difference is the method 
to get percentage of each subject. (getMath(row) and getBuss(row)). From this exercise, data 
can be manipulated using a distinct logic sequence called method [1]. There are varies of 
methods created inside each classes consist of accessor and mutator method accordingly.

Four classes that have been created are:

1) PartA.java
This is the driver class. It contains a main method for this program. The main method acts as an entry 
point for the system where the program starts executing. 

2) Body.java
Body.java class contains general functions for the system like input checking (checknum(), checknum1(), 
checknum2() & exept()), menus (mainmenu(), stdnmenu() & coursemenu()), and Student and Result objects created from Student and 
Result classes. There’s one method for updating student’s result (task number 3).

3) Student.java
Student.java contains constructor that allows object to be created inside Body.java. There are also few methods
for retrieving data from the object created, method to print getting student name, results and grades 
(stdprint()) (task number 1)and print the whole result table (printTable()) (task number 4 ).

4) Result.java
Result.java contains constructor that allows object to be created inside Body.java. There are also few methods 
for retrieving data from the object created, method to print each subject’s highest percentage, lowest percentage and 
average percentage (printCrse()) (task number 2), 

Reference:
[1]  Object-oriented programming (OOP), Margaret Rouse. 
Available: http://searchsoa.techtarget.com/definition/object-oriented-programming


 
