import java.io.IOException;

public class SpamScr {

	static final double VERSION = 0.1;

	public static void main(String[] args) {
		new MainWind();

	}

	public static void send(String s, int anz) {
		if (s.equals("")) {
			s = " ";
		}
		s = "\"" + s + "\"";
		String path = ClassLoader.getSystemClassLoader().getResource(".").getPath();
		if (path.endsWith("/bin/")) {
			path = path.substring(1, path.length() - 4) + "spam.vbs";
		} else {
			path = path.substring(1) + "spam.vbs";
		}

		System.out.println(path);

		try {
			Runtime.getRuntime().exec("wscript " + path + " " + s + " " + anz);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
