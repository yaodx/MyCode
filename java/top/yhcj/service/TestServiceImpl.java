package top.yhcj.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

	public String getTestCode() {
		return "1";
	}

}
