public class FindDivisor {
  public long numberOfDivisors(int n) {
    
int Cnt;
       
Cnt= 0;

   for (int l = 1; l <= n; l++) {
      if (n % l == 0)
        Cnt ++;
      else
        continue;
    }

    
 return Cnt;
  
 } 
} 
