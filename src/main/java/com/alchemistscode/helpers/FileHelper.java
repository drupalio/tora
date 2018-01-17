package com.alchemistscode.helpers;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Service;

@Service
public class FileHelper {


	public byte[] loadResource(String path) {
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream is = classloader.getResourceAsStream(path);
		try {
			 byte[] buffer = new byte[is.available()];
			 is.read(buffer);
			 return buffer;
		} catch (IOException e) {
		}
		finally {
			try {
				is.close();
			} catch (IOException e) {
			}
		}
		throw new IllegalArgumentException("El archivo seleccionado no es valido");
	}

	public File loadFile(String path) {
		File file = new File(path);
		if (file.exists() && !file.isDirectory()) {
			return file;
		}
		throw new IllegalArgumentException("El archivo seleccionado no es valido");
	}

	public boolean fileExist(File file) {
		return file.exists();
	}

}
