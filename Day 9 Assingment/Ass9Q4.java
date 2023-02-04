import javax.print.attribute.standard.Sides;

public class Ass9Q4 {
    public static void main(String args[]) {
        int h=10;
        for(int i = 0; i < h; i++) {  
            System.out.printf("*");  
            for(int j = 0; j <= h; j++) {  
                if((i == 0 || i == h / 2) && j < h - 1) {  
                    System.out.printf("*");  
                }else if(i < h / 2 && j == h - 1 && i != 0){  
                    System.out.printf("*");  
                }else {  
                    System.out.printf(" ");  
                }  
            }  
            System.out.printf("\n");  
        } 
       System.out.println();
        
        int count = h / 2;  
          
        for(int i = 0; i < h; i++) {  
            System.out.printf("*");  
            for(int j = 0; j <= h; j++) {  
                if(j == h) {  
                    System.out.printf("*");  
                }else if((i >= h / 2) && (j == count || j == h - count - 1)){  
                    System.out.printf("*");  
                }else {  
                    System.out.printf(" ");  
                }  
            }  
            if(i >= h / 2) {  
                count = count + 1;  
            }  
            System.out.printf("\n");  
        }  
        System.out.println(    );

        for(int i = 0; i < h; i++) {  
            for(int j = 0; j < h; j++) {  
                if((i == 0 || i == h / 2 || i == h - 1)) {  
                    System.out.printf("*");  
                }else if(i < h / 2 && j == 0){  
                    System.out.printf("*");  
                }else if(i > h / 2 && j == h - 1){  
                    System.out.printf("*");  
                }else {  
                    System.out.printf(" ");  
                }  
            }  
            System.out.printf("\n");  
        }  
     System.out.println();

     for (int i = 0; i<h;i++ ) {
        for (int j=0;j<h;j++){

            if(j==0 && i<(h-1) || i+j==(h-1)/2 || i-j==(h-1)/2 && i<=(h-1)-1){
                System.out.print("* ");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
     }

     for (int i = 0; i<h;i++ ) {
        for (int j=0;j<h;j++){

            if(i==0 && j<(h-1)|| i==(h-1) && j<(h-1) || j==(h-1)){
                System.out.print("* ");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
     }
     System.out.println( );
     for (int i = 0; i<h;i++ ) {
        for (int j=0;j<h;j++){

            if(j==0 && i<(h-1)|| i==(h-1) && j<(h-1) ){
                System.out.print("* ");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
     }
     System.out.println( );
     for (int i = 0; i<h;i++ ) {
        for (int j=0;j<h;j++){

            if(j==0 && i<(h-1)|| i==(h-1) && j<(h-1) ){
                System.out.print("* ");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
     }
     for(int i = 0; i < h; i++) {  
        for(int j = 0; j < h; j++) {  
            if((i == 0 || i == h / 2 || i == h - 1)) {  
                System.out.printf("*");  
            }else if(i < h / 2 && j == 0){  
                System.out.printf("*");  
            }else if(i > h / 2 && j == h - 1){  
                System.out.printf("*");  
            }else {  
                System.out.printf(" ");  
            }  
        }  
        System.out.printf("\n");  
    }  
 System.out.println();


 }
    }

