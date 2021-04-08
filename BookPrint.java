package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class BookPrint {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
     /*ArrayList<String[]> list3 = new ArrayList<>();
       while (true){
           String details = scanner.nextLine();
           if(details.isEmpty()){
               break;
           }
           String[] arr =  details.split(",");
           list3.add(arr);
       }
       for(String[] i : list3){
           for(String j : i){
               System.out.print(j);
           }
           System.out.println();
       }
*/ // a much efficient approach is using OOPs classes.
        ArrayList<Book> list3 = new ArrayList<>();
        while(true){
            String details = scanner.nextLine();
            if(details.isEmpty())
            {
                break;
            }
            String[] arr = details.split(",");
            String title = arr[0];
            int pages = Integer.parseInt(arr[1]);
            int pubYear = Integer.parseInt(arr[2]);
            //Book b1 = new Book(title,pages,pubYear);
            //list3.add(b1) or use new directly
            list3.add(new Book(title,pages,pubYear));
        }
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("everything")){
            for (Book b : list3){
                System.out.println(b);
            }
        }else{
            for(Book b : list3){
                System.out.println(b.getTitle());
            }
        }
    }
}
