
// 方法一
class Solution {
    public int minArray(int[] numbers) {
       return Arrays.stream(numbers).min().getAsInt();
    }
}