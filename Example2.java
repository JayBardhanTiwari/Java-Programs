public class Example2 {
public static int maximumNum(int num){
    StringBuilder sb = new StringBuilder();
    sb.append(num);

    for(int i = 0; i < sb.length();i++){
        if(sb.charAt(i) == '9'){
            sb.setCharAt(i, '6');
        }
        else if(sb.charAt(i) == '6'){
            sb.setCharAt(i, '9');
        }
    }
    return Integer.parseInt(sb.toString());
    
}
    public static void main(String[] args) {
        int num = 9669;
        // maximumNum(num);
        System.out.println();
    }
}