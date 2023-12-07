package org.lessons.java.whishlist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NullPointerException, IllegalArgumentException {
        Scanner scanner= new Scanner(System.in);
        ArrayList<String> presentArrayList = new ArrayList<>();

        boolean stop= false;
        do {
            System.out.println("il nome del regalo: ");
            String present= scanner.nextLine();

            try {
                if (present.isBlank()){
                    throw new NullPointerException("non hai inserito nulla");
                }else{
                    presentArrayList.add(present);
                }
            } catch(NullPointerException e){
                System.out.println("non hai inserito nulla. Riprova");
            }

            System.out.println("vuoi aggiungere altri regali? (y/n)");
            String userResponse= scanner.nextLine();
            try{
                if (userResponse.equalsIgnoreCase("n")) {
                    stop= true;
                }else if (!userResponse.equalsIgnoreCase("y") || userResponse.isBlank()) {
                    throw new IllegalArgumentException("non hai inserito y o n");
                }
            }catch(IllegalArgumentException e){
                System.out.println("non hai inserito né y né y. Riproviamo.\nVuoi inserire un altro regalo?");
                String userResponse1= scanner.nextLine();

                if (userResponse1.equalsIgnoreCase("n")){
                    stop=true;

                }else if (!userResponse1.equalsIgnoreCase("y")|| userResponse1.isBlank()) {
                    System.out.println("Di nuovo? Bastaaaaa");
                    stop=true;

                }
            }


            System.out.println("la tua lista è composta da "+ presentArrayList.size() +" elementi, ed è la seguente:\n"+ presentArrayList);

        }while (!stop);


        scanner.close();

    }


}
