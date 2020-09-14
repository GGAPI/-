import java.util.Scanner;
//名字大于三
public class test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(find(s));

    }
    public static String find(String s){
        StringBuilder sb = new StringBuilder();
        String[] c=s.split(" ");
        if(c.length==2){
            for(int i =0;i<c.length;i++){
                for (int j = 0; j < c[i].length(); j++) {
                    if (Character.isLowerCase(c[i].charAt(j))) {
                        sb.append(c[i].charAt(j));
                    } else if (Character.isUpperCase(c[i].charAt(j))) {
                        sb.append((char)(c[i].charAt(j) + 32));
                    } else {
                        return "unkwon name";
                    }
                }
            }
        }else if(c.length>=3){
            for (int i = 0; i <c.length;i++) {
               sb= sb.append((char)(c[i].charAt(0)+32));
            }
        }
        return sb.toString();
    }


}
