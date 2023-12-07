package org.lessons.java.whishlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws NullPointerException, IllegalArgumentException {
        Scanner scanner= new Scanner(System.in);
        Set<String> presentArrayList = new HashSet<>();

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
                boolean validResponse=false;
                while(!validResponse){
                    System.out.println("non hai inserito né y né n. Riproviamo.\nVuoi inserire un altro regalo?");
                    String userResponse1= scanner.nextLine();
                    if (userResponse1.equalsIgnoreCase("n")){
                        stop=true;
                        validResponse=true;
                    } else if (userResponse1.equalsIgnoreCase("y")) {
                        validResponse=true;
                    } else if (!userResponse1.equalsIgnoreCase("y")|| userResponse1.isBlank()) {
                        System.out.println("Di nuovo? Bastaaaa");
                    }
                }

            }

            System.out.println("la tua lista è composta da "+ presentArrayList.size() +" elementi, ed è la seguente:\n"+ presentArrayList);

        }


        scanner.close();

    }


}
