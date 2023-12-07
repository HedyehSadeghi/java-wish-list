package org.lessons.java.whishlist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NullPointerException, IllegalArgumentException {
        Scanner scanner= new Scanner(System.in);
        ArrayList<String> presentArrayList = new ArrayList<>();

        boolean stop= false;
        while (!stop){
            System.out.println("il nome del regalo: ");
            String present= scanner.nextLine();
            if (present.isBlank()){
                System.out.println("non hai inserito nulla");
            }else{
                presentArrayList.add(present);
            }

            System.out.println("vuoi aggiungere altri regali? (y/n)");
            String userResponse= scanner.nextLine();

            if (userResponse.equalsIgnoreCase("n")) {
                stop= true;
            }else if (!userResponse.equalsIgnoreCase("y") || userResponse.isBlank()) {

                System.out.println("non hai inserito né y né n. Riproviamo.\nVuoi inserire un altro regalo?");
                String userResponse1= scanner.nextLine();

                if (userResponse1.equalsIgnoreCase("n")){
                    stop=true;

                }else if (!userResponse1.equalsIgnoreCase("y")|| userResponse1.isBlank()) {
                    System.out.println("Di nuovo? Basta\nFine programma");
                    stop=true;

                }
            }


            System.out.println("la tua lista è composta da "+ presentArrayList.size() +" elementi, ed è la seguente:\n"+ presentArrayList);

        }


        scanner.close();

    }


}
