package org.test.exception;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;




public class CustomSeleniumException  {

	private String separator = "\n";
	private CustomSeleniumException previous = null;

	
	public boolean seleniumThrownException(Exception e,WebDriver driver)
			throws Exception {
		
	
		if ( !isStaleElementError(e,driver)
				&& !isElementNotSelectableError(e,driver)
				&& !isElementNotVisibleError(e,driver)
				&& !isErrorInResponseError(e,driver)
				&& !isIMEActivationFailedError(e,driver)
				&& !isIMENotAvaliableError(e,driver)
				&& !isInvalidCookieDomainError(e,driver)
				&& !isInvalidElementStateError(e,driver)
				&& !isInvalidSelectorError(e,driver)
				&& !isInvalidSwitchToTargetError(e,driver)
				&& !isMoveTargetOutOfBoundError(e,driver)
				&& !isNoAlertPresentError(e,driver)
				&& !isNoSuchAttributeError(e,driver)
				&& !isNoSuchElementError(e,driver)
				&& !isNoSuchFrameError(e,driver)
				&& !isNoSuchWindowError(e,driver)
				&& !isRemoteDriverServerError(e,driver)
				&& !isTimeOutError(e,driver)
				&& !isUnableToSetCookieError(e,driver)
				&& !isUnexpectedAlertPresentError(e,driver)
				&& !isUnexpectedTagNameError(e,driver)
				&& !isUnreachableBrowserException(e,driver)
				&& !isWebDriverError(e,driver)) {
			return true;
		}
		else if(isApplicationError(e,driver)){
			
			return true;
		}
		else{
			
			StringBuffer errorMessage = new StringBuffer();
			errorMessage=this.getFormattedErrorMessage(e, errorMessage);
			throw new Exception(e.getMessage() + errorMessage);
		}
		
	}

	



	private boolean isApplicationError(Exception e,WebDriver driver)
			throws WebDriverException {
		boolean flag = false;
		if (e.toString().contains("Contact system administrator")) {
			
			
			flag = true;
			throw new WebDriverException(
					"There is some error in the application.");
		}
		return flag;
	}
	
	
	private boolean isUnreachableBrowserException(Exception e,WebDriver driver) throws UnreachableBrowserException {
	
			boolean flag = false;
			if (e.toString().contains("org.openqa.selenium.remote.UnreachableBrowserException")) {
				
				flag = true;
				throw new UnreachableBrowserException(
						"Browser closed abruptly. Please try again.");
			}
			return flag;
	}
	
	private boolean isWebDriverError(Exception e,WebDriver driver)
			throws WebDriverException {
		boolean flag = false;
		if (e.toString().contains("org.openqa.selenium.WebDriverException")) {
			
			flag = true;
			throw new WebDriverException(
					"The browser is unsupported. Best viewed in Firefox");
		}
		return flag;
	}

	private boolean isUnexpectedTagNameError(Exception e,WebDriver driver)
			throws UnexpectedTagNameException {
		boolean flag = false;
		if (e.toString().contains("org.openqa.selenium.UnexpectedTagNameException")) {
			flag = true;
			StringBuffer errorMessage = new StringBuffer();
			
			errorMessage=this.getFormattedErrorMessage(e, errorMessage);
	
			throw new UnexpectedTagNameException("" +errorMessage);
		}
		return flag;
	}

	private boolean isUnexpectedAlertPresentError(Exception e,WebDriver driver)
			throws UnexpectedAlertPresentException {
		boolean flag = false;
		if (e.toString().contains("org.openqa.selenium.UnexpectedAlertPresentException")) {
			
			flag = true;
			StringBuffer errorMessage = new StringBuffer();
			
			errorMessage=this.getFormattedErrorMessage(e, errorMessage);
	
			throw new UnexpectedAlertPresentException("" +errorMessage);
		}
		return flag;
	}

	private boolean isUnableToSetCookieError(Exception e,WebDriver driver)
			throws UnableToSetCookieException {
		boolean flag = false;
		if (e.toString().contains("org.openqa.selenium.UnableToSetCookieException")) {
			
			flag = true;
			throw new UnableToSetCookieException(
					"An error occurred because driver failed to set a cookie");
		}
		return flag;
	}

	private boolean isTimeOutError(Exception e,WebDriver driver) throws TimeOutException {
		boolean flag = false;
		if (e.toString().contains("org.openqa.selenium.TimeOutException")) {
			

			flag = true;
			StringBuffer errorMessage = new StringBuffer();
			
			errorMessage=this.getFormattedErrorMessage(e, errorMessage);
			throw new TimeOutException("" + errorMessage);
		}
		return flag;
	}

	private boolean isRemoteDriverServerError(Exception e,WebDriver driver)
			throws RemoteDriverServerException {

		boolean flag = false;
		if (e.toString().contains("org.openqa.selenium.RemoteDriverServerException")) {
			
			flag = true;
			throw new RemoteDriverServerException(
					"Error communicating with the remote browser");
		}
		return flag;
	}

	private boolean isNoSuchWindowError(Exception e,WebDriver driver)
			throws NoSuchWindowException {
		boolean flag = false;
		if (e.toString().contains("org.openqa.selenium.NoSuchWindowException")) {
			
			flag = true;
			StringBuffer errorMessage = new StringBuffer();
			
			errorMessage=this.getFormattedErrorMessage(e, errorMessage);
			throw new NoSuchWindowException("" + errorMessage);
		}
		return flag;
	}

	private boolean isNoSuchFrameError(Exception e,WebDriver driver)
			throws NoSuchFrameException {
		boolean flag = false;
		if (e.toString().contains("org.openqa.selenium.NoSuchFrameException")) {
			
			flag = true;
			StringBuffer errorMessage = new StringBuffer();
			
			errorMessage=this.getFormattedErrorMessage(e, errorMessage);
			throw new NoSuchFrameException("" + errorMessage);
				
		}
		return flag;
	}

	private boolean isInvalidElementStateError(Exception e,WebDriver driver)
			throws InvalidElementStateException {
		boolean flag = false;
		if (e.toString().contains("org.openqa.selenium.InvalidElementStateException")) {
			
			flag = true;
			StringBuffer errorMessage = new StringBuffer();
			
			errorMessage=this.getFormattedErrorMessage(e, errorMessage);
			throw new InvalidElementStateException("" + errorMessage);
		}
		return flag;
	}

	private boolean isElementNotSelectableError(Exception e,WebDriver driver)
			throws ElementNotSelectableException {
		boolean flag = false;
		if (e.toString().contains("org.openqa.selenium.ElementNotSelectableException")) {
			
			flag = true;
			StringBuffer errorMessage = new StringBuffer();
			
			errorMessage=this.getFormattedErrorMessage(e, errorMessage);
			throw new ElementNotSelectableException("" + errorMessage);
		}
		return flag;
	}

	private boolean isNoSuchElementError(Exception e,WebDriver driver)
			throws NoSuchElementException {
		boolean flag = false;
		if (e.toString().contains("org.openqa.selenium.NoSuchElementException")) {
			
			flag = true;
			StringBuffer errorMessage = new StringBuffer();
			
			errorMessage=this.getFormattedErrorMessage(e, errorMessage);
			
			throw new NoSuchElementException("" +errorMessage);
			}
			
		return flag;
	}

	private boolean isNoSuchAttributeError(Exception e,WebDriver driver)
			throws NoSuchAttributeException {
		boolean flag = false;
		if (e.toString().contains("org.openqa.selenium.NoSuchAttributeException")) {
			
			flag = true;
			StringBuffer errorMessage = new StringBuffer();
			
			errorMessage=this.getFormattedErrorMessage(e, errorMessage);
			throw new NoSuchAttributeException("" +errorMessage);
		}
		return flag;
	}

	private boolean isNoAlertPresentError(Exception e,WebDriver driver)
			throws NoAlertPresentException {
		boolean flag = false;
		if (e.toString().contains("org.openqa.selenium.NoAlertPresentException")) {
			
			flag = true;
			StringBuffer errorMessage = new StringBuffer();
			errorMessage=this.getFormattedErrorMessage(e, errorMessage);
			throw new NoAlertPresentException("" +errorMessage);
		}
		return flag;
	}

	private boolean isMoveTargetOutOfBoundError(Exception e,WebDriver driver)
			throws MoveTargetOutOfBoundException {
		boolean flag = false;
		if (e.toString().contains("org.openqa.selenium.MoveTargetOutOfBoundException")) {
			
			flag = true;
			StringBuffer errorMessage = new StringBuffer();
			errorMessage=this.getFormattedErrorMessage(e, errorMessage);
			throw new MoveTargetOutOfBoundException("" +errorMessage);
		}
		return flag;
	}

	private boolean isInvalidSwitchToTargetError(Exception e,WebDriver driver)
			throws InvalidSwitchToTargetException {
		boolean flag = false;
		if (e.toString().contains("org.openqa.selenium.InvalidSwitchToTargetException")) {
			
			flag = true;
			StringBuffer errorMessage = new StringBuffer();
			errorMessage=this.getFormattedErrorMessage(e, errorMessage);
			throw new InvalidSwitchToTargetException("" +errorMessage);
		}
		return flag;
	}

	private boolean isInvalidSelectorError(Exception e,WebDriver driver)
			throws InvalidSelectorException {
		boolean flag = false;
		if (e.toString().contains("org.openqa.selenium.InvalidSelectorException")) {
			
			flag = true;
			StringBuffer errorMessage = new StringBuffer();
			errorMessage=this.getFormattedErrorMessage(e, errorMessage);
			throw new InvalidSelectorException("" +errorMessage);
		}
		return flag;
	}

	private boolean isInvalidCookieDomainError(Exception e,WebDriver driver)
			throws InvalidCookieDomainException {
		boolean flag = false;
		if (e.toString().contains("org.openqa.selenium.InvalidCookieDomainException")) {
			
			flag = true;
			StringBuffer errorMessage = new StringBuffer();
			errorMessage=this.getFormattedErrorMessage(e, errorMessage);
			throw new InvalidCookieDomainException(
					"An error occurred because you are attempting to add a cookie under a different domain than the current URL" + errorMessage);
		}
		return flag;
	}

	private boolean isIMENotAvaliableError(Exception e,WebDriver driver)
			throws IMENotAvaliableException {
		boolean flag = false;
		if (e.toString().contains("org.openqa.selenium.IMENotAvaliableException")) {
			
			flag = true;
			throw new IMENotAvaliableException(
					"IME support is not available on this machine.");
		}
		return flag;
	}

	private boolean isIMEActivationFailedError(Exception e,WebDriver driver)
			throws IMEActivationFailedException {
		boolean flag = false;
		if (e.toString().contains("org.openqa.selenium.IMEActivationFailedException")) {
			
			flag = true;
			throw new IMEActivationFailedException(
					"IME engine cannot be activated.");
		}
		return flag;
	}

	private boolean isErrorInResponseError(Exception e,WebDriver driver)
			throws ErrorInResponseException {
		boolean flag = false;
		if (e.toString().contains("org.openqa.selenium.ErrorInResponseException")) {
			
			flag = true;
			throw new ErrorInResponseException(
					"An error has occurred on the server side when communicating with the firefox extension or the remote driver server.");
		}
		return flag;
	}

	private boolean isElementNotVisibleError(Exception e,WebDriver driver)
			throws ElementNotVisibleException {
		boolean flag = false;
		if (e.toString().contains("org.openqa.selenium.ElementNotVisibleException")) {
			
			flag = true;
			StringBuffer errorMessage = new StringBuffer();
			errorMessage=this.getFormattedErrorMessage(e, errorMessage);
			throw new ElementNotVisibleException(""+errorMessage);
		}
		return flag;
	}

	private boolean isStaleElementError(Exception e,WebDriver driver)
			throws StaleElementException {
		boolean flag = false;
		if (e.toString().contains("org.openqa.selenium.StaleElementException")) {
			
			flag = true;
			StringBuffer errorMessage = new StringBuffer();
			errorMessage=this.getFormattedErrorMessage(e, errorMessage);
			throw new StaleElementException(""+errorMessage);
		}
		return flag;
	}

	public String traceBack(String classname, String method,String message,int lineNo) {
	    this.separator = "\n";
	    String errorContext="";
	    CustomSeleniumException e = this;
	    while (e != null) {
	    
	      errorContext += line("[ERROR] : " + message);
	      e = e.previous;
	    }  
	    return errorContext;
	  }  

	private String line(String s) {
	    return s + separator;
	  }
	
	public StringBuffer getFormattedErrorMessage(Exception e,StringBuffer errorMessage){
		
		for(StackTraceElement s:e.getStackTrace()){
			
			if(s.getClassName().contains("com.tcs.rsf.") ){
				System.out.println("Class name ::::: "+ s.getClassName());
				errorMessage.append(this.traceBack(s.getClassName(), s.getMethodName(), s.toString(),s.getLineNumber()));
			
			}
		}
		return errorMessage;		
			
}
	
	}
