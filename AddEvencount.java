public class AddEvencount
{

//metod 2 for add even count

public static void main(String args[])
{
int oddcounter=0;
int evencounter=0;
int a[]={7,5,4,3,2,1,11,5,4,6,8,9,2};
{
for(int i=0;i<a.length;i=i+1)
{
if(a[i]%2==0)
{
evencounter=evencounter+1;
}
else
{
oddcounter=oddcounter+1;
}
}
System.out.println("even counter" + evencounter);
System.out.println("odd counter" + oddcounter);
}
}
}