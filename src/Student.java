import java.util.Scanner;

public class Student
{
	// 1. thuộc tính (field)
	private int id;
	private String name;
	private int age;
	private String address;
	private String phone;
	private Boolean gender;
	
	// 2. constructor
	
	public Student()
	{
	}
	
	public Student(int id, String name, int age, String address, String phone, Boolean gender)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.gender = gender;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	public Boolean getGender()
	{
		return gender;
	}
	
	public void setGender(Boolean gender)
	{
		this.gender = gender;
	}
	
	public void inputData(Scanner sc, Student[] students, int currentIndex)
	{
		this.id = inputId(sc, students, currentIndex);
		this.name = inputName(sc);
		this.age = inputAge(sc);
		this.address = inputAddress(sc);
		this.phone = inputPhone(sc);
		this.gender = inputGender(sc);
	}
	
	public void inputUpdate(Scanner sc)
	{
		this.name = inputName(sc);
		this.age = inputAge(sc);
		this.address = inputAddress(sc);
		this.phone = inputPhone(sc);
		this.gender = inputGender(sc);
	}
	
	
	public Boolean inputGender(Scanner sc)
	{
		System.out.println("Nhập vào giới tính (true-Nam,false-Nữ): ");
		do
		{
			String gender = inputString(sc);
			if (gender.equalsIgnoreCase("true") || gender.equalsIgnoreCase("false"))
			{
				return Boolean.parseBoolean(gender);
			}
			else
			{
				System.err.println("Vui lòng nhập lại true hoặc false");
			}
		}
		while (true);
	}
	
	public String inputString(Scanner sc)
	{
		do
		{
			String input = sc.nextLine();
			if (input.trim().isEmpty())
			{
				System.err.println("Không được để trống");
			}
			else
			{
				return input;
			}
		}
		while (true);
	}
	
	public String inputPhone(Scanner sc)
	{
		System.out.println("Nhập vào số điện thoại: ");
		do
		{
			String phone = sc.nextLine();
			if (phone.trim().isEmpty())
			{
				System.err.println("Không được để trống");
			}
			else
			{
				return phone;
			}
		}
		while (true);
	}
	
	public String inputAddress(Scanner sc)
	{
		System.out.println("Nhập và địa chỉ: ");
		do
		{
			String address = sc.nextLine();
			if (address.trim().isEmpty())
			{
				System.err.println("Không được để trống");
			}
			else
			{
				return address;
			}
		}
		while (true);
	}
	
	public int inputAge(Scanner sc)
	{
		System.out.println("Nhập vào tuổi: ");
		do
		{
			String age = sc.nextLine();
			if (age.trim().isEmpty())
			{
				System.err.println("Không được để trống");
			}
			else
			{
				int newAge = Integer.parseInt(age);
				if (newAge >= 6)
				{
					return newAge;
				}
				else
				{
					System.err.println("Học sinh phải lớn hơn 6 tuổi");
				}
			}
		}
		while (true);
	}
	
	public String inputName(Scanner sc)
	{
		System.out.println("Nhập tên: ");
		do
		{
			String name = sc.nextLine();
			if (name.trim().isEmpty())
			{
				System.err.println("Vui lòng không được để trống");
			}
			else
			{
				return name;
			}
		}
		while (true);
		
	}
	
	
	public int inputId(Scanner sc, Student[] students, int currentIndex)
	{
		System.out.println("Nhập id: ");
		do
		{
			String id = sc.nextLine();
			if (id.trim().isEmpty())
			{
				System.err.println("Không được để trống");
			}
			else
			{
				int newId = Integer.parseInt(id);
				boolean isExist = false;
				for (int i = 0; i < currentIndex; i++)
				{
					if (students[i].getId() == newId)
					{
						isExist = true;
						break;
					}
				}
				if (isExist)
				{
					System.err.println("Id đã tồn tại");
				}
				else
				{
					return newId;
				}
			}
		}
		while (true);
	}
//	<access modifer> <kiểu dữ liệu trả về> <tên phương thức>( <các tham số> ) {}
	
	public void displayData()
	{
		System.out.printf(
				  "[ ID: %d | Name: %s | Age: %d | Address: %s | Phone: %s | Gender: %s ]\n",
				  this.id,
				  this.name,
				  this.age,
				  this.address,
				  this.phone,
				  this.gender ? "Nam" : "Nữ"
		);
	}
}
