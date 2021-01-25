package Ibrahim;

public class Replace_replacefirst_lastIndex_index {
    public static void main(String[] args) {

        String a=" I don't like my life that came true until now , I want to start a white page.";

        a=a.replaceFirst("don't like","like").replaceFirst("want","don't want");
        System.out.println(a);

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

        String r="I like to learn Java, because Java is cool, Java is powerful";

        r=r.replaceFirst("Java is","Python is").replaceFirst("Java ","C# ");
        System.out.println(r);

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        String p = "Yesterday was Monday, Today is Monday, Tomorrow is gonna be Monday";
        p=p.replaceFirst("Monday","Sunday").replaceFirst("be Monday","be Tuesday\n\n\n\n\n\n");
        System.out.println(p);

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

        String emailAddress = "Cybertek.School@yahoo.com";

        int beginningIndex = emailAddress.indexOf("@")+1 ;
        int endingIndex = emailAddress.indexOf(".c");//.com

        String domain = emailAddress.substring(beginningIndex, endingIndex);

        System.out.println(domain);

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        String u = "I like to Watch movies and reading books";
        String w=u.substring(u.indexOf("re"),u.indexOf(" b"));
        System.out.println(w);


//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

        String name = "My name is Ibrahim  ";
        String n=name.substring(name.indexOf("s ")+2,name.lastIndexOf("  "));
        System.out.println(n);//output: reading

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%






    }
}
