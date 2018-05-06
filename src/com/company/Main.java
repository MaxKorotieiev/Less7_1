package com.company;


public class Main {
 private static  double avg(int ... a) {
      {
          double sum=0;
          for (int i: a
                  ) {
              sum+=i;
          }
          return  sum/a.length;
      }

  }
        public static void main (String[]args){
            System.out.println(avg(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
            //   System.out.println(new Girl());
            //   new Girl().goToCinema();

            double vol;

            Box mybox1 = new Box(10, 20, 15);
            Box mybox2 = new Box(3, 6, 9);


            vol = mybox1.volume();
            System.out.println("volume is " + vol);

            vol = mybox2.volume();
            System.out.println("volume is " + vol);
        }

    }
