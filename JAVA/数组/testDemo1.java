/**
 * @ClassName
 * @Description TODO
 * @Author ZhangLu
 * @Date ${2019/10/16} ${20:30}
 * @Version 1.0
 **/
//求数组组中的最大值
//求数组中的最小值
//求数组的平均值
//将数组逆置
//将数组中奇数放到偶数前
//binarySearch的递归



        /*
    public static int binarySearch(int[] array,int key,int left,int right){
    if(left>right){
        return -1;
    }int mid=(left+right)/2;
    if(mid==key){

    }

    }
}
*/

        /*
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(averNumer(array));
    }

    public static int averNumer(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

}

*/
    /*
    public static void main(String[] args){
        int[] array={1,2,3,4,5,6};
        System.out.println(min(array));
    }

    public  static int min(int[] array){
        int min=array[0];
        for (int i = 0; i <array.length ; i++) {
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
    */


    /*
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(max(array));
    }



    public static int max(int[]array){
         int max=array[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    */




   /*
    public static void main2(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        String ret = toString(array);
        System.out.println(str);

    }
}
*/
/*
public static String toString(int[] array) {
    int left = array[0];
    int str=array[i];
    for (int i = 0; i < array.length; i++) {
        if (left < array[i]) {
            int str = array[i];
            left++;
        }
        return str;
    }
}

*/

/*
    public static void main1(String[] args) {
        int[] array={1,2,3,4,5};
        String ret=toString(array);
        System.out.println(ret);
    }

    public static String toString(int[] array){
        String str="[";
        for (int i = 0; i <array.length ; i++) {
            str+=array[i];
            if(i!=array.length-1){
                str+=",";
            }

        }
        str+="]";
        return str;
    }
}
*/