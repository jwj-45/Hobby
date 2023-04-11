package team1;

public class Hobby {

	private String name;
	private String hobby;
	private String favoriteFood;
	private String favoriteColor;
	
	public Hobby(String name, String hobby, String favoriteFood, String favoriteColor) {
		this.name = name;
		this.hobby = hobby;
		this.favoriteFood = favoriteFood;
		this.favoriteColor = favoriteColor;
	}
	
	public void print() {
		System.out.printf("이름: %s | 취미: %s | 최애음식: %s | 최애컬러: %s \n", 
				this.name, this.hobby, this.favoriteFood, this.favoriteColor);
	}
}
