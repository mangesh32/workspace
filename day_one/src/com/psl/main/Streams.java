package com.psl.main;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.lang.ProcessBuilder.Redirect;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Streams {

	public static void main(String[] args) throws IOException, InterruptedException, ParseException {
		// TODO Auto-generated method stub
		Runtime r=Runtime.getRuntime();
		Process p=new ProcessBuilder().command("cmd").inheritIO().start();
		
		InputStreamReader esr=new InputStreamReader(p.getInputStream());
		OutputStreamWriter ost= new OutputStreamWriter(p.getOutputStream());
		PrintStream mout=new PrintStream(p.getOutputStream());
		
		
		mout.print("echo mangesh you did it."+(char)13);
		mout.close();
		
		wait(1000);
		while(esr.ready())
			System.out.print((char)esr.read());
		
		
		
		
	}

}
