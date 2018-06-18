
  

public class Java8Samples {  
    public static void main(String[] args) { 
    	//Method reference to a constructor
        MyInterface ref = Hello::new;  
        ref.display("Hello World!"); 
        String  str="Hello";
        System.out.println(str.substring(0, str.length()-1));
        int c=0;
        for(int i=0;i<4;i++){
        	for(int y=i;y<4;y++){
        		c++;
        	}
        }
      System.out.println(what(11));
    }  
    public static int biggest(int a,int b,int c){
    	if(a>b && a>c){
    		return a;
    	}
    	else if(b>a && b>c){
    		return b;
    	}
    	return c;
    }
    
    public static int what(int a){
    	if(a<10){
    		return 1;
    	}
    	else 
    		return 1+what(a/10);
    	}
    	//return c;
    }

