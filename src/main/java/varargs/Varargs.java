package varargs;

public class Varargs {
    public static void main(String[] args){
        String item1 = "Apples";
        String item2 = "oranges";
        String item3 = "Pears";
        String[] shopping = {"Bread","Milk", "Eggs","Bananas"};
        printShoppingList(item1, item2, item3);
       // printShoppingList(shopping);
        printShoppingList("Bread","Milk", "Eggs","Bananas");
    }
//
//    private static void printShoppingList(String string1, String string2) {
//        System.out.println("Shopping List");
//        System.out.println("1."+ string1);
//        System.out.println("2."+ string2);
//    }
//
//    private static void printShoppingList(String string1, String string2, String string3) {
//        System.out.println("Shopping List");
//        System.out.println("1."+ string1);
//        System.out.println("2."+ string2);
//        System.out.println("3."+ string3);
//        System.out.println();
//    }
//
//    private static void printShoppingList(String[] items) {
//        System.out.println("Shopping List");
//        for(int i=0;i<items.length; i++){
//            System.out.println( i + 1+":" + items[i]);
//        }
//        System.out.println();
//    }

    private static void printShoppingList(String... items) {
        System.out.println("Shopping List");
        for(int i=0;i<items.length; i++){
            System.out.println( i + 1+":" + items[i]);
        }
        System.out.println();
    }


}
