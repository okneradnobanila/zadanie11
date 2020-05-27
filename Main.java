class Main {
  public static void main(String[] args) {
    
    // Nomer 1
    System.out.println("\t  №1");
    int[][] mass=new int[8][8];
    for (int i=0;i < mass.length;i++){
      for (int j=0;j < mass[i].length;j++){
        mass[i][j]=(int)(Math.random()*10);
      }
    }
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        
        if (j % 2 == 0) {
          if (i % 2 == 0) {
            mass[i][j] = 1;
          } 
          else {
              mass[i][j] = 0;
          }
        } 
        else {
          if (i % 2 == 0) {
            mass[i][j] = 0;
          } 
          else {
            mass[i][j] = 1;
          }
        }
      }
    }
    for (int i=0;i < mass.length;i++,System.out.println()){
      for (int j=0;j < mass[i].length;j++){
        System.out.print(mass[i][j]+" ");
      }
    }
    
    // Nomer 2
    System.out.println("\t  №2");
    int[][] mass2=new int[10][10];
    for (int i=0;i < mass2.length;i++){
      for (int j=0;j < mass2[i].length;j++){
        mass2[i][j]=(int)(Math.random()*10);
      }
    }
    for (int i=0;i < mass2.length;i++,System.out.println()){
      for (int j=0;j < mass2[i].length;j++){
        System.out.print(mass2[i][j]+" ");
      }
    }

    // Nomer 3
    System.out.println("\t  №3");
    int sum = 0;
    for(int i=0; i<10 ;i++){
      for(int j=0; j<10 ;j++){
        sum = sum + (int)mass2[i][j];
      }
      System.out.println("Сумма: "+(i+1)+"-ой строки: "+sum);
      sum=0;
    }

    // Nomer 4
    System.out.println("\t  №4");
    System.out.println("Простые числа массива: ");
    for (int i = 0; i<10 ; i++){
      for(int j=0; j<10; j++){
        if (number(mass2[i][j]) == 1){
          System.out.print(mass2[i][j]+" ");
        }
      }    
    }
  }
  public static int number(int n)
  {
    for (int i=2; i<n; i++){
      if (n % i == 0){
        return 0;
      }
      if ( (i==n) || (i>Math.sqrt(n)) ){
        return 1;
      }
    }
    return 0;
  }
}