package day36_method_overloading;

public class Day36Notes {
    /*
    3/26/2022

Day 36 Overloading Methods

day36_methods
____________________________________________________________

Overloading methods
____________________________________________________________

Method overloading

How to have methods with similar idea, first we can try with different name:
but that means we would have to use so many more methods names

	ex:
		sumInt(int numOne, int numTwo)
		sumDouble(double, numOne, numTwo)
		sumString(String str, String str2)

	* method that has the same name, but different parameters

		-> allows us to have different methods, different code, but the same name

		overloading happens inside of a class, between methods

	ex:
		substring(start)
		substring(start, end)

		indexOf()

Q: Can you overload a method by changing the return type
	no, methods are overloaded by changing the parameters

Q: After you overload a method, can you change the return type
	yes, after a method is overloaded you can change the return type if you want


    public static void method(){
        System.out.println("default empty method");
    }

	// I will try to overload by changing the return type

	//    public static int method(){
	//
	//    }
	//    this is not valid, changing the return type does not overload

	public static int method(int a){
	        return 0;
	}

var args
variable arguments

	allow you to create methods that accept an array as the parameter, but we can type all the elements directly, separated by commas, without making an array object

	syntax:

		normal --> 	(int [] nums)
		var args --> (int ... nums)

			ex:	method(element, element, element)

			public static int sum(int ... nums){

			call the method:
			System.out.println(sum(4, 6, 2, 6, 12, 4));

datatype promotion

	whenever you give an argument it will try to match with the specified type

	but if the type is not matched directly it will try to automatically promote to the closest type bigger than it

	byte --> short --> int --> long --> float --> double

	if there is no type available, then the code will not compile

summary:

Method overloading allows methods to be created with the same name
The parameters must be different (number of parameters, or the types of the parameters)
The return types should be the same, but if a method is overloaded it can be changed
Improve re-usability and readability

____________________________________________________________

Git: Keep track of changes

project: B26_Git_Project

right click on project level -> new -> file -> .gitignore

What does the git ignore file do

	any files or folders in this file will not be tracked

Common java files to ignore:
.idea
*.iml
*.xml
/out

# comment with hashtag

-----------------------------------------------------------------
Scenario about versions

	you do code in office hours
	office hours code was shared to the remote repository
	I wrote code in class
	try to share code to remote repository

		-> faced issue because my project was not the same as the project in the remote repository

	to fix the issue, I should update/or pull my project

		--> now my local repository is the same as the remote repository, so now I can commit and push my changes

	Monday class: 4.0
	Tuesday, office hours: 5.0
	Tuesday, in class: 4.0
		trying to share 4.0 --> 5.0
			x doesn't work

		to fix: I need to get version 5.0 to my computer --> update/pull

		now my computer has 5.0 version it means I can share the new code, which would share version 5.2


as a rule: you should always update your projects before pushing
-----------------------------------------------------------------

From the VCS option on the top we select enable version control system integration and pick git

	--> creates a local repository in this project
	--> VCS option becomes Git

commit the changes so far, which was just the .gitignore

Went to Git option on the top -> Github -> share project

	1) creates a remote repository
	2) links the local repository with the remote repository
	3) pushes the first changes/commits

How to open the project on github?
right click on the project level --> open in --> github

created a new package day0
created a new class HelloWorld
wrote some code

commit -> selected the HelloWorld file
push from local repository to remote repository

Note: The add option window was given to us about if we automatically want to keep track of all files
	if we cancel all files will be created un-versioned
	if we add then all files will be tracked upon creation

created a new class called First
added some code/comments
commit those changes
go back to the First class and add more changes
commit those changes
after committing there was something wrong with commit message, so we edit it

	-> How to edit: right click on the commit in the git log and select edit commit message

	Note: If you pushed changes already you will not be able to change the commit message. It is not only local now

created the JamesBond.java file on github
	(create an idea that someone else made changes to the same remote repository)
wrote some code
commit the changes on the remote repository (save)
to get the changes from the remote repository to our local repository
	fetch: go the information without making any changes to our project

	Git -> fetch

	update: actually get the changes from the remote repository to our computer, which allows us to run the file now

	Git --> update


     */
}
