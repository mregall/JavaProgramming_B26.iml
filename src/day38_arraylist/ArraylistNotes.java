package day38_arraylist;

public class ArraylistNotes {
    /*
    3/28/2022

Day 38 ArrayList

day38_arraylist
____________________________________________________________

ArrayList
____________________________________________________________

Recap

Wrapper Classes

	object representation of primitive datatypes

	these classes are in the java.lang package

Converting types

	Autoboxing: converts the primitive datatype into an object type (Wrapper Class Objects)

	Unboxing: converts the object type into a primitive datatype

When to use Wrapper classes

	1) ArrayList and other collections can't work with primitive datatypes

	2) Useful methods, information

		Ex: parse methods, MAX_VALUE

____________________________________________________________

ArrayList

	a class that works like a dynamic array that also has some methods

	located in the java.util package
		--> Anytime you want to use an ArrayList you must import it

	the size is flexible
	we can print the ArrayList objects normally
	only work with Objects type --> primitive datatypes do not work

	ArrayList will take more memory than an array
	Arrays itself is faster, whenever there is set of data that doesn't change

	Syntax:

		ArrayList<datatType> name = new ArrayList<>();

ArrayList methods:

	add(element): add the given element to the ArrayList at the end

		returns boolean --> returns true, but we don't normally use this return value

	add(index, element): adds the given element at the given index of the ArrayList. All elements are moved positions

	get(index): returns the element at the given index number

	size(): returns the number of how many elements the ArrayList has

	remove(index): remove the element at the given index and it returns the element that was removed
		all the elements move over

	remove(element): remove the given element from the ArrayList and it returns a boolean
		true -> remove an element
		false -> element doesn't exist


     */
}
