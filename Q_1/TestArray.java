package demo1;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        int[] arr = {10, 20, 30};

	        try {
	            accessArray(arr, 5);
	        } catch (MyArrayException e) {
	            System.out.println("Custom Exception: " + e.getMessage());
	        }

	}
	static void accessArray(int[] arr, int index) throws MyArrayException {
        if (index < 0 || index >= arr.length) {
            throw new MyArrayException("Index " + index + " is out of bounds!");
        }
        System.out.println("Element: " + arr[index]);
    }

}
