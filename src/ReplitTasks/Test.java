package ReplitTasks;

public class Test {


    public static void main(String[] args) {
//                    0123456
        String str = "1314431";//--->1341134
        //String str="1314";//1341
        //String str="3224";//3422
        String recordafter3="";
        for (int i = 0; i < str.length()-1; i++) {
            if ((""+str.charAt(i)).equals("3") && (!(""+str.charAt(i+1)).equals("4")) ){

                recordafter3+=str.charAt(i+1);
                str=str.replace(""+str.charAt(i+1),"4");
            }
        }
        System.out.println(recordafter3);
        System.out.println(str);


//        int findIndexof3 = str.indexOf("3");
//        int findIndexof4 = str.indexOf("4");
//        String find3=""+str.charAt(str.indexOf("3"));
//        String find4=""+str.charAt(str.indexOf("4"));
//        System.out.println(findIndexof3+"-->"+find3);
//        System.out.println(findIndexof4+"-->"+find4);
//        str=str.substring(0,findIndexof3+1)+find4+str.substring(findIndexof3+2);
//        System.out.println(str);


    }


}



