class P26{
  public static void main(String args[]){
  if(args.length==0)
  System.out.println("Please enter an Integer number");
  else{
  int n=Integer.parseInt(args[0]);
  int i=1,f=1;
    do
    {
        f=f*i;
        i++;
    }while(i<=n);
    System.out.println("The factorial of "+n+" is "+f);
  }
 }
}