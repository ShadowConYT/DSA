# Define a function named 'insert' that takes a list 'arr' as input
def insert(arr: list)->list:
    # Iterate over each element in the list
    for i in range(len(arr)):
        # The current element is treated as the "key"
        key = arr[i]
        # Initialize 'j' as one position left of 'i'
        j = i-1
        # Shift elements of 'arr[0..i-1]' that are greater than 'key' to one position ahead of their current position
        while arr[j] > key and j >= 0:
            arr[j+1] = arr[j]
            j-=1
        # Place the 'key' in its correct position in sorted subset 'arr[0..i]'
        arr[j+1] = key
    # Return the sorted list
    return arr

# Testing the function
# Define a list 'arr'
arr = [5, 2, 4, 6, 1, 3]
# Print the result of calling 'insert' on 'arr'
print(*insert(arr))