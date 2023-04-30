# Popular Algorithms

[![Java Language](https://img.shields.io/badge/PLATFORM-OpenJDK-3A75B0.svg?style=for-the-badge)][1]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?style=for-the-badge)][2]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?style=for-the-badge)][3]

The goal of these programming exercises is to practise:
- algorithmic thinking
- implementing popular algorithms in Java

For this assignment, we've provided the starter project above.

## :pushpin: Sorting

### Merge Sort<sup>1</sup>

Here is the pseudocode for the Merge Sort algorithm:

- declare the `left` and `right` variables, which will mark the extreme indices of the array of size `n`
- `left` will be assigned to 0 and `right` will be assigned to `n-1`
- Find `mid = (left + right) / 2`
- Call `mergeSort` on `(left, mid)` and `(mid + 1, right)`
- Continue the above until `left > right`
- Then call `merge` on the 2 sub-problems

Given what we've learned about this algorithm, create a program that implements it in Java.

```txt
mergeSort(arr, left, right):
    if left > right 
        return
    mid = (left+right)/2
    mergeSort(arr, left, mid)
    mergeSort(arr, mid+1, right)
    merge(arr, left, mid, right)
end
```

<sup>1</sup><sub>Compare with [this implementation][4]</sub>

### Quick Sort<sup>2</sup>

Here is the pseudocode for the Quick Sort algorithm:

- we are given with an input array of size `n`
- choose a `pivot` element - here we are choosing the last element as our `pivot`

Now partition the array as per our `pivot`
- keep a partitioned index say `p` and initialize it to `-1`
- Iterate through every element in the array except the `pivot`
- If an element is less than the `pivot`, then increment p and swap the elements at index `p` with the element at index `i`.
- Once all the elements are traversed, swap pivot with element present at `p+1` as this will the same position as in the sorted array
- Now return the `pivot` index

Once partitioned, now make 2 calls on quicksort
- One from `beg` to `p-1`
- Other from `p+1` to `n-1`

Given what we've learned about this algorithm, create a program that implements it in Java.

```txt
quickSort(arr, beg, end)
  if (beg < end)
    pivotIndex = partition(arr,beg, end)
    quickSort(arr, beg, pivotIndex)
    quickSort(arr, pivotIndex + 1, end)

partition(arr, beg, end)
  set end as pivotIndex
  pIndex = beg - 1
  for i = beg to end-1
  if arr[i] < pivot
    swap arr[i] and arr[pIndex]
    pIndex++
  swap pivot and arr[pIndex+1]
return pIndex + 1
```

<sup>2</sup><sub>Compare with [this implementation][5]</sub>


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