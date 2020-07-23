
// 方法一
class Solution {
    public int minArray(int[] numbers) {
       return Arrays.stream(numbers).min().getAsInt();
    }
}

//方法二
class Solution {
    public int minArray(int[] numbers) {
        int low = 0 ;
        int high = numbers.length - 1;
        int mid;

        while (low < high) {

            mid = low + (high - low) / 2;
            if (numbers[mid] < numbers[high]) {
                high = mid;
            } else if (numbers[mid] > numbers[high]) {
                low = mid+1;
            } else {
                high -= 1;
            }

        }
        return numbers[low];

    }

}