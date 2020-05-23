package xl_reading;

public class Script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="./data/data.xlsx";
		String sheet="valid login";
         Excel e=new Excel();
         System.out.println(e.Getvalue(path,sheet,1, 1));
         System.out.println(e.GetColNum(path, sheet, 0));
         System.out.println(e.GetRowNum(path, sheet))
         ;
	}

}
