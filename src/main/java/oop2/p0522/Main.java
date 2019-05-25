package oop2.p0522;


public class Main {
    public static void main(String[] args) {

        int size = 10;
        int generations = 100;

        char[][] currentGeneration = new char[size][size];

        char[][] nextGeneration = new char[size][size];

        char[][][] history = new char[generations][size][size];

        // Fill currentGeneration array with random population.
        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration[i].length; j++) {
                if (Math.random() < 0.22) {
                    currentGeneration[i][j] = 'x';
                } else {
                    currentGeneration[i][j] = '.';
                }
            }
        }

        for (int k = 0; k < generations; k++) {
            System.out.println("for k: " + k);
            for (int i = 0; i < currentGeneration.length; i++) {
                for (int j = 0; j < currentGeneration.length; j++) {
                    int neighbours = countNeighbours(i, j, currentGeneration);
                    nextGeneration[i][j] = currentGeneration[i][j];

                    if (currentGeneration[i][j] == 'x' && neighbours > 3 || neighbours < 2) {
                        nextGeneration[i][j] = '.';
                    }

                    if (currentGeneration[i][j] == 'x' && neighbours == 2 || neighbours == 3) {
                        nextGeneration[i][j] = currentGeneration[i][j];
                    }

                    if (currentGeneration[i][j] == '.' && neighbours == 3) {
                        nextGeneration[i][j] = 'x';
                    }
                    System.out.print(currentGeneration[i][j] + " ");
                }
                System.out.println();
            }

            if (isHistoryRepeating(history, currentGeneration)) {
                break;
            }

            if (compareGeneration(currentGeneration, nextGeneration)) {
                break;
            }

            history[k] = currentGeneration;

            currentGeneration = copy(nextGeneration);
            System.out.println("\n");
        }
    }

    private static boolean isHistoryRepeating(char[][][] history, char[][] currentGeneration) {
        for (int i = 0; i < history.length; i++) {
            if (compareGeneration(history[i], currentGeneration)) {
                System.out.println("Iteration: " + i);
                return true;
            }
        }
        return false;
    }

    // if returns true, generations are same.
    private static boolean compareGeneration(char[][] prevGen, char[][] currentGen) {

        for (int i = 0; i < prevGen.length; i++) {
            for (int j = 0; j < currentGen.length; j++) {
                if (prevGen[i][j] != currentGen[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    private static char[][] copy(char[][] arr) {
        char[][] temp = new char[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, temp[i], 0, arr[0].length);
        }
        return temp;
    }

    // Count neighbours of cell at x, y coordinates.
    private static int countNeighbours(int x, int y, char[][] arr) {
        int neighbours = 0;

        if (x > 0 && x < arr.length - 1 && y > 0 && y < arr.length - 1) {
            if (arr[x - 1][y + 1] == 'x') {
                neighbours++;
            }
            if (arr[x - 1][y] == 'x') {
                neighbours++;
            }
            if (arr[x - 1][y - 1] == 'x') {
                neighbours++;
            }
            if (arr[x][y - 1] == 'x') {
                neighbours++;
            }

            if (arr[x + 1][y - 1] == 'x') {
                neighbours++;
            }

            if (arr[x + 1][y] == 'x') {
                neighbours++;
            }
            if (arr[x][y + 1] == 'x') {
                neighbours++;
            }
            if (arr[x + 1][y + 1] == 'x') {
                neighbours++;
            }
        }
        return neighbours;
    }
}
