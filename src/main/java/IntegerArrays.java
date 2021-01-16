public class IntegerArrays {

    public int[] intArrayCrop(int[] arr){
        int x = 0;
        int y = 0;

        for (int n : arr) {
            if(n == 4){
               x++;
            }
        }

        if(x == 0){
            throw new RuntimeException("в массиве нет 4");
        }

        x = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 4){
                x = i;
            }
        }

        int[] intArr = new int[arr.length - (x + 1)];
        for (int i = x + 1; i < arr.length; i++, y++) {
            intArr[y] = arr[i];
        }

        return intArr;
    }

    public boolean intArray(int[] arr){
        int one = 0;
        int four = 0;

        for (int n : arr) {
            if(n == 1){
                one++;
            } else if(n == 4){
                four++;
            } else {
                return false;
            }
        }
        if(one == 0 || four == 0){
            return false;
        }
        return true;
    }

}
