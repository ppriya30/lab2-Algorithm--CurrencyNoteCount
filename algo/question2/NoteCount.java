package com.lab2.algo.question2;

public class NoteCount {
    public void counting(int[] currency,int amount){
        int noteCount[]= new int[currency.length];//array
        int i;
        int sumofnote=0;
        for (i=0;i<currency.length;i++){

            noteCount[i]=amount/currency[i];
            amount=amount%currency[i];
            sumofnote=sumofnote+noteCount[i];
        }


        for (int j=0;j<currency.length;j++){
            if(noteCount[j]!=0){
                System.out.println(currency[j]+"X"+ noteCount[j]);
            }

        }
        System.out.println("Total Notes "+sumofnote);
    }
}
