class OrderPlacement extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Order Placement: Step " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class OrderDelivery extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Order Delivery: Step " + i);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        OrderPlacement order = new OrderPlacement();
        OrderDelivery delivery = new OrderDelivery();

        order.start();
        delivery.start();
    }
}
