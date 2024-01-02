# Define a function named 'Linear' that takes a list 'arr' and an integer 'target' as parameters
def Linear(arr: list, target: int):
    # Iterate over the range of the length of the list 'arr'
    for i in range(len(arr)):
        # If the current element of the list 'arr' is equal to the 'target'
        if arr[i] == target:
            # Return the index 'i' where the 'target' is found
            return i
    # If the 'target' is not found in the list 'arr', return -1
    return -1

# Call the function 'Linear' with a list and a target, and print the result
print(Linear([1, 2, 3, 4, 5], 3))