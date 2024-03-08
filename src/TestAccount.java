public class TestAccount {

    public static void main(String[] args) {
        Account  ram = new Account("a1","Ram",3000);
        Account  hari = new Account("a2","Hari",300);

        System.out.println("Before Transaction");
        System.out.println(ram);
        System.out.println(hari);
        ram.transferTo(hari,200);
        System.out.println(ram);
        System.out.println(hari);
    }



}
