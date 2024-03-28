package homework.day5day6;

public class APIClient {
	
	void sendRequest(String endpoint) {
		System.out.println("Send Request");
	}
	
	void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		System.out.println("Endpoint RequestBody RequestStatus is success "+ requestStatus);
		
		
	}
	public static void main(String[] args) {
		APIClient AC=new APIClient();
		AC.sendRequest("Send Request Endpoint");
		AC.sendRequest("Endpoint", "Request body", false);
	}

}
