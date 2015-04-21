# ConverterApp
I'll cover relative layouts, grid layouts, array resources, Array Adapters, Spinners, and more. In the next video I'll finish the entire app
Get the Code Here : http://goo.gl/EccR8u


--------------------------------------------------------------------------------------------------------------------------
SIMPLE ACTIONS
	 
  1. The user enters a number they want converted into an EditText
	 
	2. They change the spinner to the unit of measure to convert from
	3. The other conversion types all show their measurement version of that unit amount
	1. Create the layout in 	activity_main.xml
	 
	a. Use relative layout for for	label "Convert From", Edittext and	Spinner
	 
	b. Use GridLayout for bottom that	contains 2 columns and 6 rows
	 
	c. Make gridlayout a blue color
	 
  d. Use the units teaspoons, tablespoons,	cup, ounces, pints, quarts, gallons,	pounds, milliliter, liter, milligram	kilograms
	 
	2. Setup MainActivity
	 
	a. Create Spinner, EditText, TextViews
	 
	b. In onCreate
 
	I. add items to the spinner
	 
	i. Create an ArrayAdapter using String array resource
	(Make strings.xml)
	 
	ii. Define the layout to use with the Spinner
	 
	iii. Connect the Adapter to the Spinner
	 
	II. Add a listener to the Spinner
	 
	i. Use setOnItemSelectedListener for Spinner
	 
	ii. NOTE : Maybe check if I am going to use a base class for unit 	conversion
	 
	III. Get the value in the EditText
	 
	IV. Initialize the TextViews
