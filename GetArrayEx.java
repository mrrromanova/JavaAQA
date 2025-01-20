package Lesson11;

public class GetArrayEx {
    public static void main(String[] args) {

        String[][] myArray = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        try{
            System.out.println("Sum of all numbers in array = " + convertAndSumArray(myArray));
        } catch (MyArraySizeException e) {
            System.out.println("MyArraySizeException");
        } catch (MyArrayDataException e) {
            System.out.println("MyArrayDataException");
        }

    }

    public static int convertAndSumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {

        if (array.length != 4 || array[0].length != 4)
            throw new MyArraySizeException("Invalid row or column size");
        int[][] newArray = new int[4][4];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                boolean isNumeric = array[i][j].chars().allMatch(Character::isDigit);
                if (!isNumeric) {
                    System.out.printf("[%d][%d] cell has char or string format.", i, j);
                    throw new MyArrayDataException();
                }
                newArray[i][j] = Integer.parseInt(array[i][j]);
                sum += newArray[i][j];
            }
        }
        return sum;
    }}