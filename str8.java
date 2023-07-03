public class str8 {
    public static boolean checkLine(int coordinates[][]) {
        int l1 = coordinates.length;
        if (l1 <= 2) {
            return true;
        }
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];

        double prevSlope = (double) (y2 - y1) / (x2 - x1);

        for (int i = 2; i < l1; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];

            double slope = (double) (y - y1) / (x - x1);

            if (slope != prevSlope) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] coordinates = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 }, { 6, 7 } };
        System.out.println(checkLine(coordinates)); 
    }
}
