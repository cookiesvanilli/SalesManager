public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int average() {
        int average = 0;
        if (sales.length > 0) {
            int sum = 0;
            for (int sale : sales) {
                sum += sale;
            }
            average = (sum - max() - min()) / sales.length;
        }
        return average;
    }
}
