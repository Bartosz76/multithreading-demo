public class Main {

    public static void main(String[] args) {

        Thread threadOne = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        });

        Thread threadTwo = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        });

        threadOne.setName("One");
        threadTwo.setName("Two");
        threadOne.start();
        threadTwo.start();

    }
}
