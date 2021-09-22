package company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	String request = read.readLine();
	StringValidator validator = new StringValidator();
	if (validator.isPatternRight(request)) {
		String operationType = validator.operationType(request);
		StringBuilder builder = new StringBuilder();
		String separator = builder.append("\\").append(validator.operationType(request)).toString();
		String stringWOSpaces = request.replaceAll(" ","");
		String[] requestParam = stringWOSpaces.split(separator);
		if ((validator.containsArabian(request))) {
			NumberFactory numberFactory = new NumberFactory();
			Arabian arabian = numberFactory.arabianInit(requestParam);
			numberFactory.arabianExec(arabian,operationType);
		} else {
			NumberFactory numberFactory = new NumberFactory();
			List<RomanNumber> list = numberFactory.romanianInit(requestParam);
			numberFactory.romanianExec(list, operationType);
		}

	}

    }

}
