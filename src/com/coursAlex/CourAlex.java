package com.coursAlex;

public class CourAlex {
    public static void main(String[] args) {
        System.out.println("debut de programme");
        try {
            methode("null");
            int[] tab = {1,2,3};
            System.out.println(tab[2]);
            checkedOrUnchecked();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("OtherException: " + e.getMessage());
        }
        System.out.println("fin de programme");
    }

    public static void methode(String chaine) {
        System.out.println("debut de methode");
        System.out.println(chaine.length());
        System.out.println("fin de methode");
    }

    public static void checkedOrUnchecked() throws Exception{
        // throw new RuntimeException("checked");
        throw new Exception("checked");
    }
}
