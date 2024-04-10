package sample;

public class ArraySample {

    public static void main(String[] args) {
        var numbers = new int[5];

        for (var i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2; // 配列の各要素に値を代入
        }

        // 配列の要素を表示
        for (var i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}