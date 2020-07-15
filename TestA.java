public class TestA extends Thread {

    public TestA(String name){
        super(name);
    }
    @Override
    public void run() {
        try{
            int t = (int )(Math.random()* 2000);
            sleep (t);
             System.out.println(getName() + " Arrivata in " + t);
        } catch (InterruptedException e) { }
    }
}
