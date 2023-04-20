package ua.orlov.hw7;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

class Vector {
    static int N;
    int x;
    int y;
    int z;
    int xx;
    int yy;
    int zz;

    public Vector(int x, int y, int z, int xx, int yy, int zz) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.xx = xx;
        this.yy = yy;
        this.zz = zz;
    }

    public static void main(String[] args) {
        Vector vector = new Vector(5, 6, 7, 4, 6, 2);
        vector.N = 4;
        int[][] arrayRaudomVector = generateRandomVectors(vector.N);
        Vector vectorL = new Vector(5, 6, 7, 4, 6, 2);
        double vectorLenght = vectorL.vectorLenght();
        Vector vectorProd = new Vector(5, 6, 7, 4, 6, 2);
        int[] arrayProd = vectorProd.productVector();
        Vector vectorCos = new Vector(5, 6, 7, 4, 6, 2);
        double cosVector = vectorCos.cosVector();
        Vector vectorArray = new Vector(5, 6, 7, 4, 6, 2);
        int[] array = vectorArray.sumVector();
        Vector vectorArraydif = new Vector(5, 6, 7, 4, 6, 2);
        int[] arrayDif = vectorArraydif.differenceVector();
        System.out.println("Product of Vector - " + Arrays.toString(arrayProd));
        System.out.println("vectorLenght - " + vectorLenght);
        System.out.println("cos ϕ " + cosVector);
        System.out.println("Arrays Raudom - " + Arrays.deepToString(arrayRaudomVector));
        System.out.println("Sum Vector - " + Arrays.toString(array));
        System.out.println("Difference Vector - " + Arrays.toString(arrayDif));
    }

    public double vectorLenght() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public int[] productVector() {
        int ax = y * zz - z * yy;
        int ay = z * xx - x * zz;
        int az = x * yy - y * xx;
        int[] arrayProd = {ax, ay, az};
        return arrayProd;
    }

    public double cosVector() {
        return (x * xx + y * yy + z * zz) / (vectorLenght() * (Math.sqrt(xx * xx + yy * yy + zz * zz)));
    }

    public int[] differenceVector() {
        int dx = x - xx;
        int dy = y - yy;
        int dz = z - zz;
        int[] array = {dx, dy, dz};
        return array;
    }

    public int[] sumVector() {
        int sx = x + xx;
        int sy = y + yy;
        int sz = z + zz;
        int[] array = {sx, sy, sz};

        return array;
    }

    public static int[][] generateRandomVectors(int n) {
        int[][] array = new int[n][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ThreadLocalRandom.current().nextInt(0, 10);
            }

        }
        return array;
    }
}
