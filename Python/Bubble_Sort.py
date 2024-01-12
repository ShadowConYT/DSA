# Define a function named 'bubble_sort' that takes a list 'arr' as input
def bubble_sort(arr: list) -> list:
    # Iterate over each element in the list
    for i in range(len(arr)):
        # For each element, iterate over the rest of the list
        for j in range(i, len(arr) - 1):
            # If the current element is greater than the next element
            if arr[i] > arr[j+1]:
                # Swap the current element and the next element
                arr[i], arr[j+1] = arr[j+1], arr[i]
    # Return the sorted list
    return arr

# Testing the function
# Define a list 'arr'
arr = [5, 4, 3, 2, 1]
# Print the result of calling 'bubble_sort' on 'arr'
print(bubble_sort(arr))