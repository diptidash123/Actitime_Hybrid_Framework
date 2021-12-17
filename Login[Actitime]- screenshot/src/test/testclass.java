package test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.BaseTest;
import pom.ActitimeLogin;

@Listeners(generics.utlity.class)
public class testclass extends BaseTest
{
 @Test
 public void login() throws IOException, InterruptedException
 {
	 ActitimeLogin act=new ActitimeLogin(driver);
	 act.loginMethod();
 }
}
