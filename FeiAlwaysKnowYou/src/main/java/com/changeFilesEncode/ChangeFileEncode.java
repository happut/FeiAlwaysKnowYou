/*
 * @(#)ChangeFileEncode.java 2013-4-8 下午05:40:38 FeiAlwaysKnowYou Copyright 2013
 * Thuisoft, Inc. All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use
 * is subject to license terms.
 */
package com.changeFilesEncode;

import java.io.File;

/**
 * ChangeFileEncode
 * @author wfei
 * @version 1.0
 *
 */
public class ChangeFileEncode {
    String filename;

    String sourceCode;

    String targetCode;

    public ChangeFileEncode(String filename, String sourceCode,
            String targetCode) {
        this.filename = filename;
        this.sourceCode = sourceCode;
        this.targetCode = targetCode;
    }

    public static void changeEncodeDir(File folder) {
        for (File f : folder.listFiles()) {
            if (f.isDirectory()) {
                changeEncodeDir(f);
            }
            changeEncodeFile(f);
        }
    }

    public void changeEncodeDir() throws Exception {
        File f = new File(filename);
        if (f.isDirectory()) {
            changeEncodeDir(new File(filename));
        }else{
            throw new Exception("输入文件信息有误");
        }
    }

    public static void changeEncodeFile(File f) {

    }
}
