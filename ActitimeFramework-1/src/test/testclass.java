package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.Basetest;
import pom.createtypeofwork;
import pom.pomclass;

public class testclass extends Basetest
{
 @Test
 public void login() throws IOException
 {
	 pomclass pm=new pomclass(driver);
	 pm.logindetails();
	 
 }
	 
 }

