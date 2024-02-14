package com.jpeony.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * 规划求解
 *
 * @author yihonglei
 */
public class ProgrammingSolution {
    private static int[] flag;

    public static void main(String[] args) {
        double[] inputs = new double[]{251.86, 639.76, 505.96, 326.70, 548.60, 563.60, 628.92, 879.95, 1018.00, 355.84, 301.60, 444.96, 435.32, 534.16, 387.60, 719.52, 202.64, 672.68, 541.68, 416.36, 706.72, 673.52, 106.04, 419.52, 405.84, 620.36, 765.40, 1184.64, 576.04, 286.96, 269.00, 333.92, 141.07, 446.69, 236.54, 969.92, 887.84, 470.65, 460.20, 653.12, 987.64, 452.60, 604.68, 609.64, 745.24, 784.92, 369.04, 778.54, 648.16, 214.20, 386.04, 643.64, 600.72, 256.46, 559.76, 627.88, 487.08, 435.68, 1221.04, 267.76, 420.72};
        flag = new int[inputs.length];
        double sum = 1663.42;
        List<List<Double>> result = new ArrayList<>();
        calculateSum(inputs, sum, inputs.length - 1, result);
        System.out.println(result);
    }

    private static void calculateSum(double[] inputs, double sum, int inputsLength, List<List<Double>> result) {
        int index;
        if (sum == 0) {
            List<Double> r = new ArrayList<>();
            for (index = 0; index < flag.length; index++) {
                if (flag[index] > 0) {
                    r.add(inputs[index]);
                }
            }
            result.add(r);
        }

        for (index = inputsLength; index >= 0; index--) {
            if (flag[index] == 0 && (sum - inputs[index]) >= 0) {
                flag[index] = 1;
                calculateSum(inputs, sum - inputs[index], index - 1, result);
                flag[index] = 0;
            }
        }
    }
}
