public class Ass9Q5 {
    public static void main(String args[]) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j == 0 && i < (n - 1) || i == (n - 1) && j < (n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= (n - 1) / 2 && j == 0 || i + j == (n - 2) / 2 || j - i == ((n + 2) / 2) - 1
                        || j == (n - 1) && i >= ((n - 1) / 2) + 1 || i == (n + 2 - 1) / 2) {

                    System.out.print("*");
                }

                else {
                    System.out.print(" ");

                }

            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < (n - 1) || j == (n - 1) / 2 && i < (n - 1)) {

                    System.out.print("* ");
                }

                else {
                    System.out.print("  ");

                }

            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j < (n - 1) || j == 0 && i < (n - 1) || i == (n - 1) && j < (n - 1)
                        || i == (n - 1) / 2 && j < (n - 1)) {

                    System.out.print("*");
                }

                else {
                    System.out.print(" ");

                }

            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == n / 2 || i == n - 1)) {
                    System.out.printf("*");
                } else if (i < n / 2 && j == 0) {
                    System.out.printf("*");
                } else if (i > n / 2 && j == n - 1) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }

            System.out.println();
        } 
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j==(n-1) || i==(n-1)/2) {

                    System.out.print("*");
                }

                else {
                    System.out.print(" ");

                }

            }
            System.out.println();
        }
        System.out.println();
        int d=0;
        for (int r = 0; r <n ; r++)
    {
        for (int c = 0; c <=n ; c++)
        {
            if (c == d || c ==n  - d && r <=n / 2)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.print("\n");
        if (r <n  / 2)
           d++;
    }
    System.out.println();
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (j==0  && i<(n-1) ||  j==(n-1) && i<(n-1) || i==(n-1) && j<(n) || i==0 && j<(n-1)) {

                System.out.print("*");
            }

            else {
                System.out.print(" ");

            }

        }
        System.out.println();
    }

    System.out.println();
    for(int i=0;i<n;i++){
    for (int j=0;j<n;j++){
        if(i> 0 && j==0 && i<((n-1)/2)+1|| i==0&& j<(n-1)/2 &&j >0  || i==((n-1)/2)+1 &&  j<(n-1)/2 &&j >0 || i==(n-1)/2 && j==(n-1)/2 || i==((n-1)/2)-1 && j>=((n-1)/2)-1 && j<=((n-1)/2)+1){
            System.out.print("*"+" ");
        }
        else{
                System.out.print("  ");
        }
        

    }
System.out.println();
}
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        if (i == 0 && j < (n - 1) || j == 0 && i < (n - 1) || i == (n - 1) && j < (n - 1)
                || i == (n - 1) / 2 && j < (n - 1)) {

            System.out.print("*");
        }

        else {
            System.out.print(" ");

        }

    }
    System.out.println();
}
System.out.println();
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        if ((i == 0 || i == n / 2 || i == n - 1)) {
            System.out.printf("*");
        } else if (i < n / 2 && j == 0) {
            System.out.printf("*");
        } else if (i > n / 2 && j == n - 1) {
            System.out.printf("*");
        } else {
            System.out.printf(" ");
        }
    }

    System.out.println();
} 
System.out.println();
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        if (j == 0 || j==(n-1) || i==(n-1)/2) {

            System.out.print("*");
        }

        else {
            System.out.print(" ");

        }

    }
    System.out.println();
}
System.out.println();
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

System.out.println();
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        if (i >= (n - 1) / 2 && j == 0 || i + j == (n - 2) / 2 || j - i == ((n + 2) / 2) - 1
                || j == (n - 1) && i >= ((n - 1) / 2) + 1 || i == (n + 2 - 1) / 2) {

            System.out.print("*");
        }

        else {
            System.out.print(" ");

        }

    }
    System.out.println();
}

System.out.println();


System.out.println();

for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        if (i == 0 && j < (n - 1) || j == (n - 1) / 2 && i < (n - 1)) {

            System.out.print("* ");
        }

        else {
            System.out.print("  ");

        }

    }
    System.out.println();
}
System.out.println();

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



    }
      
      
    }
