package FANGEN;

import java.util.List;

public class Fan {
    private char fanStar = '*';
    private char fanDot = '.';
    private boolean direction;

    public Fan() {

    }

    public char getFanStar() {
        return fanStar;
    }

    public char getFanDot() {
        return fanDot;
    }

    public void fanCreate(List<Integer> cases) {
        for (int o : cases) {
            if (o < 0) {
                direction = true;
                leftSideFanCreate(Math.abs(o));
            } else {
                rightSideFanCreate(o);
            }
        }
    }

    private void rightSideFanCreate(int size) {
        char[][] fanDrawing = new char[size * 2][size * 2];
        if (!direction) {
            for (int i = 0; i < fanDrawing.length; i++) {
                for (int j = 0; j < fanDrawing.length; j++) {
                    if (i < fanDrawing.length / 2) {
                        if (j < fanDrawing.length / 2) {
                            if (i < j) {
                                fanDrawing[i][j] = fanDot;
                            } else {
                                fanDrawing[i][j] = fanStar;
                            }
                            System.out.print(fanDrawing[i][j]);
                        } else {
                            if (j < fanDrawing.length - i) {
                                fanDrawing[i][j] = fanStar;
                            } else {
                                fanDrawing[i][j] = fanDot;
                            }
                            System.out.print(fanDrawing[i][j]);
                        }
                    } else {
                        if (j < fanDrawing.length / 2) {
                            if (j >= fanDrawing.length - i - 1) {
                                fanDrawing[i][j] = fanStar;
                            } else {
                                fanDrawing[i][j] = fanDot;
                            }
                            System.out.print(fanDrawing[i][j]);
                        } else {
                            if (j >= i) {
                                fanDrawing[i][j] = fanStar;
                            } else {
                                fanDrawing[i][j] = fanDot;
                            }
                            System.out.print(fanDrawing[i][j]);
                        }

                    }
                }
                System.out.println();
            }
        } else {
            System.out.println();
        }
    }

    private void leftSideFanCreate(int size) {
        char[][] fanDrawing = new char[size * 2][size * 2];
        for (int i = 0; i < fanDrawing.length; i++) {
            for (int j = 0; j < fanDrawing.length; j++) {
                if (i < fanDrawing.length / 2) {
                    if (j < fanDrawing.length / 2) {
                        if (j >= i) {
                            fanDrawing[i][j] = fanStar;
                        } else {
                            fanDrawing[i][j] = fanDot;
                        }
                        System.out.print(fanDrawing[i][j]);
                    } else {
                        if (j >= fanDrawing.length - i - 1) {
                            fanDrawing[i][j] = fanStar;
                        } else {
                            fanDrawing[i][j] = fanDot;
                        }
                        System.out.print(fanDrawing[i][j]);
                    }
                } else {
                    if (j < fanDrawing.length / 2) {
                        if (fanDrawing.length - i > j) {
                            fanDrawing[i][j] = fanStar;
                        } else {
                            fanDrawing[i][j] = fanDot;
                        }
                        System.out.print(fanDrawing[i][j]);
                    } else {
                        if (i >= j) {
                            fanDrawing[i][j] = fanStar;
                        } else {
                            fanDrawing[i][j] = fanDot;
                        }
                        System.out.print(fanDrawing[i][j]);
                    }
                }
            }
            System.out.println();
        }
    }
}

