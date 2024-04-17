import java.util.Scanner;
public class Demo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int size = sc.nextInt();
        Integer[] arr = new Integer[size];
        System.out.print("Nhap lan luot tung phan tu: ");
        for (int i = 0; i < size; i++)
        {   
            arr[i] = sc.nextInt();
        }

        IntegerArray list = new IntegerArray(arr);

        System.out.println("So phan tu trong mang: " + list.Count());
        System.out.print("Nhap phan tu can tim kiem: ");
        int x = sc.nextInt();
        System.out.println("Phan tu " + x + " co trong mang: " + list.Search(x));

        System.out.print("Nhap vi tri can xoa: ");
        int index = sc.nextInt();
        list.Delete(index);
        System.out.println("Mang sau khi xoa phan tu tai vi tri " + index + ": ");
        list.display();
        
    }
}

