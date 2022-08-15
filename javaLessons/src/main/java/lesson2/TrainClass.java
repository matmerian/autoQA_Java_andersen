package lesson2;

public class TrainClass {
    public static void main(String[] args) {
        drawFigure1();
        System.out.println();
        drawFigure2();
        System.out.println();
        drawFigure3();
        System.out.println();
        drawFigure4();
        System.out.println();
        drawFigure5();
    }

    public static void drawFigure1() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i > 0 && i < 5) {
                    if (j == 0 || j == 5) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void drawFigure2() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i > 0 && i < 5) {
                    if (j == 0 || j == 5 || j == i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void drawFigure3() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j <= i) {
                    if (j == 0 || j == i || i == 5) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void drawFigure4() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i > 1 && i < 4) {
                    if (j > 1 && j < 4) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void drawFigure5() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j > 3 && i < 2 || i > 3 && j < 2) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}



