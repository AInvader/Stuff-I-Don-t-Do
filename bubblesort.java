class bubblesort
{
    public static void main (String[] args)
    {
        int a[]={-2,-3,5,99,0,3,4,5,6,7,8}; int commcount=0;
        int n=a.length;
        for (int i=0;i<n;i++)
        {
            for (int j=1;j<n;j++)
            {
                if (a[j-1]>a[j])
                {                  
                    int s=a[j];
                    a[j]=a[j-1];
                    a[j-1]=s;
                }
            }
        }
        System.out.println("Ascending Order : ");
        for (int p=0;p<n;p++)
        {
        	commcount++;
        	if (commcount<n)
        		System.out.print(a[p]+",");
        	else
        		System.out.print(a[p]);
        }
    }
}