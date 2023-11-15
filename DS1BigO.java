public class DS1BigO {
    public void log (int[] numbers){
        // O(1)
        System.out.println(numbers[0]);
        System.out.println(numbers[0]);
    }
    public void log1(int[] numbers){
        //O(n)
        System.out.println(); //0(1)
        for (int number : numbers){ //(0(n))
            System.out.println(number);
        System.out.println(); //0(1)
        }
    }
        public void log2(int[] numbers, String[] names){
        //O(n + m) = 0(n)
        for (int number : numbers){ //(0(n))
            System.out.println(number);
        }
        for (String name : names){ //(0(n))
            System.out.println(name);
        }
    }
        public void log3(int[] numbers){
        //O(n^2)
        System.out.println(); //0(1)
        for (int first : numbers){ //(0(n))
          for (int second : numbers){ //(0(n))
            System.out.println(first + ", " + second);
        
            }
        }
    }
}
