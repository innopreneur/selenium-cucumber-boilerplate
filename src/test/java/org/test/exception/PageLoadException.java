package org.test.exception;

import javax.naming.ServiceUnavailableException;

import org.openqa.selenium.WebDriver;








public class PageLoadException{

	

	/**
	 * @param args
	 * @return  
	 * @throws HTTP503Exception 
	 * @throws HTTP502Exception 
	 * @throws HTTP500Exception 
	 * @throws HTTP403Exception 
	 * @throws HTTP401Exception 
	 * @throws HTTP301Exception 
	 * @throws SystemErrorException 
	 * @throws BSCErrorException 
	 * @throws HTTP404Exception 
	 * @throws LoginValidationException 
	 * @throws ServiceUnavailableException 
	 */


		 
		public boolean validatePageLoad(String url,WebDriver driver) throws SystemErrorException, HTTP301Exception, HTTP401Exception, HTTP403Exception, HTTP500Exception, HTTP502Exception, HTTP503Exception, HTTP405Exception, HTTP404Exception, LoginValidationException{

				if(!isSystemError(url,driver) && 
				   !isHTTP301Error(url,driver) &&
				   !isHTTP401Error(url,driver) &&
				   !isHTTP403Error(url,driver) &&
				   !isHTTP404Error(url,driver) &&
				   !isHTTP405Error(url,driver) &&
				   !isHTTP500Error(url,driver) &&
				   !isHTTP502Error(url,driver) &&
				   !isHTTP503Error(url,driver) &&
				   !loginValidation(url,driver)
				   ){
					return true;			
				}

				return true;			
		}

		public boolean isHTTP404Error(String url,WebDriver driver) throws HTTP404Exception{
				boolean flag = false;

			if(driver.getPageSource().contains("HTTP Status 404")){
				driver.close();
				flag = true;
				throw new HTTP404Exception("Encountered HTTP error 404 on page:" + url);


			}

			return flag;

		}


		public boolean isSystemError(String url,WebDriver driver) throws SystemErrorException{
			boolean flag = false;
			if(driver.getPageSource().contains("Smart Offer has temporarily experienced an error.")){
			//	if(SeleniumTestBase.driver.getPageSource().contains("You are super user of United States")){
				//System.out.println("This is Page source: " + driver.getPageSource());
				flag = true;

				throw new SystemErrorException("System Error encountered on page : " + url);
			}
			return flag;
		}


		public boolean isHTTP401Error(String url,WebDriver driver) throws HTTP401Exception{
			boolean flag = false;

			if(driver.getPageSource().contains("HTTP Status 401")){

			flag = true;
			throw new HTTP401Exception("Encountered HTTP error 401 on page:" + url);

			}

			return flag;

		}

		public boolean isHTTP403Error(String url,WebDriver driver) throws HTTP403Exception{
			boolean flag = false;

			if(driver.getPageSource().contains("HTTP Status 403")){

			flag = true;
			throw new HTTP403Exception("Encountered HTTP error 403 on page:" + url);

			}

			return flag;

		}

		public boolean isHTTP405Error(String url,WebDriver driver) throws HTTP405Exception{
			boolean flag = false;

			if(driver.getPageSource().contains("HTTP Status 405")){

			flag = true;
			throw new HTTP405Exception("Encountered HTTP error 405 on page:" + url);

			}

			return flag;

		}

		public boolean isHTTP301Error(String url,WebDriver driver) throws HTTP301Exception{
			boolean flag = false;

			if(driver.getPageSource().contains("HTTP Status 301")){

			flag = true;
			throw new HTTP301Exception("Encountered HTTP error 301 on page:" + url);

			}

			return flag;

		}

		public boolean isHTTP500Error(String url,WebDriver driver) throws HTTP500Exception{
			boolean flag = false;

			if(driver.getPageSource().contains("HTTP Status 500")){

			flag = true;
			throw new HTTP500Exception("Encountered HTTP error 500 on page:" + url);

			}

			return flag;

		}

		public boolean isHTTP502Error(String url,WebDriver driver) throws HTTP502Exception{
			boolean flag = false;

			if(driver.getPageSource().contains("HTTP Status 502")){

			flag = true;
			throw new HTTP502Exception("Encountered HTTP error 502 on page:" + url);

			}

			return flag;

		}

		public boolean isHTTP503Error(String url,WebDriver driver) throws HTTP503Exception{
			boolean flag = false;

			if(driver.getPageSource().contains("HTTP Status 503")){

			flag = true;
			throw new HTTP503Exception("Encountered HTTP error 503 on page:" + url);

			}

			return flag;

		}

		public boolean isServiceUnavailable(String url,WebDriver driver) throws ServiceUnavailableException{
			boolean flag = false;

			if(driver.getPageSource().contains("The server is temporarily unable to service your request due to maintenance downtime or capacity problems. Please try again later.")){

			flag = true;
			throw new ServiceUnavailableException("Application is down. May be deployment is in Progress. Please contact Karthik");

			}

			return flag;

		}

		private boolean loginValidation(String url,WebDriver driver) throws  LoginValidationException{
				boolean flag = false;
			if(driver.getPageSource().contains("The user name or password you entered was not correct.")){
				driver.close();
				flag = true;
				throw new LoginValidationException("The user name or password entered was not correct:" + url);
			}

			return flag;
	}


}