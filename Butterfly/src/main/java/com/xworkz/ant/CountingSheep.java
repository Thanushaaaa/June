package com.xworkz.ant;

public class CountingSheep {
	
	public static int countSheep(Boolean[] arr) {
        if (arr == null) {
            return 0; 
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Boolean[] sheepArray = {
        		true,  true,  true,  false,
        		  true,  true,  true,  true ,
        		  true,  false, true,  false,
        		  true,  false, false, true ,
        		  true,  true,  true,  true ,
        		  false, false, true,  true
        };

        int sheepCount = countSheep(sheepArray);
        System.out.println("Number of sheep present: " + sheepCount);
    }


}
