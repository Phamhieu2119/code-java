package main;

import java.io.File;
import java.io.IOException;

import javax.security.auth.callback.ConfirmationCallback;

public class ViDuTaoTapTinVAThuMuc {
	public static void main(String[] args) {
		File folder1 = new File("D:\\java\\java_67");
		System.out.println("Kiem tra folder co ton tai hay khong :"+folder1.exists());
		//tao thu muc
		// phuong thuc mkdir() => tao 1 thu muc
		File d1 = new File("D:\\java\\java_67\\Directory_1");
		d1.mkdir();
		// phuong thuc mkdics() => tao nhieu thu muc cung luc
		File d2 = new File("D:\\java\\java_67\\Directory_1\\Directory_2\\Directory_3");
		d2.mkdirs();
		// tao tap tin ( co pha mo rong .exe .doc
		File file1 = new File("D:\\java\\java_67\\Directory_1\\Vidu1.txt");
		try {
			file1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
