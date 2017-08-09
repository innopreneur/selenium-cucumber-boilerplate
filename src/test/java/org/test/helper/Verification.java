package org.test.helper;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class Verification {

	private StringBuffer verificationErrors;
	private StringBuffer messages;
	private StringBuffer exceptionMessages;
	private static int counter = 1;

	Logger log = LoggerFactory.getLogger(Verification.class);
	
	public Verification() {

		verificationErrors = new StringBuffer();
		messages = new StringBuffer();
		exceptionMessages=new StringBuffer();
	}

	public void verifyTrue(Boolean b ,String msg1) {
		try {
			Assert.assertTrue(b.booleanValue());
		} catch (Error e) {
			
			String msg=extractMsg("");
			verificationErrors.append("(" + counter + ")" + e);
			messages.append("(" + counter + ")" + msg);
			log.error("(" + counter + ")" + msg);
			counter++;
		}
	}

	

	public void verifyFalse(String msg1, Boolean b) {
		try {
			Assert.assertFalse(b.booleanValue());
		} catch (Error e) {
			String msg=extractMsg(msg1);
			verificationErrors.append("(" + counter + ")" + e);
			messages.append("(" + counter + ")" + msg);
			log.error("(" + counter + ")" + msg);
			counter++;
		}
	}

	public void verifyTrue(String elementDefinition, String elementLocator,
			Boolean b, String pageURL) {
		try {
			Assert.assertTrue(b.booleanValue());
		} catch (Error e) {
			verificationErrors.append("(" + counter + ")" + e);
			messages.append("Verification failed for element: "
					+ elementDefinition + ",Element locator: " + elementLocator
					+ "On page: " + pageURL);
			log.error("Verification failed for element: "
					+ elementDefinition + ",Element locator: " + elementLocator
					+ "On page: " + pageURL);
		}
	}

	public void verifyTrue(String elementDefinition, String elementLocator,
			boolean isElementPresent, int actualElementCount,
			int expectedElementCount, String pageURL) {

		try {
			Assert.assertTrue(isElementPresent);
		} catch (Error e) {
			verificationErrors.append("(" + counter + ")" + e);
			messages.append("Verification failed for element: "
					+ elementDefinition + ", Element locator: "
					+ elementLocator + "On page: " + pageURL);
			log.error("Verification failed for element: "
					+ elementDefinition + ", Element locator: "
					+ elementLocator + "On page: " + pageURL);
		}

		try {
			Assert.assertTrue(actualElementCount == expectedElementCount);
		} catch (Error e) {
			verificationErrors.append("(" + counter + ")" + e);
			messages.append("Verification count failed for element: "
					+ elementDefinition + ",Element locator: " + elementLocator
					+ ", Expected Element Count: " + expectedElementCount
					+ ", while Actual Element Count: " + actualElementCount
					+ " On page: " + pageURL);
			log.error("Verification count failed for element: "
					+ elementDefinition + ",Element locator: " + elementLocator
					+ ", Expected Element Count: " + expectedElementCount
					+ ", while Actual Element Count: " + actualElementCount
					+ " On page: " + pageURL);
		}
	}

	public void verifyEquals(String msg1, String s1, String s2) {
		try {
			Assert.assertEquals(s1, s2);
		} catch (Error e) {
			String msg=extractMsg(msg1);
			verificationErrors.append("(" + counter + ")" + e);
			messages.append("(" + counter + ")" + msg);
			log.error("(" + counter + ")" + msg);
			counter++;
		}
	}

	public void verifyEquals(String msg1, Object obj1, Object obj2) {
		try {
			Assert.assertEquals(obj1, obj2);
		} catch (Error e) {
			String msg=extractMsg(msg1);
			verificationErrors.append("(" + counter + ")" + e);
			//System.out.println("eroor :-"+ verificationErrors.toString());
			log.error("(" + counter + ")" + msg);
			messages.append("(" + counter + ")" + msg);
			counter++;
		}
	}

	public void verifyNotEquals(String msg, Object obj1, Object obj2) {
		try {
			Assert.assertNotEquals(obj1, obj2);
		} catch (Error e) {
			verificationErrors.append("(" + counter + ")" + e);
			log.error("(" + counter + ")" + msg);
			messages.append("(" + counter + ")" + msg);
			counter++;
		}
	}

	public void verifyEquals(String msg1, String str1[], String str2[]) {
		try {
			Assert.assertEquals(str1, str2);
		} catch (Error e) {
			String msg=extractMsg(msg1);
			verificationErrors.append("(" + counter + ")" + e);
			log.error("(" + counter + ")" + msg);
			messages.append("(" + counter + ")" + msg);
			counter++;
		}
	}

	public void verifyEquals(Object str1[], Object str2[], String msg) {
		try {
			Assert.assertEquals(((Object) (str1)), ((Object) (str2)));
		} catch (Error e) {
			verificationErrors.append("(" + counter + ")" + e);
			log.error("(" + counter + ")" + msg);
			messages.append("(" + counter + ")" + msg);
			counter++;
		}
	}
	
	//************************************************************************************************************
	
	public void verifyTrue(Boolean b) {
		try {
			Assert.assertTrue(b.booleanValue());
		} catch (Error e) {
			
			String msg=extractMsg("");
			verificationErrors.append("(" + counter + ")" + e);
			messages.append("(" + counter + ")" + msg);
			log.error("(" + counter + ")" + msg);
			counter++;
		}
	}

	

	public void verifyFalse( Boolean b) {
		try {
			Assert.assertFalse(b.booleanValue());
		} catch (Error e) {
			String msg=extractMsg("");
			verificationErrors.append("(" + counter + ")" + e);
			messages.append("(" + counter + ")" + msg);
			log.error("(" + counter + ")" + msg);
			counter++;
		}
	}

	

	
	public void verifyEquals(String s1, String s2) {
		try {
			Assert.assertEquals(s1, s2);
		} catch (Error e) {
			String msg=extractMsg("");
			verificationErrors.append("(" + counter + ")" + e);
			messages.append("(" + counter + ")" + msg);
			log.error("(" + counter + ")" + msg);
			counter++;
		}
	}

	public void verifyEquals( Object obj1, Object obj2) {
		try {
			Assert.assertEquals(obj1, obj2);
		} catch (Error e) {
			String msg=extractMsg("");
			verificationErrors.append("(" + counter + ")" + e);
			//System.out.println("eroor :-"+ verificationErrors.toString());
			log.error("(" + counter + ")" + msg);
			messages.append("(" + counter + ")" + msg);
			counter++;
		}
	}

	public void verifyNotEquals(Object obj1, Object obj2) {
		try {
			Assert.assertNotEquals(obj1, obj2);
		} catch (Error e) {
			String msg=extractMsg("");
			verificationErrors.append("(" + counter + ")" + e);
			log.error("(" + counter + ")" + msg);
			messages.append("(" + counter + ")" + msg);
			counter++;
		}
	}

	public void verifyEquals( String str1[], String str2[]) {
		try {
			Assert.assertEquals(str1, str2);
		} catch (Error e) {
			String msg=extractMsg("");
			verificationErrors.append("(" + counter + ")" + e);
			log.error("(" + counter + ")" + msg);
			messages.append("(" + counter + ")" + msg);
			counter++;
		}
	}

	public void verifyEquals(Object str1[], Object str2[]) {
		try {
			Assert.assertEquals(((Object) (str1)), ((Object) (str2)));
		} catch (Error e) {
			String msg=extractMsg("");
			verificationErrors.append("(" + counter + ")" + e);
			log.error("(" + counter + ")" + msg);
			messages.append("(" + counter + ")" + msg);
			counter++;
		}
	}
	
	
	//************************************************************************************************************

	public void clearVerificationErrors() {
		verificationErrors = new StringBuffer();
		

	}
	
	public void clearExceptionErrors() {
		exceptionMessages = new StringBuffer();
	}

	public void clearMessages() {
		messages = new StringBuffer();
		

	}

	public static void fail(String message) {
		throw new AssertionError(message);
	}

	public void checkForVerificationErrors() {

		// Clear Verification Errors so that it is ready to test new
		// verifications
		String verificationErrorString = verificationErrors.toString();
		String exceptionmsg=exceptionMessages.toString();
		System.out.println(exceptionmsg+"errors :-"+ verificationErrors.toString() );
		
		clearVerificationErrors();
		clearMessages();
		
		
		if (!("".equals(verificationErrorString) && "".equals(exceptionmsg)) )
			fail(verificationErrorString + exceptionmsg);
	}
	
	public void appendMessage(String text) {
		messages.append(text);
	}
	public void appendVerification(String text) {
		verificationErrors.append(text);
	}
	public void appendException(String text) {
		exceptionMessages.append(text);
	}
	
	public String getMessage() {
		return messages.toString();
	}
	
	
	public String getExceptionMessages() {
		return exceptionMessages.toString();
	}
	
	public String getVerificationErrors() {
		return verificationErrors.toString();
	}
	
	
	
	public void insertResultsInSheet(String className) {
			
	
			String verificationErrorString = verificationErrors.toString();
		
			String messageString = messages.toString();
			String exceptionString=exceptionMessages.toString();

		String result = null;
		
	
		String pageName="",testcaseNo="";
				
		String[] temp=className.split("_");
		
		testcaseNo = className.replaceAll("[^0-9]", "");
		if(testcaseNo.length()>3)
		{
			String temp1[]=className.split("\\.");
			String temp2[]=temp1[temp1.length-1].split("_");
			testcaseNo=temp2[0].replaceAll("[^0-9]", "");
		}
	
		if(temp.length>1)
		{
			
			String[] temp1=temp[0].split("\\.");		
			int lengthT2=temp1.length;
					
			if(lengthT2>2)
			{
				//testcaseNo=temp1[lengthT2-1].replace("TC", "");
				pageName=temp1[lengthT2-3]+" "+temp1[lengthT2-2];
			}
		}
		
		if ("".equals(verificationErrorString) && "".equals(exceptionString)) {

			result = "PASS";
		} else {
			
			result = "FAIL";
		}

		this.checkForVerificationErrors();

	}

	public void insertExceptionInSheet(String className, Exception e) {
	
		//exceptionMessages=exception.getFormattedErrorMessage(e, exceptionMessages);
		this.insertResultsInSheet(className);
		clearExceptionErrors();
	}

private String extractMsg(String msg) {
		
		msg=Thread.currentThread().getStackTrace()[3].getClassName();
		String temp2=msg;
		String temp[]=msg.split("_");
		String temp1[]=temp[0].split("\\.");
		msg="";
		if(temp1.length>2)
		{
			if(!temp1[3].equalsIgnoreCase("testcases"))
			{
				msg= temp1[3]+" " ;
				if(temp1[4].equalsIgnoreCase("pretrade") ||temp1[4].equalsIgnoreCase("posttrade"))
				msg=msg+temp1[4]+" ";
			}
			msg= msg + temp1[temp1.length-3]+" "+temp1[temp1.length-2]+" "+temp1[temp1.length-1];
		}
		if(temp.length>3)
		{
			msg=msg+" "+temp[1]+" "+temp[2]+" "+temp[3];
			String childMethod = msg + "::"
					+ Thread.currentThread().getStackTrace()[3].getMethodName()
					+ ":"
					+ Thread.currentThread().getStackTrace()[3].getLineNumber();

			String parentMethod = "::"
					+ Thread.currentThread().getStackTrace()[2].getMethodName()
					+ ":"
					+ Thread.currentThread().getStackTrace()[2].getLineNumber();
			msg= childMethod+" "+parentMethod;
			System.err.println(":::::::::::::::::::::::::::::::::");		
			System.err.println("MSG ::"+msg);
			System.err.println("+++++++++++++++++++++ERROR AT+++++++++++++++++++++");
			System.err.println("(" + temp2 + ".java:" + Thread.currentThread().getStackTrace()[3].getLineNumber() + ")");
			System.err.println(":::::::::::::::::::::::::::::::::");
			System.out.println("");
		
		}
		else
		{
			
			String childMethod = msg + "::"
					+ Thread.currentThread().getStackTrace()[4].getMethodName()
					+ ":"
					+ Thread.currentThread().getStackTrace()[4].getLineNumber();

			String parentMethod = "::"
					+ Thread.currentThread().getStackTrace()[3].getMethodName()
					+ ":"
					+ Thread.currentThread().getStackTrace()[3].getLineNumber();
			msg= childMethod+" "+parentMethod;
			temp2=Thread.currentThread().getStackTrace()[4].getClassName();
			
			System.err.println(":::::::::::::::::::::::::::::::::");		
			System.err.println("MSG ::"+msg);
			System.err.println("+++++++++++++++++++++ERROR AT+++++++++++++++++++++");
			System.err.println("(" + temp2 + ".java:" + Thread.currentThread().getStackTrace()[4].getLineNumber() + ")");
			System.err.println(":::::::::::::::::::::::::::::::::");
		}
		
		return msg;
	}
	
	
}