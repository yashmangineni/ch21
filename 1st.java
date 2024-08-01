class largest{
public static void main(String args[])
{
int a=10,b=-3,c=30;
if(a>b && a>c)
{
if(b>c)
{
System.out.println(b);
}
else
{
System.out.println(c);
}
}	
else if(b>c)
{
if(a>c)
{
System.out.println(a);
}
else
{
System.out.println(c);
}
}
else
{
if(a>b)
{
System.out.println(a);
}
else
{
System.out.println(b);
}
}
}
}

