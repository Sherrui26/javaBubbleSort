import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        
        //int[] data={1,2,3,4,5};
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number of Arrays: ");
        int num = sc.nextInt();
        
        int[] data;
        data = new int[num];
        for(int a = 0; a<num; a++){
            System.out.print("Enter first number: ");
            data[a] = sc.nextInt();
        }
        
        System.out.println("\nBubble Sort(Descending): ");
        boolean swapped = false;
                    do{
			swapped = false;
			for (int i=0;i<=data.length-2;i++){
                                //change "less than(<)" symbol to make it decending or ascending
				if (data[i]<data[i+1]){
					int temp = data[i];
					data[i]=data[i+1];
					data[i+1]=temp;
					swapped=true;
				}
                                //print whole numbers
				for (int k=0;k<data.length;k++){
                                    System.out.print(data[k]+" ");        				
				}
				System.out.println();
			}
		}while(swapped);
                        for (int k=0;k<data.length;k++){
        		System.out.print(data[k]+" ");
                }System.out.println();
    }
}
