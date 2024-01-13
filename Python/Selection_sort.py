def selection_sort(arr: list) -> list:
    # Iterate over the entire array. The last element doesn't need to be checked because by the time we get there, it will already be sorted.
    for i in range(len(arr)-1):
        # Assume the first element of the unsorted part of the array is the smallest
        mini = i

        # This loop will find the smallest element in the unsorted part of the array
        for j in range(i+1, len(arr)):
            # If we find an element smaller than our current smallest, update our smallest
            if arr[j] < arr[mini]:
                mini = j
        
        # Swap the smallest unsorted element with the first unsorted element
        arr[i], arr[mini] = arr[mini], arr[i]
    
    # Return the sorted array
    return arr

if __name__ == "__main__":
    arr = [1, 5, 2, 4, 3]
    # The array is sorted as follows:
    # First pass: [1, 5, 2, 4, 3] -> [1, 5, 2, 4, 3] (1 is already the smallest element)
    # Second pass: [1, 5, 2, 4, 3] -> [1, 2, 5, 4, 3] (2 is the smallest element in the remaining array)
    # Third pass: [1, 2, 5, 4, 3] -> [1, 2, 3, 4, 5] (3 is the smallest element in the remaining array)
    # Fourth pass: [1, 2, 3, 4, 5] -> [1, 2, 3, 4, 5] (4 is the smallest element in the remaining array)
    # Fifth pass: [1, 2, 3, 4, 5] -> [1, 2, 3, 4, 5] (5 is the only element left, so the array is now sorted)
    print(selection_sort(arr))