package com.company;

import java.util.Arrays;

public class Solver {
    private int[] inputData;
    private int[] data;
    private int numberOfElements;

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setInputData(int[] inputData) {
        if (inputData.length <2 || inputData.length >100){
            System.out.println("Вы ввели массив неправильной размерности");
        }

        else{
            this.inputData = inputData;
        }
    }

    public int[] getInputData() {
        return inputData;
    }

    private int findMaxOfArray(int[] array){
        int max = 0;
        for (int i = 0; i< array.length;i++){
            max = Math.max(max,array[i]);
        }
    return(max);
    }

  /*  private int[] convertToIntArray(String[] data){
        this.data = new int[data.length];
        for (int i =0; i<data.length;i++){
            int itemOfInputD = Integer.parseInt(data[i]);
            this.data[i] = itemOfInputD;
         }
        return  (this.data);
     }
*/


    private int[] findLengthsOfSets(int[] intArray){
        int[] arrayOfLength = new int [intArray.length];
        int len = 0;
        Arrays.sort(intArray);
        for (int i = 0 ; i <intArray.length; i++) {
            len = 0;
            for (int j = i ; j<intArray.length ; j++){
                if (Math.abs(intArray[j]-intArray[i]) <=1) {
                    len++;
                }
            }
            arrayOfLength[i] = len;
        }
        return (arrayOfLength);
    }

    public void SolveProblem(){
        int[] lenArr = findLengthsOfSets(this.inputData);
        int  max =  findMaxOfArray(lenArr);
        System.out.println(max);


    }


}
