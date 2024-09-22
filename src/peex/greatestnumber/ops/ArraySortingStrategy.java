package peex.greatestnumber.ops;

public interface ArraySortingStrategy extends ArrayOperation<int[]> {
     /**
      * Returns a sorted copy of the array.
      * @param array the array to sort
      * @return the copied and sorted array
      */
     int[] sorted(int[] array);

     default int[] calculate(int[] array) {
          return sorted(array);
     }
}
