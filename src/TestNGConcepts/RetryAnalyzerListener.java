package TestNGConcepts;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerListener implements IRetryAnalyzer {
 
	int retryCount = 1;
	static final int maxRetryCount = 3;

	@Override
	public boolean retry(ITestResult result) {
		
		if(retryCount < maxRetryCount)
		{
			retryCount++;
			return true;
		}
		
		return false;
	}
}
