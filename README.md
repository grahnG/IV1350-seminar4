To test DatabaseUnavailableException and InvalidItemIdentifierException, 
the user needs to change the hardcode values in the view. The method
runFakeExecution currently has ID values of 12345 and 456 for the oatmeal
and YouGoGo items. Simply set one of them values to 99 which will cause 
the DatabaseUnavailableException. To test InvalidItemIdentifierException
simply change one of them ID values to whatever number thats not
12345, 456 and 99.
