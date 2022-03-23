package Beytullah.hrms.core.abstracts;

import Beytullah.hrms.core.utilities.results.Result;

public interface MailVerificationService {
	
	Result VerifyEmail(String email);
		
	
}
