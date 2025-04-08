package lab2;

import java.util.Scanner;
import java.util.Random;

public class MatrixApp {
    static final int MAX_SIZE = 20;
    static final int RANDOM_MIN = 1;
    static final int RANDOM_MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість рядків (не більше 20): ");
        int rows = scanner.nextInt();

        System.out.print("Введіть кількість стовпців (не більше 20): ");
        int cols = scanner.nextInt();

        if (rows > MAX_SIZE || cols > MAX_SIZE) {
            System.out.println("Розмір перевищує допустимий ліміт.");
            return;
        }

        System.out.print("Оберіть режим (1 – вручну, 2 – рандом): ");
        int choice = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        if (choice == 1) {
            fillMatrixManual(matrix, scanner);
        } else {
            fillMatrixRandom(matrix);
        }

        printMatrix(matrix);
        System.out.println("Мінімальне значення: " + findMin(matrix));
        System.out.println("Максимальне значення: " + findMax(matrix));
        System.out.printf("Середнє арифметичне: %.2f\n", average(matrix));
        System.out.printf("Середнє геометричне: %.2f\n", geometricMean(matrix));
    }

    static void fillMatrixManual(int[][] matrix, Scanner scanner) {
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                matrix[i][j] = scanner.nextInt();
    }

    static void fillMatrixRandom(int[][] matrix) {
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                matrix[i][j] = rand.nextInt(RANDOM_MAX - RANDOM_MIN + 1) + RANDOM_MIN;
    }

    static void printMatrix(int[][] matrix) {
        System.out.println("Матриця:");
        for (int[] row : matrix) {
            for (int value : row) System.out.print(value + " ");
            System.out.println();
        }
    }

    static int findMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] row : matrix)
            for (int value : row)
                if (value < min) min = value;
        return min;
    }

    static int findMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix)
            for (int value : row)
                if (value > max) max = value;
        return max;
    }

    static double average(int[][] matrix) {
        double sum = 0;
        int count = 0;
        for (int[] row : matrix)
            for (int value : row) {
                sum += value;
                count++;
            }
        return sum / count;
    }

    static double geometricMean(int[][] matrix) {
        double product = 1;
        int count = 0;
        for (int[] row : matrix)
            for (int value : row) {
                product *= value;
                count++;
            }
        return Math.pow(product, 1.0 / count);
    }
}