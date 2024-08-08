package ra.entity;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		// show ra menu
		do
		{
			Main main = new Main();
			System.out.println("********************* SHOP *********************");
			System.out.println("1. Quản lý danh mục");
			System.out.println("2. Quản lý sản phẩm");
			System.out.println("3. Thoát");
			System.out.println("************************************************");
			System.out.println("Lựa chọn đê: ");
			int choice = Integer.parseInt(scanner.nextLine());
			switch (choice)
			{
				case 1:
				{
					main.menuCategory(scanner);
					break;
				}
				case 2:
				{
					main.menuProduct(scanner);
					break;
				}
				case 3:
				{
					System.exit(0);
					break;
				}
				default:
					System.err.println("Vui lòng nhập lại từ 1 -> 3");
			}
		}
		while (true);
	}
	
	public void menuCategory(Scanner scanner)
	{
		boolean isLoop = true;
		do
		{
			System.out.println("---------------------------CATEGORIES MENU---------------------------\n" +
					  "\n" +
					  "1. Nhập thông tin các danh mục\n" +
					  "2. Hiển thị thông tin các danh mục\n" +
					  "3. Cập nhật thông tin danh mục\n" +
					  "4. Xóa danh mục\n" +
					  "5. Cập nhật trạng thái danh mục\n" +
					  "6. Thoát");
			System.out.println("Lựa chọn đê: ");
			int choice = Integer.parseInt(scanner.nextLine());
			switch (choice)
			{
				case 1:
				{
					break;
				}
				case 2:
				{
					break;
				}
				case 3:
				{
					break;
				}
				case 4:
				{
					break;
				}
				case 5:
				{
					break;
				}
				case 6:
				{
					isLoop = false;
					break;
				}
				default:
					System.err.println("Vui lòng nhập lại từ 1 -> 6");
			}
		}
		while (isLoop);
	}
	
	public void menuProduct(Scanner scanner)
	{
		boolean isLoop = true;
		do
		{
			System.out.println("---------------------------PRODUCT MANAGEMENT---------------------------\n" +
					  "\n" +
					  "1. Nhập thông tin các sản phẩm\n" +
					  "2. Hiển thị thông tin các sản phẩm\n" +
					  "3. Sắp xếp các sản phẩm theo giá\n" +
					  "4.Cập nhật thông tin sản phẩm theo mã sản phẩm\n" +
					  "5. Xóa sản phẩm theo mã sản phẩm\n" +
					  "6. Tìm kiếm các sản phẩm theo tên sản phẩm\n" +
					  "7. Tìm kiếm sản phẩm trong khoảng giá a – b (a,b nhập từ bàn phím)\n" +
					  "8. Thoát");
			System.out.println("Lựa chọn đê: ");
			int choice = Integer.parseInt(scanner.nextLine());
			switch (choice)
			{
				case 1:
				{
					break;
				}
				case 2:
				{
					break;
				}
				case 3:
				{
					// sắp xếp thì sử dụng thuật toán bubble sort để sắp xếp
					break;
				}
				case 4:
				{
					break;
				}
				case 5:
				{
					break;
				}
				case 6:
				{
					// sử dụng for -> lấy name ra so sánh sử dụng contains( tìm kiếm ) xong gọi displayData() để hiển thị
					break;
				}
				case 7:
				{
					// nhập khoảng giá a = 100.000 ->  b = 200.000 => gọi displayData() -> để hiển thị
					break;
				}
				case 8:
				{
					isLoop = false;
					break;
				}
				default:
					System.err.println("Vui lòng nhập lại từ 1 -> 6");
			}
		}
		while (isLoop);
	}
	
}
