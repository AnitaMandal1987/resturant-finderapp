Restaurant Finder is an application to search for restaurants.
The user can also view the menu of the restaurant and other details like price of the items on the menu, whether the restaurant is open or not.
Users can also add items and find out how much they will be spending.

NOTE: The above application does not take orders. It is only to view the amount that the user would be spending at a restaurant that he/she is looking to visit.

The task is to only implement the features of the user/customer.

Here is a list of classes present:

**Features**

RestaurantService.java: Acts as a service to interact with the actors
Restaurant.java: Holds the details of a Restaurant
Item.java: Holds the details of an Item

**Tests**

RestaurantServiceTest.java: Contains test methods to test all methods in RestaurantService class.
RestaurantTest.java: Contains test methods to test all methods in Restaurant class. 

**To do task**

The task is to fill in the missing lines to complete the code. One could find the comments next to the code to know the work to be done. Given below are the methods to be implemented:

1.Restaurant.java

 1.1.getMenu()
 Returns the list of items in the menu.
 
 1.2.isRestaurantOpen()
 Returns a boolean: whether the restaurant is open or not.
 
2.RestaurantService.java

 2.1findRestaurantByName()
 Searches for and returns the restaurant matching the input string.
 
The following test methods were implemented:

**1.RestaurantServiceTest.java**

 1.1.searching_for_existing_restaurant_should_return_expected_restaurant_object()
  To test if findRestaurantByName() returns the expected restaurant object.
  
 1.2.searching_for_non_existing_restaurant_should_throw_exception()
  To test if findRestaurantByName() throws an exception when the restaurant cannot be found
  
**2.RestaurantTest.java**

 2.1.Is_restaurant_open_should_return_true_if_time_is_between_opening_and_closing_time()
  To test if the method isRestaurantOpen() returns true if the current time is between the opening and closing time.
  
 2.2.Is_restaurant_open_should_return_false_if_time_is_outside_opening_and_closing_time()
  To test if the method isRestaurantOpen() returns false if the current time is outside the opening and closing time.
