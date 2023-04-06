package ua.orlov.hw7;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

class Vector {
    static int N;
    int x;
    int y;
    int z;

    @Override
    public String toString() {
        return "Vector{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }

    public static void main(String... args) {
        Vector vector = new Vector();
        vector.x = 5;
        vector.y = 6;
        vector.z = 7;
        vector.N = 4;
        int xx = 4;
        int yy = 6;
        int zz = 2;
        int[][] arrayRaudomVector = (int[][]) arrayN(vector.N);
        double vectorLenght = (int) vectorLenght(vector.x, vector.y, vector.z);
        int[] arrayProd = productVector(vector.x, vector.y, vector.z, xx, yy, zz);
        double cosVector = (int) cosVector(vector.x, vector.y, vector.z, xx, yy, zz, vectorLenght);
        int[] array = sumVector(vector.x, vector.y, vector.z, xx, yy, zz);
        int[] arrayDif = differenceVector(vector.x, vector.y, vector.z, xx, yy, zz);
        System.out.println(vector);
        System.out.println("Product of Vector - " + Arrays.toString(arrayProd));
        System.out.println("vectorLenght - " + vectorLenght);
        System.out.println("cos ϕ " + cosVector);
        System.out.println("Arrays Raudom - " + Arrays.deepToString(arrayRaudomVector));
        System.out.println("Sum Vector - " + Arrays.toString(array));
        System.out.println("Difference Vector - " + Arrays.toString(arrayDif));
    }

    public static double vectorLenght(int x, int y, int z) {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public static int[] productVector(int x, int y, int z, int xx, int yy, int zz) {
        int ax = y * zz - z * yy;
        int ay = z * xx - x * zz;
        int az = x * yy - y * xx;
        int[] arrayProd = {ax, ay, az};
        return arrayProd;
    }

    public static double cosVector(int x, int y, int z, int xx, int yy, int zz, double vectorLenght) {
        return (x * xx + y * yy + z * zz) / (vectorLenght * (Math.sqrt(xx * xx + yy * yy + zz * zz)));
    }

    public static int[] differenceVector(int x, int y, int z, int xx, int yy, int zz) {
        int dx = x - xx;
        int dy = y - yy;
        int dz = z - zz;
        int[] arrayDif = {dx, dy, dz};
        return arrayDif;
    }

    public static int[] sumVector(int x, int y, int z, int xx, int yy, int zz) {
        int sx = x + xx;
        int sy = y + yy;
        int sz = z + zz;
        int[] array = {sx, sy, sz};

        return array;
    }

    public static int[][] arrayN(int n) {
        int[][] array = new int[n][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ThreadLocalRandom.current().nextInt(0, 10);
            }

        }
        return array;
    }
}
