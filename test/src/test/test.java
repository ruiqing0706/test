package test;

import java.util.Arrays;
import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> urlNonFilterList = Arrays.asList(
				"/api/tenant/userLogin", "/api", "/index.json","/api/tenant/getJoinDeptInfo"
				,"/getDbAndTable.json","/error"
				,"/dataStorage/resourceListNoSession.json","/resourceListNoSession.json"
				,"/dataMonitor/api/tenant/userLoginWithout","/api/tenant/userLoginWithout"
				);
		String uri = "/aaa/api";
		uri = uri.substring(4);
		if (urlNonFilterList.contains(uri)) {
			System.out.println("不需要session!!!");
		}
	}

}
