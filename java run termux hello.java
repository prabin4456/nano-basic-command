run java termux

pkg install ecj dx

pwd chek sotorage path

mkdir java

cd java

cd .. back termux

nano hello.java

class hello
{
	public static void main(String args[ ] )
	{
		system.out.printIn("Hello World");
	}
}

ecj hello.java

ls

dx --dex --output=hello.dex hello.class

ls

dalvikm -cp hello.dex hello

Hello world! 