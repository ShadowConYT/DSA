# Define a function named 'selectionSort' that takes a list 'arr' as a parameter
def selectionSort(arr: list):
    # Iterate over the range from 0 to the second last index of the list 'arr'
    for i in range(0, len(arr)-1):
        # Initialize 'mini' as the current index 'i'
        mini = i
        # Iterate over the range from the next index 'i+1' to the last index of the list 'arr'
        for j in range(i+1, len(arr)):
            # If the element at index 'j' is less than the element at index 'mini'
            if arr[j] < arr[mini]:
                # Update 'mini' to be the index 'j'
                mini = j

        # Swap the elements at index 'i' and 'mini'
        arr[i], arr[mini] = arr[mini], arr[i]
    # Return the sorted list 'arr'

# Define a list 'arr' with elements [1, 3, 2, 5, 4]
arr = [1, 3, 2, 5, 4]
# Call the function 'selectionSort' with the list 'arr' and print the sorted list
print(selectionSort(arr))