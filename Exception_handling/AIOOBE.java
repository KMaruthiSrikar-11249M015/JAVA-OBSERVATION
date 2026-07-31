class TrainCodes {
    public static void main(String args[]) {

        String trains[] = {"TN01", "TN02", "TN03"};

        try {
            System.out.println(trains[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Train Index!");
        }
    }
}