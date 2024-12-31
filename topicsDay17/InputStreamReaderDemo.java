package chapter9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;

public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {
		InputStream inputstream = new FileInputStream("abc.txt");
        String output = "output.txt";
		Reader r = new InputStreamReader(inputstream);

		OutputStream o = new FileOutputStream(output);
	
		int byteRead;
		byte[] buffer = new byte[1024];
       
		while((byteRead = inputstream.read(buffer))!= -1 ) {
		
			o.write(buffer,0,byteRead);
			
		}
		
		System.out.println("done");
}}
