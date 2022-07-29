package Beytullah.hrms.core.concretes;

import Beytullah.hrms.core.abstracts.MailVerificationService;
import Beytullah.hrms.core.utilities.results.Result;
import Beytullah.hrms.core.utilities.results.SuccessResult;

public class MailVerificationManager implements MailVerificationService{

	@Override
	public Result VerifyEmail(String email) {
		
		return new SuccessResult("Email Verified Successfully");
	}

}
