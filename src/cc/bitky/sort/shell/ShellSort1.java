package cc.bitky.sort.shell;

import cc.bitky.sort.KySort;

public class ShellSort1 implements KySort {
    public void kySort(int[] a, int size) {
        for (int step = size / 2; step > 0; step /= 2) {
            for (int i = step; i < size; i++) {
                int temp = a[i];
                int j = i;
                while (j >= step && a[j - step] > temp) {
                    a[j] = a[j - step];
                    j -= step;
                }
                a[j] = temp;
            }
        }
    }
}
