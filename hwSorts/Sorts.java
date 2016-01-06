import java.util.Arrays;
public class Sorts{
    public static void main(String[]args){
	int[] test = new int[6];
	test[0] = 1;
	test[1] = 2;
	test[2] = 9;
	test[3] = 5;
	test[4] = 0;
	test[5] = 3;
	insertionSort(test);
    }
    
    public static void insertionSort(int[] data){
	int index = 0;
	int i = 0;
	while(i < data.length){
	    int counter = i;
	    int min = data[i];
	    while(counter < data.length){
		if(data[counter] < min){
		    index = counter;
		    min = data[counter];
		}
		counter++;
	    }
	    //data[index] = data[i];
	    data[i] = min;
	    System.out.println(Arrays.toString(data));
	    i++;
	}
    }
}
