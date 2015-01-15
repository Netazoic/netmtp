package com.netazoic.netampg;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import javax.swing.filechooser.FileSystemView;

import android.text.style.SuperscriptSpan;


public class EncodeS4S extends ProjectEncoder{
	public static String MY_phoneDir = "storage/sdcard1/Music/JTM/Meet The Moores";
	public static String MY_propFileName = "conf/s4s_sync.properties";



	public static void setParams(){
		phoneDir = MY_phoneDir;
		propFileName = MY_propFileName;
	}
	
	public static void main(String[]args) throws Throwable{
		setParams();
		props = getProperties();
		setProjectPaths();
		encodeFiles();
		updateMTPFiles();	
		setProperties();
		System.exit(0);
	}





























}
