package org.magnitia.abdulkalam;

import java.util.Scanner;

import org.openqa.selenium.remote.RemoteWebDriver;

import Pages.GmailCompose;
import Pages.GmailHome;
import Pages.GmailLogin;
import Pages.GmailLogout;

public class Test22 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name:");
		String bn=sc.nextLine();
		System.out.println("Enter UserId:");
		String uId=sc.nextLine();
		System.out.println("Enter Password:");
		String pwd=sc.nextLine();
		System.out.println("Enter to address:");
		String addn=sc.nextLine();
		System.out.println("Enter Subject:");
		String sub=sc.nextLine();
		System.out.println("Enter body:");
		String bdy=sc.nextLine();
		System.out.println("Enter file path to attach:");
		String fp=sc.nextLine();
		sc.close();
		WebSiteUtilities Uobj=new WebSiteUtilities();
		
		RemoteWebDriver driver=Uobj.openBrowser(bn);
		
		Uobj.launchSite(driver, "https://www.gmail.com", 5000);
		GmailHome gh=new GmailHome(driver);
		GmailLogin gl=new GmailLogin(driver);
		GmailCompose gc=new GmailCompose(driver);
		GmailLogout glog=new GmailLogout(driver);
		gh.fillUid(uId);
		gh.clickNext();
		Thread.sleep(5000);
		gl.fillPwd(pwd);
		gl.clickNext();
		Thread.sleep(5000);
		gc.clickCompose();
		Thread.sleep(5000);
		gc.fillTo(addn);
		gc.fillSubject(sub);
		gc.fillBody("Hi\n"+bdy+"\n bye");
		gc.fillAttachment(fp);
		Thread.sleep(5000);
		gc.clickSend();
		Thread.sleep(5000);
		glog.clickProfilePic();
		Thread.sleep(5000);
		glog.clickSignOut();
		Thread.sleep(5000);
		Uobj.closeSite(driver);
	}

}
