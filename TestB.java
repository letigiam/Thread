public class TestB implements Runnable {

    String name;

    public TestB(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            int t = (int )(Math.random()* 2000);
            Thread.sleep (t);
            System.out.println(name + " Arrivata in " + t );
        } catch (InterruptedException e) {
        }

    }
}
