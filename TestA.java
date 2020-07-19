public class TestA extends Thread {

    public TestA(String name){
        super(name);
    }
    @Override
    public void run() {
        try{
            sleep((int)(Math.random()* 2000));
             System.out.println(getName() + " Arrivata in " + getName);
        } catch (InterruptedException e) { }
    }
}
