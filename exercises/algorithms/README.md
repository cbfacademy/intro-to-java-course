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

Given what we've learned about this algorithm, create a `QuickSort` class in the `com.cbfacademy.sort` package. Your class must implement the provided `ArraySorter` interface.

## :pushpin: Searching

### Linear Search

Write a linear search algorithm which:
- takes a list of elements (these can be numbers, strings, ...) as the first input
- the element to be found as the second input
- and sequential searches through the list, starting from one end, and checking every element of the list until the desired element is found.

### Binary Search<sup>3<sup>

Here is the pseudocode for the Binary Search algorithm.

Given what we've learned about this algorithm, create a program that implements it in Java.

```txt
do until the pointers low and high meet each other.
    mid = (low + high)/2
    if (x == arr[mid])
        return mid
    else if (x > arr[mid]) // x is on the right side
        low = mid + 1
    else                       // x is on the left side
        high = mid - 1
```

<sup>3</sup><sub>Compare with [this implementation][6]</sub>

[1]: https://docs.oracle.com/javase/11/docs/api/index.html
[2]: https://junit.org/junit5/
[3]: https://maven.apache.org/
[4]: https://www.programiz.com/java-programming/examples/merge-sort
[5]: https://www.programiz.com/java-programming/examples/quick-sort
[6]: https://www.programiz.com/java-programming/examples/binary-search