import java.util.*;

// public class Metric{
//   public static void main(String[] args) {
  
//     System.out.println("You have 6 metric choices to choose from:\n "
//   + "Type 1 to convert: 'pounds to kg', \n Type 2 to convert: 'feet to meters', \n Type 3 to convert: 'miles to kilometers', \n Type 4 to convert: 'miles to kilometers' , \n Type 5 to convert: ' Liters to milliters', \n Type 6 to convert: 'Celcius to farenheit', \n"
//   + "\n Please press '-1' to end program when done,\n Please input your metric to be converted: ");
//   Scanner sc = new Scanner(System.in);
  
//   boolean program = false;
  
//   while (program == false){
  
//   String choice = sc.nextLine();
   
//   switch(choice){
//     case "1":
//     System.out.println("How many pounds to kilograms: ");  
//     double number = sc.nextDouble();
//     double results = number /2.205;
//     System.out.printf("%.2f \n", results);

  
//     case "2":
//     System.out.println("How many feet to meters: ");  
//     double numbers = sc.nextDouble();
//     System.out.println( numbers / 3.281);
//     System.out.printf("%.2f \n", numbers);
    
    
//     case "3":
//     System.out.println("How many miles to km: ");  
//     double numbers1 = sc.nextDouble();
//     double result3  = numbers1 * 1.069;
//     System.out.printf("%.2f \n", result3);
    
    
//     case "4":
//     System.out.println("How many inches to cm: ");  
//     double numbers2 = sc.nextDouble();
//     double result4  = numbers2 * 2.54;
//     System.out.printf("%.2f \n", result4);
    
//     case "5":
//     System.out.println("How many Liters to milliters: ");  
//     double numbers3 = sc.nextDouble();
//     double result5  = numbers3 / 1000;
//     System.out.printf("%.2f \n", result5);
    
//     case "6":
//     System.out.println("How many Celcius to farenheit: ");  
//     double numbers4 = sc.nextDouble();
//     double result6  = (numbers4  * 9 / 5) + 32;
//     System.out.printf("%.2f \n", result6);
//     continue;  
    
//     case "-1":
//     program = true;
//     System.out.println("Thanks for using metric converter app");  
//     default:
//     System.out.println("Warning : \n Please choose one of the available options, choose number 1-6 to be properly converted!");
  
//   }
//   }
//   sc.close();
//   }
// }


public class Metric {
  public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      String string1; String[] myStrArray; float metricNum; String sourceMetric; String targetMetric; float targetNum = 0;
      System.out.println("You have 4 metric choices to choose from:\n "
        + "for example type: '1 km = m or mile', \n'1 kg = ib', \n '1 liters = gallons', \n '1 miles to kilometers' , \n '1 celsius = fareinheit'. "
        + "\n Please press '-1' to end program when done,\n Please input your metric to be converted: ");
      while( true ){
          string1 = scanner.nextLine();
          if(string1.equals("-1")){
              System.out.println("Thanks for using metric converter app, GoodBye!");
              scanner.close();
              break;
          }
          myStrArray = string1.split(" ");
          if(myStrArray.length != 4){
              System.out.println("Warning : \n Please choose one of the available options, choose number 1-6 to be properly converted!");
              continue;
          }else{
            metricNum = Float.parseFloat(myStrArray[0]);
              sourceMetric = myStrArray[1];
              targetMetric = myStrArray[3];
              metricConverter(metricNum, sourceMetric, targetNum, targetMetric);
          }
      }
  }

  public static float metricConverter(float sourceNum, String sourceMetric, float targetNum, String targetMetric){
    targetNum = 0;
      switch(sourceMetric){
          case "km":
          switch(targetMetric){
              case "m":
                  targetNum = sourceNum * 1000;
                  break;
              case "mile":
                  targetNum = (float) (sourceNum * 0.62);
                  break;
              default:
                  break;
          }
          break;    
          case "kg":
          switch(targetMetric){
              case "lb":
                  targetNum = (float)(sourceNum * 2.20);
                  break;
              default:
                  break; 
          }
          break;
          case "liters":
          switch(targetMetric){
              case "gallon":
                targetNum = (float)(sourceNum * 0.26);
                  break;
              default: 
                  break; 
          }
          break;
          case "celsius":
          switch(targetMetric){
              case "fahrenheit":
                  targetNum = (float)(sourceNum * 1.8 + 32);
                  break;
              default:
                  break; 
          }
          break;
          default:
          System.out.println("Metric choice is not understood by program, please try again!"); 
              break; 
              
      }
      System.out.printf("%.2f %s = %.2f %s%n", sourceNum, sourceMetric, targetNum, targetMetric);
      return targetNum;
      
  }
  
}
