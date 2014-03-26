package cn.edu.util.dataInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import edu.princeton.cs.introcs.In;

public class DataInput {
	private static final String directory = "algs4-data/";
	private static ZipInputStream zin =null;
	public DataInput(String path) {
		try {
			zin = new ZipInputStream(new FileInputStream(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public DataInput(File f){
		try {
			zin = new ZipInputStream(new FileInputStream(f));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public In getContentStream(String entryName){
		ZipEntry entry;
		String fileAbsPath = DataInput.directory + entryName;
		try {
				while(null != (entry=zin.getNextEntry())){
					if(!entry.isDirectory() && entry.getName().equals(fileAbsPath)){
						Scanner s = new Scanner(zin);
						return new In(s);
					}
					zin.closeEntry();
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public void close(){
		try {
			DataInput.zin.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
