public class DescendingOrder 
{
// fuh
  public static int power(int a, int b)
  {
    int CalPower = a;
    while (b != 1)
    {
        CalPower *= a;
        b = b - 1;
    }
      return CalPower;
  }
    
  public static int sortDesc(final int num) 
  {
    //Your code
    int count = 0;
    int NumberForCount, UArrange, SwitchNum;
    int compare = 0, deNum = 0;
    
    NumberForCount = num;
    
    while (NumberForCount != 0) 
    {
      NumberForCount = NumberForCount / 10;
      count++;
    }
    
    while (count != 0) 
    {
    
      UArrange = num / power(10, count);
      
      if (UArrange > compare) 
      {
        SwitchNum = power(10, count) * compare + power(10, count - 1) * UArrange;
        deNum = SwitchNum + deNum;
        compare = UArrange;
      }
      
    }
    
    return deNum;
    
  }
}
