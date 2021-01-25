package ReplitTasks;

import java.util.Scanner;

public class NavigateAtoD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();
        String AtoB="right";
        String BtoC="down";
        String CtoD="left";
        String DtoA="up";


        if (start.equalsIgnoreCase("a")){
            if (end.equalsIgnoreCase("b")){
                System.out.println(AtoB+": "+end+" found");
            }else if(end.equalsIgnoreCase("c")){
                System.out.println(AtoB+" > "+BtoC+": "+end+" found");
            }else if(end.equalsIgnoreCase("d")){
                System.out.println(AtoB+" > "+BtoC+" > "+CtoD+": "+end+" found");
            }else if (end.equalsIgnoreCase("a")){
                System.out.println(start+" found");
            }

        }else if (start.equalsIgnoreCase("b")){
            if (end.equalsIgnoreCase("c")){
                System.out.println(BtoC+": "+end+" found");
            }else if(end.equalsIgnoreCase("d")){
                System.out.println(BtoC+" > "+CtoD+": "+end+" found");
            }else if(end.equalsIgnoreCase("a")){
                System.out.println(BtoC+" > "+CtoD+" > "+DtoA+": "+end+" found");
            }else if (end.equalsIgnoreCase("b")){
                System.out.println(start+" found");
            }


        }else if (start.equalsIgnoreCase("c")){
            if (end.equalsIgnoreCase("d")){
                System.out.println(CtoD+": "+end+" found");
            }else if(end.equalsIgnoreCase("a")){
                System.out.println(CtoD+" > "+DtoA+": "+end+" found");
            }else if(end.equalsIgnoreCase("b")){
                System.out.println(CtoD+" > "+DtoA+" > "+AtoB+": "+end+" found");
            }else if (end.equalsIgnoreCase("c")){
                System.out.println(start+" found");
            }

        }else if (start.equalsIgnoreCase("d")){
            if (end.equalsIgnoreCase("a")){
                System.out.println(DtoA+": "+end+" found");
            }else if(end.equalsIgnoreCase("b")){
                System.out.println(DtoA+" > "+AtoB+": "+end+" found");
            }else if(end.equalsIgnoreCase("c")){
                System.out.println(DtoA+" > "+AtoB+" > "+BtoC+": "+end+" found");
            }else if (end.equalsIgnoreCase("d")){
                System.out.println(start+" found");
            }

        }



    }

}
