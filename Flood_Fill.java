public class Flood_Fill {

    public int[][] recursive(int[][] image, int target, int sr, int sc, int color) {

        if (sr < 0 || sc < 0 || sr > image.length - 1 || sc > image[0].length - 1 || image[sr][sc] != target) {
            return image;
        }

        image[sr][sc] = color;

        image = recursive(image, target, sr - 1, sc, color);
        image = recursive(image, target, sr + 1, sc, color);
        image = recursive(image, target, sr, sc - 1, color);
        image = recursive(image, target, sr, sc + 1, color);

        return image;
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int target = image[sr][sc];
        image = recursive(image, target, sr, sc, color);
        return image;
    }

    public static void main(String args[]) {
        int arr[][] = { { 0, 0, 0 }, { 0, 0, 0 } };
        for (int[] small : arr) {
            for (int num : small) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        arr = new Flood_Fill().floodFill(arr, 1, 1, 0);

        for (int[] small : arr) {
            for (int num : small) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}
