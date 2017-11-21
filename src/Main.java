import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
	try{
        ServerSocket svs=new ServerSocket(2525);
        System.out.println("等候客戶端的請求....");
        Socket s=svs.accept();
        System.out.println("客戶端已和本機連上線");

        OutputStream out=s.getOutputStream();//取得輸出串流
        String str="Honor shows the man.";
        System.out.println("資料傳送中");
        out.write(str.getBytes());//將字串轉成Byte陣列，再寫入串流中
        out.close();              //關閉輸出串流
        s.close();                //關閉socket
        System.out.println("資料傳送完畢...");
    }
    catch(Exception e){
        System.out.println("發生了"+e+"例外");
        }
    }
}
