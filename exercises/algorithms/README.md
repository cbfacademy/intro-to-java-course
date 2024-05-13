# Popular Algorithms

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][2]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][3]

The goal of these programming exercises is to practise:
- algorithmic thinking
- implementing popular algorithms in Java

For this assignment, we've provided the starter project above.

## :pushpin: Sorting

### Quick Sort

Here is the pseudocode for the Quick Sort algorithm:

```txt
// We are given an input array of size `n`, the position of the starting element (initially `0`) and the position of the end element (initially `n-1`)
sort(arr, startIndex, endIndex)
    // Ensure the position of the element is higher than the start element
    if startIndex < endIndex
        // Partition the array around a pivot element and get its position
        pivotIndex = partition(arr, startIndex, endIndex)
        
        // Recursively sort the partitions on either side of the pivot
        sort(arr, startIndex, pivotIndex - 1)
        sort(arr, pivotIndex + 1, endIndex)

// We are given the input array, the position of the starting element and the position of the end element
partition(arr, startIndex, endIndex)
    // Choose the rightmost element as the pivot
    pivot = arr[endIndex]
    // Track the position of the element representing the boundary of the lower partition and initialise it to the position just before the starting element
    boundaryIndex = startIndex - 1
    
    // Iterate through every element in the array except the pivot
    for currentIndex = startIndex to endIndex - 1
        // If the current element is less than the pivot, then increment the boundary position and swap the element at the new boundary with the current element. This has the effect of pushing all lower values to the left of the array.
        if arr[currentIndex] <= pivot
            // Increment the boundary of the lower partition
            boundaryIndex = boundaryIndex + 1
            // Move the current element into the lower partition
            swap(arr, boundaryIndex, currentIndex)
    
    // Move the pivot between the lower and upper partitions
    swap(arr, boundaryIndex + 1, endIndex)
    
    // Return the position of the pivot
    return boundaryIndex + 1

// We are given the input array, the position of the left-hand element and the position of the right-hand element
swap(arr, leftIndex, rightIndex)
    // Store the value of the left-hand element
    temp = arr[leftIndex]
    // Assign the value of the right-hand element to the left-hand element
    arr[leftIndex] = arr[rightIndex]
    // Assign the original value of the left-hand element to the right-hand element
    arr[rightIndex] = temp
```

Given what we've learned about this algorithm, create a `QuickSort` class in the `com.cbfacademy.sort` package under the `sort` module. Your class must implement the provided `ArraySorter` interface.

#### :white_check_mark: Verify Your Implementation

To verify that your code works as expected, run the `QuickSortTest` tests.

In your terminal, ensure that you are in the `algorithms` folder.
Then run the following command in your terminal.

```shell
./mvnw --projects sort clean test
```

If you are on Windows, run this command instead:

```shell
mvnw --projects sort clean test
```

Your implementation is correct when all tests pass.

## :pushpin: Searching

### Binary Search
Here is the pseudocode for the Binary Search algorithm.

NB: remember that this algorithm expects to be given sorted data otherwise the results will be unpredictable.

```txt
do until the pointers low and high meet each other.
    //find the index at the mid point of the given array (add the lowest index to the highest index and divide by two, e.g. 0 + 10 / 2 = 5)
    mid = (low + high)/2
    //if the target value is the mid point element
    if (target == arr[mid])
        // return the index number for the mid point of the array 
        return mid
    // if the target value is higher than the value of the mid point element 
    else if (target > arr[mid]) // target could be on the right side of the array
        // set the low index to the right of the middle 
        low = mid + 1
    // in all other cases
    else                       // target could be on the left side of the array
        // set the high index to the left of the middle
        high = mid - 1
```

Given what we've learned about this algorithm, create a `BinarySearch` class in the `com.cbfacademy.search` package. Your class must implement the provided `Search` interface.
  - if the target value is found in the given array, the method should return the index for that value
  - if the target value is not present, the method should return -1

#### :white_check_mark: Verify Your Implementation

To verify that your code works as expected, run the `BinarySearchTest` tests.

In your terminal, ensure that you are in the `algorithms/search` folder.
Then run the following command in your terminal.

```shell
./mvnw clean test
```

If you are on Windows, run this command instead:

```shell
mvnw.cmd clean test
```

Your implementation is correct when all tests pass.

[1]: https://docs.oracle.com/javase/21/docs/api/index.html
[2]: https://junit.org/junit5/
[3]: https://maven.apache.org/