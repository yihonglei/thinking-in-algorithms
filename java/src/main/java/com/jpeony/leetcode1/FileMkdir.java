package com.jpeony.leetcode1;

import java.io.File;
import java.io.IOException;

/**
 * @author yihonglei
 */
public class FileMkdir {
    public static void main(String[] args) throws IOException {
        for (int i = 2; i < 10; i++) {
            String fileStr = "/Users/hongqi/Documents/jpeony/thinking-in-algorithms/java/src/main/java/com/jpeony/leetcode/" + "n000" + i + "/tmp.txt";
            File file = new File(fileStr);
            if (!file.exists()) {
                file.createNewFile();
            }
        }
    }
}
