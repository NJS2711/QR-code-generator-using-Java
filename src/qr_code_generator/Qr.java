package qr_code_generator;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class Qr {

	public static void main(String[] args)throws Exception 
	{
    
		String str = "Nicky Jacob Sam : KING_NJS : hi everyone....";
		ByteArrayOutputStream out = QRCode.from(str).to(ImageType.PNG).stream();
		
		File f = new File("C:\\Users\\nicky\\projects\\QR Code Generator\\MyQRCode.jpg");
		FileOutputStream fos = new FileOutputStream(f);
		fos.write(out.toByteArray());
		fos.flush();
		

	}

}
