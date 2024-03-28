package homework.day5day6;

public class JavaConnection implements DatabaseConnection{

	@Override
	public void connect() {
		System.out.println("Connect");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute Update");
		
	}
	public static void main(String[] args) {
		JavaConnection JC=new JavaConnection();
		JC.connect();
		JC.disconnect();
		JC.executeUpdate();
	}

}
