import javax.swing.JOptionPane;

class EasterDate
{
  public static String getDate(int x)
  {
    // String input ="";
//     input =  JOptionPane.showInputDialog(null,"Enter a year");
//     //step 0
//     int x = Integer.parseInt(input);
//     //test input
//     System.out.println("You entered --> " + x);
    
    //step 1
    int A = x % 19;
    
    //step 2
    int B = x / 100;
    int C = x % 100;
    
    //step 3
    int D = B / 4;
    int E = B % 4;
    
    //step 4
    int G = (8 * B + 13) / 25;
    
    //step 5
    int H = (19 * A + B - D - G + 15) % 30;
    
    //step 6
    int M = (A + 11 * H) / 319;
    
    //step 7
    int J = (C / 4);
    int K = (C % 4);
    
    //step 8
    int L = (2 * E + 2 * J - K - H + M + 32) % 7;
    
    //step 9
    int N = (H - M + L + 90) / 25;
    
    //step 10
    int P = (H - M + L + N + 19) % 32;
    
    JOptionPane.showMessageDialog(null,"Month = " + N + "\nDay = " + P +"\nYear="+x);
    System.out.println("Month = " + N);
    System.out.println("Day = " + P);
    return N+"/"+P+"/"+x;
  }
}
    
    
    
  
    
    
  
  