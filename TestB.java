public class TestB implements Runnable {

    String name;

    public TestB(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((int )(Math.random()* 2000));
            System.out.println(name + " Arrivata in ");
        } catch (InterruptedException e) {
        }

    }
}
