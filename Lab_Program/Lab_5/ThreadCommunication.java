package Lab_Program.Lab_5;

class Restaurant {
    boolean ordered = false;
    boolean cooked = false;
    synchronized void foodOrder(String orderName) {
        System.out.println("Thread customer: customer is chosing an order ...");
        try {
            System.out.println("Thread waiter: customer has ordered " + orderName);
            ordered = true;
            notifyAll();
        } catch(Exception e) {}
    }
    synchronized void cookedOrder(String orderName) {
        try {
            while(!ordered) wait();
            System.out.println("Thread cook: chef has received the order " + orderName);
            System.out.println("Thread cook: cooking under progress.....");
            Thread.sleep(1000);
            cooked = true;
            System.out.println("Thread cook: order is ready!!");
            notifyAll();
        } catch(Exception e) {}
    }
    synchronized void recivedOrder(String orderName) {
        try {
            while(!cooked) wait();
            System.out.println("Thread waiter: food is delivered to customer!!");
        } catch(Exception e) {}
    }
}
public class ThreadCommunication {
    public static void main(String[] args) {

        Restaurant r = new Restaurant();
        String order = "Chicken biryani";

        Thread customer = new Thread(() -> r.recivedOrder(order), "customer");
        Thread waiter   = new Thread(() -> r.foodOrder(order),   "waiter");
        Thread cook     = new Thread(() -> r.cookedOrder(order), "cook");

        customer.start();
        cook.start();
        waiter.start();
    }
}

