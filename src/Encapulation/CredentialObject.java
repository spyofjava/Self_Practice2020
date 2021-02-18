package Encapulation;

public class CredentialObject {
    public static void main(String[] args) {
        Credential credential = new Credential();
        System.out.println(credential.getUserName());
        System.out.println(credential.getPassword());

        credential.setUserName("ibrahim");
        credential.setPassword(5678);

        System.out.println(credential.getUserName());
        System.out.println(credential.getPassword());




    }
}
