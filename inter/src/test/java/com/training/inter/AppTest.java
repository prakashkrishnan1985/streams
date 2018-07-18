package com.training.inter;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public static void main(String[] args) throws IOException {
	       Path path = Paths.get(URI.create("file:///Users/apttususer/Desktop/gradle.txt"));
	       List<String> alist = Files.lines(path)
	                  .filter(line -> line.contains("https://gradle.com/"))
	                  .collect(Collectors.toList());
	       System.out.println(alist.get(0).substring(alist.get(0).indexOf("https://")));
	}
	}
	 
	
	
    

