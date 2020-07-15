public class Main {

    public static void main(String[] args) {
        Thread t1 = new TestA ("A Ferrari");
        Thread t2 = new TestA ("A Mercedes");
        Thread t3 = new TestA ("A Audi");
        Thread t4 = new Thread(new TestB("B Cinquecento"));
        Thread t5 = new Thread(new TestB("B Punto"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }


}
