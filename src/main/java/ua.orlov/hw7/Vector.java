package ua.orlov.hw7;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

class Vector {
    static int N = 4;
    int x;
    int y;
    int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
        Vector vector = new Vector(5, 6, 7);
        Vector vector1 = new Vector(4, 6, 2);
        int[][] arrayRaudomVector = generateRandomVectors(N);
        Vector vectorL = new Vector(5, 6, 7);
        double vectorLenght = vectorL.vectorLenght();
        Vector vectorCos = new Vector(4, 6, 2);
        double cosVector = vectorCos.cosVector(vector);
        System.out.println("Product of Vector - " + vector.productVector(vector1));
        System.out.println("vectorLenght - " + vectorLenght);
        System.out.println("cos ϕ " + cosVector);
        System.out.println("Arrays Raudom - " + Arrays.deepToString(arrayRaudomVector));
        System.out.println("Sum Vector - " + vector.sumVector(vector1));
        System.out.println("Difference Vector - " + vector.differenceVector(vector1));
    }

    public double vectorLenght() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector productVector(Vector vector) {
        int ax = this.y * vector.z - this.z * vector.y;
        int ay = this.z * vector.x - this.x * vector.z;
        int az = this.x * vector.y - this.y * vector.x;

        return new Vector(ax, ay, az);
    }

    public double cosVector(Vector vector) {
        return (this.x * vector.x + this.y * vector.y + this.z * vector.z) / (vectorLenght() *
                (Math.sqrt(vector.x * vector.x + vector.y * vector.y + vector.z * vector.z)));
    }

    public Vector differenceVector(Vector vector) {
        int dx = this.x - vector.x;
        int dy = this.y - vector.y;
        int dz = this.z - vector.z;
        return new Vector(dx, dy, dz);
    }

    public Vector sumVector(Vector vector) {
        int sx = this.x + vector.x;
        int sy = this.y + vector.y;
        int sz = this.z + vector.z;
        return new Vector(sx, sy, sz);
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

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
