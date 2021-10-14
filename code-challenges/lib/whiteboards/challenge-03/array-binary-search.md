# Binary Search
Write a function called BinarySearch which takes in 2 parameters: a sorted array and the search key. Without utilizing any of the built-in methods available to your language, return the index of the array’s element that is equal to the value of the search key, or -1 if the element is not in the array.
## Whiteboard Process
![](../whiteboards/challenge-03.png)
## Approach & Efficiency
Setting low and high values to find the middle index was the game plan.  every time the value was not at middle index, it would check to see if it was higher than the middle index or lower, then reduce the search field and set a new middle index to locate the value.  if the value was outside the scope of the array, the function would return -1 to indicate it was not found. otherwise, it would return the index of value in the array.
