public class Main {
    public static void main(String[] args) throws Exception {
        IdAndPassword idandpasswords =new IdAndPassword();
        
        LoginPage loginpage = new LoginPage(idandpasswords.getLogininfo()); 
    }
}
