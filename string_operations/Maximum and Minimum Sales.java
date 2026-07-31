class Sales {
    public static void main(String args[]) {

        int sales[] = {1200, 3500, 2700, 4100, 3900, 1800, 4500, 5000, 2200, 3100, 2800, 4700};

        int max = sales[0];
        int min = sales[0];

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > max)
                max = sales[i];

            if (sales[i] < min)
                min = sales[i];
        }

        System.out.println("Maximum Sales = " + max);
        System.out.println("Minimum Sales = " + min);
    }
}