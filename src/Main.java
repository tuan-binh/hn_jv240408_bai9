import java.util.Scanner;

public class Main
{
	public static Student[] students = new Student[100];
	public static int currentIndex = 0;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Main main = new Main();
		do
		{
			System.out.println("************************ MENU ************************");
			System.out.println("*                                                    *");
			System.out.println("*         1. Hiển thị danh sách sinh viên            *");
			System.out.println("*         2. Thêm mới sinh viên                      *");
			System.out.println("*         3. Sửa thông tin sinh viên                 *");
			System.out.println("*         4. Xóa thông tin sinh viên                 *");
			System.out.println("*         5. Thoát                                   *");
			System.out.println("*                                                    *");
			System.out.println("******************************************************");
			System.out.println("Nhập vào lựa chọn của bạn: ");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice)
			{
				case 1:
				{
					main.showAllStudents();
					break;
				}
				case 2:
				{
					main.addNewStudent(sc);
					break;
				}
				case 3:
				{
					main.updateStudent(sc);
					break;
				}
				case 4:
				{
					main.deleteStudent(sc);
					break;
				}
				case 5:
				{
					System.exit(0);
					break;
				}
				default:
					System.err.println("Vui lòng nhập lại từ 1 -> 5");
			}
		}
		while (true);
		
	}
	
	public void showAllStudents()
	{
		// 1. Kiểm tra phần tử trong mảng có hay không;
		if (currentIndex == 0)
		{
			System.err.println("Danh sách trống...");
			return;
		}
		for (int i = 0; i < currentIndex; i++)
		{
			students[i].displayData();
		}
	}
	
	public void addNewStudent(Scanner sc)
	{
		System.out.println("Nhập vào số lượng muốn thêm: ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++)
		{
			System.out.println("Nhập thông tin sinh viên thứ " + (i + 1));
			students[currentIndex] = new Student();
			students[currentIndex].inputData(sc, students, currentIndex);
			currentIndex++;
		}
		System.out.println("Thêm thành công!!!");
	}
	
	public void updateStudent(Scanner sc)
	{
		// 1. Nhập vào id muốn sửa:
		System.out.println("Nhập vào id muốn sửa: ");
		int idUpdate = Integer.parseInt(sc.nextLine());
		// 2. Có id chúng ta sẽ tìm được index -> dùng for i để tìm kiếm index dựa vào id để tìm kiếm
		int indexUpdate = findIndexById(idUpdate);
		// 3. kiểm tra index có tồn tại hay không
		if (indexUpdate != -1)
		{
			// c2
			// hiển thị menu muốn sửa cái nào
			// switch case sửa cái nào thì gọi input cái đấy
			// c1
			students[indexUpdate].inputUpdate(sc);
		}
		else
		{
			System.err.println("Không tồn tại id student có mã " + idUpdate);
		}
		// 4. cập nhật tại vị trí index students[indexUpdate].setAge( nhập thông tin )
	}
	
	public int findIndexById(int id)
	{
		for (int i = 0; i < currentIndex; i++)
		{
			if (students[i].getId() == id)
			{
				return i;
			}
		}
		return -1;
	}
	
	public void deleteStudent(Scanner sc)
	{
		// 1. nhập vào id muốn xóa:
		System.out.println("Nhập vào id muốn xóa: ");
		int idDelete = Integer.parseInt(sc.nextLine());
		// 2. tìm index
		int indexDelete = findIndexById(idDelete);
		// 3. check index tồn tại không
		if (indexDelete != -1)
		{
			// xóa
			for (int i = indexDelete; i < currentIndex; i++)
			{
				students[i] = students[i + 1];
			}
			currentIndex--;
		}
		else
		{
			System.err.println("Không tồn tại id student có mã " + idDelete);
		}
	}
	
}
