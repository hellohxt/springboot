package com.fpx.xms.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件控制
 */
public class FileController {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			// 创建字节输入流
			fis = new FileInputStream("F:\\test\\测试.txt");
			// 创建字节输出流
			fos = new FileOutputStream("F:\\test\\newTest.txt");
			// 创建一个长度为1024的竹筒
			byte[] b = new byte[1024];
			// 使用循环来重复取水的过程
			while ((fis.read(b)) > 0) {
				fos.write(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fis.close();
			fos.close();
		}

	}

}
