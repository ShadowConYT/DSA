# Quick Sort implementation

def quick_sort(arr, low, high):
   """
   Sorts a portion of the array using the quick sort algorithm.

   Args:
       arr: The array to be sorted.
       low: The starting index of the portion to be sorted.
       high: The ending index of the portion to be sorted.

   Returns:
       The sorted array.
   """

   if low < high:
       # Partition the array around a pivot element
       pi = partition(arr, low, high)

       # Recursively sort the subarrays before and after the pivot
       quick_sort(arr, low, pi - 1)
       quick_sort(arr, pi + 1, high)

   return arr

def partition(arr, low, high):
   """
   Partitions the array around a pivot element.

   Args:
       arr: The array to be partitioned.
       low: The starting index of the portion to be partitioned.
       high: The ending index of the portion to be partitioned.

   Returns:
       The index of the pivot element after partitioning.
   """

   # Choose the last element as the pivot
   pivot = arr[high]

   # Index of the smaller element
   i = low - 1

   # Traverse the array and move smaller elements to the left of the pivot
   for j in range(low, high):
       if arr[j] < pivot:
           i += 1
           arr[i], arr[j] = arr[j], arr[i]  # Swap elements

   # Place the pivot in its correct position
   arr[i + 1], arr[high] = arr[high], arr[i + 1]

   return i + 1  # Return the index of the pivot

def main():
   """
   Main function to demonstrate the quick sort algorithm.
   """

   arr = [6, 9, 4, 2, 0, 9, 1, 1]
   n = len(arr)
   print(quick_sort(arr, 0, n - 1))  # Print the sorted array

if __name__ == "__main__":
   main()