/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findmin;

/**
 *
 * @author azenk
 */
public class FindMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final  String MIN_MSG = "The minimum integer: ";
        final String MAX_MSG = "The maximum integer: ";
        
        System.out.println(MIN_MSG + findMin());
        System.out.println(MAX_MSG + findMax());
    }
    
    /**
     * Compare first element of array to each subsequent element. If a cell
     * has a lesser value min now points to that cell.
     * @return 
     */
    public static int findMin()
    {
        int[] arr = {2, 11, 4, 1, 6};
        int min = arr[0];
                
        for(int i = 0; i < arr.length; i++)
        {
          
            if(arr[i] < min)
            {
                min = arr[i];
            }

        }
        
        return min;
    }
    
    public static int findMax()
    {
        int[] arr = {2, 11, 4, 1, 6};
        int max = arr[0];

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    
}
