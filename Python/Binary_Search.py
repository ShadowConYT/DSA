# Define a function named 'Binary' that takes a list 'arr' and an integer 'target' as parameters
def Binary(arr: list, target: int):
    arr.sort()
    # Initialize 'high' as the last index of the list 'arr'
    high = len(arr) - 1
    # Initialize 'low' as the first index of the list 'arr'
    low = 0

    # Continue the loop as long as 'high' is greater than 'low'
    while high > low:
        # Calculate the middle index by adding 'low' and the integer division of 'high' by 2
        mid = low + high // 2

        # If the element at the middle index is equal to the 'target'
        if arr[mid] == target:
            # Return the middle index 'mid' where the 'target' is found
            return mid
        # If the element at the middle index is greater than the 'target'
        elif arr[mid] > target:
            # Update 'high' to be one less than the middle index 'mid'
            high = mid - 1
        # If the element at the middle index is less than the 'target'
        else:
            # Update 'low' to be one more than the middle index 'mid'
            low = mid + 1
    # If the 'target' is not found in the list 'arr', return -1
    return -1

# Call the function 'Binary' with a list [1, 2, 3, 4, 5] and a target 0, and print the result
print(Binary([1, 2, 3, 4, 5], 0))