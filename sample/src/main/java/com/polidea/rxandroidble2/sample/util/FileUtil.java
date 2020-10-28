package com.polidea.rxandroidble2.sample.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Author: rain
 * Date: 2020/10/28 10:41 AM
 * Description:
 */
public class FileUtil {
    public static boolean writeBytesToFile(File file, byte[] bytes) {
        try {
            OutputStream out = new FileOutputStream(file);
            InputStream is = new ByteArrayInputStream(bytes);
            byte[] buff = new byte[1024];
            int len = 0;
            while ((len = is.read(buff)) != -1) {
                out.write(buff, 0, len);
            }
            is.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
