package day39_arraylist2;

public class Arraylist2Notes {
    /*
    3/30/2022

Day 39 ArrayList

day39_arraylist
____________________________________________________________

Tomorrow: No Class
____________________________________________________________

ArrayList
____________________________________________________________

ArrayList methods:

	add(element) --> adds the element to the end of the ArrayList
		returns boolean

	add(index, element): puts the element at the given index number. All the other elements are moved over
		void

	get(index) --> returns the element at the given index

	size() --> returns how many elements the ArrayList has

		last index in ArrayList: name.size() - 1

	remove(index): removes the element at the given index number and returns that element value
		-> what if you try to remove with an index that doesn't exist: it will go out of bounds

	remove(element): removes the given element and returns a boolean value if it was removed or not
		-> what if you try to remove with an element that doesn't exist: the list will not be changed and the method would return false

Iterating through an ArrayList

	ArrayList<Integer> nums = new ArrayList<>();
	nums.add(1);
	nums.add(2);
	nums.add(3);

	for(int i = 0; i < nums.size(); i++){
		System.out.println(nums.get(i));
	}

	or

	for(int each : nums){
		System.out.println(each);
	}

____________________________________________________________

Example of adding, removing

        ArrayList<String> list = new ArrayList<>();
        list.add("computer");
        list.add("screen");
        list.add("mouse");
        list.add("keyboard");

        String item = list.remove(0); // removes the first index of the ArrayList, which is (computer) and it returns that element (computer) from the method. We store the return value into a String variable called item
        System.out.println(item);
        System.out.println(list);

        boolean bool = list.remove("mouse");
        System.out.println(bool);
        System.out.println(list);

____________________________________________________________

More ArrayList methods:

	contains(element): check if the given element is in the ArrayList. Return boolean. True if the element is there or false if it is not

	clear(): remove all the elements in the ArrayList

		void: no return

	isEmpty(): return boolean.
		true: whenever there is no element in the ArrayList
		false: whenever there is any element in the ArrayList

	set(index, element): replace the element at the given index number (1st parameter) with the given element (2nd parameter)

	indexOf(element): return an int
		first occurrence of the index of the given element

		if the element does not exist in the ArrayList: it returns -1

____________________________________________________________

Convert an Array to an ArrayList

	for array we were able to declare values using curly brackets

		int [] a = { 1, 2, 3, 4};

	We can't just do this for ArrayList

	But ArrayList can be made in other ways:

		ArrayList<type> name = new ArrayList<>(); // makes empty ArrayList, no elements

		ArrayList<type> name = new ArrayList<>( ArrayList object ); // make an ArrayList with a copy of the elements from another ArrayList

			--> this one is more generic:
			ArrayList<type> name = new ArrayList<>( collection type );

	so

		we can use Arrays.asList() method which accepts an array parameter and return a collection type

	All the points combined:

		ArrayList<type> name = new ArrayList<>( Arrays.asList() );

		this will create a new ArrayList object by giving values into the asList method

Note: the asList method is a var arg method, which means the parameter is an array, but we can add the numbers ourselves using the element and a comma

	method(int ... nums) --> same as --> method(int [] nums)

	but the ..., the var arg method allow you to type the element in the parenthesis


     */
}
