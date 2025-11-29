package MyWork.ThraedsExample;

class orderStatus extends Thread {
    public void run() {
        for(int i = 1;i<=5;i++){
            System.out.println("Checking order status: " + i);
        }
    }
}

class DeliveryTracking extends Thread {
    public void run() {
        for(int i = 1;i<=5;i++){
            System.out.println("Delivery in progress: " + i);
        }
    }
}

class FoodDelApp {
    public static void main(String[] args) {
        orderStatus os = new orderStatus();
        DeliveryTracking dt = new DeliveryTracking();

        os.start();
        try {
            os.join();  // ensure orderStatus thread completes first
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        dt.start();
    }
}