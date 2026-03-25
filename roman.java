import java.util.*;
class roman{
    public static void main(String args[]){
        int i=0,l=0,v1=0,v2=0,sum=0,newv=0;
        char x='\0',y='\0';
        Scanner in=new Scanner(System.in);
        System.out.print("enter:");
        String string=in.next().toUpperCase();
        Map<Character,Integer> r=new LinkedHashMap<>();
        r.put('I',1);
        r.put('V',5);
        r.put('X',10);
        r.put('L',50);
        r.put('C',100);
        r.put('D',500);
        r.put('M',1000);
        l=string.length();
        
        
        for(i=0;i<l;i++){
            
             
             x=string.charAt(l-1-i);
             if(i!=l-1){
                y=string.charAt(l-2-i);
                v2=r.get(y);
             }
             v1=r.get(x);
             
             if(v1>v2){
             newv=v1-v2;
             i++;
             }

             else
             newv=v1;
             sum+=newv;
        }
        System.out.print(sum);
             
            
             
    }
}

       