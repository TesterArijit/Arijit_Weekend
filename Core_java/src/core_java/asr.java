package core_java;

public class asr {

	public static void main(String[] args) {
		String s="arijit";
		System.out.println(s.charAt(0));
		System.out.println(s.startsWith("a"));
		System.out.println(s.endsWith("t"));
		System.out.println(s.contains("rij"));
		System.out.println(s.lastIndexOf("t"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.replace("t", "tt"));
		System.out.println(s.substring(1));
		System.out.println(s.substring(1,4));
		System.out.println(s.concat(s));
		System.out.println(s.trim());
	

	}

}
