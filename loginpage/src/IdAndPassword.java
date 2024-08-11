import java.util.HashMap;

public class IdAndPassword {
    
    HashMap<String,String> logininfo = new HashMap<String,String>();

    IdAndPassword (){
        logininfo.put("admin", "password");
        logininfo.put("manager", "1234");
        logininfo.put("user", "5678");
    }

    protected HashMap<String, String> getLogininfo() {
        return logininfo;
    }

    
}
