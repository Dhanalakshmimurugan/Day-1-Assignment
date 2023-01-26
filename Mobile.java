package week.day1;

public class Mobile {
	public void sendMessage() {
		System.out.println("THE CAN SEND MESSAGE ");
	}
	public void shareDocument() {
		System.out.println("THE USER CAN SHARE THEIR DOCUMENT");
	}
	public void call() {
		System.out.println("THE USER CAN CALL THE OTHER PERSON");
	}
	public void takePhoto() {
		System.out.println("THE USER CAN TAKE THE PICTURE");
	}
	public void sharePicture() {
		System.out.println("THE USER CAN SHARE THEIR PICTURES");
	}
	public void viewVideo() {
		System.out.println("THE USER CAN WATCH THE VIDEO");
	}
	public void viewContactnumber() {
		System.out.println("THE USER CAN VIEW THEIR CONTACT NUMBER");
	}
	public void installApp() {
		System.out.println("THE USER CAN INSTALL THE APPLICATION");
	}
	public void viewPhoto() {
		System.out.println("THE USER CAN VIEW THEIR PHOTO");
	}
	public void lock () {
		System.out.println("THE USER CAN LOCK THEIR PHONE");
	}
 public static void main(String[] args) {
	   Mobile object = new Mobile();
	   object.sendMessage();
	   object.shareDocument();
	   object.call();
	   object.takePhoto();
	   object.sharePicture();
	   object.viewVideo();
	   object.viewContactnumber();
	   object.installApp();
	   object.viewPhoto();
	   object.lock();
	   
	   
	   
}
}