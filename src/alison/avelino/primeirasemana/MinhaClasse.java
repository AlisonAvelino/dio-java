package alison.avelino.primeirasemana;

public class MinhaClasse {

    public static void main(String[] args) {

        String firstName = "Alison";
        String lastName = "Avelino";

        String fullName = FullName(firstName, lastName);

        System.out.println(fullName);

    }

    public static String FullName(String firstName, String lastName){
        return firstName.trim().concat(" ").concat(lastName.trim());
    }

}
